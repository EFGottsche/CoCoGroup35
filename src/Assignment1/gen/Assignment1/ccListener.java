// Generated from C:/Users/esben/Desktop/Skoleting/Sem 5/CoCo/CoCoGroup35/src/Assignment1\cc.g4 by ANTLR 4.10.1
package Assignment1.gen.Assignment1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ccParser}.
 */
public interface ccListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ccParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ccParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ccParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#hardware}.
	 * @param ctx the parse tree
	 */
	void enterHardware(ccParser.HardwareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#hardware}.
	 * @param ctx the parse tree
	 */
	void exitHardware(ccParser.HardwareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(ccParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(ccParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(ccParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(ccParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#latch}.
	 * @param ctx the parse tree
	 */
	void enterLatch(ccParser.LatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#latch}.
	 * @param ctx the parse tree
	 */
	void exitLatch(ccParser.LatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#latches}.
	 * @param ctx the parse tree
	 */
	void enterLatches(ccParser.LatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#latches}.
	 * @param ctx the parse tree
	 */
	void exitLatches(ccParser.LatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(ccParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(ccParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#updates}.
	 * @param ctx the parse tree
	 */
	void enterUpdates(ccParser.UpdatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#updates}.
	 * @param ctx the parse tree
	 */
	void exitUpdates(ccParser.UpdatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#simulate}.
	 * @param ctx the parse tree
	 */
	void enterSimulate(ccParser.SimulateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#simulate}.
	 * @param ctx the parse tree
	 */
	void exitSimulate(ccParser.SimulateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#simulations}.
	 * @param ctx the parse tree
	 */
	void enterSimulations(ccParser.SimulationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#simulations}.
	 * @param ctx the parse tree
	 */
	void exitSimulations(ccParser.SimulationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNot(ccParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNot(ccParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ccParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ccParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parathesis}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParathesis(ccParser.ParathesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parathesis}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParathesis(ccParser.ParathesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterConstant(ccParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitConstant(ccParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolOr}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBoolOr(ccParser.BoolOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolOr}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBoolOr(ccParser.BoolOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolAnd}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBoolAnd(ccParser.BoolAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolAnd}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBoolAnd(ccParser.BoolAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Allocate}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAllocate(ccParser.AllocateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Allocate}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAllocate(ccParser.AllocateContext ctx);
}