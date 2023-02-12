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
		NAME=25, UP_TO=26, FORWARDS=27, BACKWARDS=28, LEFT=29, RIGHT=30, AROUND=31, 
		FORWARDS_LEFT=32, FORWARDS_RIGHT=33, BACKWARDS_LEFT=34, BACKWARDS_RIGHT=35, 
		IT=36, START_COMBAT=37, ACTIVATE=38, FlOAT=39, ONE=40, INT=41, ID=42, 
		WS=43, NL=44;
	public static final int
		RULE_spell = 0, RULE_imperative = 1, RULE_moveUnit = 2, RULE_spawnUnit = 3, 
		RULE_summonCardInHand = 4, RULE_unit = 5, RULE_stats = 6, RULE_type = 7, 
		RULE_behaviour = 8, RULE_instruction = 9, RULE_action = 10, RULE_move = 11, 
		RULE_turn = 12, RULE_damage = 13, RULE_stepAmount = 14, RULE_directionOR = 15, 
		RULE_direction = 16, RULE_targetUnit = 17, RULE_unitDescription = 18, 
		RULE_trigger = 19;
	public static final String[] ruleNames = {
		"spell", "imperative", "moveUnit", "spawnUnit", "summonCardInHand", "unit", 
		"stats", "type", "behaviour", "instruction", "action", "move", "turn", 
		"damage", "stepAmount", "directionOR", "direction", "targetUnit", "unitDescription", 
		"trigger"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Move'", "'and'", "'.'", "'Summon'", "'Put'", "'into your hand.'", 
		"'-'", "'/'", "'Knight'", "'Pawn'", "'Rook'", "'King'", "'Queen'", "'Bishop'", 
		"', then'", "'move'", "'turn'", "'deal'", "'damage'", "'steps'", "'step'", 
		"','", "'or'", "'target'", null, "'up to'", "'forwards'", "'backwards'", 
		"'left'", "'right'", "'around'", "'forwards left'", null, "'backwards left'", 
		null, "'it'", "'At the beginning of combat'", "'When this unit is activated'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "NAME", "UP_TO", "FORWARDS", "BACKWARDS", "LEFT", "RIGHT", "AROUND", 
		"FORWARDS_LEFT", "FORWARDS_RIGHT", "BACKWARDS_LEFT", "BACKWARDS_RIGHT", 
		"IT", "START_COMBAT", "ACTIVATE", "FlOAT", "ONE", "INT", "ID", "WS", "NL"
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
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				imperative();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4))) != 0) );
			setState(45);
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
		public ImperativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imperative; }
	}

	public final ImperativeContext imperative() throws RecognitionException {
		ImperativeContext _localctx = new ImperativeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imperative);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				moveUnit();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				spawnUnit();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				summonCardInHand();
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
			setState(52);
			match(T__0);
			setState(53);
			targetUnit();
			setState(54);
			match(UP_TO);
			setState(55);
			stepAmount();
			setState(56);
			directionOR();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(57);
				match(T__1);
				setState(58);
				directionOR();
				}
			}

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
			setState(63);
			match(T__3);
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==ONE || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(65);
			match(NAME);
			setState(66);
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
			setState(68);
			match(T__4);
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==ONE || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(70);
			match(NAME);
			setState(71);
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
		enterRule(_localctx, 10, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				type();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0) );
			setState(78);
			match(T__6);
			setState(79);
			stats();
			setState(80);
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
		enterRule(_localctx, 12, RULE_stats);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(INT);
			setState(83);
			match(T__7);
			setState(84);
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
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
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
		enterRule(_localctx, 16, RULE_behaviour);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				instruction();
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==START_COMBAT || _la==ACTIVATE );
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
		enterRule(_localctx, 18, RULE_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			trigger();
			setState(94);
			action();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(95);
				match(T__14);
				setState(96);
				action();
				}
			}

			setState(99);
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
		enterRule(_localctx, 20, RULE_action);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				move();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				turn();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
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
		enterRule(_localctx, 22, RULE_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__15);
			setState(107);
			match(UP_TO);
			setState(108);
			stepAmount();
			setState(109);
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
		enterRule(_localctx, 24, RULE_turn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__16);
			setState(112);
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
		enterRule(_localctx, 26, RULE_damage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__17);
			setState(115);
			match(INT);
			setState(116);
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
		enterRule(_localctx, 28, RULE_stepAmount);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(INT);
				setState(119);
				match(T__19);
				}
				break;
			case ONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(ONE);
				setState(121);
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
		enterRule(_localctx, 30, RULE_directionOR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			direction();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21 || _la==T__22) {
				{
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(125);
					match(T__21);
					setState(126);
					direction();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
				match(T__22);
				setState(133);
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
		enterRule(_localctx, 32, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FORWARDS) | (1L << BACKWARDS) | (1L << LEFT) | (1L << RIGHT) | (1L << FORWARDS_LEFT) | (1L << FORWARDS_RIGHT) | (1L << BACKWARDS_LEFT) | (1L << BACKWARDS_RIGHT))) != 0)) ) {
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
		enterRule(_localctx, 34, RULE_targetUnit);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(T__23);
				setState(139);
				unitDescription();
				}
				break;
			case IT:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
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
		enterRule(_localctx, 36, RULE_unitDescription);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143);
				type();
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0) );
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
		enterRule(_localctx, 38, RULE_trigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0099\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2,\n\2\r\2\16\2-\3\2\3\2\3\3\3\3"+
		"\3\3\5\3\65\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\6\7M\n\7\r\7\16\7N\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\n\6\n\\\n\n\r\n\16\n]\3\13\3\13\3\13\3\13\5"+
		"\13d\n\13\3\13\3\13\3\f\3\f\3\f\5\fk\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20}\n\20\3\21\3\21\3\21"+
		"\7\21\u0082\n\21\f\21\16\21\u0085\13\21\3\21\3\21\5\21\u0089\n\21\3\22"+
		"\3\22\3\23\3\23\3\23\5\23\u0090\n\23\3\24\6\24\u0093\n\24\r\24\16\24\u0094"+
		"\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2"+
		"\7\3\2*+\3\2\13\20\3\2\37!\4\2\35 \"%\3\2\'(\2\u0092\2+\3\2\2\2\4\64\3"+
		"\2\2\2\6\66\3\2\2\2\bA\3\2\2\2\nF\3\2\2\2\fL\3\2\2\2\16T\3\2\2\2\20X\3"+
		"\2\2\2\22[\3\2\2\2\24_\3\2\2\2\26j\3\2\2\2\30l\3\2\2\2\32q\3\2\2\2\34"+
		"t\3\2\2\2\36|\3\2\2\2 ~\3\2\2\2\"\u008a\3\2\2\2$\u008f\3\2\2\2&\u0092"+
		"\3\2\2\2(\u0096\3\2\2\2*,\5\4\3\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2"+
		"\2\2./\3\2\2\2/\60\7\2\2\3\60\3\3\2\2\2\61\65\5\6\4\2\62\65\5\b\5\2\63"+
		"\65\5\n\6\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\5\3\2\2\2\66"+
		"\67\7\3\2\2\678\5$\23\289\7\34\2\29:\5\36\20\2:=\5 \21\2;<\7\4\2\2<>\5"+
		" \21\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\5\2\2@\7\3\2\2\2AB\7\6\2\2BC"+
		"\t\2\2\2CD\7\33\2\2DE\7\5\2\2E\t\3\2\2\2FG\7\7\2\2GH\t\2\2\2HI\7\33\2"+
		"\2IJ\7\b\2\2J\13\3\2\2\2KM\5\20\t\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3"+
		"\2\2\2OP\3\2\2\2PQ\7\t\2\2QR\5\16\b\2RS\5\22\n\2S\r\3\2\2\2TU\7+\2\2U"+
		"V\7\n\2\2VW\7+\2\2W\17\3\2\2\2XY\t\3\2\2Y\21\3\2\2\2Z\\\5\24\13\2[Z\3"+
		"\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\23\3\2\2\2_`\5(\25\2`c\5\26\f\2"+
		"ab\7\21\2\2bd\5\26\f\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\5\2\2f\25\3\2"+
		"\2\2gk\5\30\r\2hk\5\32\16\2ik\5\34\17\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2"+
		"k\27\3\2\2\2lm\7\22\2\2mn\7\34\2\2no\5\36\20\2op\5\"\22\2p\31\3\2\2\2"+
		"qr\7\23\2\2rs\t\4\2\2s\33\3\2\2\2tu\7\24\2\2uv\7+\2\2vw\7\25\2\2w\35\3"+
		"\2\2\2xy\7+\2\2y}\7\26\2\2z{\7*\2\2{}\7\27\2\2|x\3\2\2\2|z\3\2\2\2}\37"+
		"\3\2\2\2~\u0088\5\"\22\2\177\u0080\7\30\2\2\u0080\u0082\5\"\22\2\u0081"+
		"\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2"+
		"\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\31\2\2\u0087"+
		"\u0089\5\"\22\2\u0088\u0083\3\2\2\2\u0088\u0089\3\2\2\2\u0089!\3\2\2\2"+
		"\u008a\u008b\t\5\2\2\u008b#\3\2\2\2\u008c\u008d\7\32\2\2\u008d\u0090\5"+
		"&\24\2\u008e\u0090\7&\2\2\u008f\u008c\3\2\2\2\u008f\u008e\3\2\2\2\u0090"+
		"%\3\2\2\2\u0091\u0093\5\20\t\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2"+
		"\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\'\3\2\2\2\u0096\u0097\t"+
		"\6\2\2\u0097)\3\2\2\2\16-\64=N]cj|\u0083\u0088\u008f\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}