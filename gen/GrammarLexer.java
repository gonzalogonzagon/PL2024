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
		IDENT=1, DECIMAL_INTEGER_CONST=2, OCTAL_INTEGER_CONST=3, HEXA_INTEGER_CONST=4, 
		DECIMAL_REAL_CONST=5, OCTAL_REAL_CONST=6, HEXA_REAL_CONST=7, CONSTLIT=8, 
		WS=9, NL=10, B=11, IG=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDENT", "DECIMAL_INTEGER_CONST", "OCTAL_INTEGER_CONST", "HEXA_INTEGER_CONST", 
			"DECIMAL_REAL_CONST", "OCTAL_REAL_CONST", "HEXA_REAL_CONST", "CONSTLIT", 
			"WS", "NL", "B", "IG", "DEC_DIGIT", "OCT_DIGIT"
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

	public static final String _serializedATN =
		"\u0004\u0000\f\u008e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0003\u0000\u001f"+
		"\b\u0000\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001"+
		"\u0001\u0003\u0001(\b\u0001\u0001\u0001\u0004\u0001+\b\u0001\u000b\u0001"+
		"\f\u0001,\u0001\u0002\u0003\u00020\b\u0002\u0001\u0002\u0001\u0002\u0004"+
		"\u00024\b\u0002\u000b\u0002\f\u00025\u0001\u0003\u0003\u00039\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003?\b\u0003"+
		"\u000b\u0003\f\u0003@\u0001\u0004\u0003\u0004D\b\u0004\u0001\u0004\u0004"+
		"\u0004G\b\u0004\u000b\u0004\f\u0004H\u0001\u0004\u0001\u0004\u0004\u0004"+
		"M\b\u0004\u000b\u0004\f\u0004N\u0001\u0005\u0003\u0005R\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0004\u0005V\b\u0005\u000b\u0005\f\u0005W\u0001\u0005"+
		"\u0001\u0005\u0004\u0005\\\b\u0005\u000b\u0005\f\u0005]\u0001\u0006\u0003"+
		"\u0006a\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004"+
		"\u0006g\b\u0006\u000b\u0006\f\u0006h\u0001\u0006\u0001\u0006\u0004\u0006"+
		"m\b\u0006\u000b\u0006\f\u0006n\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007u\b\u0007\n\u0007\f\u0007x\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0004\n"+
		"\u0083\b\n\u000b\n\f\n\u0084\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\u0000\u001b\u0000\u0001\u0000\u0007"+
		"\u0003\u0000$$AZaz\u0005\u0000$$09AZ__az\u0002\u0000++--\u0001\u0000\'"+
		"\'\u0002\u0000\t\t\f\r\u0001\u000019\u0001\u000009\u009e\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u001e\u0001\u0000\u0000"+
		"\u0000\u0003\'\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000"+
		"\u00078\u0001\u0000\u0000\u0000\tC\u0001\u0000\u0000\u0000\u000bQ\u0001"+
		"\u0000\u0000\u0000\r`\u0001\u0000\u0000\u0000\u000fp\u0001\u0000\u0000"+
		"\u0000\u0011{\u0001\u0000\u0000\u0000\u0013\u007f\u0001\u0000\u0000\u0000"+
		"\u0015\u0082\u0001\u0000\u0000\u0000\u0017\u0086\u0001\u0000\u0000\u0000"+
		"\u0019\u008a\u0001\u0000\u0000\u0000\u001b\u008c\u0001\u0000\u0000\u0000"+
		"\u001d\u001f\u0007\u0000\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000"+
		"\u001f#\u0001\u0000\u0000\u0000 \"\u0007\u0001\u0000\u0000! \u0001\u0000"+
		"\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$\u0002\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000&(\u0007\u0002\u0000\u0000\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000(*\u0001\u0000\u0000\u0000)+\u0003\u0019\f\u0000*)\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-\u0004\u0001\u0000\u0000\u0000.0\u0007\u0002\u0000"+
		"\u0000/.\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u000013\u00050\u0000\u000024\u0003\u001b\r\u000032\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u00006\u0006\u0001\u0000\u0000\u000079\u0007\u0002\u0000"+
		"\u000087\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0001\u0000"+
		"\u0000\u0000:;\u00050\u0000\u0000;<\u0005x\u0000\u0000<>\u0001\u0000\u0000"+
		"\u0000=?\u0003\u0019\f\u0000>=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A\b\u0001\u0000"+
		"\u0000\u0000BD\u0007\u0002\u0000\u0000CB\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000EG\u0003\u0019\f\u0000FE\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0005.\u0000\u0000"+
		"KM\u0003\u0019\f\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\n\u0001\u0000\u0000"+
		"\u0000PR\u0007\u0002\u0000\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u00050\u0000\u0000TV\u0003\u001b"+
		"\r\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0005"+
		".\u0000\u0000Z\\\u0003\u0019\f\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^\f\u0001\u0000\u0000\u0000_a\u0007\u0002\u0000\u0000`_\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u00050\u0000"+
		"\u0000cd\u0005x\u0000\u0000df\u0001\u0000\u0000\u0000eg\u0003\u0019\f"+
		"\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0005"+
		".\u0000\u0000km\u0003\u0019\f\u0000lk\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"o\u000e\u0001\u0000\u0000\u0000pv\u0005\'\u0000\u0000qu\b\u0003\u0000"+
		"\u0000rs\u0005\\\u0000\u0000su\u0005\'\u0000\u0000tq\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000yz\u0005\'\u0000\u0000z\u0010\u0001\u0000\u0000\u0000"+
		"{|\u0007\u0004\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0006\b\u0000\u0000"+
		"~\u0012\u0001\u0000\u0000\u0000\u007f\u0080\u0005\n\u0000\u0000\u0080"+
		"\u0014\u0001\u0000\u0000\u0000\u0081\u0083\u0005 \u0000\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0016"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\t\u0000\u0000\u0000\u0087\u0088\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0006\u000b\u0000\u0000\u0089\u0018\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0007\u0005\u0000\u0000\u008b\u001a\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0007\u0006\u0000\u0000\u008d\u001c\u0001"+
		"\u0000\u0000\u0000\u0016\u0000\u001e!#\',/58@CHNQW]`hntv\u0084\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}