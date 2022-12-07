// Generated from C:/Users/Arsenii/labs-translation-methods/src/lab3\HTMLHighlighting.g4 by ANTLR 4.10.1
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
		IF=17, ELSE=18, THROWS=19, AT=20, NEW=21, ASSIGN=22, PRIMITIVE_VALUE=23, 
		NULL=24, INT=25, FLOAT=26, STRING=27, CHAR=28, BOOLEAN=29, TRUE=30, FALSE=31, 
		MODIFIER=32, PUBLIC=33, PRIVATE=34, FINAL=35, STATIC=36, VOLATILE=37, 
		TRANSIENT=38, SYNCHRONIZED=39, NATIVE=40, ABSTRACT=41, PROTECTED=42, NAME=43, 
		WS=44;
	public static final int
		RULE_start = 0, RULE_nameType = 1, RULE_typeVar = 2, RULE_value = 3, RULE_declareVar = 4, 
		RULE_declareField = 5, RULE_assignVar = 6, RULE_callMethod = 7, RULE_annotation = 8, 
		RULE_arg = 9, RULE_exeptions = 10, RULE_function = 11, RULE_bodyFunction = 12, 
		RULE_returnFunction = 13, RULE_ifStatement = 14, RULE_elseStatement = 15, 
		RULE_castStatement = 16, RULE_implements = 17, RULE_exstends = 18, RULE_class = 19, 
		RULE_constructor = 20, RULE_bodyClass = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "nameType", "typeVar", "value", "declareVar", "declareField", 
			"assignVar", "callMethod", "annotation", "arg", "exeptions", "function", 
			"bodyFunction", "returnFunction", "ifStatement", "elseStatement", "castStatement", 
			"implements", "exstends", "class", "constructor", "bodyClass"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'<'", "'>'", "'['", "']'", "'{'", "','", "'}'", "';'", 
			"'('", "')'", "'return'", "'class'", "'implements'", "'extends'", "'for'", 
			"'if'", "'else'", "'throws'", "'@'", "'new'", "'='", null, "'null'", 
			null, null, null, null, null, "'true'", "'false'", null, "'public'", 
			"'private'", "'final'", "'static'", "'volatile'", "'transient'", "'synchronized'", 
			"'native'", "'abstract'", "'protected'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"RETURN", "CLASS", "IMPLEMENTS", "EXTENDS", "FOR", "IF", "ELSE", "THROWS", 
			"AT", "NEW", "ASSIGN", "PRIMITIVE_VALUE", "NULL", "INT", "FLOAT", "STRING", 
			"CHAR", "BOOLEAN", "TRUE", "FALSE", "MODIFIER", "PUBLIC", "PRIVATE", 
			"FINAL", "STATIC", "VOLATILE", "TRANSIENT", "SYNCHRONIZED", "NATIVE", 
			"ABSTRACT", "PROTECTED", "NAME", "WS"
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
			setState(44);
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
			setState(46);
			if (!( Tools.isNotReservedWord(_input.LT(1).getText()) )) throw new FailedPredicateException(this, " Tools.isNotReservedWord(_input.LT(1).getText()) ");
			setState(47);
			match(NAME);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(48);
					match(T__0);
					}
					setState(49);
					match(NAME);
					}
					} 
				}
				setState(54);
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
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(56);
				nameType();
				}
				break;
			case 2:
				{
				setState(57);
				nameType();
				setState(58);
				match(T__1);
				setState(59);
				typeVar(0);
				setState(60);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(69);
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
					setState(64);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(65);
					match(T__3);
					setState(66);
					match(T__4);
					}
					} 
				}
				setState(71);
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
		public TerminalNode PRIMITIVE_VALUE() { return getToken(HTMLHighlightingParser.PRIMITIVE_VALUE, 0); }
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
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(PRIMITIVE_VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				callMethod();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(NEW);
				setState(76);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(75);
					typeVar(0);
					}
					break;
				}
				setState(78);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				callMethod();
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(80);
						match(T__0);
						setState(81);
						value();
						}
						} 
					}
					setState(86);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				nameType();
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(88);
						match(T__0);
						setState(89);
						value();
						}
						} 
					}
					setState(94);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				match(T__5);
				setState(96);
				value();
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(97);
					match(T__6);
					setState(98);
					value();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
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
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(108);
						match(MODIFIER);
						}
						} 
					}
					setState(113);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(114);
				typeVar(0);
				setState(115);
				nameType();
				setState(116);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(118);
						match(MODIFIER);
						}
						} 
					}
					setState(123);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(124);
				typeVar(0);
				{
				setState(125);
				nameType();
				setState(126);
				match(ASSIGN);
				setState(127);
				value();
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(129);
					match(T__6);
					setState(130);
					nameType();
					setState(131);
					match(ASSIGN);
					setState(132);
					value();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
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
		public DeclareVarContext declareVar() {
			return getRuleContext(DeclareVarContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143);
					annotation();
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(149);
			declareVar();
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
			setState(151);
			nameType();
			setState(152);
			match(ASSIGN);
			setState(153);
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
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				nameType();
				setState(156);
				match(T__9);
				setState(157);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				nameType();
				setState(160);
				match(T__9);
				setState(164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(161);
					nameType();
					}
					break;
				case 2:
					{
					setState(162);
					callMethod();
					}
					break;
				case 3:
					{
					setState(163);
					value();
					}
					break;
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(166);
					match(T__6);
					setState(170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(167);
						nameType();
						}
						break;
					case 2:
						{
						setState(168);
						callMethod();
						}
						break;
					case 3:
						{
						setState(169);
						value();
						}
						break;
					}
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
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
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(AT);
				setState(182);
				callMethod();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(AT);
				setState(184);
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
			setState(187);
			typeVar(0);
			setState(188);
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
			setState(190);
			match(THROWS);
			setState(191);
			nameType();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(192);
				match(T__6);
				setState(193);
				nameType();
				}
				}
				setState(198);
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
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					annotation();
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					match(MODIFIER);
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(211);
			typeVar(0);
			setState(212);
			nameType();
			setState(213);
			match(T__9);
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(214);
				arg();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(215);
					match(T__6);
					setState(216);
					arg();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(224);
			match(T__10);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(225);
				exeptions();
				}
			}

			setState(228);
			match(T__5);
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(229);
				bodyFunction();
				}
				break;
			}
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(232);
				returnFunction();
				}
			}

			setState(235);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(237);
				declareVar();
				}
				break;
			case 2:
				{
				setState(238);
				assignVar();
				}
				break;
			case 3:
				{
				setState(239);
				callMethod();
				}
				break;
			case 4:
				{
				setState(240);
				function();
				}
				break;
			case 5:
				{
				setState(241);
				ifStatement();
				}
				break;
			}
			setState(244);
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
			setState(246);
			match(RETURN);
			setState(247);
			value();
			setState(248);
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
		int _la;
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(IF);
				setState(251);
				match(T__9);
				setState(252);
				callMethod();
				setState(253);
				match(T__10);
				setState(254);
				match(T__5);
				setState(255);
				bodyFunction();
				setState(256);
				match(T__7);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(257);
					elseStatement();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(IF);
				setState(261);
				match(T__9);
				setState(262);
				callMethod();
				setState(263);
				match(T__10);
				setState(264);
				bodyFunction();
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(265);
					elseStatement();
					}
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
			setState(270);
			match(ELSE);
			setState(271);
			match(T__5);
			setState(272);
			bodyFunction();
			setState(273);
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
			setState(275);
			match(T__9);
			setState(276);
			typeVar(0);
			setState(277);
			match(T__10);
			setState(278);
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
			setState(280);
			match(IMPLEMENTS);
			setState(281);
			nameType();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(282);
				match(T__6);
				setState(283);
				nameType();
				}
				}
				setState(288);
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
			setState(289);
			match(EXTENDS);
			setState(290);
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
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(292);
				annotation();
				}
			}

			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(295);
				match(MODIFIER);
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			match(CLASS);
			setState(302);
			nameType();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(303);
				exstends();
				}
			}

			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(306);
				implements_();
				}
			}

			setState(309);
			match(T__5);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(310);
					bodyClass();
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(316);
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
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(318);
					annotation();
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(324);
				match(MODIFIER);
				}
				break;
			}
			setState(327);
			nameType();
			setState(328);
			match(T__9);
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(329);
				arg();
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(330);
					match(T__6);
					setState(331);
					arg();
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(339);
			match(T__10);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(340);
				exeptions();
				}
			}

			setState(343);
			match(T__5);
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(344);
					bodyFunction();
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(350);
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
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				constructor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				declareField();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				callMethod();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(355);
				function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(356);
				class_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(357);
				ifStatement();
				setState(358);
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
		"\u0004\u0001,\u016b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u00013\b\u0001\n\u0001\f\u00016\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"?\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002D\b\u0002\n\u0002"+
		"\f\u0002G\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003M\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003S\b\u0003\n\u0003\f\u0003V\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003[\b\u0003\n\u0003\f\u0003^\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003d\b\u0003\n\u0003\f\u0003g\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003k\b\u0003\u0001\u0004\u0005"+
		"\u0004n\b\u0004\n\u0004\f\u0004q\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004x\b\u0004\n\u0004\f\u0004{\t"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0087"+
		"\b\u0004\n\u0004\f\u0004\u008a\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u008e\b\u0004\u0001\u0005\u0005\u0005\u0091\b\u0005\n\u0005\f\u0005\u0094"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a5\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ab\b\u0007\u0005"+
		"\u0007\u00ad\b\u0007\n\u0007\f\u0007\u00b0\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00b4\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00ba"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00c3"+
		"\b\n\n\n\f\n\u00c6\t\n\u0001\u000b\u0005\u000b\u00c9\b\u000b\n\u000b\f"+
		"\u000b\u00cc\t\u000b\u0001\u000b\u0005\u000b\u00cf\b\u000b\n\u000b\f\u000b"+
		"\u00d2\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00da\b\u000b\n\u000b\f\u000b\u00dd\t\u000b\u0003"+
		"\u000b\u00df\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e3\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00e7\b\u000b\u0001\u000b\u0003\u000b"+
		"\u00ea\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u00f3\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u0103\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u010b\b\u000e"+
		"\u0003\u000e\u010d\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u011d\b\u0011"+
		"\n\u0011\f\u0011\u0120\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0003\u0013\u0126\b\u0013\u0001\u0013\u0005\u0013\u0129\b\u0013"+
		"\n\u0013\f\u0013\u012c\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0131\b\u0013\u0001\u0013\u0003\u0013\u0134\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u0138\b\u0013\n\u0013\f\u0013\u013b\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0005\u0014\u0140\b\u0014\n\u0014\f\u0014"+
		"\u0143\t\u0014\u0001\u0014\u0003\u0014\u0146\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u014d\b\u0014\n"+
		"\u0014\f\u0014\u0150\t\u0014\u0003\u0014\u0152\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0156\b\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u015a"+
		"\b\u0014\n\u0014\f\u0014\u015d\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0169\b\u0015\u0001\u0015\u0000\u0001\u0004\u0016"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*\u0000\u0000\u018c\u0000,\u0001\u0000\u0000\u0000\u0002"+
		".\u0001\u0000\u0000\u0000\u0004>\u0001\u0000\u0000\u0000\u0006j\u0001"+
		"\u0000\u0000\u0000\b\u008d\u0001\u0000\u0000\u0000\n\u0092\u0001\u0000"+
		"\u0000\u0000\f\u0097\u0001\u0000\u0000\u0000\u000e\u00b3\u0001\u0000\u0000"+
		"\u0000\u0010\u00b9\u0001\u0000\u0000\u0000\u0012\u00bb\u0001\u0000\u0000"+
		"\u0000\u0014\u00be\u0001\u0000\u0000\u0000\u0016\u00ca\u0001\u0000\u0000"+
		"\u0000\u0018\u00f2\u0001\u0000\u0000\u0000\u001a\u00f6\u0001\u0000\u0000"+
		"\u0000\u001c\u010c\u0001\u0000\u0000\u0000\u001e\u010e\u0001\u0000\u0000"+
		"\u0000 \u0113\u0001\u0000\u0000\u0000\"\u0118\u0001\u0000\u0000\u0000"+
		"$\u0121\u0001\u0000\u0000\u0000&\u0125\u0001\u0000\u0000\u0000(\u0141"+
		"\u0001\u0000\u0000\u0000*\u0168\u0001\u0000\u0000\u0000,-\u0003&\u0013"+
		"\u0000-\u0001\u0001\u0000\u0000\u0000./\u0004\u0001\u0000\u0000/4\u0005"+
		"+\u0000\u000001\u0005\u0001\u0000\u000013\u0005+\u0000\u000020\u0001\u0000"+
		"\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u00005\u0003\u0001\u0000\u0000\u000064\u0001\u0000\u0000"+
		"\u000078\u0006\u0002\uffff\uffff\u00008?\u0003\u0002\u0001\u00009:\u0003"+
		"\u0002\u0001\u0000:;\u0005\u0002\u0000\u0000;<\u0003\u0004\u0002\u0000"+
		"<=\u0005\u0003\u0000\u0000=?\u0001\u0000\u0000\u0000>7\u0001\u0000\u0000"+
		"\u0000>9\u0001\u0000\u0000\u0000?E\u0001\u0000\u0000\u0000@A\n\u0001\u0000"+
		"\u0000AB\u0005\u0004\u0000\u0000BD\u0005\u0005\u0000\u0000C@\u0001\u0000"+
		"\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000F\u0005\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000Hk\u0005\u0017\u0000\u0000Ik\u0003\u000e\u0007\u0000JL\u0005\u0015"+
		"\u0000\u0000KM\u0003\u0004\u0002\u0000LK\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000Nk\u0003\u0006\u0003\u0000"+
		"OT\u0003\u000e\u0007\u0000PQ\u0005\u0001\u0000\u0000QS\u0003\u0006\u0003"+
		"\u0000RP\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000Uk\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000W\\\u0003\u0002\u0001\u0000XY\u0005\u0001\u0000\u0000"+
		"Y[\u0003\u0006\u0003\u0000ZX\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]k\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005\u0006\u0000\u0000`e\u0003"+
		"\u0006\u0003\u0000ab\u0005\u0007\u0000\u0000bd\u0003\u0006\u0003\u0000"+
		"ca\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000hi\u0005\b\u0000\u0000ik\u0001\u0000\u0000\u0000jH\u0001\u0000"+
		"\u0000\u0000jI\u0001\u0000\u0000\u0000jJ\u0001\u0000\u0000\u0000jO\u0001"+
		"\u0000\u0000\u0000jW\u0001\u0000\u0000\u0000j_\u0001\u0000\u0000\u0000"+
		"k\u0007\u0001\u0000\u0000\u0000ln\u0005 \u0000\u0000ml\u0001\u0000\u0000"+
		"\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rs\u0003"+
		"\u0004\u0002\u0000st\u0003\u0002\u0001\u0000tu\u0005\t\u0000\u0000u\u008e"+
		"\u0001\u0000\u0000\u0000vx\u0005 \u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0003\u0004"+
		"\u0002\u0000}~\u0003\u0002\u0001\u0000~\u007f\u0005\u0016\u0000\u0000"+
		"\u007f\u0080\u0003\u0006\u0003\u0000\u0080\u0088\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005\u0007\u0000\u0000\u0082\u0083\u0003\u0002\u0001\u0000"+
		"\u0083\u0084\u0005\u0016\u0000\u0000\u0084\u0085\u0003\u0006\u0003\u0000"+
		"\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0081\u0001\u0000\u0000\u0000"+
		"\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u0005\t\u0000\u0000\u008c"+
		"\u008e\u0001\u0000\u0000\u0000\u008do\u0001\u0000\u0000\u0000\u008dy\u0001"+
		"\u0000\u0000\u0000\u008e\t\u0001\u0000\u0000\u0000\u008f\u0091\u0003\u0010"+
		"\b\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
		"\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0003\b\u0004\u0000\u0096\u000b\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0003\u0002\u0001\u0000\u0098\u0099\u0005\u0016\u0000\u0000"+
		"\u0099\u009a\u0003\u0006\u0003\u0000\u009a\r\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0003\u0002\u0001\u0000\u009c\u009d\u0005\n\u0000\u0000\u009d\u009e"+
		"\u0005\u000b\u0000\u0000\u009e\u00b4\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0003\u0002\u0001\u0000\u00a0\u00a4\u0005\n\u0000\u0000\u00a1\u00a5\u0003"+
		"\u0002\u0001\u0000\u00a2\u00a5\u0003\u000e\u0007\u0000\u00a3\u00a5\u0003"+
		"\u0006\u0003\u0000\u00a4\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00ae\u0001"+
		"\u0000\u0000\u0000\u00a6\u00aa\u0005\u0007\u0000\u0000\u00a7\u00ab\u0003"+
		"\u0002\u0001\u0000\u00a8\u00ab\u0003\u000e\u0007\u0000\u00a9\u00ab\u0003"+
		"\u0006\u0003\u0000\u00aa\u00a7\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ac\u00a6\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0005\u000b\u0000\u0000\u00b2\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b3\u009b\u0001\u0000\u0000\u0000\u00b3\u009f\u0001"+
		"\u0000\u0000\u0000\u00b4\u000f\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"\u0014\u0000\u0000\u00b6\u00ba\u0003\u000e\u0007\u0000\u00b7\u00b8\u0005"+
		"\u0014\u0000\u0000\u00b8\u00ba\u0003\u0002\u0001\u0000\u00b9\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u0011\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0003\u0004\u0002\u0000\u00bc\u00bd\u0003"+
		"\u0002\u0001\u0000\u00bd\u0013\u0001\u0000\u0000\u0000\u00be\u00bf\u0005"+
		"\u0013\u0000\u0000\u00bf\u00c4\u0003\u0002\u0001\u0000\u00c0\u00c1\u0005"+
		"\u0007\u0000\u0000\u00c1\u00c3\u0003\u0002\u0001\u0000\u00c2\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u0015\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c9\u0003"+
		"\u0010\b\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cb\u00d0\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cf\u0005 \u0000\u0000\u00ce\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d4\u0003\u0004\u0002"+
		"\u0000\u00d4\u00d5\u0003\u0002\u0001\u0000\u00d5\u00de\u0005\n\u0000\u0000"+
		"\u00d6\u00db\u0003\u0012\t\u0000\u00d7\u00d8\u0005\u0007\u0000\u0000\u00d8"+
		"\u00da\u0003\u0012\t\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00dd"+
		"\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db"+
		"\u0001\u0000\u0000\u0000\u00de\u00d6\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e2"+
		"\u0005\u000b\u0000\u0000\u00e1\u00e3\u0003\u0014\n\u0000\u00e2\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e6\u0005\u0006\u0000\u0000\u00e5\u00e7\u0003"+
		"\u0018\f\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00ea\u0003\u001a"+
		"\r\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\b\u0000\u0000"+
		"\u00ec\u0017\u0001\u0000\u0000\u0000\u00ed\u00f3\u0003\b\u0004\u0000\u00ee"+
		"\u00f3\u0003\f\u0006\u0000\u00ef\u00f3\u0003\u000e\u0007\u0000\u00f0\u00f3"+
		"\u0003\u0016\u000b\u0000\u00f1\u00f3\u0003\u001c\u000e\u0000\u00f2\u00ed"+
		"\u0001\u0000\u0000\u0000\u00f2\u00ee\u0001\u0000\u0000\u0000\u00f2\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0005\t\u0000\u0000\u00f5\u0019\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005"+
		"\f\u0000\u0000\u00f7\u00f8\u0003\u0006\u0003\u0000\u00f8\u00f9\u0005\t"+
		"\u0000\u0000\u00f9\u001b\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u0011"+
		"\u0000\u0000\u00fb\u00fc\u0005\n\u0000\u0000\u00fc\u00fd\u0003\u000e\u0007"+
		"\u0000\u00fd\u00fe\u0005\u000b\u0000\u0000\u00fe\u00ff\u0005\u0006\u0000"+
		"\u0000\u00ff\u0100\u0003\u0018\f\u0000\u0100\u0102\u0005\b\u0000\u0000"+
		"\u0101\u0103\u0003\u001e\u000f\u0000\u0102\u0101\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u010d\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0005\u0011\u0000\u0000\u0105\u0106\u0005\n\u0000\u0000\u0106"+
		"\u0107\u0003\u000e\u0007\u0000\u0107\u0108\u0005\u000b\u0000\u0000\u0108"+
		"\u010a\u0003\u0018\f\u0000\u0109\u010b\u0003\u001e\u000f\u0000\u010a\u0109"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010d"+
		"\u0001\u0000\u0000\u0000\u010c\u00fa\u0001\u0000\u0000\u0000\u010c\u0104"+
		"\u0001\u0000\u0000\u0000\u010d\u001d\u0001\u0000\u0000\u0000\u010e\u010f"+
		"\u0005\u0012\u0000\u0000\u010f\u0110\u0005\u0006\u0000\u0000\u0110\u0111"+
		"\u0003\u0018\f\u0000\u0111\u0112\u0005\b\u0000\u0000\u0112\u001f\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0005\n\u0000\u0000\u0114\u0115\u0003\u0004"+
		"\u0002\u0000\u0115\u0116\u0005\u000b\u0000\u0000\u0116\u0117\u0003\u000e"+
		"\u0007\u0000\u0117!\u0001\u0000\u0000\u0000\u0118\u0119\u0005\u000e\u0000"+
		"\u0000\u0119\u011e\u0003\u0002\u0001\u0000\u011a\u011b\u0005\u0007\u0000"+
		"\u0000\u011b\u011d\u0003\u0002\u0001\u0000\u011c\u011a\u0001\u0000\u0000"+
		"\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f#\u0001\u0000\u0000\u0000"+
		"\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u000f\u0000\u0000"+
		"\u0122\u0123\u0003\u0002\u0001\u0000\u0123%\u0001\u0000\u0000\u0000\u0124"+
		"\u0126\u0003\u0010\b\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0001\u0000\u0000\u0000\u0126\u012a\u0001\u0000\u0000\u0000\u0127\u0129"+
		"\u0005 \u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129\u012c\u0001"+
		"\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001"+
		"\u0000\u0000\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u012a\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0005\r\u0000\u0000\u012e\u0130\u0003\u0002"+
		"\u0001\u0000\u012f\u0131\u0003$\u0012\u0000\u0130\u012f\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0133\u0001\u0000\u0000"+
		"\u0000\u0132\u0134\u0003\"\u0011\u0000\u0133\u0132\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000"+
		"\u0135\u0139\u0005\u0006\u0000\u0000\u0136\u0138\u0003*\u0015\u0000\u0137"+
		"\u0136\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139"+
		"\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a"+
		"\u013c\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0005\b\u0000\u0000\u013d\'\u0001\u0000\u0000\u0000\u013e\u0140"+
		"\u0003\u0010\b\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u0143\u0001"+
		"\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001"+
		"\u0000\u0000\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001"+
		"\u0000\u0000\u0000\u0144\u0146\u0005 \u0000\u0000\u0145\u0144\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0003\u0002\u0001\u0000\u0148\u0151\u0005\n\u0000"+
		"\u0000\u0149\u014e\u0003\u0012\t\u0000\u014a\u014b\u0005\u0007\u0000\u0000"+
		"\u014b\u014d\u0003\u0012\t\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d"+
		"\u0150\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150"+
		"\u014e\u0001\u0000\u0000\u0000\u0151\u0149\u0001\u0000\u0000\u0000\u0151"+
		"\u0152\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153"+
		"\u0155\u0005\u000b\u0000\u0000\u0154\u0156\u0003\u0014\n\u0000\u0155\u0154"+
		"\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157"+
		"\u0001\u0000\u0000\u0000\u0157\u015b\u0005\u0006\u0000\u0000\u0158\u015a"+
		"\u0003\u0018\f\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u015a\u015d\u0001"+
		"\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001"+
		"\u0000\u0000\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u015b\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u0005\b\u0000\u0000\u015f)\u0001\u0000"+
		"\u0000\u0000\u0160\u0169\u0003(\u0014\u0000\u0161\u0169\u0003\n\u0005"+
		"\u0000\u0162\u0169\u0003\u000e\u0007\u0000\u0163\u0169\u0003\u0016\u000b"+
		"\u0000\u0164\u0169\u0003&\u0013\u0000\u0165\u0166\u0003\u001c\u000e\u0000"+
		"\u0166\u0167\u0005\t\u0000\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168"+
		"\u0160\u0001\u0000\u0000\u0000\u0168\u0161\u0001\u0000\u0000\u0000\u0168"+
		"\u0162\u0001\u0000\u0000\u0000\u0168\u0163\u0001\u0000\u0000\u0000\u0168"+
		"\u0164\u0001\u0000\u0000\u0000\u0168\u0165\u0001\u0000\u0000\u0000\u0169"+
		"+\u0001\u0000\u0000\u0000+4>ELT\\ejoy\u0088\u008d\u0092\u00a4\u00aa\u00ae"+
		"\u00b3\u00b9\u00c4\u00ca\u00d0\u00db\u00de\u00e2\u00e6\u00e9\u00f2\u0102"+
		"\u010a\u010c\u011e\u0125\u012a\u0130\u0133\u0139\u0141\u0145\u014e\u0151"+
		"\u0155\u015b\u0168";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}