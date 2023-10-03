package Assignment1;

import Assignment1.gen.Assignment1.ccLexer;
import Assignment1.gen.Assignment1.ccParser;
import Assignment1.gen.Assignment1.ccVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException{

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
    private Environment environment;
    Interpreter(){
       this.environment = new Environment();
    }

    @Override
    public String visitStart(ccParser.StartContext ctx) {
        ParseTree p = ctx.children.remove(0);
        return visit(p);
    }

    @Override
    public String visitHardware(ccParser.HardwareContext ctx) {
        ParseTree p = ctx.getChild(0);
        if(p!=null){
            for(ParseTree child : ctx.children){
                p=child;
                System.out.println(p.getText());
            }
        }
        return visit(ctx.parent);
    }

    @Override
    public String visitInput(ccParser.InputContext ctx) {
        //TODO implement input holder, we need an environment!
        String[] inputs = ctx.stop.getText().split(" ");
        for(String input : inputs){
            environment.setOutput(input);
        }
        return visit(ctx.parent);
    }

    @Override
    public String visitOutput(ccParser.OutputContext ctx) {
        //TODO implement output holders, we need an environment!!
        String[] outputs = ctx.stop.getText().split(" ");
        for(String output : outputs){
            environment.setOutput(output);
        }
        return visit(ctx.getChild(0).getParent().getParent());
    }

    @Override
    public String visitLatch(ccParser.LatchContext ctx) {
        //ctx.latches()
        return null;
    }

    @Override
    public String visitLatches(ccParser.LatchesContext ctx) {
        return null;
    }

    @Override
    public String visitUpdate(ccParser.UpdateContext ctx) {
        return null;
    }

    @Override
    public String visitUpdates(ccParser.UpdatesContext ctx) {
        return null;
    }

    @Override
    public String visitSimulate(ccParser.SimulateContext ctx) {
        return null;
    }

    @Override
    public String visitSimulations(ccParser.SimulationsContext ctx) {
        return null;
    }

    @Override
    public String visitNot(ccParser.NotContext ctx) {
        return null;
    }

    @Override
    public String visitVariable(ccParser.VariableContext ctx) {
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
        return null;
    }

    @Override
    public String visitBoolAnd(ccParser.BoolAndContext ctx) {
        return null;
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




}

