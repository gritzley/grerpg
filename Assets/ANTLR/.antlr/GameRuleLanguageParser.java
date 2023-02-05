// Generated from e:\UnityProjects\GRERPG\Assets\ANTLR\GameRuleLanguage.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GameRuleLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		FlOAT=18, ONE=19, INT=20, ID=21, WS=22, NL=23;
	public static final int
		RULE_spell = 0, RULE_imperative = 1, RULE_moveUnit = 2, RULE_spawnUnit = 3, 
		RULE_unit = 4, RULE_unitType = 5, RULE_unitName = 6, RULE_unitDescription = 7, 
		RULE_unitBehaviour = 8, RULE_instruction = 9, RULE_action = 10, RULE_move = 11, 
		RULE_direction = 12, RULE_directionUp = 13, RULE_directionDown = 14, RULE_directionLeft = 15, 
		RULE_directionRight = 16, RULE_directionRandom = 17, RULE_targetUnit = 18, 
		RULE_trigger = 19, RULE_startCombat = 20;
	public static final String[] ruleNames = {
		"spell", "imperative", "moveUnit", "spawnUnit", "unit", "unitType", "unitName", 
		"unitDescription", "unitBehaviour", "instruction", "action", "move", "direction", 
		"directionUp", "directionDown", "directionLeft", "directionRight", "directionRandom", 
		"targetUnit", "trigger", "startCombat"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Move a'", "'up to'", "'spaces.'", "'Summon'", "'a'", "'.'", "'-'", 
		"'hp'", "'move'", "'steps'", "'step'", "'up'", "'down'", "'left'", "'right'", 
		"'in a random direction'", "'At the beginning of combat'", null, "'1 '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "FlOAT", "ONE", "INT", "ID", "WS", 
		"NL"
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
	public String getGrammarFileName() { return "GameRuleLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GameRuleLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SpellContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GameRuleLanguageParser.EOF, 0); }
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
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				imperative();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==T__3 );
			setState(47);
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
		public ImperativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imperative; }
	}

	public final ImperativeContext imperative() throws RecognitionException {
		ImperativeContext _localctx = new ImperativeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imperative);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				moveUnit();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				spawnUnit();
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
		public TerminalNode INT() { return getToken(GameRuleLanguageParser.INT, 0); }
		public MoveUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveUnit; }
	}

	public final MoveUnitContext moveUnit() throws RecognitionException {
		MoveUnitContext _localctx = new MoveUnitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moveUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__0);
			setState(54);
			targetUnit();
			setState(55);
			match(T__1);
			setState(56);
			match(INT);
			setState(57);
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
		public UnitNameContext unitName() {
			return getRuleContext(UnitNameContext.class,0);
		}
		public TerminalNode INT() { return getToken(GameRuleLanguageParser.INT, 0); }
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
			setState(59);
			match(T__3);
			setState(60);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(61);
			unitName();
			setState(62);
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
		public TerminalNode INT() { return getToken(GameRuleLanguageParser.INT, 0); }
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
		enterRule(_localctx, 8, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				unitType();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(69);
			match(T__6);
			setState(70);
			match(INT);
			setState(71);
			match(T__7);
			setState(72);
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
		public TerminalNode ID() { return getToken(GameRuleLanguageParser.ID, 0); }
		public UnitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitType; }
	}

	public final UnitTypeContext unitType() throws RecognitionException {
		UnitTypeContext _localctx = new UnitTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unitType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
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
		public List<TerminalNode> ID() { return getTokens(GameRuleLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GameRuleLanguageParser.ID, i);
		}
		public UnitNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitName; }
	}

	public final UnitNameContext unitName() throws RecognitionException {
		UnitNameContext _localctx = new UnitNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unitName);
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
				setState(76);
				match(ID);
				}
				}
				setState(79); 
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
		enterRule(_localctx, 14, RULE_unitDescription);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				unitType();
				}
				}
				setState(84); 
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
		enterRule(_localctx, 16, RULE_unitBehaviour);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				instruction();
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__16 );
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
		enterRule(_localctx, 18, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			trigger();
			setState(92);
			action();
			setState(93);
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
		enterRule(_localctx, 20, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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
		public TerminalNode INT() { return getToken(GameRuleLanguageParser.INT, 0); }
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public TerminalNode ONE() { return getToken(GameRuleLanguageParser.ONE, 0); }
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_move);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(T__8);
				setState(98);
				match(INT);
				setState(99);
				match(T__9);
				setState(100);
				direction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(T__8);
				setState(102);
				match(ONE);
				setState(103);
				match(T__10);
				setState(104);
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
		enterRule(_localctx, 24, RULE_direction);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				directionUp();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				directionDown();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				directionLeft();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				directionRight();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
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
		enterRule(_localctx, 26, RULE_directionUp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
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

	public static class DirectionDownContext extends ParserRuleContext {
		public DirectionDownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directionDown; }
	}

	public final DirectionDownContext directionDown() throws RecognitionException {
		DirectionDownContext _localctx = new DirectionDownContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_directionDown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__12);
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
		enterRule(_localctx, 30, RULE_directionLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__13);
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
		enterRule(_localctx, 32, RULE_directionRight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__14);
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
		enterRule(_localctx, 34, RULE_directionRandom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__15);
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
		enterRule(_localctx, 36, RULE_targetUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			unitDescription();
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
		enterRule(_localctx, 38, RULE_trigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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
		enterRule(_localctx, 40, RULE_startCombat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__16);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u0085\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2.\n\2\r\2\16\2/\3\2\3"+
		"\2\3\3\3\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\6\6D\n\6\r\6\16\6E\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\6\bP\n\b\r\b\16\b"+
		"Q\3\t\6\tU\n\t\r\t\16\tV\3\n\6\nZ\n\n\r\n\16\n[\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rl\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\5\16s\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*\2\3\4\2\7\7\26\26\2z\2-\3\2\2\2\4\65\3\2\2\2\6\67\3\2\2"+
		"\2\b=\3\2\2\2\nC\3\2\2\2\fL\3\2\2\2\16O\3\2\2\2\20T\3\2\2\2\22Y\3\2\2"+
		"\2\24]\3\2\2\2\26a\3\2\2\2\30k\3\2\2\2\32r\3\2\2\2\34t\3\2\2\2\36v\3\2"+
		"\2\2 x\3\2\2\2\"z\3\2\2\2$|\3\2\2\2&~\3\2\2\2(\u0080\3\2\2\2*\u0082\3"+
		"\2\2\2,.\5\4\3\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2"+
		"\2\61\62\7\2\2\3\62\3\3\2\2\2\63\66\5\6\4\2\64\66\5\b\5\2\65\63\3\2\2"+
		"\2\65\64\3\2\2\2\66\5\3\2\2\2\678\7\3\2\289\5&\24\29:\7\4\2\2:;\7\26\2"+
		"\2;<\7\5\2\2<\7\3\2\2\2=>\7\6\2\2>?\t\2\2\2?@\5\16\b\2@A\7\b\2\2A\t\3"+
		"\2\2\2BD\5\f\7\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7"+
		"\t\2\2HI\7\26\2\2IJ\7\n\2\2JK\5\22\n\2K\13\3\2\2\2LM\7\27\2\2M\r\3\2\2"+
		"\2NP\7\27\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\17\3\2\2\2SU\5"+
		"\f\7\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\21\3\2\2\2XZ\5\24\13\2"+
		"YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\23\3\2\2\2]^\5(\25\2^_\5\26"+
		"\f\2_`\7\b\2\2`\25\3\2\2\2ab\5\30\r\2b\27\3\2\2\2cd\7\13\2\2de\7\26\2"+
		"\2ef\7\f\2\2fl\5\32\16\2gh\7\13\2\2hi\7\25\2\2ij\7\r\2\2jl\5\32\16\2k"+
		"c\3\2\2\2kg\3\2\2\2l\31\3\2\2\2ms\5\34\17\2ns\5\36\20\2os\5 \21\2ps\5"+
		"\"\22\2qs\5$\23\2rm\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\33"+
		"\3\2\2\2tu\7\16\2\2u\35\3\2\2\2vw\7\17\2\2w\37\3\2\2\2xy\7\20\2\2y!\3"+
		"\2\2\2z{\7\21\2\2{#\3\2\2\2|}\7\22\2\2}%\3\2\2\2~\177\5\20\t\2\177\'\3"+
		"\2\2\2\u0080\u0081\5*\26\2\u0081)\3\2\2\2\u0082\u0083\7\23\2\2\u0083+"+
		"\3\2\2\2\n/\65EQV[kr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}