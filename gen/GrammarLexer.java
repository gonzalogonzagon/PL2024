// Generated from C:/Users/gonza/Desktop/UNI/AÑO 4/SEGUNDO CUATRI/Procesadores de Lenguajes/Proyecto Final/PracticaObligatoriaPL24/src/Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DECIMAL_INTEGER_CONST=1, OCTAL_INTEGER_CONST=2, HEXA_INTEGER_CONST=3, 
		DECIMAL_REAL_CONST=4, OCTAL_REAL_CONST=5, HEXA_REAL_CONST=6, CONSTLIT=7, 
		WS=8, NL=9, B=10, BACKSLASH=11, IG=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DECIMAL_INTEGER_CONST", "OCTAL_INTEGER_CONST", "HEXA_INTEGER_CONST", 
			"DECIMAL_REAL_CONST", "OCTAL_REAL_CONST", "HEXA_REAL_CONST", "CONSTLIT", 
			"WS", "NL", "B", "BACKSLASH", "IG", "DEC_DIGIT", "OCT_DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'\\n'", null, 
			"'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DECIMAL_INTEGER_CONST", "OCTAL_INTEGER_CONST", "HEXA_INTEGER_CONST", 
			"DECIMAL_REAL_CONST", "OCTAL_REAL_CONST", "HEXA_REAL_CONST", "CONSTLIT", 
			"WS", "NL", "B", "BACKSLASH", "IG"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 10:
			BACKSLASH_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void BACKSLASH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.print(getText().substring(1));
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\f\u0088\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0003\u0000\u001f"+
		"\b\u0000\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000\f\u0000#\u0001"+
		"\u0001\u0003\u0001\'\b\u0001\u0001\u0001\u0001\u0001\u0004\u0001+\b\u0001"+
		"\u000b\u0001\f\u0001,\u0001\u0002\u0003\u00020\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0004\u00026\b\u0002\u000b\u0002\f\u0002"+
		"7\u0001\u0003\u0003\u0003;\b\u0003\u0001\u0003\u0004\u0003>\b\u0003\u000b"+
		"\u0003\f\u0003?\u0001\u0003\u0001\u0003\u0004\u0003D\b\u0003\u000b\u0003"+
		"\f\u0003E\u0001\u0004\u0003\u0004I\b\u0004\u0001\u0004\u0001\u0004\u0004"+
		"\u0004M\b\u0004\u000b\u0004\f\u0004N\u0001\u0004\u0001\u0004\u0004\u0004"+
		"S\b\u0004\u000b\u0004\f\u0004T\u0001\u0005\u0003\u0005X\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005^\b\u0005\u000b"+
		"\u0005\f\u0005_\u0001\u0005\u0001\u0005\u0004\u0005d\b\u0005\u000b\u0005"+
		"\f\u0005e\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"l\b\u0006\n\u0006\f\u0006o\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0004\tz"+
		"\b\t\u000b\t\f\t{\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0000\u0000\u000e\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\u0000\u001b\u0000\u0001"+
		"\u0000\u0005\u0002\u0000++--\u0001\u0000\'\'\u0002\u0000\t\t\f\r\u0001"+
		"\u000019\u0001\u000009\u0097\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0001\u001e\u0001\u0000\u0000\u0000\u0003&\u0001\u0000"+
		"\u0000\u0000\u0005/\u0001\u0000\u0000\u0000\u0007:\u0001\u0000\u0000\u0000"+
		"\tH\u0001\u0000\u0000\u0000\u000bW\u0001\u0000\u0000\u0000\rg\u0001\u0000"+
		"\u0000\u0000\u000fr\u0001\u0000\u0000\u0000\u0011v\u0001\u0000\u0000\u0000"+
		"\u0013y\u0001\u0000\u0000\u0000\u0015}\u0001\u0000\u0000\u0000\u0017\u0080"+
		"\u0001\u0000\u0000\u0000\u0019\u0084\u0001\u0000\u0000\u0000\u001b\u0086"+
		"\u0001\u0000\u0000\u0000\u001d\u001f\u0007\u0000\u0000\u0000\u001e\u001d"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f!\u0001"+
		"\u0000\u0000\u0000 \"\u0003\u0019\f\u0000! \u0001\u0000\u0000\u0000\""+
		"#\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000$\u0002\u0001\u0000\u0000\u0000%\'\u0007\u0000\u0000\u0000&%\u0001"+
		"\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(*\u00050\u0000\u0000)+\u0003\u001b\r\u0000*)\u0001\u0000\u0000\u0000"+
		"+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-\u0004\u0001\u0000\u0000\u0000.0\u0007\u0000\u0000\u0000/.\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u0000"+
		"12\u00050\u0000\u000023\u0005x\u0000\u000035\u0001\u0000\u0000\u00004"+
		"6\u0003\u0019\f\u000054\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u0006\u0001\u0000"+
		"\u0000\u00009;\u0007\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000<>\u0003\u0019\f\u0000=<\u0001"+
		"\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0005.\u0000\u0000"+
		"BD\u0003\u0019\f\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\b\u0001\u0000\u0000"+
		"\u0000GI\u0007\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u00050\u0000\u0000KM\u0003\u001b"+
		"\r\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0005"+
		".\u0000\u0000QS\u0003\u0019\f\u0000RQ\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"U\n\u0001\u0000\u0000\u0000VX\u0007\u0000\u0000\u0000WV\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u00050\u0000"+
		"\u0000Z[\u0005x\u0000\u0000[]\u0001\u0000\u0000\u0000\\^\u0003\u0019\f"+
		"\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0005"+
		".\u0000\u0000bd\u0003\u0019\f\u0000cb\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"f\f\u0001\u0000\u0000\u0000gm\u0005\'\u0000\u0000hl\b\u0001\u0000\u0000"+
		"ij\u0005\\\u0000\u0000jl\u0005\'\u0000\u0000kh\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000pq\u0005\'\u0000\u0000q\u000e\u0001\u0000\u0000\u0000rs\u0007"+
		"\u0002\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0006\u0007\u0000\u0000"+
		"u\u0010\u0001\u0000\u0000\u0000vw\u0005\n\u0000\u0000w\u0012\u0001\u0000"+
		"\u0000\u0000xz\u0005 \u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0014"+
		"\u0001\u0000\u0000\u0000}~\u0005\'\u0000\u0000~\u007f\u0006\n\u0001\u0000"+
		"\u007f\u0016\u0001\u0000\u0000\u0000\u0080\u0081\t\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0006\u000b\u0000\u0000\u0083"+
		"\u0018\u0001\u0000\u0000\u0000\u0084\u0085\u0007\u0003\u0000\u0000\u0085"+
		"\u001a\u0001\u0000\u0000\u0000\u0086\u0087\u0007\u0004\u0000\u0000\u0087"+
		"\u001c\u0001\u0000\u0000\u0000\u0013\u0000\u001e#&,/7:?EHNTW_ekm{\u0002"+
		"\u0006\u0000\u0000\u0001\n\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}