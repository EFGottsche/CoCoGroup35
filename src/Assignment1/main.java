package Assignment1;


import Assignment1.gen.Assignment1.ccLexer;
import Assignment1.gen.Assignment1.ccParser;
import Assignment1.gen.Assignment1.ccVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static HashMap<String,String> inputs = new HashMap<>();
    public static HashMap<String,String> outputs = new HashMap<>();
    public static HashMap<String,String> latches = new HashMap<>();
    public static void main(String[] args) throws IOException {

        // we expect exactly one argument: the name of the input file
        if (args.length!=1) {
            System.err.println("\n");
            System.err.println("cc Interpreter\n");
            System.err.println("=================\n\n");
            System.err.println("Please give as input argument a filename\n");
            System.exit(-1);
        }
        String filename=args[0];

        // open the input file
        CharStream input = CharStreams.fromFileName(filename);
        //new ANTLRFileStream (filename); // depricated

        // create a lexer/scanner
        ccLexer lex = new ccLexer(input);

        // get the stream of tokens from the scanner
        CommonTokenStream tokens = new CommonTokenStream(lex);

        // create a parser
        ccParser parser = new ccParser(tokens);

        // and parse anything from the grammar for "start"
        ParseTree parseTree = parser.start();

        // Construct an interpreter and run it on the parse tree
        Interpreter interpreter = new Interpreter();
        Object result=interpreter.visit(parseTree);
        System.out.println("The result is: "+result);
    }
}

// We write an interpreter that implements interface
// "ccVisitor<T>" that is automatically generated by ANTLR
// This is parameterized over a return type "<T>" which is in our case
// simply a Double.

class Interpreter extends AbstractParseTreeVisitor<String> implements ccVisitor<String> {
    Interpreter(){
    }

    @Override
    public String visitStart(ccParser.StartContext ctx) {
        for (var entry : main.inputs.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        String hardware, input, output, latches, update, simulate;

        hardware = visit(ctx.h);
        input = visit(ctx.i);
        output = visit(ctx.o);

        for (var entry : main.outputs.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        latches = visit(ctx.l);
        update = visit(ctx.u);
        simulate = visit(ctx.s);

        return hardware + input + output + latches + update + simulate;
    }

    @Override
    public String visitHardware(ccParser.HardwareContext ctx) {
        return ctx.hardw.getText();
    }

    @Override
    public String visitInput(ccParser.InputContext ctx) {
        String input = "";
        for(Token t : ctx.ins){
            main.inputs.putIfAbsent(t.getText(), "0");
            input += t.getText() + "\n";
        }
        return input;
    }

    @Override
    public String visitOutput(ccParser.OutputContext ctx) {
        String output = "";
        for(Token t : ctx.outs){
            main.outputs.putIfAbsent(t.getText(), "0");
            output += t.getText() + "\n";
        }

        return output;


    }

    @Override
    public String visitLatch(ccParser.LatchContext ctx) {

        /*for(ParseTree latch : ctx.latches()){
            String left = latch.getChild(0).getText().strip();
            String right = latch.getChild(2).getText().strip();
            environment.setLatch(left,right);
        }*/
        ParseTree p;
        if(!ctx.children.isEmpty()){
            p = ctx.children.remove(0);
        }else{
            return visit(ctx.getParent().getChild(0));
        }

        if(p.getText().equalsIgnoreCase(".latches")){
            p = ctx.children.remove((0));
        }
        return visit(p);
    }

    @Override
    public String visitLatches(ccParser.LatchesContext ctx) {
        System.out.println(ctx.start.getText()+"->"+ctx.stop.getText());
        return visit(ctx.getParent());
    }

    @Override
    public String visitUpdate(ccParser.UpdateContext ctx) {
        for(ccParser.UpdatesContext upd : ctx.ups){
            visit(upd);
        }
        return null;
    }

    @Override
    public String visitUpdates(ccParser.UpdatesContext ctx) {
        ccParser.ExpContext s = ctx.exp();
        visit(s);
        return null;
    }

    @Override
    public String visitSimulate(ccParser.SimulateContext ctx) {
        for(ccParser.SimulationsContext sim : ctx.sims){
            visit(sim);
        }
        return null;
    }

    @Override
    public String visitSimulations(ccParser.SimulationsContext ctx) {
        //environment.setSim(ctx.getText)
        //visit()
        return null;
    }

    @Override
    public String visitNot(ccParser.NotContext ctx) {
        return String.valueOf(!Boolean.parseBoolean(visit(ctx.exp())));
    }

    @Override
    public String visitVariable(ccParser.VariableContext ctx) {
        ctx.IDENTIFIER();

        return null;
    }

    @Override
    public String visitParathesis(ccParser.ParathesisContext ctx) {
        return null;
    }

    @Override
    public String visitConstant(ccParser.ConstantContext ctx) {
        return ctx.i.getText();
    }

    @Override
    public String visitBoolOr(ccParser.BoolOrContext ctx) {
        ccParser.ExpContext e1 = ctx.e1;
        Boolean resE1 = Boolean.parseBoolean(visit(e1));
        ccParser.ExpContext e2 = ctx.e2;
        Boolean resE2 = Boolean.parseBoolean(visit(e2));
        return String.valueOf(resE1 || resE2);
    }

    @Override
    public String visitBoolAnd(ccParser.BoolAndContext ctx) {
        ccParser.ExpContext e1 = ctx.e1;
        Boolean resE1 = Boolean.parseBoolean(visit(e1));
        ccParser.ExpContext e2 = ctx.e2;
        Boolean resE2 = Boolean.parseBoolean(visit(e2));
        return String.valueOf(resE1 && resE2);
    }

    @Override
    public String visitAllocate(ccParser.AllocateContext ctx) {
        return null;
    }

    // todo - Java will complain that "Interpreter" does not in fact
    // implement "ccVisitor" at the moment.

    /*public Double visitStart(ccParser.StartContext ctx){
        System.out.println("Evaluating Start");
        return visit(ctx.e);
    }
    public Double visitAdd(ccParser.AddContext ctx){
        Double d1=visit(ctx.e1);
        Double d2=visit(ctx.e2);
        System.out.println("Addition "+d1+ctx.op.getText()+d2);
        if (ctx.op.getText().equals("+"))
            return d1+d2;
        else return d1-d2;
    };
    public Double visitMult(ccParser.MultContext ctx){
        Double d1=visit(ctx.e1);
        Double d2=visit(ctx.e2);
        System.out.println("Mult "+d1+ctx.op.getText()+d2);
        if (ctx.op.getText().equals("*"))
            return d1*d2;
        else return d1/d2;
    }
    public Double visitVar(ccParser.VarContext ctx){
        System.err.println("Variables not yet supported.");
        System.exit(-1);
        return null;
    };
    public Double visitConst(ccParser.ConstContext ctx){
        return Double.valueOf(ctx.f.getText());
    }
    public Double visitParen(ccParser.ParenContext ctx){
        System.out.println("Parentheses");
        return visit(ctx.e);}*/

    private class CalculationStructure{
        public CalculationStructure(Boolean output, String name, String updateStructure){
            this.output = output;
            this.name = name;
            this.updateStructure = updateStructure;
        }
        boolean output;
        String name;
        String updateStructure;

        public String calculate(){
            return "";
        }

        @Override
        public String toString() {
            return calculate() +" " + name;
        }


    }



}

