// Generated from java-escape by ANTLR 4.11.1
package lab4.analyzers.grammarParser;
import lab4.analyzers.grammar.Grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class rulesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, CODE=6, GRAMMAR_NAME=7, IMPORT=8, 
		MEMBER=9, NODE_CONTEXT=10, RETURN_TYPE=11, RETURN_VALUE=12, TOKEN_NAME=13, 
		RULE_NAME=14, ARG=15, SEMANTIC_RULE=16, LITERAL=17, WS=18;
	public static final int
		RULE_start = 0, RULE_grammarName = 1, RULE_members = 2, RULE_nodeContext = 3, 
		RULE_imports = 4, RULE_nonTerminals = 5, RULE_nonTerminal = 6, RULE_right = 7, 
		RULE_ruleName = 8, RULE_semantics = 9, RULE_terminals = 10, RULE_terminal = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "grammarName", "members", "nodeContext", "imports", "nonTerminals", 
			"nonTerminal", "right", "ruleName", "semantics", "terminals", "terminal"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public rulesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public Grammar x;
		public Grammar val;
		public GrammarNameContext grammarName() {
			return getRuleContext(GrammarNameContext.class,0);
		}
		public NonTerminalsContext nonTerminals() {
			return getRuleContext(NonTerminalsContext.class,0);
		}
		public TerminalsContext terminals() {
			return getRuleContext(TerminalsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(rulesParser.EOF, 0); }
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public NodeContextContext nodeContext() {
			return getRuleContext(NodeContextContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StartContext(ParserRuleContext parent, int invokingState, Grammar x) {
			super(parent, invokingState);
			this.x = x;
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start(Grammar x) throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState(), x);
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			grammarName(_localctx.x);
			{
			setState(25);
			imports(_localctx.x);
			}
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MEMBER) {
				{
				setState(26);
				members(_localctx.x);
				}
			}

			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NODE_CONTEXT) {
				{
				setState(29);
				nodeContext(_localctx.x);
				}
			}

			setState(32);
			nonTerminals(_localctx.x);
			setState(33);
			terminals(_localctx.x);
			setState(34);
			match(EOF);
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
	public static class GrammarNameContext extends ParserRuleContext {
		public Grammar x;
		public Grammar val;
		public TerminalNode GRAMMAR_NAME() { return getToken(rulesParser.GRAMMAR_NAME, 0); }
		public GrammarNameContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public GrammarNameContext(ParserRuleContext parent, int invokingState, Grammar x) {
			super(parent, invokingState);
			this.x = x;
		}
		@Override public int getRuleIndex() { return RULE_grammarName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterGrammarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitGrammarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitGrammarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarNameContext grammarName(Grammar x) throws RecognitionException {
		GrammarNameContext _localctx = new GrammarNameContext(_ctx, getState(), x);
		enterRule(_localctx, 2, RULE_grammarName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(GRAMMAR_NAME);
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
	public static class MembersContext extends ParserRuleContext {
		public Grammar x;
		public Grammar val;
		public TerminalNode MEMBER() { return getToken(rulesParser.MEMBER, 0); }
		public TerminalNode CODE() { return getToken(rulesParser.CODE, 0); }
		public MembersContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MembersContext(ParserRuleContext parent, int invokingState, Grammar x) {
			super(parent, invokingState);
			this.x = x;
		}
		@Override public int getRuleIndex() { return RULE_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembersContext members(Grammar x) throws RecognitionException {
		MembersContext _localctx = new MembersContext(_ctx, getState(), x);
		enterRule(_localctx, 4, RULE_members);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(MEMBER);
			setState(39);
			match(CODE);
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
	public static class NodeContextContext extends ParserRuleContext {
		public Grammar x;
		public Grammar val;
		public TerminalNode NODE_CONTEXT() { return getToken(rulesParser.NODE_CONTEXT, 0); }
		public TerminalNode RETURN_TYPE() { return getToken(rulesParser.RETURN_TYPE, 0); }
		public TerminalNode RETURN_VALUE() { return getToken(rulesParser.RETURN_VALUE, 0); }
		public NodeContextContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NodeContextContext(ParserRuleContext parent, int invokingState, Grammar x) {
			super(parent, invokingState);
			this.x = x;
		}
		@Override public int getRuleIndex() { return RULE_nodeContext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterNodeContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitNodeContext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitNodeContext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContextContext nodeContext(Grammar x) throws RecognitionException {
		NodeContextContext _localctx = new NodeContextContext(_ctx, getState(), x);
		enterRule(_localctx, 6, RULE_nodeContext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(NODE_CONTEXT);
			setState(42);
			match(T__0);
			setState(43);
			match(RETURN_TYPE);
			setState(44);
			match(RETURN_VALUE);
			setState(45);
			match(T__1);
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
	public static class ImportsContext extends ParserRuleContext {
		public Grammar x;
		public Grammar val;
		public List<TerminalNode> IMPORT() { return getTokens(rulesParser.IMPORT); }
		public TerminalNode IMPORT(int i) {
			return getToken(rulesParser.IMPORT, i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ImportsContext(ParserRuleContext parent, int invokingState, Grammar x) {
			super(parent, invokingState);
			this.x = x;
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports(Grammar x) throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState(), x);
		enterRule(_localctx, 8, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(47);
				match(IMPORT);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class NonTerminalsContext extends ParserRuleContext {
		public Grammar x;
		public Grammar val;
		public List<NonTerminalContext> nonTerminal() {
			return getRuleContexts(NonTerminalContext.class);
		}
		public NonTerminalContext nonTerminal(int i) {
			return getRuleContext(NonTerminalContext.class,i);
		}
		public NonTerminalsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NonTerminalsContext(ParserRuleContext parent, int invokingState, Grammar x) {
			super(parent, invokingState);
			this.x = x;
		}
		@Override public int getRuleIndex() { return RULE_nonTerminals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterNonTerminals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitNonTerminals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitNonTerminals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTerminalsContext nonTerminals(Grammar x) throws RecognitionException {
		NonTerminalsContext _localctx = new NonTerminalsContext(_ctx, getState(), x);
		enterRule(_localctx, 10, RULE_nonTerminals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				nonTerminal(_localctx.x);
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RULE_NAME );
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
	public static class NonTerminalContext extends ParserRuleContext {
		public Grammar x;
		public Grammar val;
		public RuleNameContext ruleName() {
			return getRuleContext(RuleNameContext.class,0);
		}
		public List<RightContext> right() {
			return getRuleContexts(RightContext.class);
		}
		public RightContext right(int i) {
			return getRuleContext(RightContext.class,i);
		}
		public NonTerminalContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NonTerminalContext(ParserRuleContext parent, int invokingState, Grammar x) {
			super(parent, invokingState);
			this.x = x;
		}
		@Override public int getRuleIndex() { return RULE_nonTerminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterNonTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitNonTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitNonTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTerminalContext nonTerminal(Grammar x) throws RecognitionException {
		NonTerminalContext _localctx = new NonTerminalContext(_ctx, getState(), x);
		enterRule(_localctx, 12, RULE_nonTerminal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			ruleName(_localctx.x);
			setState(59);
			match(T__2);
			setState(60);
			right(_localctx.x);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(61);
				match(T__3);
				setState(62);
				right(_localctx.x);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(T__4);
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
	public static class RightContext extends ParserRuleContext {
		public Grammar x;
		public Grammar val;
		public List<RuleNameContext> ruleName() {
			return getRuleContexts(RuleNameContext.class);
		}
		public RuleNameContext ruleName(int i) {
			return getRuleContext(RuleNameContext.class,i);
		}
		public List<TerminalNode> TOKEN_NAME() { return getTokens(rulesParser.TOKEN_NAME); }
		public TerminalNode TOKEN_NAME(int i) {
			return getToken(rulesParser.TOKEN_NAME, i);
		}
		public List<SemanticsContext> semantics() {
			return getRuleContexts(SemanticsContext.class);
		}
		public SemanticsContext semantics(int i) {
			return getRuleContext(SemanticsContext.class,i);
		}
		public RightContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RightContext(ParserRuleContext parent, int invokingState, Grammar x) {
			super(parent, invokingState);
			this.x = x;
		}
		@Override public int getRuleIndex() { return RULE_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightContext right(Grammar x) throws RecognitionException {
		RightContext _localctx = new RightContext(_ctx, getState(), x);
		enterRule(_localctx, 14, RULE_right);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RULE_NAME:
					{
					setState(70);
					ruleName(_localctx.x);
					}
					break;
				case TOKEN_NAME:
					{
					setState(71);
					match(TOKEN_NAME);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMANTIC_RULE) {
					{
					setState(74);
					semantics(_localctx.x);
					}
				}

				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOKEN_NAME || _la==RULE_NAME );
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
	public static class RuleNameContext extends ParserRuleContext {
		public Grammar x;
		public Grammar val;
		public TerminalNode RULE_NAME() { return getToken(rulesParser.RULE_NAME, 0); }
		public List<TerminalNode> ARG() { return getTokens(rulesParser.ARG); }
		public TerminalNode ARG(int i) {
			return getToken(rulesParser.ARG, i);
		}
		public RuleNameContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RuleNameContext(ParserRuleContext parent, int invokingState, Grammar x) {
			super(parent, invokingState);
			this.x = x;
		}
		@Override public int getRuleIndex() { return RULE_ruleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterRuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitRuleName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitRuleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleNameContext ruleName(Grammar x) throws RecognitionException {
		RuleNameContext _localctx = new RuleNameContext(_ctx, getState(), x);
		enterRule(_localctx, 16, RULE_ruleName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(RULE_NAME);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARG) {
				{
				{
				setState(82);
				match(ARG);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class SemanticsContext extends ParserRuleContext {
		public Grammar x;
		public Grammar val;
		public TerminalNode SEMANTIC_RULE() { return getToken(rulesParser.SEMANTIC_RULE, 0); }
		public SemanticsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SemanticsContext(ParserRuleContext parent, int invokingState, Grammar x) {
			super(parent, invokingState);
			this.x = x;
		}
		@Override public int getRuleIndex() { return RULE_semantics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterSemantics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitSemantics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitSemantics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemanticsContext semantics(Grammar x) throws RecognitionException {
		SemanticsContext _localctx = new SemanticsContext(_ctx, getState(), x);
		enterRule(_localctx, 18, RULE_semantics);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(SEMANTIC_RULE);
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
	public static class TerminalsContext extends ParserRuleContext {
		public Grammar x;
		public Grammar val;
		public List<TerminalContext> terminal() {
			return getRuleContexts(TerminalContext.class);
		}
		public TerminalContext terminal(int i) {
			return getRuleContext(TerminalContext.class,i);
		}
		public TerminalsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TerminalsContext(ParserRuleContext parent, int invokingState, Grammar x) {
			super(parent, invokingState);
			this.x = x;
		}
		@Override public int getRuleIndex() { return RULE_terminals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterTerminals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitTerminals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitTerminals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalsContext terminals(Grammar x) throws RecognitionException {
		TerminalsContext _localctx = new TerminalsContext(_ctx, getState(), x);
		enterRule(_localctx, 20, RULE_terminals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				terminal(_localctx.x);
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOKEN_NAME );
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
	public static class TerminalContext extends ParserRuleContext {
		public Grammar x;
		public Grammar val;
		public TerminalNode TOKEN_NAME() { return getToken(rulesParser.TOKEN_NAME, 0); }
		public List<TerminalNode> LITERAL() { return getTokens(rulesParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(rulesParser.LITERAL, i);
		}
		public TerminalContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TerminalContext(ParserRuleContext parent, int invokingState, Grammar x) {
			super(parent, invokingState);
			this.x = x;
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalContext terminal(Grammar x) throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState(), x);
		enterRule(_localctx, 22, RULE_terminal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(TOKEN_NAME);
			setState(96);
			match(T__2);
			setState(97);
			match(LITERAL);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(98);
				match(T__3);
				setState(99);
				match(LITERAL);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(T__4);
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
		"\u0004\u0001\u0012l\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001c\b\u0000\u0001\u0000\u0003"+
		"\u0000\u001f\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0005"+
		"\u00041\b\u0004\n\u0004\f\u00044\t\u0004\u0001\u0005\u0004\u00057\b\u0005"+
		"\u000b\u0005\f\u00058\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006@\b\u0006\n\u0006\f\u0006C\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007I\b\u0007\u0001\u0007"+
		"\u0003\u0007L\b\u0007\u0004\u0007N\b\u0007\u000b\u0007\f\u0007O\u0001"+
		"\b\u0001\b\u0005\bT\b\b\n\b\f\bW\t\b\u0001\t\u0001\t\u0001\n\u0004\n\\"+
		"\b\n\u000b\n\f\n]\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000be\b\u000b\n\u000b\f\u000bh\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0000\u0000j\u0000\u0018\u0001\u0000\u0000\u0000\u0002"+
		"$\u0001\u0000\u0000\u0000\u0004&\u0001\u0000\u0000\u0000\u0006)\u0001"+
		"\u0000\u0000\u0000\b2\u0001\u0000\u0000\u0000\n6\u0001\u0000\u0000\u0000"+
		"\f:\u0001\u0000\u0000\u0000\u000eM\u0001\u0000\u0000\u0000\u0010Q\u0001"+
		"\u0000\u0000\u0000\u0012X\u0001\u0000\u0000\u0000\u0014[\u0001\u0000\u0000"+
		"\u0000\u0016_\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0002\u0001\u0000"+
		"\u0019\u001b\u0003\b\u0004\u0000\u001a\u001c\u0003\u0004\u0002\u0000\u001b"+
		"\u001a\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c"+
		"\u001e\u0001\u0000\u0000\u0000\u001d\u001f\u0003\u0006\u0003\u0000\u001e"+
		"\u001d\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 !\u0003\n\u0005\u0000!\"\u0003\u0014\n\u0000"+
		"\"#\u0005\u0000\u0000\u0001#\u0001\u0001\u0000\u0000\u0000$%\u0005\u0007"+
		"\u0000\u0000%\u0003\u0001\u0000\u0000\u0000&\'\u0005\t\u0000\u0000\'("+
		"\u0005\u0006\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)*\u0005\n\u0000"+
		"\u0000*+\u0005\u0001\u0000\u0000+,\u0005\u000b\u0000\u0000,-\u0005\f\u0000"+
		"\u0000-.\u0005\u0002\u0000\u0000.\u0007\u0001\u0000\u0000\u0000/1\u0005"+
		"\b\u0000\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u00003\t\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000057\u0003\f\u0006\u000065\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009\u000b\u0001\u0000\u0000\u0000:;\u0003\u0010\b\u0000;<\u0005\u0003"+
		"\u0000\u0000<A\u0003\u000e\u0007\u0000=>\u0005\u0004\u0000\u0000>@\u0003"+
		"\u000e\u0007\u0000?=\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000DE\u0005\u0005\u0000\u0000E\r\u0001\u0000"+
		"\u0000\u0000FI\u0003\u0010\b\u0000GI\u0005\r\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000HG\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JL\u0003"+
		"\u0012\t\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001"+
		"\u0000\u0000\u0000MH\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u000f\u0001\u0000"+
		"\u0000\u0000QU\u0005\u000e\u0000\u0000RT\u0005\u000f\u0000\u0000SR\u0001"+
		"\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000V\u0011\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000XY\u0005\u0010\u0000\u0000Y\u0013\u0001\u0000\u0000\u0000"+
		"Z\\\u0003\u0016\u000b\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\u0015\u0001"+
		"\u0000\u0000\u0000_`\u0005\r\u0000\u0000`a\u0005\u0003\u0000\u0000af\u0005"+
		"\u0011\u0000\u0000bc\u0005\u0004\u0000\u0000ce\u0005\u0011\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000ij\u0005\u0005\u0000\u0000j\u0017\u0001\u0000\u0000\u0000"+
		"\u000b\u001b\u001e28AHKOU]f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}