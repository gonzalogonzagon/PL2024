// Generated from C:/Users/gonza/Desktop/UNI/A�O 4/SEGUNDO CUATRI/Procesadores de Lenguajes/Proyecto Final/PL2024/src/Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#defines}.
	 * @param ctx the parse tree
	 */
	void enterDefines(GrammarParser.DefinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#defines}.
	 * @param ctx the parse tree
	 */
	void exitDefines(GrammarParser.DefinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ctes}.
	 * @param ctx the parse tree
	 */
	void enterCtes(GrammarParser.CtesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ctes}.
	 * @param ctx the parse tree
	 */
	void exitCtes(GrammarParser.CtesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#partes}.
	 * @param ctx the parse tree
	 */
	void enterPartes(GrammarParser.PartesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#partes}.
	 * @param ctx the parse tree
	 */
	void exitPartes(GrammarParser.PartesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(GrammarParser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(GrammarParser.PartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#restpart}.
	 * @param ctx the parse tree
	 */
	void enterRestpart(GrammarParser.RestpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#restpart}.
	 * @param ctx the parse tree
	 */
	void exitRestpart(GrammarParser.RestpartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#blq}.
	 * @param ctx the parse tree
	 */
	void enterBlq(GrammarParser.BlqContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#blq}.
	 * @param ctx the parse tree
	 */
	void exitBlq(GrammarParser.BlqContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#listparam}.
	 * @param ctx the parse tree
	 */
	void enterListparam(GrammarParser.ListparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#listparam}.
	 * @param ctx the parse tree
	 */
	void exitListparam(GrammarParser.ListparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#listparamm}.
	 * @param ctx the parse tree
	 */
	void enterListparamm(GrammarParser.ListparammContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#listparamm}.
	 * @param ctx the parse tree
	 */
	void exitListparamm(GrammarParser.ListparammContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(GrammarParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(GrammarParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#sentlistt}.
	 * @param ctx the parse tree
	 */
	void enterSentlistt(GrammarParser.SentlisttContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#sentlistt}.
	 * @param ctx the parse tree
	 */
	void exitSentlistt(GrammarParser.SentlisttContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(GrammarParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(GrammarParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lid}.
	 * @param ctx the parse tree
	 */
	void enterLid(GrammarParser.LidContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lid}.
	 * @param ctx the parse tree
	 */
	void exitLid(GrammarParser.LidContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lidd}.
	 * @param ctx the parse tree
	 */
	void enterLidd(GrammarParser.LiddContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lidd}.
	 * @param ctx the parse tree
	 */
	void exitLidd(GrammarParser.LiddContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lexp}.
	 * @param ctx the parse tree
	 */
	void enterLexp(GrammarParser.LexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lexp}.
	 * @param ctx the parse tree
	 */
	void exitLexp(GrammarParser.LexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lexpp}.
	 * @param ctx the parse tree
	 */
	void enterLexpp(GrammarParser.LexppContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lexpp}.
	 * @param ctx the parse tree
	 */
	void exitLexpp(GrammarParser.LexppContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(GrammarParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(GrammarParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expp}.
	 * @param ctx the parse tree
	 */
	void enterExpp(GrammarParser.ExppContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expp}.
	 * @param ctx the parse tree
	 */
	void exitExpp(GrammarParser.ExppContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(GrammarParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(GrammarParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(GrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(GrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lcond}.
	 * @param ctx the parse tree
	 */
	void enterLcond(GrammarParser.LcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lcond}.
	 * @param ctx the parse tree
	 */
	void exitLcond(GrammarParser.LcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lcondd}.
	 * @param ctx the parse tree
	 */
	void enterLcondd(GrammarParser.LconddContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lcondd}.
	 * @param ctx the parse tree
	 */
	void exitLcondd(GrammarParser.LconddContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#opl}.
	 * @param ctx the parse tree
	 */
	void enterOpl(GrammarParser.OplContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#opl}.
	 * @param ctx the parse tree
	 */
	void exitOpl(GrammarParser.OplContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cond2Types}.
	 * @param ctx the parse tree
	 */
	void enterCond2Types(GrammarParser.Cond2TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cond2Types}.
	 * @param ctx the parse tree
	 */
	void exitCond2Types(GrammarParser.Cond2TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(GrammarParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(GrammarParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#opr}.
	 * @param ctx the parse tree
	 */
	void enterOpr(GrammarParser.OprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#opr}.
	 * @param ctx the parse tree
	 */
	void exitOpr(GrammarParser.OprContext ctx);
}