// Generated from C:/Users/esben/Desktop/Skoleting/Sem 5/CoCo/CoCoGroup35/src/Assignment1\cc.g4 by ANTLR 4.10.1
package Assignment1.gen.Assignment1;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ccParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ccVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ccParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ccParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#hardware}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHardware(ccParser.HardwareContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(ccParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(ccParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#latch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatch(ccParser.LatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#latches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatches(ccParser.LatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(ccParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#updates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdates(ccParser.UpdatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#simulate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimulate(ccParser.SimulateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#simulations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimulations(ccParser.SimulationsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(ccParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ccParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parathesis}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParathesis(ccParser.ParathesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(ccParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolOr}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOr(ccParser.BoolOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolAnd}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAnd(ccParser.BoolAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Allocate}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocate(ccParser.AllocateContext ctx);
}