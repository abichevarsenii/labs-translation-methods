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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, RETURN=12, CLASS=13, IMPLEMENTS=14, EXTENDS=15, FOR=16, 
		IF=17, ELSE=18, THROWS=19, AT=20, NEW=21, ASSIGN=22, NULL=23, INT=24, 
		FLOAT=25, STRING=26, CHAR=27, BOOLEAN=28, TRUE=29, FALSE=30, MODIFIER=31, 
		PUBLIC=32, PRIVATE=33, FINAL=34, STATIC=35, VOLATILE=36, TRANSIENT=37, 
		SYNCHRONIZED=38, NATIVE=39, ABSTRACT=40, PROTECTED=41, NAME=42, WS=43;
	public static final int
		RULE_start = 0, RULE_nameType = 1, RULE_typeVar = 2, RULE_value = 3, RULE_declareVar = 4, 
		RULE_declareField = 5, RULE_assignVar = 6, RULE_callMethod = 7, RULE_annotation = 8, 
		RULE_arg = 9, RULE_exeptions = 10, RULE_function = 11, RULE_bodyFunction = 12, 
		RULE_returnFunction = 13, RULE_ifStatement = 14, RULE_elseStatement = 15, 
		RULE_castStatement = 16, RULE_implements = 17, RULE_exstends = 18, RULE_class = 19, 
		RULE_constructor = 20, RULE_bodyClass = 21, RULE_primitiveValue = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "nameType", "typeVar", "value", "declareVar", "declareField", 
			"assignVar", "callMethod", "annotation", "arg", "exeptions", "function", 
			"bodyFunction", "returnFunction", "ifStatement", "elseStatement", "castStatement", 
			"implements", "exstends", "class", "constructor", "bodyClass", "primitiveValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'<'", "'>'", "'['", "']'", "'{'", "','", "'}'", "';'", 
			"'('", "')'", "'return'", "'class'", "'implements'", "'extends'", "'for'", 
			"'if'", "'else'", "'throws'", "'@'", "'new'", "'='", "'null'", null, 
			null, null, null, null, "'true'", "'false'", null, "'public'", "'private'", 
			"'final'", "'static'", "'volatile'", "'transient'", "'synchronized'", 
			"'native'", "'abstract'", "'protected'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"RETURN", "CLASS", "IMPLEMENTS", "EXTENDS", "FOR", "IF", "ELSE", "THROWS", 
			"AT", "NEW", "ASSIGN", "NULL", "INT", "FLOAT", "STRING", "CHAR", "BOOLEAN", 
			"TRUE", "FALSE", "MODIFIER", "PUBLIC", "PRIVATE", "FINAL", "STATIC", 
			"VOLATILE", "TRANSIENT", "SYNCHRONIZED", "NATIVE", "ABSTRACT", "PROTECTED", 
			"NAME", "WS"
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
			setState(46);
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

	public static class NameTypeContext extends ParserRuleContext {
		public String val;
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
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			if (!( Tools.isNotReservedWord(_input.LT(1).getText()) )) throw new FailedPredicateException(this, " Tools.isNotReservedWord(_input.LT(1).getText()) ");
			setState(49);
			match(NAME);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(50);
					match(T__0);
					}
					setState(51);
					match(NAME);
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class TypeVarContext extends ParserRuleContext {
		public String val;
		public NameTypeContext nameType() {
			return getRuleContext(NameTypeContext.class,0);
		}
		public TypeVarContext typeVar() {
			return getRuleContext(TypeVarContext.class,0);
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
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(58);
				nameType();
				}
				break;
			case 2:
				{
				setState(59);
				nameType();
				setState(60);
				match(T__1);
				setState(61);
				typeVar(0);
				setState(62);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeVarContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeVar);
					setState(66);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(67);
					match(T__3);
					setState(68);
					match(T__4);
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class ValueContext extends ParserRuleContext {
		public String val;
		public PrimitiveValueContext primitiveValue() {
			return getRuleContext(PrimitiveValueContext.class,0);
		}
		public CallMethodContext callMethod() {
			return getRuleContext(CallMethodContext.class,0);
		}
		public TerminalNode NEW() { return getToken(HTMLHighlightingParser.NEW, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TypeVarContext typeVar() {
			return getRuleContext(TypeVarContext.class,0);
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
		enterRule(_localctx, 6, RULE_value);
		int _la;
		try {
			int _alt;
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				primitiveValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				callMethod();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(NEW);
				setState(78);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(77);
					typeVar(0);
					}
					break;
				}
				setState(80);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				callMethod();
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(82);
						match(T__0);
						setState(83);
						value();
						}
						} 
					}
					setState(88);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				nameType();
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(90);
						match(T__0);
						setState(91);
						value();
						}
						} 
					}
					setState(96);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				match(T__5);
				setState(98);
				value();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(99);
					match(T__6);
					setState(100);
					value();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(T__7);
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
		enterRule(_localctx, 8, RULE_declareVar);
		int _la;
		try {
			int _alt;
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				typeVar(0);
				setState(111);
				nameType();
				setState(112);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(114);
						match(MODIFIER);
						}
						} 
					}
					setState(119);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(120);
				typeVar(0);
				{
				setState(121);
				nameType();
				setState(122);
				match(ASSIGN);
				setState(123);
				value();
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(125);
					match(T__6);
					setState(126);
					nameType();
					setState(127);
					match(ASSIGN);
					setState(128);
					value();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
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
		enterRule(_localctx, 10, RULE_declareField);
		int _la;
		try {
			int _alt;
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(139);
					annotation();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(145);
						match(MODIFIER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(148); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(150);
				typeVar(0);
				setState(151);
				nameType();
				setState(152);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
				while (_la==T__6) {
					{
					{
					setState(165);
					match(T__6);
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
				setState(175);
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
		enterRule(_localctx, 12, RULE_assignVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			nameType();
			setState(180);
			match(ASSIGN);
			setState(181);
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
		enterRule(_localctx, 14, RULE_callMethod);
		int _la;
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				nameType();
				setState(184);
				match(T__9);
				setState(185);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				nameType();
				setState(188);
				match(T__9);
				setState(192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(189);
					nameType();
					}
					break;
				case 2:
					{
					setState(190);
					callMethod();
					}
					break;
				case 3:
					{
					setState(191);
					value();
					}
					break;
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(194);
					match(T__6);
					setState(198);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(195);
						nameType();
						}
						break;
					case 2:
						{
						setState(196);
						callMethod();
						}
						break;
					case 3:
						{
						setState(197);
						value();
						}
						break;
					}
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				match(T__10);
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
		enterRule(_localctx, 16, RULE_annotation);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(AT);
				setState(210);
				callMethod();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(AT);
				setState(212);
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
		enterRule(_localctx, 18, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			typeVar(0);
			setState(216);
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
		enterRule(_localctx, 20, RULE_exeptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(THROWS);
			setState(219);
			nameType();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(220);
				match(T__6);
				setState(221);
				nameType();
				}
				}
				setState(226);
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
		public BodyFunctionContext bodyFunction() {
			return getRuleContext(BodyFunctionContext.class,0);
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
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227);
					annotation();
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233);
					match(MODIFIER);
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(239);
			typeVar(0);
			setState(240);
			nameType();
			setState(241);
			match(T__9);
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(242);
				arg();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(243);
					match(T__6);
					setState(244);
					arg();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(252);
			match(T__10);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(253);
				exeptions();
				}
			}

			setState(256);
			match(T__5);
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(257);
				bodyFunction();
				}
				break;
			}
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(260);
				returnFunction();
				}
			}

			setState(263);
			match(T__7);
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

	public static class BodyFunctionContext extends ParserRuleContext {
		public String val;
		public List<DeclareVarContext> declareVar() {
			return getRuleContexts(DeclareVarContext.class);
		}
		public DeclareVarContext declareVar(int i) {
			return getRuleContext(DeclareVarContext.class,i);
		}
		public List<AssignVarContext> assignVar() {
			return getRuleContexts(AssignVarContext.class);
		}
		public AssignVarContext assignVar(int i) {
			return getRuleContext(AssignVarContext.class,i);
		}
		public List<CallMethodContext> callMethod() {
			return getRuleContexts(CallMethodContext.class);
		}
		public CallMethodContext callMethod(int i) {
			return getRuleContext(CallMethodContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
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
		enterRule(_localctx, 24, RULE_bodyFunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(270);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(265);
						declareVar();
						}
						break;
					case 2:
						{
						setState(266);
						assignVar();
						}
						break;
					case 3:
						{
						setState(267);
						callMethod();
						}
						break;
					case 4:
						{
						setState(268);
						function();
						}
						break;
					case 5:
						{
						setState(269);
						ifStatement();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(272); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(274);
			match(T__8);
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
		enterRule(_localctx, 26, RULE_returnFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(RETURN);
			setState(277);
			value();
			setState(278);
			match(T__8);
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

	public static class IfStatementContext extends ParserRuleContext {
		public String val;
		public TerminalNode IF() { return getToken(HTMLHighlightingParser.IF, 0); }
		public CallMethodContext callMethod() {
			return getRuleContext(CallMethodContext.class,0);
		}
		public BodyFunctionContext bodyFunction() {
			return getRuleContext(BodyFunctionContext.class,0);
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
		enterRule(_localctx, 28, RULE_ifStatement);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(IF);
				setState(281);
				match(T__9);
				setState(282);
				callMethod();
				setState(283);
				match(T__10);
				setState(284);
				match(T__5);
				setState(285);
				bodyFunction();
				setState(286);
				match(T__7);
				setState(288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(287);
					elseStatement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(IF);
				setState(291);
				match(T__9);
				setState(292);
				callMethod();
				setState(293);
				match(T__10);
				setState(294);
				bodyFunction();
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(295);
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
		enterRule(_localctx, 30, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(ELSE);
			setState(301);
			match(T__5);
			setState(302);
			bodyFunction();
			setState(303);
			match(T__7);
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
		enterRule(_localctx, 32, RULE_castStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__9);
			setState(306);
			typeVar(0);
			setState(307);
			match(T__10);
			setState(308);
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
		enterRule(_localctx, 34, RULE_implements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(IMPLEMENTS);
			setState(311);
			nameType();
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(312);
				match(T__6);
				setState(313);
				nameType();
				}
				}
				setState(318);
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
		enterRule(_localctx, 36, RULE_exstends);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(EXTENDS);
			setState(320);
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
		enterRule(_localctx, 38, RULE_class);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(322);
				annotation();
				}
			}

			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(325);
				match(MODIFIER);
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(331);
			match(CLASS);
			setState(332);
			nameType();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(333);
				exstends();
				}
			}

			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(336);
				implements_();
				}
			}

			setState(339);
			match(T__5);
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(340);
					bodyClass();
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(346);
			match(T__7);
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
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(348);
					annotation();
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(354);
				match(MODIFIER);
				}
				break;
			}
			setState(357);
			nameType();
			setState(358);
			match(T__9);
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(359);
				arg();
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(360);
					match(T__6);
					setState(361);
					arg();
					}
					}
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(369);
			match(T__10);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(370);
				exeptions();
				}
			}

			setState(373);
			match(T__5);
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(374);
					bodyFunction();
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(380);
			match(T__7);
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
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				constructor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				declareField();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				callMethod();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
				class_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(387);
				ifStatement();
				setState(388);
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
		enterRule(_localctx, 44, RULE_primitiveValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return nameType_sempred((NameTypeContext)_localctx, predIndex);
		case 2:
			return typeVar_sempred((TypeVarContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\u0004\u0001+\u018b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u00015\b\u0001\n\u0001\f\u00018\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002A\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002F\b\u0002\n\u0002\f\u0002I\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003O\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003U\b\u0003\n\u0003\f\u0003X\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003]\b\u0003\n\u0003\f\u0003"+
		"`\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"f\b\u0003\n\u0003\f\u0003i\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"m\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004t\b\u0004\n\u0004\f\u0004w\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u0083\b\u0004\n\u0004\f\u0004\u0086"+
		"\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u008a\b\u0004\u0001\u0005"+
		"\u0005\u0005\u008d\b\u0005\n\u0005\f\u0005\u0090\t\u0005\u0001\u0005\u0004"+
		"\u0005\u0093\b\u0005\u000b\u0005\f\u0005\u0094\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u009c\b\u0005\n\u0005"+
		"\f\u0005\u009f\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u00ab\b\u0005\n\u0005\f\u0005\u00ae\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00b2\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c1\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c7\b\u0007\u0005"+
		"\u0007\u00c9\b\u0007\n\u0007\f\u0007\u00cc\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00d0\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d6"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00df"+
		"\b\n\n\n\f\n\u00e2\t\n\u0001\u000b\u0005\u000b\u00e5\b\u000b\n\u000b\f"+
		"\u000b\u00e8\t\u000b\u0001\u000b\u0005\u000b\u00eb\b\u000b\n\u000b\f\u000b"+
		"\u00ee\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00f6\b\u000b\n\u000b\f\u000b\u00f9\t\u000b\u0003"+
		"\u000b\u00fb\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00ff\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0103\b\u000b\u0001\u000b\u0003\u000b"+
		"\u0106\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0004\f\u010f\b\f\u000b\f\f\f\u0110\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0121\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0129\b\u000e\u0003\u000e\u012b\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u013b\b\u0011\n\u0011\f\u0011\u013e\t\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0003\u0013\u0144\b\u0013\u0001\u0013\u0005"+
		"\u0013\u0147\b\u0013\n\u0013\f\u0013\u014a\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u014f\b\u0013\u0001\u0013\u0003\u0013\u0152\b"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0156\b\u0013\n\u0013\f\u0013"+
		"\u0159\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0005\u0014\u015e\b"+
		"\u0014\n\u0014\f\u0014\u0161\t\u0014\u0001\u0014\u0003\u0014\u0164\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u016b\b\u0014\n\u0014\f\u0014\u016e\t\u0014\u0003\u0014\u0170\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0174\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u0178\b\u0014\n\u0014\f\u0014\u017b\t\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0187\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0000\u0001\u0004\u0017\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000"+
		"\u0001\u0001\u0000\u0017\u001c\u01af\u0000.\u0001\u0000\u0000\u0000\u0002"+
		"0\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000\u0000\u0006l\u0001"+
		"\u0000\u0000\u0000\b\u0089\u0001\u0000\u0000\u0000\n\u00b1\u0001\u0000"+
		"\u0000\u0000\f\u00b3\u0001\u0000\u0000\u0000\u000e\u00cf\u0001\u0000\u0000"+
		"\u0000\u0010\u00d5\u0001\u0000\u0000\u0000\u0012\u00d7\u0001\u0000\u0000"+
		"\u0000\u0014\u00da\u0001\u0000\u0000\u0000\u0016\u00e6\u0001\u0000\u0000"+
		"\u0000\u0018\u010e\u0001\u0000\u0000\u0000\u001a\u0114\u0001\u0000\u0000"+
		"\u0000\u001c\u012a\u0001\u0000\u0000\u0000\u001e\u012c\u0001\u0000\u0000"+
		"\u0000 \u0131\u0001\u0000\u0000\u0000\"\u0136\u0001\u0000\u0000\u0000"+
		"$\u013f\u0001\u0000\u0000\u0000&\u0143\u0001\u0000\u0000\u0000(\u015f"+
		"\u0001\u0000\u0000\u0000*\u0186\u0001\u0000\u0000\u0000,\u0188\u0001\u0000"+
		"\u0000\u0000./\u0003&\u0013\u0000/\u0001\u0001\u0000\u0000\u000001\u0004"+
		"\u0001\u0000\u000016\u0005*\u0000\u000023\u0005\u0001\u0000\u000035\u0005"+
		"*\u0000\u000042\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0003\u0001\u0000\u0000"+
		"\u000086\u0001\u0000\u0000\u00009:\u0006\u0002\uffff\uffff\u0000:A\u0003"+
		"\u0002\u0001\u0000;<\u0003\u0002\u0001\u0000<=\u0005\u0002\u0000\u0000"+
		"=>\u0003\u0004\u0002\u0000>?\u0005\u0003\u0000\u0000?A\u0001\u0000\u0000"+
		"\u0000@9\u0001\u0000\u0000\u0000@;\u0001\u0000\u0000\u0000AG\u0001\u0000"+
		"\u0000\u0000BC\n\u0001\u0000\u0000CD\u0005\u0004\u0000\u0000DF\u0005\u0005"+
		"\u0000\u0000EB\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0005\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000Jm\u0003,\u0016\u0000Km\u0003\u000e\u0007"+
		"\u0000LN\u0005\u0015\u0000\u0000MO\u0003\u0004\u0002\u0000NM\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000Pm\u0003"+
		"\u0006\u0003\u0000QV\u0003\u000e\u0007\u0000RS\u0005\u0001\u0000\u0000"+
		"SU\u0003\u0006\u0003\u0000TR\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000"+
		"\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000Wm\u0001\u0000"+
		"\u0000\u0000XV\u0001\u0000\u0000\u0000Y^\u0003\u0002\u0001\u0000Z[\u0005"+
		"\u0001\u0000\u0000[]\u0003\u0006\u0003\u0000\\Z\u0001\u0000\u0000\u0000"+
		"]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000"+
		"\u0000_m\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ab\u0005\u0006"+
		"\u0000\u0000bg\u0003\u0006\u0003\u0000cd\u0005\u0007\u0000\u0000df\u0003"+
		"\u0006\u0003\u0000ec\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000jk\u0005\b\u0000\u0000km\u0001\u0000\u0000"+
		"\u0000lJ\u0001\u0000\u0000\u0000lK\u0001\u0000\u0000\u0000lL\u0001\u0000"+
		"\u0000\u0000lQ\u0001\u0000\u0000\u0000lY\u0001\u0000\u0000\u0000la\u0001"+
		"\u0000\u0000\u0000m\u0007\u0001\u0000\u0000\u0000no\u0003\u0004\u0002"+
		"\u0000op\u0003\u0002\u0001\u0000pq\u0005\t\u0000\u0000q\u008a\u0001\u0000"+
		"\u0000\u0000rt\u0005\u001f\u0000\u0000sr\u0001\u0000\u0000\u0000tw\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0003\u0004\u0002"+
		"\u0000yz\u0003\u0002\u0001\u0000z{\u0005\u0016\u0000\u0000{|\u0003\u0006"+
		"\u0003\u0000|\u0084\u0001\u0000\u0000\u0000}~\u0005\u0007\u0000\u0000"+
		"~\u007f\u0003\u0002\u0001\u0000\u007f\u0080\u0005\u0016\u0000\u0000\u0080"+
		"\u0081\u0003\u0006\u0003\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082"+
		"}\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0005\t\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089n\u0001"+
		"\u0000\u0000\u0000\u0089u\u0001\u0000\u0000\u0000\u008a\t\u0001\u0000"+
		"\u0000\u0000\u008b\u008d\u0003\u0010\b\u0000\u008c\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0093\u0005\u001f\u0000"+
		"\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0003\u0004\u0002"+
		"\u0000\u0097\u0098\u0003\u0002\u0001\u0000\u0098\u0099\u0005\t\u0000\u0000"+
		"\u0099\u00b2\u0001\u0000\u0000\u0000\u009a\u009c\u0005\u001f\u0000\u0000"+
		"\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000"+
		"\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000"+
		"\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0003\u0004\u0002\u0000\u00a1\u00a2\u0003\u0002\u0001\u0000"+
		"\u00a2\u00a3\u0005\u0016\u0000\u0000\u00a3\u00a4\u0003\u0006\u0003\u0000"+
		"\u00a4\u00ac\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0007\u0000\u0000"+
		"\u00a6\u00a7\u0003\u0002\u0001\u0000\u00a7\u00a8\u0005\u0016\u0000\u0000"+
		"\u00a8\u00a9\u0003\u0006\u0003\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a5\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005\t\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1"+
		"\u008e\u0001\u0000\u0000\u0000\u00b1\u009d\u0001\u0000\u0000\u0000\u00b2"+
		"\u000b\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003\u0002\u0001\u0000\u00b4"+
		"\u00b5\u0005\u0016\u0000\u0000\u00b5\u00b6\u0003\u0006\u0003\u0000\u00b6"+
		"\r\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003\u0002\u0001\u0000\u00b8\u00b9"+
		"\u0005\n\u0000\u0000\u00b9\u00ba\u0005\u000b\u0000\u0000\u00ba\u00d0\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0003\u0002\u0001\u0000\u00bc\u00c0\u0005"+
		"\n\u0000\u0000\u00bd\u00c1\u0003\u0002\u0001\u0000\u00be\u00c1\u0003\u000e"+
		"\u0007\u0000\u00bf\u00c1\u0003\u0006\u0003\u0000\u00c0\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c1\u00ca\u0001\u0000\u0000\u0000\u00c2\u00c6\u0005\u0007"+
		"\u0000\u0000\u00c3\u00c7\u0003\u0002\u0001\u0000\u00c4\u00c7\u0003\u000e"+
		"\u0007\u0000\u00c5\u00c7\u0003\u0006\u0003\u0000\u00c6\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u000b"+
		"\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00b7\u0001\u0000"+
		"\u0000\u0000\u00cf\u00bb\u0001\u0000\u0000\u0000\u00d0\u000f\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0005\u0014\u0000\u0000\u00d2\u00d6\u0003\u000e"+
		"\u0007\u0000\u00d3\u00d4\u0005\u0014\u0000\u0000\u00d4\u00d6\u0003\u0002"+
		"\u0001\u0000\u00d5\u00d1\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d6\u0011\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003\u0004"+
		"\u0002\u0000\u00d8\u00d9\u0003\u0002\u0001\u0000\u00d9\u0013\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0005\u0013\u0000\u0000\u00db\u00e0\u0003\u0002"+
		"\u0001\u0000\u00dc\u00dd\u0005\u0007\u0000\u0000\u00dd\u00df\u0003\u0002"+
		"\u0001\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e1\u0015\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e5\u0003\u0010\b\u0000\u00e4\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00ec\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00eb\u0005\u001f\u0000"+
		"\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0003\u0004\u0002\u0000\u00f0\u00f1\u0003\u0002\u0001"+
		"\u0000\u00f1\u00fa\u0005\n\u0000\u0000\u00f2\u00f7\u0003\u0012\t\u0000"+
		"\u00f3\u00f4\u0005\u0007\u0000\u0000\u00f4\u00f6\u0003\u0012\t\u0000\u00f5"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8"+
		"\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa"+
		"\u00f2\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0005\u000b\u0000\u0000\u00fd"+
		"\u00ff\u0003\u0014\n\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102"+
		"\u0005\u0006\u0000\u0000\u0101\u0103\u0003\u0018\f\u0000\u0102\u0101\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0105\u0001"+
		"\u0000\u0000\u0000\u0104\u0106\u0003\u001a\r\u0000\u0105\u0104\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0005\b\u0000\u0000\u0108\u0017\u0001\u0000\u0000"+
		"\u0000\u0109\u010f\u0003\b\u0004\u0000\u010a\u010f\u0003\f\u0006\u0000"+
		"\u010b\u010f\u0003\u000e\u0007\u0000\u010c\u010f\u0003\u0016\u000b\u0000"+
		"\u010d\u010f\u0003\u001c\u000e\u0000\u010e\u0109\u0001\u0000\u0000\u0000"+
		"\u010e\u010a\u0001\u0000\u0000\u0000\u010e\u010b\u0001\u0000\u0000\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0005\t\u0000\u0000\u0113\u0019\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0005\f\u0000\u0000\u0115\u0116\u0003\u0006\u0003\u0000\u0116\u0117"+
		"\u0005\t\u0000\u0000\u0117\u001b\u0001\u0000\u0000\u0000\u0118\u0119\u0005"+
		"\u0011\u0000\u0000\u0119\u011a\u0005\n\u0000\u0000\u011a\u011b\u0003\u000e"+
		"\u0007\u0000\u011b\u011c\u0005\u000b\u0000\u0000\u011c\u011d\u0005\u0006"+
		"\u0000\u0000\u011d\u011e\u0003\u0018\f\u0000\u011e\u0120\u0005\b\u0000"+
		"\u0000\u011f\u0121\u0003\u001e\u000f\u0000\u0120\u011f\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u012b\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0005\u0011\u0000\u0000\u0123\u0124\u0005\n\u0000\u0000"+
		"\u0124\u0125\u0003\u000e\u0007\u0000\u0125\u0126\u0005\u000b\u0000\u0000"+
		"\u0126\u0128\u0003\u0018\f\u0000\u0127\u0129\u0003\u001e\u000f\u0000\u0128"+
		"\u0127\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129"+
		"\u012b\u0001\u0000\u0000\u0000\u012a\u0118\u0001\u0000\u0000\u0000\u012a"+
		"\u0122\u0001\u0000\u0000\u0000\u012b\u001d\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0005\u0012\u0000\u0000\u012d\u012e\u0005\u0006\u0000\u0000\u012e"+
		"\u012f\u0003\u0018\f\u0000\u012f\u0130\u0005\b\u0000\u0000\u0130\u001f"+
		"\u0001\u0000\u0000\u0000\u0131\u0132\u0005\n\u0000\u0000\u0132\u0133\u0003"+
		"\u0004\u0002\u0000\u0133\u0134\u0005\u000b\u0000\u0000\u0134\u0135\u0003"+
		"\u000e\u0007\u0000\u0135!\u0001\u0000\u0000\u0000\u0136\u0137\u0005\u000e"+
		"\u0000\u0000\u0137\u013c\u0003\u0002\u0001\u0000\u0138\u0139\u0005\u0007"+
		"\u0000\u0000\u0139\u013b\u0003\u0002\u0001\u0000\u013a\u0138\u0001\u0000"+
		"\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d#\u0001\u0000\u0000"+
		"\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u000f\u0000"+
		"\u0000\u0140\u0141\u0003\u0002\u0001\u0000\u0141%\u0001\u0000\u0000\u0000"+
		"\u0142\u0144\u0003\u0010\b\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u0001\u0000\u0000\u0000\u0144\u0148\u0001\u0000\u0000\u0000\u0145"+
		"\u0147\u0005\u001f\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147"+
		"\u014a\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0001\u0000\u0000\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a"+
		"\u0148\u0001\u0000\u0000\u0000\u014b\u014c\u0005\r\u0000\u0000\u014c\u014e"+
		"\u0003\u0002\u0001\u0000\u014d\u014f\u0003$\u0012\u0000\u014e\u014d\u0001"+
		"\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0151\u0001"+
		"\u0000\u0000\u0000\u0150\u0152\u0003\"\u0011\u0000\u0151\u0150\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000"+
		"\u0000\u0000\u0153\u0157\u0005\u0006\u0000\u0000\u0154\u0156\u0003*\u0015"+
		"\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000\u0000"+
		"\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000"+
		"\u0000\u0158\u015a\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0005\b\u0000\u0000\u015b\'\u0001\u0000\u0000\u0000"+
		"\u015c\u015e\u0003\u0010\b\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e"+
		"\u0161\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f"+
		"\u0160\u0001\u0000\u0000\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161"+
		"\u015f\u0001\u0000\u0000\u0000\u0162\u0164\u0005\u001f\u0000\u0000\u0163"+
		"\u0162\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164"+
		"\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0003\u0002\u0001\u0000\u0166"+
		"\u016f\u0005\n\u0000\u0000\u0167\u016c\u0003\u0012\t\u0000\u0168\u0169"+
		"\u0005\u0007\u0000\u0000\u0169\u016b\u0003\u0012\t\u0000\u016a\u0168\u0001"+
		"\u0000\u0000\u0000\u016b\u016e\u0001\u0000\u0000\u0000\u016c\u016a\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u0170\u0001"+
		"\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f\u0167\u0001"+
		"\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0171\u0001"+
		"\u0000\u0000\u0000\u0171\u0173\u0005\u000b\u0000\u0000\u0172\u0174\u0003"+
		"\u0014\n\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0179\u0005\u0006"+
		"\u0000\u0000\u0176\u0178\u0003\u0018\f\u0000\u0177\u0176\u0001\u0000\u0000"+
		"\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000"+
		"\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017c\u0001\u0000\u0000"+
		"\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u017d\u0005\b\u0000\u0000"+
		"\u017d)\u0001\u0000\u0000\u0000\u017e\u0187\u0003(\u0014\u0000\u017f\u0187"+
		"\u0003\n\u0005\u0000\u0180\u0187\u0003\u000e\u0007\u0000\u0181\u0187\u0003"+
		"\u0016\u000b\u0000\u0182\u0187\u0003&\u0013\u0000\u0183\u0184\u0003\u001c"+
		"\u000e\u0000\u0184\u0185\u0005\t\u0000\u0000\u0185\u0187\u0001\u0000\u0000"+
		"\u0000\u0186\u017e\u0001\u0000\u0000\u0000\u0186\u017f\u0001\u0000\u0000"+
		"\u0000\u0186\u0180\u0001\u0000\u0000\u0000\u0186\u0181\u0001\u0000\u0000"+
		"\u0000\u0186\u0182\u0001\u0000\u0000\u0000\u0186\u0183\u0001\u0000\u0000"+
		"\u0000\u0187+\u0001\u0000\u0000\u0000\u0188\u0189\u0007\u0000\u0000\u0000"+
		"\u0189-\u0001\u0000\u0000\u0000/6@GNV^glu\u0084\u0089\u008e\u0094\u009d"+
		"\u00ac\u00b1\u00c0\u00c6\u00ca\u00cf\u00d5\u00e0\u00e6\u00ec\u00f7\u00fa"+
		"\u00fe\u0102\u0105\u010e\u0110\u0120\u0128\u012a\u013c\u0143\u0148\u014e"+
		"\u0151\u0157\u015f\u0163\u016c\u016f\u0173\u0179\u0186";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}