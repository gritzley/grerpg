// Generated from e:\UnityProjects\GRERPG\Assets\ANTLR\lib/Target.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TargetParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, FlOAT=13, ONE=14, INT=15, ID=16, WS=17, NL=18;
	public static final int
		RULE_target = 0, RULE_targetUnit = 1, RULE_unit = 2, RULE_unitType = 3, 
		RULE_unitName = 4, RULE_unitDescription = 5, RULE_unitBehaviour = 6, RULE_instruction = 7, 
		RULE_action = 8, RULE_move = 9, RULE_direction = 10, RULE_directionUp = 11, 
		RULE_directionDown = 12, RULE_directionLeft = 13, RULE_directionRight = 14, 
		RULE_directionRandom = 15, RULE_trigger = 16, RULE_startCombat = 17;
	public static final String[] ruleNames = {
		"target", "targetUnit", "unit", "unitType", "unitName", "unitDescription", 
		"unitBehaviour", "instruction", "action", "move", "direction", "directionUp", 
		"directionDown", "directionLeft", "directionRight", "directionRandom", 
		"trigger", "startCombat"
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
	public String getGrammarFileName() { return "Target.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TargetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TargetContext extends ParserRuleContext {
		public TargetUnitContext targetUnit() {
			return getRuleContext(TargetUnitContext.class,0);
		}
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			targetUnit();
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

	public static class TargetUnitContext extends ParserRuleContext {
		public UnitDescriptionContext unitDescription() {
			return getRuleContext(UnitDescriptionContext.class,0);
		}
		public TargetUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetUnit; }
	}

	public final TargetUnitContext targetUnit() throws RecognitionException {
		TargetUnitContext _localctx = new TargetUnitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_targetUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(38);
				unitDescription();
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

	public static class UnitContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TargetParser.INT, 0); }
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
		enterRule(_localctx, 4, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				unitType();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(46);
			match(T__0);
			setState(47);
			match(INT);
			setState(48);
			match(T__1);
			setState(49);
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
		public TerminalNode ID() { return getToken(TargetParser.ID, 0); }
		public UnitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitType; }
	}

	public final UnitTypeContext unitType() throws RecognitionException {
		UnitTypeContext _localctx = new UnitTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unitType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
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
		public List<TerminalNode> ID() { return getTokens(TargetParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TargetParser.ID, i);
		}
		public UnitNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitName; }
	}

	public final UnitNameContext unitName() throws RecognitionException {
		UnitNameContext _localctx = new UnitNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unitName);
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
				match(ID);
				}
				}
				setState(56); 
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
		enterRule(_localctx, 10, RULE_unitDescription);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				unitType();
				}
				}
				setState(61); 
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
		enterRule(_localctx, 12, RULE_unitBehaviour);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				instruction();
				}
				}
				setState(66); 
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
		enterRule(_localctx, 14, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			trigger();
			setState(69);
			action();
			setState(70);
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
		enterRule(_localctx, 16, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
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
		public TerminalNode INT() { return getToken(TargetParser.INT, 0); }
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public TerminalNode ONE() { return getToken(TargetParser.ONE, 0); }
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_move);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(T__3);
				setState(75);
				match(INT);
				setState(76);
				match(T__4);
				setState(77);
				direction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(T__3);
				setState(79);
				match(ONE);
				setState(80);
				match(T__5);
				setState(81);
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
		enterRule(_localctx, 20, RULE_direction);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				directionUp();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				directionDown();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				directionLeft();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				directionRight();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
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
		enterRule(_localctx, 22, RULE_directionUp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
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
		enterRule(_localctx, 24, RULE_directionDown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
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
		enterRule(_localctx, 26, RULE_directionLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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
		enterRule(_localctx, 28, RULE_directionRight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
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
		enterRule(_localctx, 30, RULE_directionRandom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
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
		enterRule(_localctx, 32, RULE_trigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
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
		enterRule(_localctx, 34, RULE_startCombat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24l\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23"+
		"\t\23\3\2\3\2\3\3\5\3*\n\3\3\4\6\4-\n\4\r\4\16\4.\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\6\69\n\6\r\6\16\6:\3\7\6\7>\n\7\r\7\16\7?\3\b\6\bC\n\b\r"+
		"\b\16\bD\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13U\n\13\3\f\3\f\3\f\3\f\3\f\5\f\\\n\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$\2\2\2c\2&\3\2\2\2\4)\3\2\2\2\6,\3\2\2\2\b"+
		"\65\3\2\2\2\n8\3\2\2\2\f=\3\2\2\2\16B\3\2\2\2\20F\3\2\2\2\22J\3\2\2\2"+
		"\24T\3\2\2\2\26[\3\2\2\2\30]\3\2\2\2\32_\3\2\2\2\34a\3\2\2\2\36c\3\2\2"+
		"\2 e\3\2\2\2\"g\3\2\2\2$i\3\2\2\2&\'\5\4\3\2\'\3\3\2\2\2(*\5\f\7\2)(\3"+
		"\2\2\2)*\3\2\2\2*\5\3\2\2\2+-\5\b\5\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./"+
		"\3\2\2\2/\60\3\2\2\2\60\61\7\3\2\2\61\62\7\21\2\2\62\63\7\4\2\2\63\64"+
		"\5\16\b\2\64\7\3\2\2\2\65\66\7\22\2\2\66\t\3\2\2\2\679\7\22\2\28\67\3"+
		"\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\13\3\2\2\2<>\5\b\5\2=<\3\2\2\2>"+
		"?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\r\3\2\2\2AC\5\20\t\2BA\3\2\2\2CD\3\2\2"+
		"\2DB\3\2\2\2DE\3\2\2\2E\17\3\2\2\2FG\5\"\22\2GH\5\22\n\2HI\7\5\2\2I\21"+
		"\3\2\2\2JK\5\24\13\2K\23\3\2\2\2LM\7\6\2\2MN\7\21\2\2NO\7\7\2\2OU\5\26"+
		"\f\2PQ\7\6\2\2QR\7\20\2\2RS\7\b\2\2SU\5\26\f\2TL\3\2\2\2TP\3\2\2\2U\25"+
		"\3\2\2\2V\\\5\30\r\2W\\\5\32\16\2X\\\5\34\17\2Y\\\5\36\20\2Z\\\5 \21\2"+
		"[V\3\2\2\2[W\3\2\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\27\3\2\2\2]^\7\t"+
		"\2\2^\31\3\2\2\2_`\7\n\2\2`\33\3\2\2\2ab\7\13\2\2b\35\3\2\2\2cd\7\f\2"+
		"\2d\37\3\2\2\2ef\7\r\2\2f!\3\2\2\2gh\5$\23\2h#\3\2\2\2ij\7\16\2\2j%\3"+
		"\2\2\2\t).:?DT[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}