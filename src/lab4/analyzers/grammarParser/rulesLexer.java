// Generated from C:/Users/Arsenii/labs-translation-methods/src/lab4/analyzers/grammarParser\rules.g4 by ANTLR 4.10.1
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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rulesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MEMBER=4, NODE_CONTEXT=5, TOKEN_NAME=6, RULE_NAME=7, 
		CODE=8, SEMANTIC_RULE=9, LITERAL=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "MEMBER", "NODE_CONTEXT", "TOKEN_NAME", "RULE_NAME", 
			"CODE", "SEMANTIC_RULE", "LITERAL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'|'", "';'", "'@member'", "'@node'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "MEMBER", "NODE_CONTEXT", "TOKEN_NAME", "RULE_NAME", 
			"CODE", "SEMANTIC_RULE", "LITERAL", "WS"
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
		"\u0004\u0000\u000bW\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0004\u0005.\b\u0005\u000b\u0005"+
		"\f\u0005/\u0001\u0006\u0001\u0006\u0005\u00064\b\u0006\n\u0006\f\u0006"+
		"7\t\u0006\u0001\u0007\u0001\u0007\u0004\u0007;\b\u0007\u000b\u0007\f\u0007"+
		"<\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0004\bC\b\b\u000b\b\f\bD\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tM\b\t\n\t\f\tP\t\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001D\u0000\u000b\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0001\u0000\u0007\u0001\u0000AZ\u0003\u0000"+
		"09AZ__\u0001\u0000az\u0004\u000009AZ__az\u0001\u0000$$\u0001\u0000\'\'"+
		"\u0003\u0000\t\n\r\r  \\\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0001\u0017\u0001\u0000"+
		"\u0000\u0000\u0003\u0019\u0001\u0000\u0000\u0000\u0005\u001b\u0001\u0000"+
		"\u0000\u0000\u0007\u001d\u0001\u0000\u0000\u0000\t%\u0001\u0000\u0000"+
		"\u0000\u000b+\u0001\u0000\u0000\u0000\r1\u0001\u0000\u0000\u0000\u000f"+
		"8\u0001\u0000\u0000\u0000\u0011@\u0001\u0000\u0000\u0000\u0013H\u0001"+
		"\u0000\u0000\u0000\u0015S\u0001\u0000\u0000\u0000\u0017\u0018\u0005:\u0000"+
		"\u0000\u0018\u0002\u0001\u0000\u0000\u0000\u0019\u001a\u0005|\u0000\u0000"+
		"\u001a\u0004\u0001\u0000\u0000\u0000\u001b\u001c\u0005;\u0000\u0000\u001c"+
		"\u0006\u0001\u0000\u0000\u0000\u001d\u001e\u0005@\u0000\u0000\u001e\u001f"+
		"\u0005m\u0000\u0000\u001f \u0005e\u0000\u0000 !\u0005m\u0000\u0000!\""+
		"\u0005b\u0000\u0000\"#\u0005e\u0000\u0000#$\u0005r\u0000\u0000$\b\u0001"+
		"\u0000\u0000\u0000%&\u0005@\u0000\u0000&\'\u0005n\u0000\u0000\'(\u0005"+
		"o\u0000\u0000()\u0005d\u0000\u0000)*\u0005e\u0000\u0000*\n\u0001\u0000"+
		"\u0000\u0000+-\u0007\u0000\u0000\u0000,.\u0007\u0001\u0000\u0000-,\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u00000\f\u0001\u0000\u0000\u000015\u0007\u0002\u0000"+
		"\u000024\u0007\u0003\u0000\u000032\u0001\u0000\u0000\u000047\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006\u000e"+
		"\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u00008:\u0005{\u0000\u0000"+
		"9;\b\u0004\u0000\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>?\u0005}\u0000\u0000?\u0010\u0001\u0000\u0000\u0000@B\u0005{\u0000"+
		"\u0000AC\t\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FG\u0005}\u0000\u0000G\u0012\u0001\u0000\u0000\u0000HN\u0005"+
		"\'\u0000\u0000IJ\u0005\'\u0000\u0000JM\u0005\'\u0000\u0000KM\b\u0005\u0000"+
		"\u0000LI\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005\'\u0000\u0000R\u0014"+
		"\u0001\u0000\u0000\u0000ST\u0007\u0006\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UV\u0006\n\u0000\u0000V\u0016\u0001\u0000\u0000\u0000\u0007\u0000"+
		"/5<DLN\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}