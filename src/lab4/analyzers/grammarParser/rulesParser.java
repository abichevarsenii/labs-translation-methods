// Generated from C:/Users/Arsenii/labs-translation-methods/src/lab4/analyzers/grammarParser\rules.g4 by ANTLR 4.10.1
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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rulesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MEMBER=4, NODE_CONTEXT=5, TOKEN_NAME=6, RULE_NAME=7, 
		CODE=8, SEMANTIC_RULE=9, LITERAL=10, WS=11;
	public static final int
		RULE_start = 0, RULE_members = 1, RULE_nodeContext = 2, RULE_nonTerminals = 3, 
		RULE_nonTerminal = 4, RULE_right = 5, RULE_terminals = 6, RULE_terminal = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "members", "nodeContext", "nonTerminals", "nonTerminal", "right", 
			"terminals", "terminal"
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

	@Override
	public String getGrammarFileName() { return "rules.g4"; }

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

	public static class StartContext extends ParserRuleContext {
		public Grammar x;
		public Grammar val;
		public NonTerminalsContext nonTerminals() {
			return getRuleContext(NonTerminalsContext.class,0);
		}
		public TerminalsContext terminals() {
			return getRuleContext(TerminalsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(rulesParser.EOF, 0); }
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
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MEMBER) {
				{
				setState(16);
				members(_localctx.x);
				}
			}

			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NODE_CONTEXT) {
				{
				setState(19);
				nodeContext(_localctx.x);
				}
			}

			setState(22);
			nonTerminals(_localctx.x);
			setState(23);
			terminals(_localctx.x);
			setState(24);
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
		enterRule(_localctx, 2, RULE_members);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(MEMBER);
			setState(27);
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

	public static class NodeContextContext extends ParserRuleContext {
		public Grammar x;
		public Grammar val;
		public TerminalNode NODE_CONTEXT() { return getToken(rulesParser.NODE_CONTEXT, 0); }
		public TerminalNode CODE() { return getToken(rulesParser.CODE, 0); }
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
		enterRule(_localctx, 4, RULE_nodeContext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(NODE_CONTEXT);
			setState(30);
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
		enterRule(_localctx, 6, RULE_nonTerminals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				nonTerminal(_localctx.x);
				}
				}
				setState(35); 
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

	public static class NonTerminalContext extends ParserRuleContext {
		public Grammar x;
		public Grammar val;
		public TerminalNode RULE_NAME() { return getToken(rulesParser.RULE_NAME, 0); }
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
		enterRule(_localctx, 8, RULE_nonTerminal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(RULE_NAME);
			setState(38);
			match(T__0);
			setState(39);
			right(_localctx.x);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(40);
				match(T__1);
				setState(41);
				right(_localctx.x);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(T__2);
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

	public static class RightContext extends ParserRuleContext {
		public Grammar x;
		public Grammar val;
		public List<TerminalNode> RULE_NAME() { return getTokens(rulesParser.RULE_NAME); }
		public TerminalNode RULE_NAME(int i) {
			return getToken(rulesParser.RULE_NAME, i);
		}
		public List<TerminalNode> TOKEN_NAME() { return getTokens(rulesParser.TOKEN_NAME); }
		public TerminalNode TOKEN_NAME(int i) {
			return getToken(rulesParser.TOKEN_NAME, i);
		}
		public List<TerminalNode> SEMANTIC_RULE() { return getTokens(rulesParser.SEMANTIC_RULE); }
		public TerminalNode SEMANTIC_RULE(int i) {
			return getToken(rulesParser.SEMANTIC_RULE, i);
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
		enterRule(_localctx, 10, RULE_right);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_NAME) | (1L << RULE_NAME) | (1L << SEMANTIC_RULE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_NAME) | (1L << RULE_NAME) | (1L << SEMANTIC_RULE))) != 0) );
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
		enterRule(_localctx, 12, RULE_terminals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				terminal(_localctx.x);
				}
				}
				setState(57); 
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
		enterRule(_localctx, 14, RULE_terminal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(TOKEN_NAME);
			setState(60);
			match(T__0);
			setState(61);
			match(LITERAL);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(62);
				match(T__1);
				setState(63);
				match(LITERAL);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(T__2);
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
		"\u0004\u0001\u000bH\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0003\u0000\u0012\b\u0000\u0001\u0000\u0003\u0000\u0015\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003"+
		"\"\b\u0003\u000b\u0003\f\u0003#\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004+\b\u0004\n\u0004\f\u0004.\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0004\u00053\b\u0005\u000b\u0005\f\u0005"+
		"4\u0001\u0006\u0004\u00068\b\u0006\u000b\u0006\f\u00069\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007A\b\u0007\n\u0007"+
		"\f\u0007D\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0000\u0001\u0002\u0000\u0006\u0007\t\t"+
		"F\u0000\u0011\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000"+
		"\u0004\u001d\u0001\u0000\u0000\u0000\u0006!\u0001\u0000\u0000\u0000\b"+
		"%\u0001\u0000\u0000\u0000\n2\u0001\u0000\u0000\u0000\f7\u0001\u0000\u0000"+
		"\u0000\u000e;\u0001\u0000\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000"+
		"\u0011\u0010\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000"+
		"\u0012\u0014\u0001\u0000\u0000\u0000\u0013\u0015\u0003\u0004\u0002\u0000"+
		"\u0014\u0013\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0006\u0003\u0000"+
		"\u0017\u0018\u0003\f\u0006\u0000\u0018\u0019\u0005\u0000\u0000\u0001\u0019"+
		"\u0001\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0004\u0000\u0000\u001b"+
		"\u001c\u0005\b\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0005\u0005\u0000\u0000\u001e\u001f\u0005\b\u0000\u0000\u001f\u0005\u0001"+
		"\u0000\u0000\u0000 \"\u0003\b\u0004\u0000! \u0001\u0000\u0000\u0000\""+
		"#\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000$\u0007\u0001\u0000\u0000\u0000%&\u0005\u0007\u0000\u0000&\'\u0005"+
		"\u0001\u0000\u0000\',\u0003\n\u0005\u0000()\u0005\u0002\u0000\u0000)+"+
		"\u0003\n\u0005\u0000*(\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000"+
		",*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000"+
		"\u0000.,\u0001\u0000\u0000\u0000/0\u0005\u0003\u0000\u00000\t\u0001\u0000"+
		"\u0000\u000013\u0007\u0000\u0000\u000021\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"5\u000b\u0001\u0000\u0000\u000068\u0003\u000e\u0007\u000076\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:\r\u0001\u0000\u0000\u0000;<\u0005\u0006\u0000\u0000"+
		"<=\u0005\u0001\u0000\u0000=B\u0005\n\u0000\u0000>?\u0005\u0002\u0000\u0000"+
		"?A\u0005\n\u0000\u0000@>\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000EF\u0005\u0003\u0000\u0000F\u000f\u0001"+
		"\u0000\u0000\u0000\u0007\u0011\u0014#,49B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}