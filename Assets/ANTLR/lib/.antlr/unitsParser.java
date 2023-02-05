// Generated from e:\UnityProjects\GRERPG\Assets\ANTLR\lib/Units.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UnitsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, FlOAT=13, ONE=14, INT=15, ID=16, WS=17, NL=18;
	public static final int
		RULE_unit = 0, RULE_unitType = 1, RULE_unitName = 2, RULE_unitDescription = 3, 
		RULE_unitBehaviour = 4, RULE_instruction = 5, RULE_action = 6, RULE_move = 7, 
		RULE_direction = 8, RULE_directionUp = 9, RULE_directionDown = 10, RULE_directionLeft = 11, 
		RULE_directionRight = 12, RULE_directionRandom = 13, RULE_trigger = 14, 
		RULE_startCombat = 15;
	public static final String[] ruleNames = {
		"unit", "unitType", "unitName", "unitDescription", "unitBehaviour", "instruction", 
		"action", "move", "direction", "directionUp", "directionDown", "directionLeft", 
		"directionRight", "directionRandom", "trigger", "startCombat"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'hp'", "'.'", "'move'", "'steps'", "'step'", "'up'", "'down'", 
		"'left'", "'right'", "'in a random direction'", "'At the beginning of combat'", 
		null, "'1 '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "FlOAT", "ONE", "INT", "ID", "WS", "NL"
	};
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
	public String getGrammarFileName() { return "Units.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UnitsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class UnitContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(UnitsParser.INT, 0); }
		public UnitBehaviourContext unitBehaviour() {
			return getRuleContext(UnitBehaviourContext.class,0);
		}
		public List<UnitTypeContext> unitType() {
			return getRuleContexts(UnitTypeContext.class);
		}
		public UnitTypeContext unitType(int i) {
			return getRuleContext(UnitTypeContext.class,i);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_unit);
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
				unitType();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(37);
			match(T__0);
			setState(38);
			match(INT);
			setState(39);
			match(T__1);
			setState(40);
			unitBehaviour();
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

	public static class UnitTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UnitsParser.ID, 0); }
		public UnitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitType; }
	}

	public final UnitTypeContext unitType() throws RecognitionException {
		UnitTypeContext _localctx = new UnitTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_unitType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(ID);
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

	public static class UnitNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(UnitsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(UnitsParser.ID, i);
		}
		public UnitNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitName; }
	}

	public final UnitNameContext unitName() throws RecognitionException {
		UnitNameContext _localctx = new UnitNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unitName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				match(ID);
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class UnitDescriptionContext extends ParserRuleContext {
		public List<UnitTypeContext> unitType() {
			return getRuleContexts(UnitTypeContext.class);
		}
		public UnitTypeContext unitType(int i) {
			return getRuleContext(UnitTypeContext.class,i);
		}
		public UnitDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitDescription; }
	}

	public final UnitDescriptionContext unitDescription() throws RecognitionException {
		UnitDescriptionContext _localctx = new UnitDescriptionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unitDescription);
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
				unitType();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class UnitBehaviourContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public UnitBehaviourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitBehaviour; }
	}

	public final UnitBehaviourContext unitBehaviour() throws RecognitionException {
		UnitBehaviourContext _localctx = new UnitBehaviourContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unitBehaviour);
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
				instruction();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
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

	public static class InstructionContext extends ParserRuleContext {
		public TriggerContext trigger() {
			return getRuleContext(TriggerContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			trigger();
			setState(60);
			action();
			setState(61);
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

	public static class ActionContext extends ParserRuleContext {
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			move();
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

	public static class MoveContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(UnitsParser.INT, 0); }
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public TerminalNode ONE() { return getToken(UnitsParser.ONE, 0); }
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_move);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(T__3);
				setState(66);
				match(INT);
				setState(67);
				match(T__4);
				setState(68);
				direction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(T__3);
				setState(70);
				match(ONE);
				setState(71);
				match(T__5);
				setState(72);
				direction();
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

	public static class DirectionContext extends ParserRuleContext {
		public DirectionUpContext directionUp() {
			return getRuleContext(DirectionUpContext.class,0);
		}
		public DirectionDownContext directionDown() {
			return getRuleContext(DirectionDownContext.class,0);
		}
		public DirectionLeftContext directionLeft() {
			return getRuleContext(DirectionLeftContext.class,0);
		}
		public DirectionRightContext directionRight() {
			return getRuleContext(DirectionRightContext.class,0);
		}
		public DirectionRandomContext directionRandom() {
			return getRuleContext(DirectionRandomContext.class,0);
		}
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_direction);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				directionUp();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				directionDown();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				directionLeft();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				directionRight();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				directionRandom();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DirectionUpContext extends ParserRuleContext {
		public DirectionUpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directionUp; }
	}

	public final DirectionUpContext directionUp() throws RecognitionException {
		DirectionUpContext _localctx = new DirectionUpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_directionUp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
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

	public static class DirectionDownContext extends ParserRuleContext {
		public DirectionDownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directionDown; }
	}

	public final DirectionDownContext directionDown() throws RecognitionException {
		DirectionDownContext _localctx = new DirectionDownContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_directionDown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
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

	public static class DirectionLeftContext extends ParserRuleContext {
		public DirectionLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directionLeft; }
	}

	public final DirectionLeftContext directionLeft() throws RecognitionException {
		DirectionLeftContext _localctx = new DirectionLeftContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_directionLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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

	public static class DirectionRightContext extends ParserRuleContext {
		public DirectionRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directionRight; }
	}

	public final DirectionRightContext directionRight() throws RecognitionException {
		DirectionRightContext _localctx = new DirectionRightContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_directionRight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__9);
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

	public static class DirectionRandomContext extends ParserRuleContext {
		public DirectionRandomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directionRandom; }
	}

	public final DirectionRandomContext directionRandom() throws RecognitionException {
		DirectionRandomContext _localctx = new DirectionRandomContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_directionRandom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__10);
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

	public static class TriggerContext extends ParserRuleContext {
		public StartCombatContext startCombat() {
			return getRuleContext(StartCombatContext.class,0);
		}
		public TriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger; }
	}

	public final TriggerContext trigger() throws RecognitionException {
		TriggerContext _localctx = new TriggerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_trigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			startCombat();
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

	public static class StartCombatContext extends ParserRuleContext {
		public StartCombatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startCombat; }
	}

	public final StartCombatContext startCombat() throws RecognitionException {
		StartCombatContext _localctx = new StartCombatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_startCombat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__11);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24c\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2$\n\2\r"+
		"\2\16\2%\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\6\4\60\n\4\r\4\16\4\61\3\5\6"+
		"\5\65\n\5\r\5\16\5\66\3\6\6\6:\n\6\r\6\16\6;\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tL\n\t\3\n\3\n\3\n\3\n\3\n\5\nS\n\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\2[\2#\3\2\2\2\4,\3"+
		"\2\2\2\6/\3\2\2\2\b\64\3\2\2\2\n9\3\2\2\2\f=\3\2\2\2\16A\3\2\2\2\20K\3"+
		"\2\2\2\22R\3\2\2\2\24T\3\2\2\2\26V\3\2\2\2\30X\3\2\2\2\32Z\3\2\2\2\34"+
		"\\\3\2\2\2\36^\3\2\2\2 `\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$%\3\2\2\2%#\3\2"+
		"\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7\3\2\2()\7\21\2\2)*\7\4\2\2*+\5\n\6\2+\3"+
		"\3\2\2\2,-\7\22\2\2-\5\3\2\2\2.\60\7\22\2\2/.\3\2\2\2\60\61\3\2\2\2\61"+
		"/\3\2\2\2\61\62\3\2\2\2\62\7\3\2\2\2\63\65\5\4\3\2\64\63\3\2\2\2\65\66"+
		"\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\t\3\2\2\28:\5\f\7\298\3\2\2\2"+
		":;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\13\3\2\2\2=>\5\36\20\2>?\5\16\b\2?@\7"+
		"\5\2\2@\r\3\2\2\2AB\5\20\t\2B\17\3\2\2\2CD\7\6\2\2DE\7\21\2\2EF\7\7\2"+
		"\2FL\5\22\n\2GH\7\6\2\2HI\7\20\2\2IJ\7\b\2\2JL\5\22\n\2KC\3\2\2\2KG\3"+
		"\2\2\2L\21\3\2\2\2MS\5\24\13\2NS\5\26\f\2OS\5\30\r\2PS\5\32\16\2QS\5\34"+
		"\17\2RM\3\2\2\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\23\3\2\2\2TU"+
		"\7\t\2\2U\25\3\2\2\2VW\7\n\2\2W\27\3\2\2\2XY\7\13\2\2Y\31\3\2\2\2Z[\7"+
		"\f\2\2[\33\3\2\2\2\\]\7\r\2\2]\35\3\2\2\2^_\5 \21\2_\37\3\2\2\2`a\7\16"+
		"\2\2a!\3\2\2\2\b%\61\66;KR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}