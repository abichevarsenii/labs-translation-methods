// Generated from java-escape by ANTLR 4.11.1
package lab4.analyzers.grammarParser;
import lab4.analyzers.grammar.Grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class rulesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, CODE=6, GRAMMAR_NAME=7, IMPORT=8, 
		MEMBER=9, NODE_CONTEXT=10, RETURN_TYPE=11, RETURN_VALUE=12, TOKEN_NAME=13, 
		RULE_NAME=14, ARG=15, SEMANTIC_RULE=16, LITERAL=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "CODE", "GRAMMAR_NAME", "IMPORT", 
			"MEMBER", "NODE_CONTEXT", "RETURN_TYPE", "RETURN_VALUE", "TOKEN_NAME", 
			"RULE_NAME", "ARG", "SEMANTIC_RULE", "LITERAL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "':'", "'|'", "';'", null, null, null, "'@member'", 
			"'@node'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "CODE", "GRAMMAR_NAME", "IMPORT", 
			"MEMBER", "NODE_CONTEXT", "RETURN_TYPE", "RETURN_VALUE", "TOKEN_NAME", 
			"RULE_NAME", "ARG", "SEMANTIC_RULE", "LITERAL", "WS"
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


	public rulesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "rules.g4"; }

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
		"\u0004\u0000\u0012\u00ab\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0004\u00052\b\u0005\u000b\u0005\f\u00053\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0004\u0006A\b\u0006\u000b\u0006\f\u0006"+
		"B\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007O\b\u0007"+
		"\u000b\u0007\f\u0007P\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0004\nk\b\n\u000b\n\f\nl\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0004\u000bz\b\u000b\u000b\u000b\f\u000b{\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0004\f\u0082\b\f\u000b\f\f\f\u0083\u0001"+
		"\r\u0001\r\u0005\r\u0088\b\r\n\r\f\r\u008b\t\r\u0001\u000e\u0001\u000e"+
		"\u0004\u000e\u008f\b\u000e\u000b\u000e\f\u000e\u0090\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0004\u000f\u0097\b\u000f\u000b\u000f\f"+
		"\u000f\u0098\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00a1\b\u0010\n\u0010\f\u0010\u00a4\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0007"+
		"3BPl{\u0090\u0098\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001"+
		"\u0000\u0006\u0001\u0000AZ\u0003\u000009AZ__\u0001\u0000az\u0004\u0000"+
		"09AZ__az\u0001\u0000\'\'\u0003\u0000\t\n\r\r  \u00b5\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003\'"+
		"\u0001\u0000\u0000\u0000\u0005)\u0001\u0000\u0000\u0000\u0007+\u0001\u0000"+
		"\u0000\u0000\t-\u0001\u0000\u0000\u0000\u000b/\u0001\u0000\u0000\u0000"+
		"\r7\u0001\u0000\u0000\u0000\u000fF\u0001\u0000\u0000\u0000\u0011T\u0001"+
		"\u0000\u0000\u0000\u0013\\\u0001\u0000\u0000\u0000\u0015b\u0001\u0000"+
		"\u0000\u0000\u0017p\u0001\u0000\u0000\u0000\u0019\u007f\u0001\u0000\u0000"+
		"\u0000\u001b\u0085\u0001\u0000\u0000\u0000\u001d\u008c\u0001\u0000\u0000"+
		"\u0000\u001f\u0094\u0001\u0000\u0000\u0000!\u009c\u0001\u0000\u0000\u0000"+
		"#\u00a7\u0001\u0000\u0000\u0000%&\u0005(\u0000\u0000&\u0002\u0001\u0000"+
		"\u0000\u0000\'(\u0005)\u0000\u0000(\u0004\u0001\u0000\u0000\u0000)*\u0005"+
		":\u0000\u0000*\u0006\u0001\u0000\u0000\u0000+,\u0005|\u0000\u0000,\b\u0001"+
		"\u0000\u0000\u0000-.\u0005;\u0000\u0000.\n\u0001\u0000\u0000\u0000/1\u0005"+
		"$\u0000\u000002\t\u0000\u0000\u000010\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u000056\u0005$\u0000\u00006\f\u0001\u0000\u0000\u0000"+
		"78\u0005g\u0000\u000089\u0005r\u0000\u00009:\u0005a\u0000\u0000:;\u0005"+
		"m\u0000\u0000;<\u0005m\u0000\u0000<=\u0005a\u0000\u0000=>\u0005r\u0000"+
		"\u0000>@\u0001\u0000\u0000\u0000?A\t\u0000\u0000\u0000@?\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0005;\u0000\u0000E\u000e\u0001"+
		"\u0000\u0000\u0000FG\u0005i\u0000\u0000GH\u0005m\u0000\u0000HI\u0005p"+
		"\u0000\u0000IJ\u0005o\u0000\u0000JK\u0005r\u0000\u0000KL\u0005t\u0000"+
		"\u0000LN\u0001\u0000\u0000\u0000MO\t\u0000\u0000\u0000NM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000PN\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0005;\u0000\u0000S\u0010\u0001"+
		"\u0000\u0000\u0000TU\u0005@\u0000\u0000UV\u0005m\u0000\u0000VW\u0005e"+
		"\u0000\u0000WX\u0005m\u0000\u0000XY\u0005b\u0000\u0000YZ\u0005e\u0000"+
		"\u0000Z[\u0005r\u0000\u0000[\u0012\u0001\u0000\u0000\u0000\\]\u0005@\u0000"+
		"\u0000]^\u0005n\u0000\u0000^_\u0005o\u0000\u0000_`\u0005d\u0000\u0000"+
		"`a\u0005e\u0000\u0000a\u0014\u0001\u0000\u0000\u0000bc\u0005r\u0000\u0000"+
		"cd\u0005e\u0000\u0000de\u0005t\u0000\u0000ef\u0005u\u0000\u0000fg\u0005"+
		"r\u0000\u0000gh\u0005n\u0000\u0000hj\u0001\u0000\u0000\u0000ik\t\u0000"+
		"\u0000\u0000ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"no\u0005;\u0000\u0000o\u0016\u0001\u0000\u0000\u0000pq\u0005d\u0000\u0000"+
		"qr\u0005e\u0000\u0000rs\u0005f\u0000\u0000st\u0005a\u0000\u0000tu\u0005"+
		"u\u0000\u0000uv\u0005l\u0000\u0000vw\u0005t\u0000\u0000wy\u0001\u0000"+
		"\u0000\u0000xz\t\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}~\u0005;\u0000\u0000~\u0018\u0001\u0000\u0000\u0000"+
		"\u007f\u0081\u0007\u0000\u0000\u0000\u0080\u0082\u0007\u0001\u0000\u0000"+
		"\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u001a\u0001\u0000\u0000\u0000\u0085\u0089\u0007\u0002\u0000\u0000"+
		"\u0086\u0088\u0007\u0003\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u001c\u0001\u0000\u0000\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008e\u0005[\u0000\u0000\u008d"+
		"\u008f\t\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0090\u008e"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005]\u0000\u0000\u0093\u001e\u0001\u0000\u0000\u0000\u0094\u0096\u0005"+
		"{\u0000\u0000\u0095\u0097\t\u0000\u0000\u0000\u0096\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005}\u0000\u0000\u009b \u0001\u0000\u0000\u0000"+
		"\u009c\u00a2\u0005\'\u0000\u0000\u009d\u009e\u0005\'\u0000\u0000\u009e"+
		"\u00a1\u0005\'\u0000\u0000\u009f\u00a1\b\u0004\u0000\u0000\u00a0\u009d"+
		"\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\'\u0000\u0000\u00a6\"\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0007\u0005\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0006\u0011\u0000\u0000\u00aa$\u0001\u0000"+
		"\u0000\u0000\f\u00003BPl{\u0083\u0089\u0090\u0098\u00a0\u00a2\u0001\u0006"+
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