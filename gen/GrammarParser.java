// Generated from C:/Users/gonza/Desktop/UNI/A—O 4/SEGUNDO CUATRI/Procesadores de Lenguajes/Proyecto Final/PracticaObligatoriaPL24/src/Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		IDENT=32, CONSTINT=33, CONSTFLOAT=34, DECIMAL_INTEGER_CONST=35, OCTAL_INTEGER_CONST=36, 
		HEXA_INTEGER_CONST=37, DECIMAL_REAL_CONST=38, OCTAL_REAL_CONST=39, HEXA_REAL_CONST=40, 
		CONSTLIT=41, COMENTARIOBLOQUE=42, COMENTARIOLINEA=43, WS=44, NL=45, B=46, 
		IG=47;
	public static final int
		RULE_program = 0, RULE_defines = 1, RULE_ctes = 2, RULE_partes = 3, RULE_part = 4, 
		RULE_restpart = 5, RULE_blq = 6, RULE_listparam = 7, RULE_listparamm = 8, 
		RULE_type = 9, RULE_sentlist = 10, RULE_sentlistt = 11, RULE_sent = 12, 
		RULE_lid = 13, RULE_lidd = 14, RULE_lexp = 15, RULE_lexpp = 16, RULE_exp = 17, 
		RULE_expp = 18, RULE_op = 19, RULE_factor = 20, RULE_lcond = 21, RULE_lcondd = 22, 
		RULE_opl = 23, RULE_cond2Types = 24, RULE_cond = 25, RULE_opr = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "defines", "ctes", "partes", "part", "restpart", "blq", "listparam", 
			"listparamm", "type", "sentlist", "sentlistt", "sent", "lid", "lidd", 
			"lexp", "lexpp", "exp", "expp", "op", "factor", "lcond", "lcondd", "opl", 
			"cond2Types", "cond", "opr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#define'", "'('", "')'", "'void'", "'{'", "'}'", "','", "'int'", 
			"'float'", "';'", "'='", "'return'", "'if'", "'else'", "'while'", "'do'", 
			"'until'", "'for'", "'+'", "'-'", "'*'", "'/'", "'%'", "'||'", "'&&'", 
			"'!'", "'=='", "'<'", "'>'", "'>='", "'<='", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "IDENT", "CONSTINT", 
			"CONSTFLOAT", "DECIMAL_INTEGER_CONST", "OCTAL_INTEGER_CONST", "HEXA_INTEGER_CONST", 
			"DECIMAL_REAL_CONST", "OCTAL_REAL_CONST", "HEXA_REAL_CONST", "CONSTLIT", 
			"COMENTARIOBLOQUE", "COMENTARIOLINEA", "WS", "NL", "B", "IG"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    // Variables utilizadas en el analizador
	    private Constantes constantes;
	    private Bloque bloqueAux;

	    // Declarar objeto
	    private Codigo codigo;

	    // Recibir como un par√°metro del constructor el objeto real
	    public GrammarParser ( TokenStream input, Codigo code, Constantes cons, Bloque bloque)  {
	        this(input);
	        codigo = code;
	        constantes = cons;
	        bloqueAux = bloque;
	    }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public DefinesContext defines() {
			return getRuleContext(DefinesContext.class,0);
		}
		public PartesContext partes() {
			return getRuleContext(PartesContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			defines();
			setState(55);
			partes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinesContext extends ParserRuleContext {
		public Token IDENT;
		public CtesContext ctes;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public DefinesContext defines() {
			return getRuleContext(DefinesContext.class,0);
		}
		public DefinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDefines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDefines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDefines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinesContext defines() throws RecognitionException {
		DefinesContext _localctx = new DefinesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_defines);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(T__0);
				Elemento elem = new Elemento();
				setState(59);
				((DefinesContext)_localctx).IDENT = match(IDENT);
				elem.setId((((DefinesContext)_localctx).IDENT!=null?((DefinesContext)_localctx).IDENT.getText():null));
				setState(61);
				((DefinesContext)_localctx).ctes = ctes();
				elem.setValor(((DefinesContext)_localctx).ctes.s); constantes.anadirElemento(elem);
				setState(63);
				defines();
				}
				break;
			case T__3:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CtesContext extends ParserRuleContext {
		public String s;
		public Token CONSTINT;
		public Token CONSTFLOAT;
		public Token CONSTLIT;
		public TerminalNode CONSTINT() { return getToken(GrammarParser.CONSTINT, 0); }
		public TerminalNode CONSTFLOAT() { return getToken(GrammarParser.CONSTFLOAT, 0); }
		public TerminalNode CONSTLIT() { return getToken(GrammarParser.CONSTLIT, 0); }
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ctes);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				((CtesContext)_localctx).CONSTINT = match(CONSTINT);
				((CtesContext)_localctx).s =  (((CtesContext)_localctx).CONSTINT!=null?((CtesContext)_localctx).CONSTINT.getText():null);
				}
				break;
			case CONSTFLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				((CtesContext)_localctx).CONSTFLOAT = match(CONSTFLOAT);
				((CtesContext)_localctx).s =  (((CtesContext)_localctx).CONSTFLOAT!=null?((CtesContext)_localctx).CONSTFLOAT.getText():null);
				}
				break;
			case CONSTLIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				((CtesContext)_localctx).CONSTLIT = match(CONSTLIT);
				((CtesContext)_localctx).s =  (((CtesContext)_localctx).CONSTLIT!=null?((CtesContext)_localctx).CONSTLIT.getText():null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartesContext extends ParserRuleContext {
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public PartesContext partes() {
			return getRuleContext(PartesContext.class,0);
		}
		public PartesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPartes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPartes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPartes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartesContext partes() throws RecognitionException {
		PartesContext _localctx = new PartesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_partes);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				part(codigo.addSubprograma(new Subprograma()));
				setState(77);
				partes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				part(codigo.addSubprograma(new Subprograma()));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartContext extends ParserRuleContext {
		public Subprograma subp;
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RestpartContext restpart() {
			return getRuleContext(RestpartContext.class,0);
		}
		public PartContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PartContext(ParserRuleContext parent, int invokingState, Subprograma subp) {
			super(parent, invokingState);
			this.subp = subp;
		}
		@Override public int getRuleIndex() { return RULE_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartContext part(Subprograma subp) throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState(), subp);
		enterRule(_localctx, 8, RULE_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			((PartContext)_localctx).type = type();
			subp.getCabecera().setTipo(((PartContext)_localctx).type.s);
			setState(84);
			restpart(subp);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RestpartContext extends ParserRuleContext {
		public Subprograma subp;
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public ListparamContext listparam() {
			return getRuleContext(ListparamContext.class,0);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public RestpartContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RestpartContext(ParserRuleContext parent, int invokingState, Subprograma subp) {
			super(parent, invokingState);
			this.subp = subp;
		}
		@Override public int getRuleIndex() { return RULE_restpart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRestpart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRestpart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRestpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestpartContext restpart(Subprograma subp) throws RecognitionException {
		RestpartContext _localctx = new RestpartContext(_ctx, getState(), subp);
		enterRule(_localctx, 10, RULE_restpart);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				((RestpartContext)_localctx).IDENT = match(IDENT);
				subp.setNombre((((RestpartContext)_localctx).IDENT!=null?((RestpartContext)_localctx).IDENT.getText():null));
				setState(88);
				match(T__1);
				setState(89);
				listparam(subp.getCabecera());
				setState(90);
				match(T__2);
				setState(91);
				blq(subp.getVariables(), subp.getBloque(), subp.getNombre());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				((RestpartContext)_localctx).IDENT = match(IDENT);
				subp.setNombre((((RestpartContext)_localctx).IDENT!=null?((RestpartContext)_localctx).IDENT.getText():null));
				setState(95);
				match(T__1);
				setState(96);
				match(T__3);
				setState(97);
				match(T__2);
				setState(98);
				blq(subp.getVariables(), subp.getBloque(), subp.getNombre());
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlqContext extends ParserRuleContext {
		public Variables var;
		public Bloque b;
		public String func;
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public BlqContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BlqContext(ParserRuleContext parent, int invokingState, Variables var, Bloque b, String func) {
			super(parent, invokingState);
			this.var = var;
			this.b = b;
			this.func = func;
		}
		@Override public int getRuleIndex() { return RULE_blq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlqContext blq(Variables var,Bloque b,String func) throws RecognitionException {
		BlqContext _localctx = new BlqContext(_ctx, getState(), var, b, func);
		enterRule(_localctx, 12, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__4);
			setState(102);
			sentlist(var, b, func);
			setState(103);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListparamContext extends ParserRuleContext {
		public Cabecera cab;
		public TypeContext type;
		public Token IDENT;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public ListparammContext listparamm() {
			return getRuleContext(ListparammContext.class,0);
		}
		public ListparamContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ListparamContext(ParserRuleContext parent, int invokingState, Cabecera cab) {
			super(parent, invokingState);
			this.cab = cab;
		}
		@Override public int getRuleIndex() { return RULE_listparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterListparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitListparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitListparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListparamContext listparam(Cabecera cab) throws RecognitionException {
		ListparamContext _localctx = new ListparamContext(_ctx, getState(), cab);
		enterRule(_localctx, 14, RULE_listparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			((ListparamContext)_localctx).type = type();
			setState(106);
			((ListparamContext)_localctx).IDENT = match(IDENT);
			cab.addElemento(new Elemento((((ListparamContext)_localctx).IDENT!=null?((ListparamContext)_localctx).IDENT.getText():null), ((ListparamContext)_localctx).type.s));
			setState(108);
			listparamm(cab);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListparammContext extends ParserRuleContext {
		public Cabecera cab;
		public TypeContext type;
		public Token IDENT;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public ListparammContext listparamm() {
			return getRuleContext(ListparammContext.class,0);
		}
		public ListparammContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ListparammContext(ParserRuleContext parent, int invokingState, Cabecera cab) {
			super(parent, invokingState);
			this.cab = cab;
		}
		@Override public int getRuleIndex() { return RULE_listparamm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterListparamm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitListparamm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitListparamm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListparammContext listparamm(Cabecera cab) throws RecognitionException {
		ListparammContext _localctx = new ListparammContext(_ctx, getState(), cab);
		enterRule(_localctx, 16, RULE_listparamm);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(T__6);
				setState(111);
				((ListparammContext)_localctx).type = type();
				setState(112);
				((ListparammContext)_localctx).IDENT = match(IDENT);
				cab.addElemento(new Elemento((((ListparammContext)_localctx).IDENT!=null?((ListparammContext)_localctx).IDENT.getText():null), ((ListparammContext)_localctx).type.s));
				setState(114);
				listparamm(cab);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public String s;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(T__3);
				((TypeContext)_localctx).s =  "VOID";
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(T__7);
				((TypeContext)_localctx).s =  "INTEGER";
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(T__8);
				((TypeContext)_localctx).s =  "REAL";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentlistContext extends ParserRuleContext {
		public Variables var;
		public Bloque b;
		public String func;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlisttContext sentlistt() {
			return getRuleContext(SentlisttContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentlistContext(ParserRuleContext parent, int invokingState, Variables var, Bloque b, String func) {
			super(parent, invokingState);
			this.var = var;
			this.b = b;
			this.func = func;
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist(Variables var,Bloque b,String func) throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState(), var, b, func);
		enterRule(_localctx, 20, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			sent(var, b, func);
			setState(128);
			sentlistt(var, b, func);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentlisttContext extends ParserRuleContext {
		public Variables var;
		public Bloque b;
		public String func;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlisttContext sentlistt() {
			return getRuleContext(SentlisttContext.class,0);
		}
		public SentlisttContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentlisttContext(ParserRuleContext parent, int invokingState, Variables var, Bloque b, String func) {
			super(parent, invokingState);
			this.var = var;
			this.b = b;
			this.func = func;
		}
		@Override public int getRuleIndex() { return RULE_sentlistt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSentlistt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSentlistt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSentlistt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlisttContext sentlistt(Variables var,Bloque b,String func) throws RecognitionException {
		SentlisttContext _localctx = new SentlisttContext(_ctx, getState(), var, b, func);
		enterRule(_localctx, 22, RULE_sentlistt);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__7:
			case T__8:
			case T__11:
			case T__12:
			case T__14:
			case T__15:
			case T__17:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				sent(var, b, func);
				setState(131);
				sentlistt(var, b, func);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentContext extends ParserRuleContext {
		public Variables var;
		public Bloque b;
		public String func;
		public TypeContext type;
		public Token IDENT;
		public ExpContext exp;
		public LexpContext lexp;
		public LcondContext lcond;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public LexpContext lexp() {
			return getRuleContext(LexpContext.class,0);
		}
		public LcondContext lcond() {
			return getRuleContext(LcondContext.class,0);
		}
		public List<BlqContext> blq() {
			return getRuleContexts(BlqContext.class);
		}
		public BlqContext blq(int i) {
			return getRuleContext(BlqContext.class,i);
		}
		public SentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentContext(ParserRuleContext parent, int invokingState, Variables var, Bloque b, String func) {
			super(parent, invokingState);
			this.var = var;
			this.b = b;
			this.func = func;
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent(Variables var,Bloque b,String func) throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState(), var, b, func);
		enterRule(_localctx, 24, RULE_sent);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				((SentContext)_localctx).type = type();
				setState(137);
				lid(var, ((SentContext)_localctx).type.s);
				setState(138);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				((SentContext)_localctx).IDENT = match(IDENT);
				setState(141);
				match(T__10);
				setState(142);
				((SentContext)_localctx).exp = exp();
				setState(143);
				match(T__9);
				String sent = (((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null) + " := " + ((SentContext)_localctx).exp.s + ";"; b.anadirSentencia(new Sentencia(sent, 0));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				((SentContext)_localctx).IDENT = match(IDENT);
				setState(147);
				match(T__1);
				setState(148);
				((SentContext)_localctx).lexp = lexp();
				setState(149);
				match(T__2);
				setState(150);
				match(T__9);
				String sent = (((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null) + "(" + ((SentContext)_localctx).lexp.s + ")" + ";"; b.anadirSentencia(new Sentencia(sent, 0));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				((SentContext)_localctx).IDENT = match(IDENT);
				setState(154);
				match(T__1);
				setState(155);
				match(T__2);
				setState(156);
				match(T__9);
				String sent = (((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null) + "()" + ";"; b.anadirSentencia(new Sentencia(sent, 0));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				match(T__11);
				setState(159);
				((SentContext)_localctx).exp = exp();
				setState(160);
				match(T__9);
				String sent = _localctx.func + " := " + ((SentContext)_localctx).exp.s + ";"; b.anadirSentencia(new Sentencia(sent, 0));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				bloqueAux.resetSentencias();
				setState(164);
				match(T__12);
				setState(165);
				match(T__1);
				setState(166);
				((SentContext)_localctx).lcond = lcond();
				setState(167);
				match(T__2);
				setState(168);
				blq(var, bloqueAux, null);
				String sent = "IF(" + ((SentContext)_localctx).lcond.s + ")\n" + bloqueAux.imprimirBloque() + "end;\n";
				bloqueAux.resetSentencias();
				setState(171);
				match(T__13);
				setState(172);
				blq(var, bloqueAux, null);
				sent += "ELSE\n" + bloqueAux.imprimirBloque() + "end;\n"; b.anadirSentencia(new Sentencia(sent, 1));
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(175);
				match(T__14);
				setState(176);
				match(T__1);
				setState(177);
				lcond();
				setState(178);
				match(T__2);
				setState(179);
				blq(null, new Bloque(), null);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(181);
				match(T__15);
				setState(182);
				blq(null, new Bloque(), null);
				setState(183);
				match(T__16);
				setState(184);
				match(T__1);
				setState(185);
				lcond();
				setState(186);
				match(T__2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(188);
				match(T__17);
				setState(189);
				match(T__1);
				setState(190);
				match(IDENT);
				setState(191);
				match(T__10);
				setState(192);
				exp();
				setState(193);
				match(T__9);
				setState(194);
				lcond();
				setState(195);
				match(T__9);
				setState(196);
				match(IDENT);
				setState(197);
				match(T__10);
				setState(198);
				exp();
				setState(199);
				match(T__2);
				setState(200);
				blq(null, new Bloque(), null);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LidContext extends ParserRuleContext {
		public Variables var;
		public String t;
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public LiddContext lidd() {
			return getRuleContext(LiddContext.class,0);
		}
		public LidContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LidContext(ParserRuleContext parent, int invokingState, Variables var, String t) {
			super(parent, invokingState);
			this.var = var;
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_lid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LidContext lid(Variables var,String t) throws RecognitionException {
		LidContext _localctx = new LidContext(_ctx, getState(), var, t);
		enterRule(_localctx, 26, RULE_lid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			((LidContext)_localctx).IDENT = match(IDENT);
			var.anadirElemento(new Elemento((((LidContext)_localctx).IDENT!=null?((LidContext)_localctx).IDENT.getText():null), _localctx.t));
			setState(206);
			lidd(var, t);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiddContext extends ParserRuleContext {
		public Variables var;
		public String t;
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public LiddContext lidd() {
			return getRuleContext(LiddContext.class,0);
		}
		public LiddContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LiddContext(ParserRuleContext parent, int invokingState, Variables var, String t) {
			super(parent, invokingState);
			this.var = var;
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_lidd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLidd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLidd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLidd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiddContext lidd(Variables var,String t) throws RecognitionException {
		LiddContext _localctx = new LiddContext(_ctx, getState(), var, t);
		enterRule(_localctx, 28, RULE_lidd);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(T__6);
				setState(209);
				((LiddContext)_localctx).IDENT = match(IDENT);
				var.anadirElemento(new Elemento((((LiddContext)_localctx).IDENT!=null?((LiddContext)_localctx).IDENT.getText():null), _localctx.t));
				setState(211);
				lidd(var, t);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LexpContext extends ParserRuleContext {
		public String s;
		public ExpContext exp;
		public LexppContext lexpp;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public LexppContext lexpp() {
			return getRuleContext(LexppContext.class,0);
		}
		public LexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexpContext lexp() throws RecognitionException {
		LexpContext _localctx = new LexpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			((LexpContext)_localctx).exp = exp();
			setState(216);
			((LexpContext)_localctx).lexpp = lexpp();
			((LexpContext)_localctx).s =  ((LexpContext)_localctx).exp.s + ((LexpContext)_localctx).lexpp.s;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LexppContext extends ParserRuleContext {
		public String s;
		public LexppContext lexpp;
		public LexppContext lexpp() {
			return getRuleContext(LexppContext.class,0);
		}
		public LexppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLexpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLexpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLexpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexppContext lexpp() throws RecognitionException {
		LexppContext _localctx = new LexppContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lexpp);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(T__6);
				setState(220);
				((LexppContext)_localctx).lexpp = lexpp();
				((LexppContext)_localctx).s =  ", " + ((LexppContext)_localctx).lexpp.s;
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				((LexppContext)_localctx).s =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public String s;
		public FactorContext factor;
		public ExppContext expp;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExppContext expp() {
			return getRuleContext(ExppContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			((ExpContext)_localctx).factor = factor();
			setState(227);
			((ExpContext)_localctx).expp = expp();
			((ExpContext)_localctx).s =  ((ExpContext)_localctx).factor.s + ((ExpContext)_localctx).expp.s;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExppContext extends ParserRuleContext {
		public String s;
		public OpContext op;
		public FactorContext factor;
		public ExppContext expp;
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExppContext expp() {
			return getRuleContext(ExppContext.class,0);
		}
		public ExppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExppContext expp() throws RecognitionException {
		ExppContext _localctx = new ExppContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expp);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				((ExppContext)_localctx).op = op();
				setState(231);
				((ExppContext)_localctx).factor = factor();
				setState(232);
				((ExppContext)_localctx).expp = expp();
				((ExppContext)_localctx).s =  " " + ((ExppContext)_localctx).op.s + " " + ((ExppContext)_localctx).factor.s + ((ExppContext)_localctx).expp.s;
				}
				break;
			case T__2:
			case T__6:
			case T__9:
			case T__23:
			case T__24:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				((ExppContext)_localctx).s =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpContext extends ParserRuleContext {
		public String s;
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_op);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(T__18);
				((OpContext)_localctx).s =  "+";
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(T__19);
				((OpContext)_localctx).s =  "-";
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(T__20);
				((OpContext)_localctx).s =  "*";
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				match(T__21);
				((OpContext)_localctx).s =  "div";
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				match(T__22);
				((OpContext)_localctx).s =  "mod";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public String s;
		public Token IDENT;
		public LexpContext lexp;
		public ExpContext exp;
		public CtesContext ctes;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public LexpContext lexp() {
			return getRuleContext(LexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				((FactorContext)_localctx).IDENT = match(IDENT);
				setState(251);
				match(T__1);
				setState(252);
				((FactorContext)_localctx).lexp = lexp();
				setState(253);
				match(T__2);
				((FactorContext)_localctx).s =  (((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null) + " (" + ((FactorContext)_localctx).lexp.s + ")";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				((FactorContext)_localctx).IDENT = match(IDENT);
				setState(257);
				match(T__1);
				setState(258);
				match(T__2);
				((FactorContext)_localctx).s =  (((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null) + "()";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				match(T__1);
				setState(261);
				((FactorContext)_localctx).exp = exp();
				setState(262);
				match(T__2);
				((FactorContext)_localctx).s =  "(" + ((FactorContext)_localctx).exp.s + ")";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				((FactorContext)_localctx).IDENT = match(IDENT);
				((FactorContext)_localctx).s =  (((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				((FactorContext)_localctx).ctes = ctes();
				((FactorContext)_localctx).s =  ((FactorContext)_localctx).ctes.s ;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LcondContext extends ParserRuleContext {
		public String s;
		public Cond2TypesContext cond2Types;
		public OplContext opl;
		public LconddContext lcondd;
		public List<Cond2TypesContext> cond2Types() {
			return getRuleContexts(Cond2TypesContext.class);
		}
		public Cond2TypesContext cond2Types(int i) {
			return getRuleContext(Cond2TypesContext.class,i);
		}
		public OplContext opl() {
			return getRuleContext(OplContext.class,0);
		}
		public LconddContext lcondd() {
			return getRuleContext(LconddContext.class,0);
		}
		public LcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LcondContext lcond() throws RecognitionException {
		LcondContext _localctx = new LcondContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lcond);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				((LcondContext)_localctx).cond2Types = cond2Types();
				((LcondContext)_localctx).s =  ((LcondContext)_localctx).cond2Types.s;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				((LcondContext)_localctx).cond2Types = cond2Types();
				((LcondContext)_localctx).s =  ((LcondContext)_localctx).cond2Types.s + " ";
				setState(277);
				((LcondContext)_localctx).opl = opl();
				setState(278);
				((LcondContext)_localctx).cond2Types = cond2Types();
				setState(279);
				((LcondContext)_localctx).lcondd = lcondd();
				_localctx.s += ((LcondContext)_localctx).opl.s + " " + ((LcondContext)_localctx).cond2Types.s + ((LcondContext)_localctx).lcondd.s;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LconddContext extends ParserRuleContext {
		public String s;
		public OplContext opl;
		public Cond2TypesContext cond2Types;
		public LconddContext lcondd;
		public OplContext opl() {
			return getRuleContext(OplContext.class,0);
		}
		public Cond2TypesContext cond2Types() {
			return getRuleContext(Cond2TypesContext.class,0);
		}
		public LconddContext lcondd() {
			return getRuleContext(LconddContext.class,0);
		}
		public LconddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcondd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLcondd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLcondd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLcondd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LconddContext lcondd() throws RecognitionException {
		LconddContext _localctx = new LconddContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_lcondd);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				((LconddContext)_localctx).opl = opl();
				setState(285);
				((LconddContext)_localctx).cond2Types = cond2Types();
				setState(286);
				((LconddContext)_localctx).lcondd = lcondd();
				((LconddContext)_localctx).s =  " " + ((LconddContext)_localctx).opl.s + " " + ((LconddContext)_localctx).cond2Types.s + ((LconddContext)_localctx).lcondd.s;
				}
				break;
			case T__2:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OplContext extends ParserRuleContext {
		public String s;
		public OplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOpl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOpl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplContext opl() throws RecognitionException {
		OplContext _localctx = new OplContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_opl);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(T__23);
				((OplContext)_localctx).s =  "OR";
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(T__24);
				((OplContext)_localctx).s =  "AND";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cond2TypesContext extends ParserRuleContext {
		public String s;
		public CondContext cond;
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Cond2TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond2Types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCond2Types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCond2Types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCond2Types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond2TypesContext cond2Types() throws RecognitionException {
		Cond2TypesContext _localctx = new Cond2TypesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cond2Types);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case IDENT:
			case CONSTINT:
			case CONSTFLOAT:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				((Cond2TypesContext)_localctx).cond = cond();
				((Cond2TypesContext)_localctx).s =  ((Cond2TypesContext)_localctx).cond.s;
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(T__25);
				setState(302);
				((Cond2TypesContext)_localctx).cond = cond();
				((Cond2TypesContext)_localctx).s =  "NOT (" + ((Cond2TypesContext)_localctx).cond.s + ")";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public String s;
		public ExpContext exp;
		public OprContext opr;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			((CondContext)_localctx).exp = exp();
			setState(308);
			((CondContext)_localctx).opr = opr();
			setState(309);
			((CondContext)_localctx).exp = exp();
			((CondContext)_localctx).s =  ((CondContext)_localctx).exp.s + " " + ((CondContext)_localctx).opr.s + " " + ((CondContext)_localctx).exp.s;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OprContext extends ParserRuleContext {
		public String s;
		public OprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OprContext opr() throws RecognitionException {
		OprContext _localctx = new OprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_opr);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(T__26);
				((OprContext)_localctx).s =  "=";
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(T__27);
				((OprContext)_localctx).s =  "<";
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(T__28);
				((OprContext)_localctx).s =  ">";
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				match(T__29);
				((OprContext)_localctx).s =  ">=";
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
				match(T__30);
				((OprContext)_localctx).s =  "<=";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u0145\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002K\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003Q\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005d\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bv\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t~\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0087\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00cb\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00d6\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00e1\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00ed\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00f9\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u010f\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u011b\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0123\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0129\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0132\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0143\b\u001a\u0001\u001a\u0000\u0000\u001b"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.024\u0000\u0000\u014d\u00006\u0001\u0000\u0000\u0000"+
		"\u0002B\u0001\u0000\u0000\u0000\u0004J\u0001\u0000\u0000\u0000\u0006P"+
		"\u0001\u0000\u0000\u0000\bR\u0001\u0000\u0000\u0000\nc\u0001\u0000\u0000"+
		"\u0000\fe\u0001\u0000\u0000\u0000\u000ei\u0001\u0000\u0000\u0000\u0010"+
		"u\u0001\u0000\u0000\u0000\u0012}\u0001\u0000\u0000\u0000\u0014\u007f\u0001"+
		"\u0000\u0000\u0000\u0016\u0086\u0001\u0000\u0000\u0000\u0018\u00ca\u0001"+
		"\u0000\u0000\u0000\u001a\u00cc\u0001\u0000\u0000\u0000\u001c\u00d5\u0001"+
		"\u0000\u0000\u0000\u001e\u00d7\u0001\u0000\u0000\u0000 \u00e0\u0001\u0000"+
		"\u0000\u0000\"\u00e2\u0001\u0000\u0000\u0000$\u00ec\u0001\u0000\u0000"+
		"\u0000&\u00f8\u0001\u0000\u0000\u0000(\u010e\u0001\u0000\u0000\u0000*"+
		"\u011a\u0001\u0000\u0000\u0000,\u0122\u0001\u0000\u0000\u0000.\u0128\u0001"+
		"\u0000\u0000\u00000\u0131\u0001\u0000\u0000\u00002\u0133\u0001\u0000\u0000"+
		"\u00004\u0142\u0001\u0000\u0000\u000067\u0003\u0002\u0001\u000078\u0003"+
		"\u0006\u0003\u00008\u0001\u0001\u0000\u0000\u00009:\u0005\u0001\u0000"+
		"\u0000:;\u0006\u0001\uffff\uffff\u0000;<\u0005 \u0000\u0000<=\u0006\u0001"+
		"\uffff\uffff\u0000=>\u0003\u0004\u0002\u0000>?\u0006\u0001\uffff\uffff"+
		"\u0000?@\u0003\u0002\u0001\u0000@C\u0001\u0000\u0000\u0000AC\u0001\u0000"+
		"\u0000\u0000B9\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000C\u0003"+
		"\u0001\u0000\u0000\u0000DE\u0005!\u0000\u0000EK\u0006\u0002\uffff\uffff"+
		"\u0000FG\u0005\"\u0000\u0000GK\u0006\u0002\uffff\uffff\u0000HI\u0005)"+
		"\u0000\u0000IK\u0006\u0002\uffff\uffff\u0000JD\u0001\u0000\u0000\u0000"+
		"JF\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000K\u0005\u0001\u0000"+
		"\u0000\u0000LM\u0003\b\u0004\u0000MN\u0003\u0006\u0003\u0000NQ\u0001\u0000"+
		"\u0000\u0000OQ\u0003\b\u0004\u0000PL\u0001\u0000\u0000\u0000PO\u0001\u0000"+
		"\u0000\u0000Q\u0007\u0001\u0000\u0000\u0000RS\u0003\u0012\t\u0000ST\u0006"+
		"\u0004\uffff\uffff\u0000TU\u0003\n\u0005\u0000U\t\u0001\u0000\u0000\u0000"+
		"VW\u0005 \u0000\u0000WX\u0006\u0005\uffff\uffff\u0000XY\u0005\u0002\u0000"+
		"\u0000YZ\u0003\u000e\u0007\u0000Z[\u0005\u0003\u0000\u0000[\\\u0003\f"+
		"\u0006\u0000\\d\u0001\u0000\u0000\u0000]^\u0005 \u0000\u0000^_\u0006\u0005"+
		"\uffff\uffff\u0000_`\u0005\u0002\u0000\u0000`a\u0005\u0004\u0000\u0000"+
		"ab\u0005\u0003\u0000\u0000bd\u0003\f\u0006\u0000cV\u0001\u0000\u0000\u0000"+
		"c]\u0001\u0000\u0000\u0000d\u000b\u0001\u0000\u0000\u0000ef\u0005\u0005"+
		"\u0000\u0000fg\u0003\u0014\n\u0000gh\u0005\u0006\u0000\u0000h\r\u0001"+
		"\u0000\u0000\u0000ij\u0003\u0012\t\u0000jk\u0005 \u0000\u0000kl\u0006"+
		"\u0007\uffff\uffff\u0000lm\u0003\u0010\b\u0000m\u000f\u0001\u0000\u0000"+
		"\u0000no\u0005\u0007\u0000\u0000op\u0003\u0012\t\u0000pq\u0005 \u0000"+
		"\u0000qr\u0006\b\uffff\uffff\u0000rs\u0003\u0010\b\u0000sv\u0001\u0000"+
		"\u0000\u0000tv\u0001\u0000\u0000\u0000un\u0001\u0000\u0000\u0000ut\u0001"+
		"\u0000\u0000\u0000v\u0011\u0001\u0000\u0000\u0000wx\u0005\u0004\u0000"+
		"\u0000x~\u0006\t\uffff\uffff\u0000yz\u0005\b\u0000\u0000z~\u0006\t\uffff"+
		"\uffff\u0000{|\u0005\t\u0000\u0000|~\u0006\t\uffff\uffff\u0000}w\u0001"+
		"\u0000\u0000\u0000}y\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"~\u0013\u0001\u0000\u0000\u0000\u007f\u0080\u0003\u0018\f\u0000\u0080"+
		"\u0081\u0003\u0016\u000b\u0000\u0081\u0015\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0003\u0018\f\u0000\u0083\u0084\u0003\u0016\u000b\u0000\u0084\u0087"+
		"\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0082"+
		"\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0017"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0003\u0012\t\u0000\u0089\u008a\u0003"+
		"\u001a\r\u0000\u008a\u008b\u0005\n\u0000\u0000\u008b\u00cb\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005 \u0000\u0000\u008d\u008e\u0005\u000b\u0000"+
		"\u0000\u008e\u008f\u0003\"\u0011\u0000\u008f\u0090\u0005\n\u0000\u0000"+
		"\u0090\u0091\u0006\f\uffff\uffff\u0000\u0091\u00cb\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0005 \u0000\u0000\u0093\u0094\u0005\u0002\u0000\u0000\u0094"+
		"\u0095\u0003\u001e\u000f\u0000\u0095\u0096\u0005\u0003\u0000\u0000\u0096"+
		"\u0097\u0005\n\u0000\u0000\u0097\u0098\u0006\f\uffff\uffff\u0000\u0098"+
		"\u00cb\u0001\u0000\u0000\u0000\u0099\u009a\u0005 \u0000\u0000\u009a\u009b"+
		"\u0005\u0002\u0000\u0000\u009b\u009c\u0005\u0003\u0000\u0000\u009c\u009d"+
		"\u0005\n\u0000\u0000\u009d\u00cb\u0006\f\uffff\uffff\u0000\u009e\u009f"+
		"\u0005\f\u0000\u0000\u009f\u00a0\u0003\"\u0011\u0000\u00a0\u00a1\u0005"+
		"\n\u0000\u0000\u00a1\u00a2\u0006\f\uffff\uffff\u0000\u00a2\u00cb\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0006\f\uffff\uffff\u0000\u00a4\u00a5\u0005"+
		"\r\u0000\u0000\u00a5\u00a6\u0005\u0002\u0000\u0000\u00a6\u00a7\u0003*"+
		"\u0015\u0000\u00a7\u00a8\u0005\u0003\u0000\u0000\u00a8\u00a9\u0003\f\u0006"+
		"\u0000\u00a9\u00aa\u0006\f\uffff\uffff\u0000\u00aa\u00ab\u0006\f\uffff"+
		"\uffff\u0000\u00ab\u00ac\u0005\u000e\u0000\u0000\u00ac\u00ad\u0003\f\u0006"+
		"\u0000\u00ad\u00ae\u0006\f\uffff\uffff\u0000\u00ae\u00cb\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0005\u000f\u0000\u0000\u00b0\u00b1\u0005\u0002\u0000"+
		"\u0000\u00b1\u00b2\u0003*\u0015\u0000\u00b2\u00b3\u0005\u0003\u0000\u0000"+
		"\u00b3\u00b4\u0003\f\u0006\u0000\u00b4\u00cb\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0005\u0010\u0000\u0000\u00b6\u00b7\u0003\f\u0006\u0000\u00b7\u00b8"+
		"\u0005\u0011\u0000\u0000\u00b8\u00b9\u0005\u0002\u0000\u0000\u00b9\u00ba"+
		"\u0003*\u0015\u0000\u00ba\u00bb\u0005\u0003\u0000\u0000\u00bb\u00cb\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0005\u0012\u0000\u0000\u00bd\u00be\u0005"+
		"\u0002\u0000\u0000\u00be\u00bf\u0005 \u0000\u0000\u00bf\u00c0\u0005\u000b"+
		"\u0000\u0000\u00c0\u00c1\u0003\"\u0011\u0000\u00c1\u00c2\u0005\n\u0000"+
		"\u0000\u00c2\u00c3\u0003*\u0015\u0000\u00c3\u00c4\u0005\n\u0000\u0000"+
		"\u00c4\u00c5\u0005 \u0000\u0000\u00c5\u00c6\u0005\u000b\u0000\u0000\u00c6"+
		"\u00c7\u0003\"\u0011\u0000\u00c7\u00c8\u0005\u0003\u0000\u0000\u00c8\u00c9"+
		"\u0003\f\u0006\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u0088\u0001"+
		"\u0000\u0000\u0000\u00ca\u008c\u0001\u0000\u0000\u0000\u00ca\u0092\u0001"+
		"\u0000\u0000\u0000\u00ca\u0099\u0001\u0000\u0000\u0000\u00ca\u009e\u0001"+
		"\u0000\u0000\u0000\u00ca\u00a3\u0001\u0000\u0000\u0000\u00ca\u00af\u0001"+
		"\u0000\u0000\u0000\u00ca\u00b5\u0001\u0000\u0000\u0000\u00ca\u00bc\u0001"+
		"\u0000\u0000\u0000\u00cb\u0019\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005"+
		" \u0000\u0000\u00cd\u00ce\u0006\r\uffff\uffff\u0000\u00ce\u00cf\u0003"+
		"\u001c\u000e\u0000\u00cf\u001b\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005"+
		"\u0007\u0000\u0000\u00d1\u00d2\u0005 \u0000\u0000\u00d2\u00d3\u0006\u000e"+
		"\uffff\uffff\u0000\u00d3\u00d6\u0003\u001c\u000e\u0000\u00d4\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d0\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u001d\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003"+
		"\"\u0011\u0000\u00d8\u00d9\u0003 \u0010\u0000\u00d9\u00da\u0006\u000f"+
		"\uffff\uffff\u0000\u00da\u001f\u0001\u0000\u0000\u0000\u00db\u00dc\u0005"+
		"\u0007\u0000\u0000\u00dc\u00dd\u0003 \u0010\u0000\u00dd\u00de\u0006\u0010"+
		"\uffff\uffff\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00e1\u0006"+
		"\u0010\uffff\uffff\u0000\u00e0\u00db\u0001\u0000\u0000\u0000\u00e0\u00df"+
		"\u0001\u0000\u0000\u0000\u00e1!\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003"+
		"(\u0014\u0000\u00e3\u00e4\u0003$\u0012\u0000\u00e4\u00e5\u0006\u0011\uffff"+
		"\uffff\u0000\u00e5#\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003&\u0013\u0000"+
		"\u00e7\u00e8\u0003(\u0014\u0000\u00e8\u00e9\u0003$\u0012\u0000\u00e9\u00ea"+
		"\u0006\u0012\uffff\uffff\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ed\u0006\u0012\uffff\uffff\u0000\u00ec\u00e6\u0001\u0000\u0000\u0000"+
		"\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed%\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0005\u0013\u0000\u0000\u00ef\u00f9\u0006\u0013\uffff\uffff\u0000"+
		"\u00f0\u00f1\u0005\u0014\u0000\u0000\u00f1\u00f9\u0006\u0013\uffff\uffff"+
		"\u0000\u00f2\u00f3\u0005\u0015\u0000\u0000\u00f3\u00f9\u0006\u0013\uffff"+
		"\uffff\u0000\u00f4\u00f5\u0005\u0016\u0000\u0000\u00f5\u00f9\u0006\u0013"+
		"\uffff\uffff\u0000\u00f6\u00f7\u0005\u0017\u0000\u0000\u00f7\u00f9\u0006"+
		"\u0013\uffff\uffff\u0000\u00f8\u00ee\u0001\u0000\u0000\u0000\u00f8\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f2\u0001\u0000\u0000\u0000\u00f8\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\'\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0005 \u0000\u0000\u00fb\u00fc\u0005\u0002"+
		"\u0000\u0000\u00fc\u00fd\u0003\u001e\u000f\u0000\u00fd\u00fe\u0005\u0003"+
		"\u0000\u0000\u00fe\u00ff\u0006\u0014\uffff\uffff\u0000\u00ff\u010f\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0005 \u0000\u0000\u0101\u0102\u0005\u0002"+
		"\u0000\u0000\u0102\u0103\u0005\u0003\u0000\u0000\u0103\u010f\u0006\u0014"+
		"\uffff\uffff\u0000\u0104\u0105\u0005\u0002\u0000\u0000\u0105\u0106\u0003"+
		"\"\u0011\u0000\u0106\u0107\u0005\u0003\u0000\u0000\u0107\u0108\u0006\u0014"+
		"\uffff\uffff\u0000\u0108\u010f\u0001\u0000\u0000\u0000\u0109\u010a\u0005"+
		" \u0000\u0000\u010a\u010f\u0006\u0014\uffff\uffff\u0000\u010b\u010c\u0003"+
		"\u0004\u0002\u0000\u010c\u010d\u0006\u0014\uffff\uffff\u0000\u010d\u010f"+
		"\u0001\u0000\u0000\u0000\u010e\u00fa\u0001\u0000\u0000\u0000\u010e\u0100"+
		"\u0001\u0000\u0000\u0000\u010e\u0104\u0001\u0000\u0000\u0000\u010e\u0109"+
		"\u0001\u0000\u0000\u0000\u010e\u010b\u0001\u0000\u0000\u0000\u010f)\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u00030\u0018\u0000\u0111\u0112\u0006\u0015"+
		"\uffff\uffff\u0000\u0112\u011b\u0001\u0000\u0000\u0000\u0113\u0114\u0003"+
		"0\u0018\u0000\u0114\u0115\u0006\u0015\uffff\uffff\u0000\u0115\u0116\u0003"+
		".\u0017\u0000\u0116\u0117\u00030\u0018\u0000\u0117\u0118\u0003,\u0016"+
		"\u0000\u0118\u0119\u0006\u0015\uffff\uffff\u0000\u0119\u011b\u0001\u0000"+
		"\u0000\u0000\u011a\u0110\u0001\u0000\u0000\u0000\u011a\u0113\u0001\u0000"+
		"\u0000\u0000\u011b+\u0001\u0000\u0000\u0000\u011c\u011d\u0003.\u0017\u0000"+
		"\u011d\u011e\u00030\u0018\u0000\u011e\u011f\u0003,\u0016\u0000\u011f\u0120"+
		"\u0006\u0016\uffff\uffff\u0000\u0120\u0123\u0001\u0000\u0000\u0000\u0121"+
		"\u0123\u0001\u0000\u0000\u0000\u0122\u011c\u0001\u0000\u0000\u0000\u0122"+
		"\u0121\u0001\u0000\u0000\u0000\u0123-\u0001\u0000\u0000\u0000\u0124\u0125"+
		"\u0005\u0018\u0000\u0000\u0125\u0129\u0006\u0017\uffff\uffff\u0000\u0126"+
		"\u0127\u0005\u0019\u0000\u0000\u0127\u0129\u0006\u0017\uffff\uffff\u0000"+
		"\u0128\u0124\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000"+
		"\u0129/\u0001\u0000\u0000\u0000\u012a\u012b\u00032\u0019\u0000\u012b\u012c"+
		"\u0006\u0018\uffff\uffff\u0000\u012c\u0132\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0005\u001a\u0000\u0000\u012e\u012f\u00032\u0019\u0000\u012f\u0130"+
		"\u0006\u0018\uffff\uffff\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131"+
		"\u012a\u0001\u0000\u0000\u0000\u0131\u012d\u0001\u0000\u0000\u0000\u0132"+
		"1\u0001\u0000\u0000\u0000\u0133\u0134\u0003\"\u0011\u0000\u0134\u0135"+
		"\u00034\u001a\u0000\u0135\u0136\u0003\"\u0011\u0000\u0136\u0137\u0006"+
		"\u0019\uffff\uffff\u0000\u01373\u0001\u0000\u0000\u0000\u0138\u0139\u0005"+
		"\u001b\u0000\u0000\u0139\u0143\u0006\u001a\uffff\uffff\u0000\u013a\u013b"+
		"\u0005\u001c\u0000\u0000\u013b\u0143\u0006\u001a\uffff\uffff\u0000\u013c"+
		"\u013d\u0005\u001d\u0000\u0000\u013d\u0143\u0006\u001a\uffff\uffff\u0000"+
		"\u013e\u013f\u0005\u001e\u0000\u0000\u013f\u0143\u0006\u001a\uffff\uffff"+
		"\u0000\u0140\u0141\u0005\u001f\u0000\u0000\u0141\u0143\u0006\u001a\uffff"+
		"\uffff\u0000\u0142\u0138\u0001\u0000\u0000\u0000\u0142\u013a\u0001\u0000"+
		"\u0000\u0000\u0142\u013c\u0001\u0000\u0000\u0000\u0142\u013e\u0001\u0000"+
		"\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u01435\u0001\u0000\u0000"+
		"\u0000\u0012BJPcu}\u0086\u00ca\u00d5\u00e0\u00ec\u00f8\u010e\u011a\u0122"+
		"\u0128\u0131\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}