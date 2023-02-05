// Generated from e:\UnityProjects\GRERPG\Assets\ANTLR\lib/Actions.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ActionsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, FlOAT=9, 
		ONE=10, INT=11, ID=12, WS=13, NL=14;
	public static final int
		RULE_action = 0, RULE_move = 1, RULE_direction = 2, RULE_directionUp = 3, 
		RULE_directionDown = 4, RULE_directionLeft = 5, RULE_directionRight = 6, 
		RULE_directionRandom = 7;
	public static final String[] ruleNames = {
		"action", "move", "direction", "directionUp", "directionDown", "directionLeft", 
		"directionRight", "directionRandom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'move'", "'steps'", "'step'", "'up'", "'down'", "'left'", "'right'", 
		"'in a random direction'", null, "'1 '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "FlOAT", "ONE", 
		"INT", "ID", "WS", "NL"
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
	public String getGrammarFileName() { return "Actions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ActionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
		enterRule(_localctx, 0, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
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
		public TerminalNode INT() { return getToken(ActionsParser.INT, 0); }
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public TerminalNode ONE() { return getToken(ActionsParser.ONE, 0); }
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_move);
		try {
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(T__0);
				setState(19);
				match(INT);
				setState(20);
				match(T__1);
				setState(21);
				direction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				match(T__0);
				setState(23);
				match(ONE);
				setState(24);
				match(T__2);
				setState(25);
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
		enterRule(_localctx, 4, RULE_direction);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				directionUp();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				directionDown();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				directionLeft();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				directionRight();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
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
		enterRule(_localctx, 6, RULE_directionUp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__3);
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
		enterRule(_localctx, 8, RULE_directionDown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
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

	public static class DirectionLeftContext extends ParserRuleContext {
		public DirectionLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directionLeft; }
	}

	public final DirectionLeftContext directionLeft() throws RecognitionException {
		DirectionLeftContext _localctx = new DirectionLeftContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_directionLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
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

	public static class DirectionRightContext extends ParserRuleContext {
		public DirectionRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directionRight; }
	}

	public final DirectionRightContext directionRight() throws RecognitionException {
		DirectionRightContext _localctx = new DirectionRightContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_directionRight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
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

	public static class DirectionRandomContext extends ParserRuleContext {
		public DirectionRandomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directionRandom; }
	}

	public final DirectionRandomContext directionRandom() throws RecognitionException {
		DirectionRandomContext _localctx = new DirectionRandomContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_directionRandom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\60\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\4\5\4$\n\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\2,\2"+
		"\22\3\2\2\2\4\34\3\2\2\2\6#\3\2\2\2\b%\3\2\2\2\n\'\3\2\2\2\f)\3\2\2\2"+
		"\16+\3\2\2\2\20-\3\2\2\2\22\23\5\4\3\2\23\3\3\2\2\2\24\25\7\3\2\2\25\26"+
		"\7\r\2\2\26\27\7\4\2\2\27\35\5\6\4\2\30\31\7\3\2\2\31\32\7\f\2\2\32\33"+
		"\7\5\2\2\33\35\5\6\4\2\34\24\3\2\2\2\34\30\3\2\2\2\35\5\3\2\2\2\36$\5"+
		"\b\5\2\37$\5\n\6\2 $\5\f\7\2!$\5\16\b\2\"$\5\20\t\2#\36\3\2\2\2#\37\3"+
		"\2\2\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$\7\3\2\2\2%&\7\6\2\2&\t\3\2\2\2"+
		"\'(\7\7\2\2(\13\3\2\2\2)*\7\b\2\2*\r\3\2\2\2+,\7\t\2\2,\17\3\2\2\2-.\7"+
		"\n\2\2.\21\3\2\2\2\4\34#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}