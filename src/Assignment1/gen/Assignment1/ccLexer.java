// Generated from C:/Users/esben/Desktop/Skoleting/Sem 5/CoCo/CoCoGroup35/src/Assignment1\cc.g4 by ANTLR 4.10.1
package Assignment1.gen.Assignment1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ccLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, IDENTIFIER=14, INT=15, FLOAT=16, 
		EQUALS=17, WHITESPACE=18, COMMENT=19, LONGCOMMENT=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "IDENTIFIER", "INT", "FLOAT", "EQUALS", 
			"WHITESPACE", "COMMENT", "LONGCOMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.hardware'", "'.inputs'", "'.outputs'", "'.latches'", "'->'", 
			"'.update'", "'='", "'.simulate'", "'!'", "'&&'", "'||'", "'('", "')'", 
			null, null, null, "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "IDENTIFIER", "INT", "FLOAT", "EQUALS", "WHITESPACE", "COMMENT", 
			"LONGCOMMENT"
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


	public ccLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cc.g4"; }

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
		"\u0004\u0000\u0014\u00ac\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0005\rs\b\r\n\r\f\rv\t\r\u0001\u000e\u0004\u000ey\b\u000e"+
		"\u000b\u000e\f\u000ez\u0001\u000f\u0004\u000f~\b\u000f\u000b\u000f\f\u000f"+
		"\u007f\u0001\u000f\u0001\u000f\u0004\u000f\u0084\b\u000f\u000b\u000f\f"+
		"\u000f\u0085\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011"+
		"\u008c\b\u0011\u000b\u0011\f\u0011\u008d\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0096\b\u0012\n"+
		"\u0012\f\u0012\u0099\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00a3"+
		"\b\u0013\n\u0013\f\u0013\u00a6\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014\u0001\u0000\u0007\u0002\u0000AZaz\u0005\u0000 "+
		" 09AZ^_az\u0001\u000009\u0002\u0000\t\n  \u0001\u0000\n\n\u0001\u0000"+
		"**\u0001\u0000//\u00b3\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001"+
		")\u0001\u0000\u0000\u0000\u00033\u0001\u0000\u0000\u0000\u0005;\u0001"+
		"\u0000\u0000\u0000\u0007D\u0001\u0000\u0000\u0000\tM\u0001\u0000\u0000"+
		"\u0000\u000bP\u0001\u0000\u0000\u0000\rX\u0001\u0000\u0000\u0000\u000f"+
		"Z\u0001\u0000\u0000\u0000\u0011d\u0001\u0000\u0000\u0000\u0013f\u0001"+
		"\u0000\u0000\u0000\u0015i\u0001\u0000\u0000\u0000\u0017l\u0001\u0000\u0000"+
		"\u0000\u0019n\u0001\u0000\u0000\u0000\u001bp\u0001\u0000\u0000\u0000\u001d"+
		"x\u0001\u0000\u0000\u0000\u001f}\u0001\u0000\u0000\u0000!\u0087\u0001"+
		"\u0000\u0000\u0000#\u008b\u0001\u0000\u0000\u0000%\u0091\u0001\u0000\u0000"+
		"\u0000\'\u009c\u0001\u0000\u0000\u0000)*\u0005.\u0000\u0000*+\u0005h\u0000"+
		"\u0000+,\u0005a\u0000\u0000,-\u0005r\u0000\u0000-.\u0005d\u0000\u0000"+
		"./\u0005w\u0000\u0000/0\u0005a\u0000\u000001\u0005r\u0000\u000012\u0005"+
		"e\u0000\u00002\u0002\u0001\u0000\u0000\u000034\u0005.\u0000\u000045\u0005"+
		"i\u0000\u000056\u0005n\u0000\u000067\u0005p\u0000\u000078\u0005u\u0000"+
		"\u000089\u0005t\u0000\u00009:\u0005s\u0000\u0000:\u0004\u0001\u0000\u0000"+
		"\u0000;<\u0005.\u0000\u0000<=\u0005o\u0000\u0000=>\u0005u\u0000\u0000"+
		">?\u0005t\u0000\u0000?@\u0005p\u0000\u0000@A\u0005u\u0000\u0000AB\u0005"+
		"t\u0000\u0000BC\u0005s\u0000\u0000C\u0006\u0001\u0000\u0000\u0000DE\u0005"+
		".\u0000\u0000EF\u0005l\u0000\u0000FG\u0005a\u0000\u0000GH\u0005t\u0000"+
		"\u0000HI\u0005c\u0000\u0000IJ\u0005h\u0000\u0000JK\u0005e\u0000\u0000"+
		"KL\u0005s\u0000\u0000L\b\u0001\u0000\u0000\u0000MN\u0005-\u0000\u0000"+
		"NO\u0005>\u0000\u0000O\n\u0001\u0000\u0000\u0000PQ\u0005.\u0000\u0000"+
		"QR\u0005u\u0000\u0000RS\u0005p\u0000\u0000ST\u0005d\u0000\u0000TU\u0005"+
		"a\u0000\u0000UV\u0005t\u0000\u0000VW\u0005e\u0000\u0000W\f\u0001\u0000"+
		"\u0000\u0000XY\u0005=\u0000\u0000Y\u000e\u0001\u0000\u0000\u0000Z[\u0005"+
		".\u0000\u0000[\\\u0005s\u0000\u0000\\]\u0005i\u0000\u0000]^\u0005m\u0000"+
		"\u0000^_\u0005u\u0000\u0000_`\u0005l\u0000\u0000`a\u0005a\u0000\u0000"+
		"ab\u0005t\u0000\u0000bc\u0005e\u0000\u0000c\u0010\u0001\u0000\u0000\u0000"+
		"de\u0005!\u0000\u0000e\u0012\u0001\u0000\u0000\u0000fg\u0005&\u0000\u0000"+
		"gh\u0005&\u0000\u0000h\u0014\u0001\u0000\u0000\u0000ij\u0005|\u0000\u0000"+
		"jk\u0005|\u0000\u0000k\u0016\u0001\u0000\u0000\u0000lm\u0005(\u0000\u0000"+
		"m\u0018\u0001\u0000\u0000\u0000no\u0005)\u0000\u0000o\u001a\u0001\u0000"+
		"\u0000\u0000pt\u0007\u0000\u0000\u0000qs\u0007\u0001\u0000\u0000rq\u0001"+
		"\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000u\u001c\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000wy\u0007\u0002\u0000\u0000xw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{\u001e\u0001\u0000\u0000\u0000|~\u0007\u0002\u0000\u0000}|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u0083\u0005.\u0000\u0000\u0082\u0084\u0007\u0002\u0000\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		" \u0001\u0000\u0000\u0000\u0087\u0088\u0005=\u0000\u0000\u0088\u0089\u0005"+
		"=\u0000\u0000\u0089\"\u0001\u0000\u0000\u0000\u008a\u008c\u0007\u0003"+
		"\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0006\u0011"+
		"\u0000\u0000\u0090$\u0001\u0000\u0000\u0000\u0091\u0092\u0005/\u0000\u0000"+
		"\u0092\u0093\u0005/\u0000\u0000\u0093\u0097\u0001\u0000\u0000\u0000\u0094"+
		"\u0096\b\u0004\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0099"+
		"\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0001\u0000\u0000\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0006\u0012\u0000\u0000\u009b&\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0005/\u0000\u0000\u009d\u009e\u0005*\u0000"+
		"\u0000\u009e\u00a4\u0001\u0000\u0000\u0000\u009f\u00a3\b\u0005\u0000\u0000"+
		"\u00a0\u00a1\u0005*\u0000\u0000\u00a1\u00a3\b\u0006\u0000\u0000\u00a2"+
		"\u009f\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005*\u0000\u0000\u00a8\u00a9"+
		"\u0005/\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0006"+
		"\u0013\u0000\u0000\u00ab(\u0001\u0000\u0000\u0000\t\u0000tz\u007f\u0085"+
		"\u008d\u0097\u00a2\u00a4\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}