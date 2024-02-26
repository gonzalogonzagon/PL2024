// Generated from C:/Users/gonza/Desktop/UNI/AÑO 4/SEGUNDO CUATRI/Procesadores de Lenguajes/Proyecto Final/PracticaObligatoriaPL24/src/Grammar.g4 by ANTLR 4.13.1
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
		IDENT=1, DECIMAL_INTEGER_CONST=2, OCTAL_INTEGER_CONST=3, HEXA_INTEGER_CONST=4, 
		DECIMAL_REAL_CONST=5, OCTAL_REAL_CONST=6, HEXA_REAL_CONST=7, CONSTLIT=8, 
		WS=9, NL=10, B=11, IG=12;
	public static final int
		RULE_program = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENT", "DECIMAL_INTEGER_CONST", "OCTAL_INTEGER_CONST", "HEXA_INTEGER_CONST", 
			"DECIMAL_REAL_CONST", "OCTAL_REAL_CONST", "HEXA_REAL_CONST", "CONSTLIT", 
			"WS", "NL", "B", "IG"
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

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public List<TerminalNode> DECIMAL_INTEGER_CONST() { return getTokens(GrammarParser.DECIMAL_INTEGER_CONST); }
		public TerminalNode DECIMAL_INTEGER_CONST(int i) {
			return getToken(GrammarParser.DECIMAL_INTEGER_CONST, i);
		}
		public List<TerminalNode> OCTAL_INTEGER_CONST() { return getTokens(GrammarParser.OCTAL_INTEGER_CONST); }
		public TerminalNode OCTAL_INTEGER_CONST(int i) {
			return getToken(GrammarParser.OCTAL_INTEGER_CONST, i);
		}
		public List<TerminalNode> HEXA_INTEGER_CONST() { return getTokens(GrammarParser.HEXA_INTEGER_CONST); }
		public TerminalNode HEXA_INTEGER_CONST(int i) {
			return getToken(GrammarParser.HEXA_INTEGER_CONST, i);
		}
		public List<TerminalNode> DECIMAL_REAL_CONST() { return getTokens(GrammarParser.DECIMAL_REAL_CONST); }
		public TerminalNode DECIMAL_REAL_CONST(int i) {
			return getToken(GrammarParser.DECIMAL_REAL_CONST, i);
		}
		public List<TerminalNode> OCTAL_REAL_CONST() { return getTokens(GrammarParser.OCTAL_REAL_CONST); }
		public TerminalNode OCTAL_REAL_CONST(int i) {
			return getToken(GrammarParser.OCTAL_REAL_CONST, i);
		}
		public List<TerminalNode> HEXA_REAL_CONST() { return getTokens(GrammarParser.HEXA_REAL_CONST); }
		public TerminalNode HEXA_REAL_CONST(int i) {
			return getToken(GrammarParser.HEXA_REAL_CONST, i);
		}
		public List<TerminalNode> CONSTLIT() { return getTokens(GrammarParser.CONSTLIT); }
		public TerminalNode CONSTLIT(int i) {
			return getToken(GrammarParser.CONSTLIT, i);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarParser.WS, i);
		}
		public List<TerminalNode> B() { return getTokens(GrammarParser.B); }
		public TerminalNode B(int i) {
			return getToken(GrammarParser.B, i);
		}
		public List<TerminalNode> NL() { return getTokens(GrammarParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GrammarParser.NL, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4094L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(5); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4094L) != 0) );
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
		"\u0004\u0001\f\b\u0002\u0000\u0007\u0000\u0001\u0000\u0004\u0000\u0004"+
		"\b\u0000\u000b\u0000\f\u0000\u0005\u0001\u0000\u0000\u0000\u0001\u0000"+
		"\u0000\u0001\u0001\u0000\u0001\u000b\u0007\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0002\u0004\u0007\u0000\u0000\u0000\u0003\u0002\u0001\u0000\u0000"+
		"\u0000\u0004\u0005\u0001\u0000\u0000\u0000\u0005\u0003\u0001\u0000\u0000"+
		"\u0000\u0005\u0006\u0001\u0000\u0000\u0000\u0006\u0001\u0001\u0000\u0000"+
		"\u0000\u0001\u0005";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}