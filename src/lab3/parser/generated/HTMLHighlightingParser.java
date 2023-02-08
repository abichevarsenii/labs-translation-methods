// Generated from java-escape by ANTLR 4.11.1
package lab3.parser.generated;

    import lab3.resources.Tools;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
	import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HTMLHighlightingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, BREAK=11, CASE=12, DEFAULT=13, SWITCH=14, RETURN=15, CLASS=16, 
		IMPLEMENTS=17, EXTENDS=18, FOR=19, IF=20, ELSE=21, THROWS=22, AT=23, NEW=24, 
		ASSIGN=25, NULL=26, INT=27, FLOAT=28, STRING=29, CHAR=30, BOOLEAN=31, 
		TRUE=32, FALSE=33, BINARY_OPERATOR=34, PLUS=35, MINUS=36, MULTIPLY=37, 
		DIVIDE=38, MOD=39, AND=40, OR=41, NOT=42, EQUAL=43, NOT_EQUAL=44, LESS=45, 
		LESS_OR_EQUAL=46, MORE_=47, MORE_OR_EQUAL=48, UNARY_OPERATOR=49, MODIFIER=50, 
		PUBLIC=51, PRIVATE=52, FINAL=53, STATIC=54, VOLATILE=55, TRANSIENT=56, 
		SYNCHRONIZED=57, NATIVE=58, ABSTRACT=59, PROTECTED=60, INT_TYPE=61, FLOAT_TYPE=62, 
		CHAR_TYPE=63, BOOLEAN_TYPE=64, VOID_TYPE=65, NAME=66, WS=67;
	public static final int
		RULE_start = 0, RULE_nameType = 1, RULE_typeVar = 2, RULE_primitiveValue = 3, 
		RULE_primitiveType = 4, RULE_value = 5, RULE_term = 6, RULE_declareVar = 7, 
		RULE_declareField = 8, RULE_assignVar = 9, RULE_callMethod = 10, RULE_function = 11, 
		RULE_annotation = 12, RULE_arg = 13, RULE_exeptions = 14, RULE_bodyFunction = 15, 
		RULE_returnFunction = 16, RULE_class = 17, RULE_implements = 18, RULE_exstends = 19, 
		RULE_constructor = 20, RULE_bodyClass = 21, RULE_castStatement = 22, RULE_ifStatement = 23, 
		RULE_elseStatement = 24, RULE_forStatement = 25, RULE_switchStatement = 26, 
		RULE_caseStatement = 27, RULE_defaultStatement = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "nameType", "typeVar", "primitiveValue", "primitiveType", "value", 
			"term", "declareVar", "declareField", "assignVar", "callMethod", "function", 
			"annotation", "arg", "exeptions", "bodyFunction", "returnFunction", "class", 
			"implements", "exstends", "constructor", "bodyClass", "castStatement", 
			"ifStatement", "elseStatement", "forStatement", "switchStatement", "caseStatement", 
			"defaultStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'['", "']'", "'{'", "','", "'}'", "';'", "'('", "')'", 
			"':'", "'break'", "'case'", "'default'", "'switch'", "'return'", "'class'", 
			"'implements'", "'extends'", "'for'", "'if'", "'else'", "'throws'", "'@'", 
			"'new'", "'='", "'null'", null, null, null, null, null, "'true'", "'false'", 
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", "'=='", 
			"'!='", "'<'", "'<='", "'>'", "'>='", null, null, "'public'", "'private'", 
			"'final'", "'static'", "'volatile'", "'transient'", "'synchronized'", 
			"'native'", "'abstract'", "'protected'", "'int'", "'float'", "'char'", 
			"'boolean'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "BREAK", 
			"CASE", "DEFAULT", "SWITCH", "RETURN", "CLASS", "IMPLEMENTS", "EXTENDS", 
			"FOR", "IF", "ELSE", "THROWS", "AT", "NEW", "ASSIGN", "NULL", "INT", 
			"FLOAT", "STRING", "CHAR", "BOOLEAN", "TRUE", "FALSE", "BINARY_OPERATOR", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MOD", "AND", "OR", "NOT", "EQUAL", 
			"NOT_EQUAL", "LESS", "LESS_OR_EQUAL", "MORE_", "MORE_OR_EQUAL", "UNARY_OPERATOR", 
			"MODIFIER", "PUBLIC", "PRIVATE", "FINAL", "STATIC", "VOLATILE", "TRANSIENT", 
			"SYNCHRONIZED", "NATIVE", "ABSTRACT", "PROTECTED", "INT_TYPE", "FLOAT_TYPE", 
			"CHAR_TYPE", "BOOLEAN_TYPE", "VOID_TYPE", "NAME", "WS"
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

	public HTMLHighlightingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public String val;
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
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
			setState(58);
			class_();
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
	public static class NameTypeContext extends ParserRuleContext {
		public String val;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(HTMLHighlightingParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(HTMLHighlightingParser.NAME, i);
		}
		public NameTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterNameType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitNameType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitNameType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameTypeContext nameType() throws RecognitionException {
		NameTypeContext _localctx = new NameTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nameType);
		try {
			int _alt;
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				if (!( Tools.isNotReservedWord(_input.LT(1).getText()) )) throw new FailedPredicateException(this, " Tools.isNotReservedWord(_input.LT(1).getText()) ");
				setState(62);
				match(NAME);
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						{
						setState(63);
						match(T__0);
						}
						setState(64);
						match(NAME);
						}
						} 
					}
					setState(69);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeVarContext extends ParserRuleContext {
		public String val;
		public NameTypeContext nameType() {
			return getRuleContext(NameTypeContext.class,0);
		}
		public TerminalNode LESS() { return getToken(HTMLHighlightingParser.LESS, 0); }
		public TypeVarContext typeVar() {
			return getRuleContext(TypeVarContext.class,0);
		}
		public TerminalNode MORE_() { return getToken(HTMLHighlightingParser.MORE_, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TypeVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterTypeVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitTypeVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitTypeVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVarContext typeVar() throws RecognitionException {
		return typeVar(0);
	}

	private TypeVarContext typeVar(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeVarContext _localctx = new TypeVarContext(_ctx, _parentState);
		TypeVarContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_typeVar, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(73);
				nameType();
				}
				break;
			case 2:
				{
				setState(74);
				nameType();
				setState(75);
				match(LESS);
				setState(76);
				typeVar(0);
				setState(77);
				match(MORE_);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeVarContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeVar);
					setState(81);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(82);
					match(T__1);
					setState(84);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(83);
						value();
						}
						break;
					}
					setState(86);
					match(T__2);
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveValueContext extends ParserRuleContext {
		public String val;
		public TerminalNode INT() { return getToken(HTMLHighlightingParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(HTMLHighlightingParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(HTMLHighlightingParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(HTMLHighlightingParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(HTMLHighlightingParser.BOOLEAN, 0); }
		public TerminalNode NULL() { return getToken(HTMLHighlightingParser.NULL, 0); }
		public PrimitiveValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterPrimitiveValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitPrimitiveValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitPrimitiveValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveValueContext primitiveValue() throws RecognitionException {
		PrimitiveValueContext _localctx = new PrimitiveValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_primitiveValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4227858432L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public String val;
		public TerminalNode INT_TYPE() { return getToken(HTMLHighlightingParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(HTMLHighlightingParser.FLOAT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(HTMLHighlightingParser.CHAR_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(HTMLHighlightingParser.BOOLEAN_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(HTMLHighlightingParser.VOID_TYPE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 31L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class ValueContext extends ParserRuleContext {
		public String val;
		public PrimitiveValueContext primitiveValue() {
			return getRuleContext(PrimitiveValueContext.class,0);
		}
		public CallMethodContext callMethod() {
			return getRuleContext(CallMethodContext.class,0);
		}
		public TerminalNode NEW() { return getToken(HTMLHighlightingParser.NEW, 0); }
		public TypeVarContext typeVar() {
			return getRuleContext(TypeVarContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public NameTypeContext nameType() {
			return getRuleContext(NameTypeContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		int _la;
		try {
			int _alt;
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				primitiveValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				callMethod();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(NEW);
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(99);
					typeVar(0);
					}
					break;
				}
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(102);
					value();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				callMethod();
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(106);
						match(T__0);
						setState(107);
						value();
						}
						} 
					}
					setState(112);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				nameType();
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(114);
						match(T__0);
						setState(115);
						value();
						}
						} 
					}
					setState(120);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
				match(T__3);
				setState(122);
				value();
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(123);
					match(T__4);
					setState(124);
					value();
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public String val;
		public TerminalNode UNARY_OPERATOR() { return getToken(HTMLHighlightingParser.UNARY_OPERATOR, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode BINARY_OPERATOR() { return getToken(HTMLHighlightingParser.BINARY_OPERATOR, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(135);
				match(UNARY_OPERATOR);
				setState(136);
				term(3);
				}
				break;
			case 2:
				{
				setState(137);
				value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(140);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(141);
						match(BINARY_OPERATOR);
						setState(142);
						term(5);
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(143);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(144);
						match(UNARY_OPERATOR);
						}
						break;
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareVarContext extends ParserRuleContext {
		public String val;
		public TypeVarContext typeVar() {
			return getRuleContext(TypeVarContext.class,0);
		}
		public List<NameTypeContext> nameType() {
			return getRuleContexts(NameTypeContext.class);
		}
		public NameTypeContext nameType(int i) {
			return getRuleContext(NameTypeContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(HTMLHighlightingParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(HTMLHighlightingParser.ASSIGN, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> MODIFIER() { return getTokens(HTMLHighlightingParser.MODIFIER); }
		public TerminalNode MODIFIER(int i) {
			return getToken(HTMLHighlightingParser.MODIFIER, i);
		}
		public DeclareVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterDeclareVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitDeclareVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitDeclareVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareVarContext declareVar() throws RecognitionException {
		DeclareVarContext _localctx = new DeclareVarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declareVar);
		int _la;
		try {
			int _alt;
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				typeVar(0);
				setState(151);
				nameType();
				setState(152);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(154);
						match(MODIFIER);
						}
						} 
					}
					setState(159);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(160);
				typeVar(0);
				{
				setState(161);
				nameType();
				setState(162);
				match(ASSIGN);
				setState(163);
				value();
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(165);
					match(T__4);
					setState(166);
					nameType();
					setState(167);
					match(ASSIGN);
					setState(168);
					value();
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareFieldContext extends ParserRuleContext {
		public String val;
		public TypeVarContext typeVar() {
			return getRuleContext(TypeVarContext.class,0);
		}
		public List<NameTypeContext> nameType() {
			return getRuleContexts(NameTypeContext.class);
		}
		public NameTypeContext nameType(int i) {
			return getRuleContext(NameTypeContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> MODIFIER() { return getTokens(HTMLHighlightingParser.MODIFIER); }
		public TerminalNode MODIFIER(int i) {
			return getToken(HTMLHighlightingParser.MODIFIER, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(HTMLHighlightingParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(HTMLHighlightingParser.ASSIGN, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public DeclareFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterDeclareField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitDeclareField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitDeclareField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareFieldContext declareField() throws RecognitionException {
		DeclareFieldContext _localctx = new DeclareFieldContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declareField);
		int _la;
		try {
			int _alt;
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(177);
					annotation();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(184); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(183);
						match(MODIFIER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(186); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(188);
				typeVar(0);
				setState(189);
				nameType();
				setState(190);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(192);
						match(MODIFIER);
						}
						} 
					}
					setState(197);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(198);
				typeVar(0);
				{
				setState(199);
				nameType();
				setState(200);
				match(ASSIGN);
				setState(201);
				value();
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(203);
					match(T__4);
					setState(204);
					nameType();
					setState(205);
					match(ASSIGN);
					setState(206);
					value();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
				match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignVarContext extends ParserRuleContext {
		public String val;
		public NameTypeContext nameType() {
			return getRuleContext(NameTypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(HTMLHighlightingParser.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterAssignVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitAssignVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitAssignVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignVarContext assignVar() throws RecognitionException {
		AssignVarContext _localctx = new AssignVarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			nameType();
			setState(218);
			match(ASSIGN);
			setState(219);
			value();
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
	public static class CallMethodContext extends ParserRuleContext {
		public String val;
		public List<NameTypeContext> nameType() {
			return getRuleContexts(NameTypeContext.class);
		}
		public NameTypeContext nameType(int i) {
			return getRuleContext(NameTypeContext.class,i);
		}
		public List<CallMethodContext> callMethod() {
			return getRuleContexts(CallMethodContext.class);
		}
		public CallMethodContext callMethod(int i) {
			return getRuleContext(CallMethodContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public CallMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterCallMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitCallMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitCallMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallMethodContext callMethod() throws RecognitionException {
		CallMethodContext _localctx = new CallMethodContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_callMethod);
		int _la;
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				nameType();
				setState(222);
				match(T__7);
				setState(223);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				nameType();
				setState(226);
				match(T__7);
				setState(230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(227);
					nameType();
					}
					break;
				case 2:
					{
					setState(228);
					callMethod();
					}
					break;
				case 3:
					{
					setState(229);
					value();
					}
					break;
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(232);
					match(T__4);
					setState(236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(233);
						nameType();
						}
						break;
					case 2:
						{
						setState(234);
						callMethod();
						}
						break;
					case 3:
						{
						setState(235);
						value();
						}
						break;
					}
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243);
				match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public String val;
		public TypeVarContext typeVar() {
			return getRuleContext(TypeVarContext.class,0);
		}
		public NameTypeContext nameType() {
			return getRuleContext(NameTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> MODIFIER() { return getTokens(HTMLHighlightingParser.MODIFIER); }
		public TerminalNode MODIFIER(int i) {
			return getToken(HTMLHighlightingParser.MODIFIER, i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ExeptionsContext exeptions() {
			return getRuleContext(ExeptionsContext.class,0);
		}
		public List<BodyFunctionContext> bodyFunction() {
			return getRuleContexts(BodyFunctionContext.class);
		}
		public BodyFunctionContext bodyFunction(int i) {
			return getRuleContext(BodyFunctionContext.class,i);
		}
		public ReturnFunctionContext returnFunction() {
			return getRuleContext(ReturnFunctionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					annotation();
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(253);
					match(MODIFIER);
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(259);
			typeVar(0);
			setState(260);
			nameType();
			setState(261);
			match(T__7);
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(262);
				arg();
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(263);
					match(T__4);
					setState(264);
					arg();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(272);
			match(T__8);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(273);
				exeptions();
				}
			}

			setState(276);
			match(T__3);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(277);
					bodyFunction();
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(283);
				returnFunction();
				}
			}

			setState(286);
			match(T__5);
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
	public static class AnnotationContext extends ParserRuleContext {
		public String val;
		public TerminalNode AT() { return getToken(HTMLHighlightingParser.AT, 0); }
		public CallMethodContext callMethod() {
			return getRuleContext(CallMethodContext.class,0);
		}
		public NameTypeContext nameType() {
			return getRuleContext(NameTypeContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_annotation);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(AT);
				setState(289);
				callMethod();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(AT);
				setState(291);
				nameType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgContext extends ParserRuleContext {
		public String val;
		public TypeVarContext typeVar() {
			return getRuleContext(TypeVarContext.class,0);
		}
		public NameTypeContext nameType() {
			return getRuleContext(NameTypeContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			typeVar(0);
			setState(295);
			nameType();
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
	public static class ExeptionsContext extends ParserRuleContext {
		public String val;
		public TerminalNode THROWS() { return getToken(HTMLHighlightingParser.THROWS, 0); }
		public List<NameTypeContext> nameType() {
			return getRuleContexts(NameTypeContext.class);
		}
		public NameTypeContext nameType(int i) {
			return getRuleContext(NameTypeContext.class,i);
		}
		public ExeptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exeptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterExeptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitExeptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitExeptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExeptionsContext exeptions() throws RecognitionException {
		ExeptionsContext _localctx = new ExeptionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exeptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(THROWS);
			setState(298);
			nameType();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(299);
				match(T__4);
				setState(300);
				nameType();
				}
				}
				setState(305);
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
	public static class BodyFunctionContext extends ParserRuleContext {
		public String val;
		public DeclareVarContext declareVar() {
			return getRuleContext(DeclareVarContext.class,0);
		}
		public AssignVarContext assignVar() {
			return getRuleContext(AssignVarContext.class,0);
		}
		public CallMethodContext callMethod() {
			return getRuleContext(CallMethodContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public BodyFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterBodyFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitBodyFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitBodyFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyFunctionContext bodyFunction() throws RecognitionException {
		BodyFunctionContext _localctx = new BodyFunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bodyFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(306);
				declareVar();
				}
				break;
			case 2:
				{
				setState(307);
				assignVar();
				}
				break;
			case 3:
				{
				setState(308);
				callMethod();
				}
				break;
			case 4:
				{
				setState(309);
				function();
				}
				break;
			case 5:
				{
				setState(310);
				ifStatement();
				}
				break;
			case 6:
				{
				setState(311);
				forStatement();
				}
				break;
			case 7:
				{
				setState(312);
				switchStatement();
				}
				break;
			}
			setState(315);
			match(T__6);
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
	public static class ReturnFunctionContext extends ParserRuleContext {
		public String val;
		public TerminalNode RETURN() { return getToken(HTMLHighlightingParser.RETURN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ReturnFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterReturnFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitReturnFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitReturnFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnFunctionContext returnFunction() throws RecognitionException {
		ReturnFunctionContext _localctx = new ReturnFunctionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(RETURN);
			setState(318);
			value();
			setState(319);
			match(T__6);
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
	public static class ClassContext extends ParserRuleContext {
		public String val;
		public TerminalNode CLASS() { return getToken(HTMLHighlightingParser.CLASS, 0); }
		public NameTypeContext nameType() {
			return getRuleContext(NameTypeContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public List<TerminalNode> MODIFIER() { return getTokens(HTMLHighlightingParser.MODIFIER); }
		public TerminalNode MODIFIER(int i) {
			return getToken(HTMLHighlightingParser.MODIFIER, i);
		}
		public ExstendsContext exstends() {
			return getRuleContext(ExstendsContext.class,0);
		}
		public ImplementsContext implements_() {
			return getRuleContext(ImplementsContext.class,0);
		}
		public List<BodyClassContext> bodyClass() {
			return getRuleContexts(BodyClassContext.class);
		}
		public BodyClassContext bodyClass(int i) {
			return getRuleContext(BodyClassContext.class,i);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_class);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(321);
				annotation();
				}
			}

			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(324);
				match(MODIFIER);
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330);
			match(CLASS);
			setState(331);
			nameType();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(332);
				exstends();
				}
			}

			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(335);
				implements_();
				}
			}

			setState(338);
			match(T__3);
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(339);
					bodyClass();
					}
					} 
				}
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(345);
			match(T__5);
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
	public static class ImplementsContext extends ParserRuleContext {
		public String val;
		public TerminalNode IMPLEMENTS() { return getToken(HTMLHighlightingParser.IMPLEMENTS, 0); }
		public List<NameTypeContext> nameType() {
			return getRuleContexts(NameTypeContext.class);
		}
		public NameTypeContext nameType(int i) {
			return getRuleContext(NameTypeContext.class,i);
		}
		public ImplementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterImplements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitImplements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitImplements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementsContext implements_() throws RecognitionException {
		ImplementsContext _localctx = new ImplementsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_implements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(IMPLEMENTS);
			setState(348);
			nameType();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(349);
				match(T__4);
				setState(350);
				nameType();
				}
				}
				setState(355);
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
	public static class ExstendsContext extends ParserRuleContext {
		public String val;
		public TerminalNode EXTENDS() { return getToken(HTMLHighlightingParser.EXTENDS, 0); }
		public NameTypeContext nameType() {
			return getRuleContext(NameTypeContext.class,0);
		}
		public ExstendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exstends; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterExstends(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitExstends(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitExstends(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExstendsContext exstends() throws RecognitionException {
		ExstendsContext _localctx = new ExstendsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exstends);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(EXTENDS);
			setState(357);
			nameType();
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
	public static class ConstructorContext extends ParserRuleContext {
		public String val;
		public NameTypeContext nameType() {
			return getRuleContext(NameTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode MODIFIER() { return getToken(HTMLHighlightingParser.MODIFIER, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ExeptionsContext exeptions() {
			return getRuleContext(ExeptionsContext.class,0);
		}
		public List<BodyFunctionContext> bodyFunction() {
			return getRuleContexts(BodyFunctionContext.class);
		}
		public BodyFunctionContext bodyFunction(int i) {
			return getRuleContext(BodyFunctionContext.class,i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constructor);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(359);
					annotation();
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(365);
				match(MODIFIER);
				}
				break;
			}
			setState(368);
			nameType();
			setState(369);
			match(T__7);
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(370);
				arg();
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(371);
					match(T__4);
					setState(372);
					arg();
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(380);
			match(T__8);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(381);
				exeptions();
				}
			}

			setState(384);
			match(T__3);
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(385);
					bodyFunction();
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(391);
			match(T__5);
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
	public static class BodyClassContext extends ParserRuleContext {
		public String val;
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public DeclareFieldContext declareField() {
			return getRuleContext(DeclareFieldContext.class,0);
		}
		public CallMethodContext callMethod() {
			return getRuleContext(CallMethodContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BodyClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterBodyClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitBodyClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitBodyClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyClassContext bodyClass() throws RecognitionException {
		BodyClassContext _localctx = new BodyClassContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bodyClass);
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				constructor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				declareField();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				callMethod();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(396);
				function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(397);
				class_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(398);
				ifStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(399);
				forStatement();
				setState(400);
				match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CastStatementContext extends ParserRuleContext {
		public String val;
		public TypeVarContext typeVar() {
			return getRuleContext(TypeVarContext.class,0);
		}
		public CallMethodContext callMethod() {
			return getRuleContext(CallMethodContext.class,0);
		}
		public CastStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterCastStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitCastStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitCastStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastStatementContext castStatement() throws RecognitionException {
		CastStatementContext _localctx = new CastStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_castStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(T__7);
			setState(405);
			typeVar(0);
			setState(406);
			match(T__8);
			setState(407);
			callMethod();
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
	public static class IfStatementContext extends ParserRuleContext {
		public String val;
		public TerminalNode IF() { return getToken(HTMLHighlightingParser.IF, 0); }
		public BodyFunctionContext bodyFunction() {
			return getRuleContext(BodyFunctionContext.class,0);
		}
		public CallMethodContext callMethod() {
			return getRuleContext(CallMethodContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifStatement);
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(IF);
				setState(410);
				match(T__7);
				setState(413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(411);
					callMethod();
					}
					break;
				case 2:
					{
					setState(412);
					term(0);
					}
					break;
				}
				setState(415);
				match(T__8);
				setState(416);
				match(T__3);
				setState(417);
				bodyFunction();
				setState(418);
				match(T__5);
				setState(420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(419);
					elseStatement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(IF);
				setState(423);
				match(T__7);
				setState(424);
				callMethod();
				setState(425);
				match(T__8);
				setState(426);
				bodyFunction();
				setState(428);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(427);
					elseStatement();
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseStatementContext extends ParserRuleContext {
		public String val;
		public TerminalNode ELSE() { return getToken(HTMLHighlightingParser.ELSE, 0); }
		public BodyFunctionContext bodyFunction() {
			return getRuleContext(BodyFunctionContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(ELSE);
			setState(433);
			match(T__3);
			setState(434);
			bodyFunction();
			setState(435);
			match(T__5);
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
	public static class ForStatementContext extends ParserRuleContext {
		public String val;
		public TerminalNode FOR() { return getToken(HTMLHighlightingParser.FOR, 0); }
		public DeclareVarContext declareVar() {
			return getRuleContext(DeclareVarContext.class,0);
		}
		public AssignVarContext assignVar() {
			return getRuleContext(AssignVarContext.class,0);
		}
		public List<CallMethodContext> callMethod() {
			return getRuleContexts(CallMethodContext.class);
		}
		public CallMethodContext callMethod(int i) {
			return getRuleContext(CallMethodContext.class,i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<BodyFunctionContext> bodyFunction() {
			return getRuleContexts(BodyFunctionContext.class);
		}
		public BodyFunctionContext bodyFunction(int i) {
			return getRuleContext(BodyFunctionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(437);
			match(FOR);
			setState(438);
			match(T__7);
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(439);
				declareVar();
				}
				break;
			case 2:
				{
				setState(440);
				assignVar();
				}
				break;
			}
			setState(443);
			match(T__6);
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(444);
				callMethod();
				}
				break;
			case 2:
				{
				setState(445);
				term(0);
				}
				break;
			}
			setState(448);
			match(T__6);
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(449);
				callMethod();
				}
				break;
			case 2:
				{
				setState(450);
				term(0);
				}
				break;
			}
			setState(453);
			match(T__8);
			}
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(455);
				match(T__3);
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(456);
						bodyFunction();
						}
						} 
					}
					setState(461);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(462);
				match(T__5);
				}
				break;
			case 2:
				{
				setState(464);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(463);
					bodyFunction();
					}
					break;
				}
				}
				break;
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
	public static class SwitchStatementContext extends ParserRuleContext {
		public String val;
		public TerminalNode SWITCH() { return getToken(HTMLHighlightingParser.SWITCH, 0); }
		public CallMethodContext callMethod() {
			return getRuleContext(CallMethodContext.class,0);
		}
		public List<CaseStatementContext> caseStatement() {
			return getRuleContexts(CaseStatementContext.class);
		}
		public CaseStatementContext caseStatement(int i) {
			return getRuleContext(CaseStatementContext.class,i);
		}
		public DefaultStatementContext defaultStatement() {
			return getRuleContext(DefaultStatementContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(SWITCH);
			setState(469);
			match(T__7);
			setState(470);
			callMethod();
			setState(471);
			match(T__8);
			setState(472);
			match(T__3);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(473);
				caseStatement();
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(479);
				defaultStatement();
				}
			}

			setState(482);
			match(T__5);
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
	public static class CaseStatementContext extends ParserRuleContext {
		public String val;
		public TerminalNode CASE() { return getToken(HTMLHighlightingParser.CASE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<BodyFunctionContext> bodyFunction() {
			return getRuleContexts(BodyFunctionContext.class);
		}
		public BodyFunctionContext bodyFunction(int i) {
			return getRuleContext(BodyFunctionContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(HTMLHighlightingParser.BREAK, 0); }
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_caseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(CASE);
			setState(485);
			value();
			setState(486);
			match(T__9);
			setState(490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(487);
					bodyFunction();
					}
					} 
				}
				setState(492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(493);
				match(BREAK);
				setState(494);
				match(T__6);
				}
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
	public static class DefaultStatementContext extends ParserRuleContext {
		public String val;
		public TerminalNode DEFAULT() { return getToken(HTMLHighlightingParser.DEFAULT, 0); }
		public List<BodyFunctionContext> bodyFunction() {
			return getRuleContexts(BodyFunctionContext.class);
		}
		public BodyFunctionContext bodyFunction(int i) {
			return getRuleContext(BodyFunctionContext.class,i);
		}
		public DefaultStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).enterDefaultStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLHighlightingListener ) ((HTMLHighlightingListener)listener).exitDefaultStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLHighlightingVisitor ) return ((HTMLHighlightingVisitor<? extends T>)visitor).visitDefaultStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultStatementContext defaultStatement() throws RecognitionException {
		DefaultStatementContext _localctx = new DefaultStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_defaultStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(DEFAULT);
			setState(498);
			match(T__9);
			setState(502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(499);
					bodyFunction();
					}
					} 
				}
				setState(504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return nameType_sempred((NameTypeContext)_localctx, predIndex);
		case 2:
			return typeVar_sempred((TypeVarContext)_localctx, predIndex);
		case 6:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nameType_sempred(NameTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  Tools.isNotReservedWord(_input.LT(1).getText()) ;
		}
		return true;
	}
	private boolean typeVar_sempred(TypeVarContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001C\u01fa\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001B\b\u0001\n\u0001\f\u0001"+
		"E\t\u0001\u0003\u0001G\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002P\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002U\b\u0002\u0001\u0002\u0005"+
		"\u0002X\b\u0002\n\u0002\f\u0002[\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005e\b\u0005\u0001\u0005\u0003\u0005h\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005m\b\u0005\n\u0005\f\u0005p\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005u\b\u0005\n\u0005\f\u0005x\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005~\b\u0005"+
		"\n\u0005\f\u0005\u0081\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0085"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008b"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u0092\b\u0006\n\u0006\f\u0006\u0095\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u009c\b\u0007\n\u0007"+
		"\f\u0007\u009f\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00ab\b\u0007\n\u0007\f\u0007\u00ae\t\u0007\u0003\u0007\u00b0"+
		"\b\u0007\u0001\b\u0005\b\u00b3\b\b\n\b\f\b\u00b6\t\b\u0001\b\u0004\b\u00b9"+
		"\b\b\u000b\b\f\b\u00ba\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b"+
		"\u00c2\b\b\n\b\f\b\u00c5\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00d1\b\b\n\b\f\b\u00d4\t\b"+
		"\u0001\b\u0001\b\u0003\b\u00d8\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00e7\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ed\b\n\u0005\n"+
		"\u00ef\b\n\n\n\f\n\u00f2\t\n\u0001\n\u0001\n\u0003\n\u00f6\b\n\u0001\u000b"+
		"\u0005\u000b\u00f9\b\u000b\n\u000b\f\u000b\u00fc\t\u000b\u0001\u000b\u0005"+
		"\u000b\u00ff\b\u000b\n\u000b\f\u000b\u0102\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u010a\b\u000b"+
		"\n\u000b\f\u000b\u010d\t\u000b\u0003\u000b\u010f\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0113\b\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0117"+
		"\b\u000b\n\u000b\f\u000b\u011a\t\u000b\u0001\u000b\u0003\u000b\u011d\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u0125\b\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u012e\b\u000e\n\u000e\f\u000e\u0131\t\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u013a\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0003\u0011\u0143\b\u0011\u0001"+
		"\u0011\u0005\u0011\u0146\b\u0011\n\u0011\f\u0011\u0149\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u014e\b\u0011\u0001\u0011\u0003\u0011"+
		"\u0151\b\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0155\b\u0011\n\u0011"+
		"\f\u0011\u0158\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0160\b\u0012\n\u0012\f\u0012\u0163"+
		"\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0005\u0014\u0169"+
		"\b\u0014\n\u0014\f\u0014\u016c\t\u0014\u0001\u0014\u0003\u0014\u016f\b"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0176\b\u0014\n\u0014\f\u0014\u0179\t\u0014\u0003\u0014\u017b\b"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u017f\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u0183\b\u0014\n\u0014\f\u0014\u0186\t\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0193\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u019e\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01a5\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u01ad\b\u0017\u0003\u0017\u01af\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u01ba\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u01bf\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u01c4\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u01ca\b\u0019\n\u0019\f\u0019\u01cd\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u01d1\b\u0019\u0003\u0019\u01d3\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01db"+
		"\b\u001a\n\u001a\f\u001a\u01de\t\u001a\u0001\u001a\u0003\u001a\u01e1\b"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u01e9\b\u001b\n\u001b\f\u001b\u01ec\t\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u01f0\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u01f5\b\u001c\n\u001c\f\u001c\u01f8\t\u001c\u0001\u001c\u0000"+
		"\u0002\u0004\f\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0002\u0001\u0000\u001a"+
		"\u001f\u0001\u0000=A\u022c\u0000:\u0001\u0000\u0000\u0000\u0002F\u0001"+
		"\u0000\u0000\u0000\u0004O\u0001\u0000\u0000\u0000\u0006\\\u0001\u0000"+
		"\u0000\u0000\b^\u0001\u0000\u0000\u0000\n\u0084\u0001\u0000\u0000\u0000"+
		"\f\u008a\u0001\u0000\u0000\u0000\u000e\u00af\u0001\u0000\u0000\u0000\u0010"+
		"\u00d7\u0001\u0000\u0000\u0000\u0012\u00d9\u0001\u0000\u0000\u0000\u0014"+
		"\u00f5\u0001\u0000\u0000\u0000\u0016\u00fa\u0001\u0000\u0000\u0000\u0018"+
		"\u0124\u0001\u0000\u0000\u0000\u001a\u0126\u0001\u0000\u0000\u0000\u001c"+
		"\u0129\u0001\u0000\u0000\u0000\u001e\u0139\u0001\u0000\u0000\u0000 \u013d"+
		"\u0001\u0000\u0000\u0000\"\u0142\u0001\u0000\u0000\u0000$\u015b\u0001"+
		"\u0000\u0000\u0000&\u0164\u0001\u0000\u0000\u0000(\u016a\u0001\u0000\u0000"+
		"\u0000*\u0192\u0001\u0000\u0000\u0000,\u0194\u0001\u0000\u0000\u0000."+
		"\u01ae\u0001\u0000\u0000\u00000\u01b0\u0001\u0000\u0000\u00002\u01b5\u0001"+
		"\u0000\u0000\u00004\u01d4\u0001\u0000\u0000\u00006\u01e4\u0001\u0000\u0000"+
		"\u00008\u01f1\u0001\u0000\u0000\u0000:;\u0003\"\u0011\u0000;\u0001\u0001"+
		"\u0000\u0000\u0000<G\u0003\b\u0004\u0000=>\u0004\u0001\u0000\u0000>C\u0005"+
		"B\u0000\u0000?@\u0005\u0001\u0000\u0000@B\u0005B\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"F<\u0001\u0000\u0000\u0000F=\u0001\u0000\u0000\u0000G\u0003\u0001\u0000"+
		"\u0000\u0000HI\u0006\u0002\uffff\uffff\u0000IP\u0003\u0002\u0001\u0000"+
		"JK\u0003\u0002\u0001\u0000KL\u0005-\u0000\u0000LM\u0003\u0004\u0002\u0000"+
		"MN\u0005/\u0000\u0000NP\u0001\u0000\u0000\u0000OH\u0001\u0000\u0000\u0000"+
		"OJ\u0001\u0000\u0000\u0000PY\u0001\u0000\u0000\u0000QR\n\u0001\u0000\u0000"+
		"RT\u0005\u0002\u0000\u0000SU\u0003\n\u0005\u0000TS\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0005\u0003\u0000"+
		"\u0000WQ\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0005\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000\\]\u0007\u0000\u0000\u0000]\u0007\u0001\u0000"+
		"\u0000\u0000^_\u0007\u0001\u0000\u0000_\t\u0001\u0000\u0000\u0000`\u0085"+
		"\u0003\u0006\u0003\u0000a\u0085\u0003\u0014\n\u0000bd\u0005\u0018\u0000"+
		"\u0000ce\u0003\u0004\u0002\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000eg\u0001\u0000\u0000\u0000fh\u0003\n\u0005\u0000gf\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0085\u0001\u0000\u0000\u0000"+
		"in\u0003\u0014\n\u0000jk\u0005\u0001\u0000\u0000km\u0003\n\u0005\u0000"+
		"lj\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000o\u0085\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000qv\u0003\u0002\u0001\u0000rs\u0005\u0001\u0000\u0000"+
		"su\u0003\n\u0005\u0000tr\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u0085\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0005\u0004\u0000\u0000z\u007f"+
		"\u0003\n\u0005\u0000{|\u0005\u0005\u0000\u0000|~\u0003\n\u0005\u0000}"+
		"{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"\u0006\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084`\u0001\u0000"+
		"\u0000\u0000\u0084a\u0001\u0000\u0000\u0000\u0084b\u0001\u0000\u0000\u0000"+
		"\u0084i\u0001\u0000\u0000\u0000\u0084q\u0001\u0000\u0000\u0000\u0084y"+
		"\u0001\u0000\u0000\u0000\u0085\u000b\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0006\u0006\uffff\uffff\u0000\u0087\u0088\u00051\u0000\u0000\u0088\u008b"+
		"\u0003\f\u0006\u0003\u0089\u008b\u0003\n\u0005\u0000\u008a\u0086\u0001"+
		"\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u0093\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\n\u0004\u0000\u0000\u008d\u008e\u0005\""+
		"\u0000\u0000\u008e\u0092\u0003\f\u0006\u0005\u008f\u0090\n\u0002\u0000"+
		"\u0000\u0090\u0092\u00051\u0000\u0000\u0091\u008c\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\r\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0003\u0004\u0002\u0000\u0097\u0098\u0003\u0002\u0001\u0000\u0098"+
		"\u0099\u0005\u0007\u0000\u0000\u0099\u00b0\u0001\u0000\u0000\u0000\u009a"+
		"\u009c\u00052\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009f"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0003\u0004\u0002\u0000\u00a1\u00a2"+
		"\u0003\u0002\u0001\u0000\u00a2\u00a3\u0005\u0019\u0000\u0000\u00a3\u00a4"+
		"\u0003\n\u0005\u0000\u00a4\u00ac\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005"+
		"\u0005\u0000\u0000\u00a6\u00a7\u0003\u0002\u0001\u0000\u00a7\u00a8\u0005"+
		"\u0019\u0000\u0000\u00a8\u00a9\u0003\n\u0005\u0000\u00a9\u00ab\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a5\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000"+
		"\u0000\u0000\u00af\u0096\u0001\u0000\u0000\u0000\u00af\u009d\u0001\u0000"+
		"\u0000\u0000\u00b0\u000f\u0001\u0000\u0000\u0000\u00b1\u00b3\u0003\u0018"+
		"\f\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b9\u00052\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0003\u0004\u0002\u0000\u00bd\u00be\u0003\u0002\u0001\u0000"+
		"\u00be\u00bf\u0005\u0007\u0000\u0000\u00bf\u00d8\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c2\u00052\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003\u0004\u0002\u0000\u00c7"+
		"\u00c8\u0003\u0002\u0001\u0000\u00c8\u00c9\u0005\u0019\u0000\u0000\u00c9"+
		"\u00ca\u0003\n\u0005\u0000\u00ca\u00d2\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0005\u0005\u0000\u0000\u00cc\u00cd\u0003\u0002\u0001\u0000\u00cd\u00ce"+
		"\u0005\u0019\u0000\u0000\u00ce\u00cf\u0003\n\u0005\u0000\u00cf\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d0\u00cb\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0005\u0007\u0000\u0000\u00d6\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d7\u00b4\u0001\u0000\u0000\u0000\u00d7\u00c3\u0001"+
		"\u0000\u0000\u0000\u00d8\u0011\u0001\u0000\u0000\u0000\u00d9\u00da\u0003"+
		"\u0002\u0001\u0000\u00da\u00db\u0005\u0019\u0000\u0000\u00db\u00dc\u0003"+
		"\n\u0005\u0000\u00dc\u0013\u0001\u0000\u0000\u0000\u00dd\u00de\u0003\u0002"+
		"\u0001\u0000\u00de\u00df\u0005\b\u0000\u0000\u00df\u00e0\u0005\t\u0000"+
		"\u0000\u00e0\u00f6\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003\u0002\u0001"+
		"\u0000\u00e2\u00e6\u0005\b\u0000\u0000\u00e3\u00e7\u0003\u0002\u0001\u0000"+
		"\u00e4\u00e7\u0003\u0014\n\u0000\u00e5\u00e7\u0003\n\u0005\u0000\u00e6"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e7\u00f0\u0001\u0000\u0000\u0000\u00e8"+
		"\u00ec\u0005\u0005\u0000\u0000\u00e9\u00ed\u0003\u0002\u0001\u0000\u00ea"+
		"\u00ed\u0003\u0014\n\u0000\u00eb\u00ed\u0003\n\u0005\u0000\u00ec\u00e9"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00e8"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0005\t\u0000\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00dd\u0001"+
		"\u0000\u0000\u0000\u00f5\u00e1\u0001\u0000\u0000\u0000\u00f6\u0015\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f9\u0003\u0018\f\u0000\u00f8\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u0100\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00ff\u00052\u0000"+
		"\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000"+
		"\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000"+
		"\u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0003\u0004\u0002\u0000\u0104\u0105\u0003\u0002\u0001"+
		"\u0000\u0105\u010e\u0005\b\u0000\u0000\u0106\u010b\u0003\u001a\r\u0000"+
		"\u0107\u0108\u0005\u0005\u0000\u0000\u0108\u010a\u0003\u001a\r\u0000\u0109"+
		"\u0107\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b"+
		"\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c"+
		"\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e"+
		"\u0106\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0001\u0000\u0000\u0000\u0110\u0112\u0005\t\u0000\u0000\u0111\u0113"+
		"\u0003\u001c\u000e\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0118"+
		"\u0005\u0004\u0000\u0000\u0115\u0117\u0003\u001e\u000f\u0000\u0116\u0115"+
		"\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116"+
		"\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011c"+
		"\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011d"+
		"\u0003 \u0010\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011c\u011d\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f\u0005"+
		"\u0006\u0000\u0000\u011f\u0017\u0001\u0000\u0000\u0000\u0120\u0121\u0005"+
		"\u0017\u0000\u0000\u0121\u0125\u0003\u0014\n\u0000\u0122\u0123\u0005\u0017"+
		"\u0000\u0000\u0123\u0125\u0003\u0002\u0001\u0000\u0124\u0120\u0001\u0000"+
		"\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0019\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0003\u0004\u0002\u0000\u0127\u0128\u0003\u0002"+
		"\u0001\u0000\u0128\u001b\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u0016"+
		"\u0000\u0000\u012a\u012f\u0003\u0002\u0001\u0000\u012b\u012c\u0005\u0005"+
		"\u0000\u0000\u012c\u012e\u0003\u0002\u0001\u0000\u012d\u012b\u0001\u0000"+
		"\u0000\u0000\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u001d\u0001\u0000"+
		"\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0132\u013a\u0003\u000e"+
		"\u0007\u0000\u0133\u013a\u0003\u0012\t\u0000\u0134\u013a\u0003\u0014\n"+
		"\u0000\u0135\u013a\u0003\u0016\u000b\u0000\u0136\u013a\u0003.\u0017\u0000"+
		"\u0137\u013a\u00032\u0019\u0000\u0138\u013a\u00034\u001a\u0000\u0139\u0132"+
		"\u0001\u0000\u0000\u0000\u0139\u0133\u0001\u0000\u0000\u0000\u0139\u0134"+
		"\u0001\u0000\u0000\u0000\u0139\u0135\u0001\u0000\u0000\u0000\u0139\u0136"+
		"\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u0138"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0005\u0007\u0000\u0000\u013c\u001f\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0005\u000f\u0000\u0000\u013e\u013f\u0003\n\u0005\u0000\u013f\u0140\u0005"+
		"\u0007\u0000\u0000\u0140!\u0001\u0000\u0000\u0000\u0141\u0143\u0003\u0018"+
		"\f\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000"+
		"\u0000\u0143\u0147\u0001\u0000\u0000\u0000\u0144\u0146\u00052\u0000\u0000"+
		"\u0145\u0144\u0001\u0000\u0000\u0000\u0146\u0149\u0001\u0000\u0000\u0000"+
		"\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000"+
		"\u0148\u014a\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0005\u0010\u0000\u0000\u014b\u014d\u0003\u0002\u0001\u0000"+
		"\u014c\u014e\u0003&\u0013\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0001\u0000\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000\u014f"+
		"\u0151\u0003$\u0012\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0156"+
		"\u0005\u0004\u0000\u0000\u0153\u0155\u0003*\u0015\u0000\u0154\u0153\u0001"+
		"\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000\u0000\u0156\u0154\u0001"+
		"\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0159\u0001"+
		"\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0159\u015a\u0005"+
		"\u0006\u0000\u0000\u015a#\u0001\u0000\u0000\u0000\u015b\u015c\u0005\u0011"+
		"\u0000\u0000\u015c\u0161\u0003\u0002\u0001\u0000\u015d\u015e\u0005\u0005"+
		"\u0000\u0000\u015e\u0160\u0003\u0002\u0001\u0000\u015f\u015d\u0001\u0000"+
		"\u0000\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000"+
		"\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162%\u0001\u0000\u0000"+
		"\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0164\u0165\u0005\u0012\u0000"+
		"\u0000\u0165\u0166\u0003\u0002\u0001\u0000\u0166\'\u0001\u0000\u0000\u0000"+
		"\u0167\u0169\u0003\u0018\f\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169"+
		"\u016c\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0001\u0000\u0000\u0000\u016b\u016e\u0001\u0000\u0000\u0000\u016c"+
		"\u016a\u0001\u0000\u0000\u0000\u016d\u016f\u00052\u0000\u0000\u016e\u016d"+
		"\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0001\u0000\u0000\u0000\u0170\u0171\u0003\u0002\u0001\u0000\u0171\u017a"+
		"\u0005\b\u0000\u0000\u0172\u0177\u0003\u001a\r\u0000\u0173\u0174\u0005"+
		"\u0005\u0000\u0000\u0174\u0176\u0003\u001a\r\u0000\u0175\u0173\u0001\u0000"+
		"\u0000\u0000\u0176\u0179\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000"+
		"\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u017b\u0001\u0000"+
		"\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u017a\u0172\u0001\u0000"+
		"\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000"+
		"\u0000\u0000\u017c\u017e\u0005\t\u0000\u0000\u017d\u017f\u0003\u001c\u000e"+
		"\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0184\u0005\u0004\u0000"+
		"\u0000\u0181\u0183\u0003\u001e\u000f\u0000\u0182\u0181\u0001\u0000\u0000"+
		"\u0000\u0183\u0186\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000"+
		"\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0187\u0001\u0000\u0000"+
		"\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u0188\u0005\u0006\u0000"+
		"\u0000\u0188)\u0001\u0000\u0000\u0000\u0189\u0193\u0003(\u0014\u0000\u018a"+
		"\u0193\u0003\u0010\b\u0000\u018b\u0193\u0003\u0014\n\u0000\u018c\u0193"+
		"\u0003\u0016\u000b\u0000\u018d\u0193\u0003\"\u0011\u0000\u018e\u0193\u0003"+
		".\u0017\u0000\u018f\u0190\u00032\u0019\u0000\u0190\u0191\u0005\u0007\u0000"+
		"\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u0189\u0001\u0000\u0000"+
		"\u0000\u0192\u018a\u0001\u0000\u0000\u0000\u0192\u018b\u0001\u0000\u0000"+
		"\u0000\u0192\u018c\u0001\u0000\u0000\u0000\u0192\u018d\u0001\u0000\u0000"+
		"\u0000\u0192\u018e\u0001\u0000\u0000\u0000\u0192\u018f\u0001\u0000\u0000"+
		"\u0000\u0193+\u0001\u0000\u0000\u0000\u0194\u0195\u0005\b\u0000\u0000"+
		"\u0195\u0196\u0003\u0004\u0002\u0000\u0196\u0197\u0005\t\u0000\u0000\u0197"+
		"\u0198\u0003\u0014\n\u0000\u0198-\u0001\u0000\u0000\u0000\u0199\u019a"+
		"\u0005\u0014\u0000\u0000\u019a\u019d\u0005\b\u0000\u0000\u019b\u019e\u0003"+
		"\u0014\n\u0000\u019c\u019e\u0003\f\u0006\u0000\u019d\u019b\u0001\u0000"+
		"\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000"+
		"\u0000\u0000\u019f\u01a0\u0005\t\u0000\u0000\u01a0\u01a1\u0005\u0004\u0000"+
		"\u0000\u01a1\u01a2\u0003\u001e\u000f\u0000\u01a2\u01a4\u0005\u0006\u0000"+
		"\u0000\u01a3\u01a5\u00030\u0018\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01af\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a7\u0005\u0014\u0000\u0000\u01a7\u01a8\u0005\b\u0000\u0000\u01a8"+
		"\u01a9\u0003\u0014\n\u0000\u01a9\u01aa\u0005\t\u0000\u0000\u01aa\u01ac"+
		"\u0003\u001e\u000f\u0000\u01ab\u01ad\u00030\u0018\u0000\u01ac\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01af\u0001"+
		"\u0000\u0000\u0000\u01ae\u0199\u0001\u0000\u0000\u0000\u01ae\u01a6\u0001"+
		"\u0000\u0000\u0000\u01af/\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005\u0015"+
		"\u0000\u0000\u01b1\u01b2\u0005\u0004\u0000\u0000\u01b2\u01b3\u0003\u001e"+
		"\u000f\u0000\u01b3\u01b4\u0005\u0006\u0000\u0000\u01b41\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b6\u0005\u0013\u0000\u0000\u01b6\u01b9\u0005\b\u0000\u0000"+
		"\u01b7\u01ba\u0003\u000e\u0007\u0000\u01b8\u01ba\u0003\u0012\t\u0000\u01b9"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bb\u0001\u0000\u0000\u0000\u01bb\u01be\u0005\u0007\u0000\u0000\u01bc"+
		"\u01bf\u0003\u0014\n\u0000\u01bd\u01bf\u0003\f\u0006\u0000\u01be\u01bc"+
		"\u0001\u0000\u0000\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0"+
		"\u0001\u0000\u0000\u0000\u01c0\u01c3\u0005\u0007\u0000\u0000\u01c1\u01c4"+
		"\u0003\u0014\n\u0000\u01c2\u01c4\u0003\f\u0006\u0000\u01c3\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c6\u0005\t\u0000\u0000\u01c6\u01d2\u0001\u0000"+
		"\u0000\u0000\u01c7\u01cb\u0005\u0004\u0000\u0000\u01c8\u01ca\u0003\u001e"+
		"\u000f\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cd\u0001\u0000"+
		"\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000"+
		"\u0000\u0000\u01cc\u01ce\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000"+
		"\u0000\u0000\u01ce\u01d3\u0005\u0006\u0000\u0000\u01cf\u01d1\u0003\u001e"+
		"\u000f\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d3\u0001\u0000\u0000\u0000\u01d2\u01c7\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d33\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d5\u0005\u000e\u0000\u0000\u01d5\u01d6\u0005\b\u0000\u0000"+
		"\u01d6\u01d7\u0003\u0014\n\u0000\u01d7\u01d8\u0005\t\u0000\u0000\u01d8"+
		"\u01dc\u0005\u0004\u0000\u0000\u01d9\u01db\u00036\u001b\u0000\u01da\u01d9"+
		"\u0001\u0000\u0000\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc\u01da"+
		"\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01e0"+
		"\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e1"+
		"\u00038\u001c\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005"+
		"\u0006\u0000\u0000\u01e35\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005\f"+
		"\u0000\u0000\u01e5\u01e6\u0003\n\u0005\u0000\u01e6\u01ea\u0005\n\u0000"+
		"\u0000\u01e7\u01e9\u0003\u001e\u000f\u0000\u01e8\u01e7\u0001\u0000\u0000"+
		"\u0000\u01e9\u01ec\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000"+
		"\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ef\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ed\u01ee\u0005\u000b\u0000"+
		"\u0000\u01ee\u01f0\u0005\u0007\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f07\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f2\u0005\r\u0000\u0000\u01f2\u01f6\u0005\n\u0000\u0000\u01f3"+
		"\u01f5\u0003\u001e\u000f\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f8\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f7\u0001\u0000\u0000\u0000\u01f79\u0001\u0000\u0000\u0000\u01f8\u01f6"+
		"\u0001\u0000\u0000\u0000@CFOTYdgnv\u007f\u0084\u008a\u0091\u0093\u009d"+
		"\u00ac\u00af\u00b4\u00ba\u00c3\u00d2\u00d7\u00e6\u00ec\u00f0\u00f5\u00fa"+
		"\u0100\u010b\u010e\u0112\u0118\u011c\u0124\u012f\u0139\u0142\u0147\u014d"+
		"\u0150\u0156\u0161\u016a\u016e\u0177\u017a\u017e\u0184\u0192\u019d\u01a4"+
		"\u01ac\u01ae\u01b9\u01be\u01c3\u01cb\u01d0\u01d2\u01dc\u01e0\u01ea\u01ef"+
		"\u01f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}