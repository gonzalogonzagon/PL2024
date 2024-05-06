// Generated from C:/Users/gonza/Desktop/UNI/A�O 4/SEGUNDO CUATRI/Procesadores de Lenguajes/Proyecto Final/PL2024/src/Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#defines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefines(GrammarParser.DefinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ctes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtes(GrammarParser.CtesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#partes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartes(GrammarParser.PartesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart(GrammarParser.PartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#restpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestpart(GrammarParser.RestpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#blq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlq(GrammarParser.BlqContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#listparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListparam(GrammarParser.ListparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#listparamm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListparamm(GrammarParser.ListparammContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(GrammarParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#sentlistt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlistt(GrammarParser.SentlisttContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(GrammarParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLid(GrammarParser.LidContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lidd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLidd(GrammarParser.LiddContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexp(GrammarParser.LexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lexpp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexpp(GrammarParser.LexppContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(GrammarParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpp(GrammarParser.ExppContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(GrammarParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(GrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcond(GrammarParser.LcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lcondd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcondd(GrammarParser.LconddContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#opl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpl(GrammarParser.OplContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#cond2Types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond2Types(GrammarParser.Cond2TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(GrammarParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#opr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpr(GrammarParser.OprContext ctx);
}