// Generated from C:/Users/Arsenii/Downloads/labs-translation-methods/src/lab3\HTMLHighlighting.g4 by ANTLR 4.10.1
package lab3;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLHighlightingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PACKAGE=2, PACKAGE_END=3, IMPORT=4, NAME=5, PACKAGE_NAME=6, WS=7;
	public static final int
		RULE_start = 0, RULE_headerNode = 1, RULE_packageNode = 2, RULE_importNode = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "headerNode", "packageNode", "importNode"
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

	@Override
	public String getGrammarFileName() { return "HTMLHighlighting.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLHighlightingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public String val;
		public HeaderNodeContext headerNode;
		public HeaderNodeContext headerNode() {
			return getRuleContext(HeaderNodeContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			((StartContext)_localctx).headerNode = headerNode();
			 ((StartContext)_localctx).val =  ((StartContext)_localctx).headerNode.val;
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

	public static class HeaderNodeContext extends ParserRuleContext {
		public String val;
		public PackageNodeContext packageNode;
		public ImportNodeContext importNode;
		public PackageNodeContext packageNode() {
			return getRuleContext(PackageNodeContext.class,0);
		}
		public ImportNodeContext importNode() {
			return getRuleContext(ImportNodeContext.class,0);
		}
		public HeaderNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterHeaderNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitHeaderNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitHeaderNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderNodeContext headerNode() throws RecognitionException {
		HeaderNodeContext _localctx = new HeaderNodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_headerNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(11);
				((HeaderNodeContext)_localctx).packageNode = packageNode();
				}
			}

			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORT) {
				{
				setState(14);
				((HeaderNodeContext)_localctx).importNode = importNode();
				}
			}

			 ((HeaderNodeContext)_localctx).val =  Tools.getClass(((HeaderNodeContext)_localctx).packageNode.val,"var") + Tools.nextLine(2) +Tools.getClass(((HeaderNodeContext)_localctx).importNode.val + ";","simple") + Tools.nextLine() ; 
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

	public static class PackageNodeContext extends ParserRuleContext {
		public String val;
		public Token PACKAGE_NAME;
		public TerminalNode PACKAGE() { return getToken(HTMLHighlightingParser.PACKAGE, 0); }
		public TerminalNode PACKAGE_NAME() { return getToken(HTMLHighlightingParser.PACKAGE_NAME, 0); }
		public PackageNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterPackageNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitPackageNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitPackageNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNodeContext packageNode() throws RecognitionException {
		PackageNodeContext _localctx = new PackageNodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_packageNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(PACKAGE);
			setState(20);
			((PackageNodeContext)_localctx).PACKAGE_NAME = match(PACKAGE_NAME);
			setState(21);
			match(T__0);
			 ((PackageNodeContext)_localctx).val =  Tools.getPackage((((PackageNodeContext)_localctx).PACKAGE_NAME!=null?((PackageNodeContext)_localctx).PACKAGE_NAME.getText():null)) ; 
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

	public static class ImportNodeContext extends ParserRuleContext {
		public String val;
		public Token IMPORT;
		public List<Token> el = new ArrayList<Token>();
		public Token PACKAGE_NAME;
		public Token PACKAGE_END;
		public ImportNodeContext importNode() {
			return getRuleContext(ImportNodeContext.class,0);
		}
		public TerminalNode IMPORT() { return getToken(HTMLHighlightingParser.IMPORT, 0); }
		public TerminalNode PACKAGE_NAME() { return getToken(HTMLHighlightingParser.PACKAGE_NAME, 0); }
		public TerminalNode PACKAGE_END() { return getToken(HTMLHighlightingParser.PACKAGE_END, 0); }
		public ImportNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterImportNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitImportNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitImportNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNodeContext importNode() throws RecognitionException {
		ImportNodeContext _localctx = new ImportNodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importNode);
		int _la;
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				((ImportNodeContext)_localctx).IMPORT = match(IMPORT);
				((ImportNodeContext)_localctx).el.add(((ImportNodeContext)_localctx).IMPORT);
				setState(25);
				((ImportNodeContext)_localctx).PACKAGE_NAME = match(PACKAGE_NAME);
				((ImportNodeContext)_localctx).el.add(((ImportNodeContext)_localctx).PACKAGE_NAME);
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PACKAGE_END) {
					{
					setState(26);
					((ImportNodeContext)_localctx).PACKAGE_END = match(PACKAGE_END);
					((ImportNodeContext)_localctx).el.add(((ImportNodeContext)_localctx).PACKAGE_END);
					}
				}

				setState(29);
				match(T__0);
				setState(30);
				importNode();
				 ((ImportNodeContext)_localctx).val = String.valueOf(((ImportNodeContext)_localctx).el.size());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(IMPORT);
				setState(34);
				((ImportNodeContext)_localctx).PACKAGE_NAME = match(PACKAGE_NAME);
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PACKAGE_END) {
					{
					setState(35);
					match(PACKAGE_END);
					}
				}

				setState(38);
				match(T__0);
				 ((ImportNodeContext)_localctx).val =  Tools.getImport((((ImportNodeContext)_localctx).PACKAGE_NAME!=null?((ImportNodeContext)_localctx).PACKAGE_NAME.getText():null)); 
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

	public static final String _serializedATN =
		"\u0004\u0001\u0007+\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0003\u0001\r\b\u0001\u0001\u0001\u0003\u0001\u0010"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u001c"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003%\b\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003)\b\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006"+
		"\u0000\u0000+\u0000\b\u0001\u0000\u0000\u0000\u0002\f\u0001\u0000\u0000"+
		"\u0000\u0004\u0013\u0001\u0000\u0000\u0000\u0006(\u0001\u0000\u0000\u0000"+
		"\b\t\u0003\u0002\u0001\u0000\t\n\u0006\u0000\uffff\uffff\u0000\n\u0001"+
		"\u0001\u0000\u0000\u0000\u000b\r\u0003\u0004\u0002\u0000\f\u000b\u0001"+
		"\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000f\u0001\u0000\u0000"+
		"\u0000\u000e\u0010\u0003\u0006\u0003\u0000\u000f\u000e\u0001\u0000\u0000"+
		"\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000"+
		"\u0000\u0011\u0012\u0006\u0001\uffff\uffff\u0000\u0012\u0003\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0005\u0002\u0000\u0000\u0014\u0015\u0005\u0006"+
		"\u0000\u0000\u0015\u0016\u0005\u0001\u0000\u0000\u0016\u0017\u0006\u0002"+
		"\uffff\uffff\u0000\u0017\u0005\u0001\u0000\u0000\u0000\u0018\u0019\u0005"+
		"\u0004\u0000\u0000\u0019\u001b\u0005\u0006\u0000\u0000\u001a\u001c\u0005"+
		"\u0003\u0000\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0005"+
		"\u0001\u0000\u0000\u001e\u001f\u0003\u0006\u0003\u0000\u001f \u0006\u0003"+
		"\uffff\uffff\u0000 )\u0001\u0000\u0000\u0000!\"\u0005\u0004\u0000\u0000"+
		"\"$\u0005\u0006\u0000\u0000#%\u0005\u0003\u0000\u0000$#\u0001\u0000\u0000"+
		"\u0000$%\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0005\u0001"+
		"\u0000\u0000\')\u0006\u0003\uffff\uffff\u0000(\u0018\u0001\u0000\u0000"+
		"\u0000(!\u0001\u0000\u0000\u0000)\u0007\u0001\u0000\u0000\u0000\u0005"+
		"\f\u000f\u001b$(";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}