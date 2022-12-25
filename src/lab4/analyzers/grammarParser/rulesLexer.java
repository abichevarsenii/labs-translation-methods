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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, GRAMMAR_NAME=6, MEMBER=7, NODE_CONTEXT=8, 
		RETURN_TYPE=9, RETURN_VALUE=10, TOKEN_NAME=11, RULE_NAME=12, ARG=13, CODE=14, 
		SEMANTIC_RULE=15, LITERAL=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "GRAMMAR_NAME", "MEMBER", "NODE_CONTEXT", 
			"RETURN_TYPE", "RETURN_VALUE", "TOKEN_NAME", "RULE_NAME", "ARG", "CODE", 
			"SEMANTIC_RULE", "LITERAL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "':'", "'|'", "';'", null, "'@member'", "'@node'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "GRAMMAR_NAME", "MEMBER", "NODE_CONTEXT", 
			"RETURN_TYPE", "RETURN_VALUE", "TOKEN_NAME", "RULE_NAME", "ARG", "CODE", 
			"SEMANTIC_RULE", "LITERAL", "WS"
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
		"\u0004\u0000\u0011\u00a1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005"+
		"7\b\u0005\u000b\u0005\f\u00058\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0004\bS\b\b\u000b\b\f\bT\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\tb\b\t\u000b\t\f\tc\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0004\nj\b\n\u000b\n\f\nk\u0001\u000b\u0001"+
		"\u000b\u0005\u000bp\b\u000b\n\u000b\f\u000bs\t\u000b\u0001\f\u0001\f\u0004"+
		"\fw\b\f\u000b\f\f\fx\u0001\f\u0001\f\u0001\r\u0001\r\u0004\r\u007f\b\r"+
		"\u000b\r\f\r\u0080\u0001\r\u0001\r\u0004\r\u0085\b\r\u000b\r\f\r\u0086"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0004\u000e\u008d\b\u000e\u000b"+
		"\u000e\f\u000e\u008e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0097\b\u000f\n\u000f\f\u000f\u009a\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u00058Tcx\u008e\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011\u0001\u0000"+
		"\u0006\u0001\u0000AZ\u0003\u000009AZ__\u0001\u0000az\u0004\u000009AZ_"+
		"_az\u0001\u0000\'\'\u0003\u0000\t\n\r\r  \u00ab\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001"+
		"#\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005\'\u0001"+
		"\u0000\u0000\u0000\u0007)\u0001\u0000\u0000\u0000\t+\u0001\u0000\u0000"+
		"\u0000\u000b-\u0001\u0000\u0000\u0000\r<\u0001\u0000\u0000\u0000\u000f"+
		"D\u0001\u0000\u0000\u0000\u0011J\u0001\u0000\u0000\u0000\u0013X\u0001"+
		"\u0000\u0000\u0000\u0015g\u0001\u0000\u0000\u0000\u0017m\u0001\u0000\u0000"+
		"\u0000\u0019t\u0001\u0000\u0000\u0000\u001b|\u0001\u0000\u0000\u0000\u001d"+
		"\u008a\u0001\u0000\u0000\u0000\u001f\u0092\u0001\u0000\u0000\u0000!\u009d"+
		"\u0001\u0000\u0000\u0000#$\u0005(\u0000\u0000$\u0002\u0001\u0000\u0000"+
		"\u0000%&\u0005)\u0000\u0000&\u0004\u0001\u0000\u0000\u0000\'(\u0005:\u0000"+
		"\u0000(\u0006\u0001\u0000\u0000\u0000)*\u0005|\u0000\u0000*\b\u0001\u0000"+
		"\u0000\u0000+,\u0005;\u0000\u0000,\n\u0001\u0000\u0000\u0000-.\u0005g"+
		"\u0000\u0000./\u0005r\u0000\u0000/0\u0005a\u0000\u000001\u0005m\u0000"+
		"\u000012\u0005m\u0000\u000023\u0005a\u0000\u000034\u0005r\u0000\u0000"+
		"46\u0001\u0000\u0000\u000057\t\u0000\u0000\u000065\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:;\u0005;\u0000\u0000;\f\u0001\u0000\u0000"+
		"\u0000<=\u0005@\u0000\u0000=>\u0005m\u0000\u0000>?\u0005e\u0000\u0000"+
		"?@\u0005m\u0000\u0000@A\u0005b\u0000\u0000AB\u0005e\u0000\u0000BC\u0005"+
		"r\u0000\u0000C\u000e\u0001\u0000\u0000\u0000DE\u0005@\u0000\u0000EF\u0005"+
		"n\u0000\u0000FG\u0005o\u0000\u0000GH\u0005d\u0000\u0000HI\u0005e\u0000"+
		"\u0000I\u0010\u0001\u0000\u0000\u0000JK\u0005r\u0000\u0000KL\u0005e\u0000"+
		"\u0000LM\u0005t\u0000\u0000MN\u0005u\u0000\u0000NO\u0005r\u0000\u0000"+
		"OP\u0005n\u0000\u0000PR\u0001\u0000\u0000\u0000QS\t\u0000\u0000\u0000"+
		"RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0005;\u0000"+
		"\u0000W\u0012\u0001\u0000\u0000\u0000XY\u0005d\u0000\u0000YZ\u0005e\u0000"+
		"\u0000Z[\u0005f\u0000\u0000[\\\u0005a\u0000\u0000\\]\u0005u\u0000\u0000"+
		"]^\u0005l\u0000\u0000^_\u0005t\u0000\u0000_a\u0001\u0000\u0000\u0000`"+
		"b\t\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000ef\u0005;\u0000\u0000f\u0014\u0001\u0000\u0000\u0000gi\u0007\u0000"+
		"\u0000\u0000hj\u0007\u0001\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"l\u0016\u0001\u0000\u0000\u0000mq\u0007\u0002\u0000\u0000np\u0007\u0003"+
		"\u0000\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0018\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000tv\u0005[\u0000\u0000uw\t\u0000\u0000"+
		"\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005"+
		"]\u0000\u0000{\u001a\u0001\u0000\u0000\u0000|~\u0005(\u0000\u0000}\u007f"+
		"\u0007\u0003\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0005=\u0000\u0000"+
		"\u0083\u0085\u0007\u0003\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0005)\u0000\u0000\u0089\u001c\u0001\u0000\u0000\u0000\u008a"+
		"\u008c\u0005{\u0000\u0000\u008b\u008d\t\u0000\u0000\u0000\u008c\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005}\u0000\u0000\u0091\u001e\u0001"+
		"\u0000\u0000\u0000\u0092\u0098\u0005\'\u0000\u0000\u0093\u0094\u0005\'"+
		"\u0000\u0000\u0094\u0097\u0005\'\u0000\u0000\u0095\u0097\b\u0004\u0000"+
		"\u0000\u0096\u0093\u0001\u0000\u0000\u0000\u0096\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009c\u0005\'\u0000\u0000"+
		"\u009c \u0001\u0000\u0000\u0000\u009d\u009e\u0007\u0005\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0006\u0010\u0000\u0000\u00a0"+
		"\"\u0001\u0000\u0000\u0000\f\u00008Tckqx\u0080\u0086\u008e\u0096\u0098"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}