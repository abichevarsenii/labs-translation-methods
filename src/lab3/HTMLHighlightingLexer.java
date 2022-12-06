// Generated from C:/Users/Arsenii/Downloads/labs-translation-methods/src/lab3\HTMLHighlighting.g4 by ANTLR 4.10.1
package lab3;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLHighlightingLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PACKAGE=2, PACKAGE_END=3, IMPORT=4, NAME=5, PACKAGE_NAME=6, WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PACKAGE", "PACKAGE_END", "IMPORT", "NAME", "PACKAGE_NAME", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'package'", "'.*'", "'import'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PACKAGE", "PACKAGE_END", "IMPORT", "NAME", "PACKAGE_NAME", 
			"WS"
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


	public HTMLHighlightingLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTMLHighlighting.g4"; }

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
		"\u0004\u0000\u00077\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0004\u0004%\b\u0004\u000b\u0004\f\u0004&\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005,\b\u0005\n\u0005\f\u0005/\t"+
		"\u0005\u0001\u0006\u0004\u00062\b\u0006\u000b\u0006\f\u00063\u0001\u0006"+
		"\u0001\u0006\u0000\u0000\u0007\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u0001\u0000\u0002\u0004\u000009AZ_"+
		"_az\u0003\u0000\t\n\r\r  9\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0001\u000f\u0001\u0000"+
		"\u0000\u0000\u0003\u0011\u0001\u0000\u0000\u0000\u0005\u0019\u0001\u0000"+
		"\u0000\u0000\u0007\u001c\u0001\u0000\u0000\u0000\t$\u0001\u0000\u0000"+
		"\u0000\u000b(\u0001\u0000\u0000\u0000\r1\u0001\u0000\u0000\u0000\u000f"+
		"\u0010\u0005;\u0000\u0000\u0010\u0002\u0001\u0000\u0000\u0000\u0011\u0012"+
		"\u0005p\u0000\u0000\u0012\u0013\u0005a\u0000\u0000\u0013\u0014\u0005c"+
		"\u0000\u0000\u0014\u0015\u0005k\u0000\u0000\u0015\u0016\u0005a\u0000\u0000"+
		"\u0016\u0017\u0005g\u0000\u0000\u0017\u0018\u0005e\u0000\u0000\u0018\u0004"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0005.\u0000\u0000\u001a\u001b\u0005"+
		"*\u0000\u0000\u001b\u0006\u0001\u0000\u0000\u0000\u001c\u001d\u0005i\u0000"+
		"\u0000\u001d\u001e\u0005m\u0000\u0000\u001e\u001f\u0005p\u0000\u0000\u001f"+
		" \u0005o\u0000\u0000 !\u0005r\u0000\u0000!\"\u0005t\u0000\u0000\"\b\u0001"+
		"\u0000\u0000\u0000#%\u0007\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000"+
		"%&\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000"+
		"\u0000\'\n\u0001\u0000\u0000\u0000(-\u0003\t\u0004\u0000)*\u0005.\u0000"+
		"\u0000*,\u0003\t\u0004\u0000+)\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.\f\u0001\u0000"+
		"\u0000\u0000/-\u0001\u0000\u0000\u000002\u0007\u0001\u0000\u000010\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"34\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0006\u0006\u0000"+
		"\u00006\u000e\u0001\u0000\u0000\u0000\u0004\u0000&-3\u0001\u0000\u0001"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}