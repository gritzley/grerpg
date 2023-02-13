// Generated from e:\UnityProjects\GRERPG\Assets\ANTLR\Rules.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RulesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		NAME=25, UP_TO=26, FORWARDS_LEFT=27, FORWARDS_RIGHT=28, BACKWARDS_LEFT=29, 
		BACKWARDS_RIGHT=30, FORWARDS=31, BACKWARDS=32, LEFT=33, RIGHT=34, AROUND=35, 
		IT=36, START_COMBAT=37, ACTIVATE=38, FlOAT=39, ONE=40, INT=41, WS=42, 
		NL=43;
	public static final int
		RULE_spell = 0, RULE_imperative = 1, RULE_moveUnit = 2, RULE_spawnUnit = 3, 
		RULE_summonCardInHand = 4, RULE_destroyUnits = 5, RULE_chooseUnit = 6, 
		RULE_unitFightsUnit = 7, RULE_unitSelector = 8, RULE_unit = 9, RULE_stats = 10, 
		RULE_type = 11, RULE_behaviour = 12, RULE_instruction = 13, RULE_action = 14, 
		RULE_move = 15, RULE_turn = 16, RULE_damage = 17, RULE_stepAmount = 18, 
		RULE_directionOR = 19, RULE_direction = 20, RULE_targetUnit = 21, RULE_unitDescription = 22, 
		RULE_trigger = 23;
	public static final String[] ruleNames = {
		"spell", "imperative", "moveUnit", "spawnUnit", "summonCardInHand", "destroyUnits", 
		"chooseUnit", "unitFightsUnit", "unitSelector", "unit", "stats", "type", 
		"behaviour", "instruction", "action", "move", "turn", "damage", "stepAmount", 
		"directionOR", "direction", "targetUnit", "unitDescription", "trigger"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Move'", "'and'", "'.'", "'Summon'", "'Put'", "'into your hand.'", 
		"'Destroy each'", "'Pick'", "'fights'", "'unit'", "'-'", "'/'", "'Knight'", 
		"'Rogue'", "', then'", "'move'", "'turn'", "'deal'", "'damage'", "'steps'", 
		"'step'", "','", "'or'", "'target'", null, "'up to'", "'forwards left'", 
		"'forwards right'", "'backwards left'", "'backwards right'", "'forwards'", 
		"'backwards'", "'left'", "'right'", "'around'", null, "'At the beginning of combat'", 
		"'When this unit is activated'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "NAME", "UP_TO", "FORWARDS_LEFT", "FORWARDS_RIGHT", "BACKWARDS_LEFT", 
		"BACKWARDS_RIGHT", "FORWARDS", "BACKWARDS", "LEFT", "RIGHT", "AROUND", 
		"IT", "START_COMBAT", "ACTIVATE", "FlOAT", "ONE", "INT", "WS", "NL"
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
	public String getGrammarFileName() { return "Rules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RulesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SpellContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RulesParser.EOF, 0); }
		public List<ImperativeContext> imperative() {
			return getRuleContexts(ImperativeContext.class);
		}
		public ImperativeContext imperative(int i) {
			return getRuleContext(ImperativeContext.class,i);
		}
		public SpellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spell; }
	}

	public final SpellContext spell() throws RecognitionException {
		SpellContext _localctx = new SpellContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_spell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				imperative();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__23) | (1L << IT))) != 0) );
			setState(53);
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

	public static class ImperativeContext extends ParserRuleContext {
		public MoveUnitContext moveUnit() {
			return getRuleContext(MoveUnitContext.class,0);
		}
		public SpawnUnitContext spawnUnit() {
			return getRuleContext(SpawnUnitContext.class,0);
		}
		public SummonCardInHandContext summonCardInHand() {
			return getRuleContext(SummonCardInHandContext.class,0);
		}
		public DestroyUnitsContext destroyUnits() {
			return getRuleContext(DestroyUnitsContext.class,0);
		}
		public ChooseUnitContext chooseUnit() {
			return getRuleContext(ChooseUnitContext.class,0);
		}
		public UnitFightsUnitContext unitFightsUnit() {
			return getRuleContext(UnitFightsUnitContext.class,0);
		}
		public ImperativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imperative; }
	}

	public final ImperativeContext imperative() throws RecognitionException {
		ImperativeContext _localctx = new ImperativeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imperative);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				moveUnit();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				spawnUnit();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				summonCardInHand();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				destroyUnits();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				chooseUnit();
				}
				break;
			case T__23:
			case IT:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				unitFightsUnit();
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

	public static class MoveUnitContext extends ParserRuleContext {
		public TargetUnitContext targetUnit() {
			return getRuleContext(TargetUnitContext.class,0);
		}
		public TerminalNode UP_TO() { return getToken(RulesParser.UP_TO, 0); }
		public StepAmountContext stepAmount() {
			return getRuleContext(StepAmountContext.class,0);
		}
		public List<DirectionORContext> directionOR() {
			return getRuleContexts(DirectionORContext.class);
		}
		public DirectionORContext directionOR(int i) {
			return getRuleContext(DirectionORContext.class,i);
		}
		public MoveUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveUnit; }
	}

	public final MoveUnitContext moveUnit() throws RecognitionException {
		MoveUnitContext _localctx = new MoveUnitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moveUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__0);
			setState(64);
			targetUnit();
			setState(65);
			match(UP_TO);
			setState(66);
			stepAmount();
			setState(67);
			directionOR();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(68);
				match(T__1);
				setState(69);
				directionOR();
				}
			}

			setState(72);
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

	public static class SpawnUnitContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(RulesParser.NAME, 0); }
		public TerminalNode INT() { return getToken(RulesParser.INT, 0); }
		public TerminalNode ONE() { return getToken(RulesParser.ONE, 0); }
		public SpawnUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spawnUnit; }
	}

	public final SpawnUnitContext spawnUnit() throws RecognitionException {
		SpawnUnitContext _localctx = new SpawnUnitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_spawnUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__3);
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==ONE || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(76);
			match(NAME);
			setState(77);
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

	public static class SummonCardInHandContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(RulesParser.NAME, 0); }
		public TerminalNode INT() { return getToken(RulesParser.INT, 0); }
		public TerminalNode ONE() { return getToken(RulesParser.ONE, 0); }
		public SummonCardInHandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summonCardInHand; }
	}

	public final SummonCardInHandContext summonCardInHand() throws RecognitionException {
		SummonCardInHandContext _localctx = new SummonCardInHandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_summonCardInHand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__4);
			setState(80);
			_la = _input.LA(1);
			if ( !(_la==ONE || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(81);
			match(NAME);
			setState(82);
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

	public static class DestroyUnitsContext extends ParserRuleContext {
		public UnitSelectorContext unitSelector() {
			return getRuleContext(UnitSelectorContext.class,0);
		}
		public DestroyUnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destroyUnits; }
	}

	public final DestroyUnitsContext destroyUnits() throws RecognitionException {
		DestroyUnitsContext _localctx = new DestroyUnitsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_destroyUnits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__6);
			setState(85);
			unitSelector();
			setState(86);
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

	public static class ChooseUnitContext extends ParserRuleContext {
		public TargetUnitContext targetUnit() {
			return getRuleContext(TargetUnitContext.class,0);
		}
		public ChooseUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chooseUnit; }
	}

	public final ChooseUnitContext chooseUnit() throws RecognitionException {
		ChooseUnitContext _localctx = new ChooseUnitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_chooseUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__7);
			setState(89);
			targetUnit();
			setState(90);
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

	public static class UnitFightsUnitContext extends ParserRuleContext {
		public List<TargetUnitContext> targetUnit() {
			return getRuleContexts(TargetUnitContext.class);
		}
		public TargetUnitContext targetUnit(int i) {
			return getRuleContext(TargetUnitContext.class,i);
		}
		public UnitFightsUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitFightsUnit; }
	}

	public final UnitFightsUnitContext unitFightsUnit() throws RecognitionException {
		UnitFightsUnitContext _localctx = new UnitFightsUnitContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unitFightsUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			targetUnit();
			setState(93);
			match(T__8);
			setState(94);
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

	public static class UnitSelectorContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public UnitSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitSelector; }
	}

	public final UnitSelectorContext unitSelector() throws RecognitionException {
		UnitSelectorContext _localctx = new UnitSelectorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unitSelector);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(T__9);
				}
				break;
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				type();
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

	public static class UnitContext extends ParserRuleContext {
		public StatsContext stats() {
			return getRuleContext(StatsContext.class,0);
		}
		public BehaviourContext behaviour() {
			return getRuleContext(BehaviourContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				type();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__12 || _la==T__13 );
			setState(105);
			match(T__10);
			setState(106);
			stats();
			setState(107);
			behaviour();
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

	public static class StatsContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(RulesParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(RulesParser.INT, i);
		}
		public StatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stats; }
	}

	public final StatsContext stats() throws RecognitionException {
		StatsContext _localctx = new StatsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stats);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(INT);
			setState(110);
			match(T__11);
			setState(111);
			match(INT);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
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

	public static class BehaviourContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BehaviourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behaviour; }
	}

	public final BehaviourContext behaviour() throws RecognitionException {
		BehaviourContext _localctx = new BehaviourContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_behaviour);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==START_COMBAT || _la==ACTIVATE) {
				{
				{
				setState(115);
				instruction();
				}
				}
				setState(120);
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

	public static class InstructionContext extends ParserRuleContext {
		public TriggerContext trigger() {
			return getRuleContext(TriggerContext.class,0);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			trigger();
			setState(122);
			action();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(123);
				match(T__14);
				setState(124);
				action();
				}
			}

			setState(127);
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
		public TurnContext turn() {
			return getRuleContext(TurnContext.class,0);
		}
		public DamageContext damage() {
			return getRuleContext(DamageContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_action);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				move();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				turn();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				damage();
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

	public static class MoveContext extends ParserRuleContext {
		public TerminalNode UP_TO() { return getToken(RulesParser.UP_TO, 0); }
		public StepAmountContext stepAmount() {
			return getRuleContext(StepAmountContext.class,0);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__15);
			setState(135);
			match(UP_TO);
			setState(136);
			stepAmount();
			setState(137);
			direction();
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

	public static class TurnContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(RulesParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(RulesParser.RIGHT, 0); }
		public TerminalNode AROUND() { return getToken(RulesParser.AROUND, 0); }
		public TurnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turn; }
	}

	public final TurnContext turn() throws RecognitionException {
		TurnContext _localctx = new TurnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_turn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__16);
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << AROUND))) != 0)) ) {
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

	public static class DamageContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(RulesParser.INT, 0); }
		public DamageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damage; }
	}

	public final DamageContext damage() throws RecognitionException {
		DamageContext _localctx = new DamageContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_damage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__17);
			setState(143);
			match(INT);
			setState(144);
			match(T__18);
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

	public static class StepAmountContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(RulesParser.INT, 0); }
		public TerminalNode ONE() { return getToken(RulesParser.ONE, 0); }
		public StepAmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepAmount; }
	}

	public final StepAmountContext stepAmount() throws RecognitionException {
		StepAmountContext _localctx = new StepAmountContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stepAmount);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(INT);
				setState(147);
				match(T__19);
				}
				break;
			case ONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(ONE);
				setState(149);
				match(T__20);
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

	public static class DirectionORContext extends ParserRuleContext {
		public List<DirectionContext> direction() {
			return getRuleContexts(DirectionContext.class);
		}
		public DirectionContext direction(int i) {
			return getRuleContext(DirectionContext.class,i);
		}
		public DirectionORContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directionOR; }
	}

	public final DirectionORContext directionOR() throws RecognitionException {
		DirectionORContext _localctx = new DirectionORContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_directionOR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			direction();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21 || _la==T__22) {
				{
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(153);
					match(T__21);
					setState(154);
					direction();
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				match(T__22);
				setState(161);
				direction();
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

	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode FORWARDS() { return getToken(RulesParser.FORWARDS, 0); }
		public TerminalNode BACKWARDS() { return getToken(RulesParser.BACKWARDS, 0); }
		public TerminalNode LEFT() { return getToken(RulesParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(RulesParser.RIGHT, 0); }
		public TerminalNode FORWARDS_LEFT() { return getToken(RulesParser.FORWARDS_LEFT, 0); }
		public TerminalNode FORWARDS_RIGHT() { return getToken(RulesParser.FORWARDS_RIGHT, 0); }
		public TerminalNode BACKWARDS_LEFT() { return getToken(RulesParser.BACKWARDS_LEFT, 0); }
		public TerminalNode BACKWARDS_RIGHT() { return getToken(RulesParser.BACKWARDS_RIGHT, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FORWARDS_LEFT) | (1L << FORWARDS_RIGHT) | (1L << BACKWARDS_LEFT) | (1L << BACKWARDS_RIGHT) | (1L << FORWARDS) | (1L << BACKWARDS) | (1L << LEFT) | (1L << RIGHT))) != 0)) ) {
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

	public static class TargetUnitContext extends ParserRuleContext {
		public UnitDescriptionContext unitDescription() {
			return getRuleContext(UnitDescriptionContext.class,0);
		}
		public TerminalNode IT() { return getToken(RulesParser.IT, 0); }
		public TargetUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetUnit; }
	}

	public final TargetUnitContext targetUnit() throws RecognitionException {
		TargetUnitContext _localctx = new TargetUnitContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_targetUnit);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__23);
				setState(167);
				unitDescription();
				}
				break;
			case IT:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(IT);
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

	public static class UnitDescriptionContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public UnitDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitDescription; }
	}

	public final UnitDescriptionContext unitDescription() throws RecognitionException {
		UnitDescriptionContext _localctx = new UnitDescriptionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unitDescription);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(171);
					type();
					}
					}
					setState(174); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__12 || _la==T__13 );
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(T__9);
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

	public static class TriggerContext extends ParserRuleContext {
		public TerminalNode START_COMBAT() { return getToken(RulesParser.START_COMBAT, 0); }
		public TerminalNode ACTIVATE() { return getToken(RulesParser.ACTIVATE, 0); }
		public TriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger; }
	}

	public final TriggerContext trigger() throws RecognitionException {
		TriggerContext _localctx = new TriggerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_trigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !(_la==START_COMBAT || _la==ACTIVATE) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00b8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\6\2\64\n\2\r\2\16\2\65\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4I\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\5\ne\n\n\3\13\6\13h\n\13\r\13\16\13i\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\16\7\16w\n\16\f\16\16\16z\13\16\3\17\3\17\3\17\3\17\5\17"+
		"\u0080\n\17\3\17\3\17\3\20\3\20\3\20\5\20\u0087\n\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u0099"+
		"\n\24\3\25\3\25\3\25\7\25\u009e\n\25\f\25\16\25\u00a1\13\25\3\25\3\25"+
		"\5\25\u00a5\n\25\3\26\3\26\3\27\3\27\3\27\5\27\u00ac\n\27\3\30\6\30\u00af"+
		"\n\30\r\30\16\30\u00b0\3\30\5\30\u00b4\n\30\3\31\3\31\3\31\2\2\32\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\7\3\2*+\3\2\17\20\3"+
		"\2#%\3\2\35$\3\2\'(\2\u00b2\2\63\3\2\2\2\4?\3\2\2\2\6A\3\2\2\2\bL\3\2"+
		"\2\2\nQ\3\2\2\2\fV\3\2\2\2\16Z\3\2\2\2\20^\3\2\2\2\22d\3\2\2\2\24g\3\2"+
		"\2\2\26o\3\2\2\2\30s\3\2\2\2\32x\3\2\2\2\34{\3\2\2\2\36\u0086\3\2\2\2"+
		" \u0088\3\2\2\2\"\u008d\3\2\2\2$\u0090\3\2\2\2&\u0098\3\2\2\2(\u009a\3"+
		"\2\2\2*\u00a6\3\2\2\2,\u00ab\3\2\2\2.\u00b3\3\2\2\2\60\u00b5\3\2\2\2\62"+
		"\64\5\4\3\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66"+
		"\67\3\2\2\2\678\7\2\2\38\3\3\2\2\29@\5\6\4\2:@\5\b\5\2;@\5\n\6\2<@\5\f"+
		"\7\2=@\5\16\b\2>@\5\20\t\2?9\3\2\2\2?:\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3"+
		"\2\2\2?>\3\2\2\2@\5\3\2\2\2AB\7\3\2\2BC\5,\27\2CD\7\34\2\2DE\5&\24\2E"+
		"H\5(\25\2FG\7\4\2\2GI\5(\25\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\5\2\2"+
		"K\7\3\2\2\2LM\7\6\2\2MN\t\2\2\2NO\7\33\2\2OP\7\5\2\2P\t\3\2\2\2QR\7\7"+
		"\2\2RS\t\2\2\2ST\7\33\2\2TU\7\b\2\2U\13\3\2\2\2VW\7\t\2\2WX\5\22\n\2X"+
		"Y\7\5\2\2Y\r\3\2\2\2Z[\7\n\2\2[\\\5,\27\2\\]\7\5\2\2]\17\3\2\2\2^_\5,"+
		"\27\2_`\7\13\2\2`a\5,\27\2a\21\3\2\2\2be\7\f\2\2ce\5\30\r\2db\3\2\2\2"+
		"dc\3\2\2\2e\23\3\2\2\2fh\5\30\r\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2"+
		"\2\2jk\3\2\2\2kl\7\r\2\2lm\5\26\f\2mn\5\32\16\2n\25\3\2\2\2op\7+\2\2p"+
		"q\7\16\2\2qr\7+\2\2r\27\3\2\2\2st\t\3\2\2t\31\3\2\2\2uw\5\34\17\2vu\3"+
		"\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\33\3\2\2\2zx\3\2\2\2{|\5\60\31\2"+
		"|\177\5\36\20\2}~\7\21\2\2~\u0080\5\36\20\2\177}\3\2\2\2\177\u0080\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\5\2\2\u0082\35\3\2\2\2\u0083\u0087"+
		"\5 \21\2\u0084\u0087\5\"\22\2\u0085\u0087\5$\23\2\u0086\u0083\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\37\3\2\2\2\u0088\u0089"+
		"\7\22\2\2\u0089\u008a\7\34\2\2\u008a\u008b\5&\24\2\u008b\u008c\5*\26\2"+
		"\u008c!\3\2\2\2\u008d\u008e\7\23\2\2\u008e\u008f\t\4\2\2\u008f#\3\2\2"+
		"\2\u0090\u0091\7\24\2\2\u0091\u0092\7+\2\2\u0092\u0093\7\25\2\2\u0093"+
		"%\3\2\2\2\u0094\u0095\7+\2\2\u0095\u0099\7\26\2\2\u0096\u0097\7*\2\2\u0097"+
		"\u0099\7\27\2\2\u0098\u0094\3\2\2\2\u0098\u0096\3\2\2\2\u0099\'\3\2\2"+
		"\2\u009a\u00a4\5*\26\2\u009b\u009c\7\30\2\2\u009c\u009e\5*\26\2\u009d"+
		"\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\31\2\2\u00a3"+
		"\u00a5\5*\26\2\u00a4\u009f\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5)\3\2\2\2"+
		"\u00a6\u00a7\t\5\2\2\u00a7+\3\2\2\2\u00a8\u00a9\7\32\2\2\u00a9\u00ac\5"+
		".\30\2\u00aa\u00ac\7&\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"-\3\2\2\2\u00ad\u00af\5\30\r\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2"+
		"\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b4"+
		"\7\f\2\2\u00b3\u00ae\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4/\3\2\2\2\u00b5"+
		"\u00b6\t\6\2\2\u00b6\61\3\2\2\2\20\65?Hdix\177\u0086\u0098\u009f\u00a4"+
		"\u00ab\u00b0\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}