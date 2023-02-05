// Generated from e:\UnityProjects\GRERPG\Assets\ANTLR\lib\Spells.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SpellsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		FlOAT=18, ONE=19, INT=20, ID=21, WS=22, NL=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"FlOAT", "ONE", "INT", "ID", "WS", "NL"
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


	public SpellsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Spells.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00c6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\6\25\u00b3\n\25\r\25\16\25\u00b4\3\26\6"+
		"\26\u00b8\n\26\r\26\16\26\u00b9\3\27\3\27\3\27\3\27\3\30\6\30\u00c1\n"+
		"\30\r\30\16\30\u00c2\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\3\2\6\3\2\62;\4\2C\\c|\4\2\13\13\"\"\4\2\f\f\17\17\2\u00c8\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61"+
		"\3\2\2\2\58\3\2\2\2\7>\3\2\2\2\tF\3\2\2\2\13M\3\2\2\2\rO\3\2\2\2\17Q\3"+
		"\2\2\2\21S\3\2\2\2\23V\3\2\2\2\25[\3\2\2\2\27a\3\2\2\2\31f\3\2\2\2\33"+
		"i\3\2\2\2\35n\3\2\2\2\37s\3\2\2\2!y\3\2\2\2#\u008f\3\2\2\2%\u00aa\3\2"+
		"\2\2\'\u00ae\3\2\2\2)\u00b2\3\2\2\2+\u00b7\3\2\2\2-\u00bb\3\2\2\2/\u00c0"+
		"\3\2\2\2\61\62\7O\2\2\62\63\7q\2\2\63\64\7x\2\2\64\65\7g\2\2\65\66\7\""+
		"\2\2\66\67\7c\2\2\67\4\3\2\2\289\7w\2\29:\7r\2\2:;\7\"\2\2;<\7v\2\2<="+
		"\7q\2\2=\6\3\2\2\2>?\7u\2\2?@\7r\2\2@A\7c\2\2AB\7e\2\2BC\7g\2\2CD\7u\2"+
		"\2DE\7\60\2\2E\b\3\2\2\2FG\7U\2\2GH\7w\2\2HI\7o\2\2IJ\7o\2\2JK\7q\2\2"+
		"KL\7p\2\2L\n\3\2\2\2MN\7c\2\2N\f\3\2\2\2OP\7\60\2\2P\16\3\2\2\2QR\7/\2"+
		"\2R\20\3\2\2\2ST\7j\2\2TU\7r\2\2U\22\3\2\2\2VW\7o\2\2WX\7q\2\2XY\7x\2"+
		"\2YZ\7g\2\2Z\24\3\2\2\2[\\\7u\2\2\\]\7v\2\2]^\7g\2\2^_\7r\2\2_`\7u\2\2"+
		"`\26\3\2\2\2ab\7u\2\2bc\7v\2\2cd\7g\2\2de\7r\2\2e\30\3\2\2\2fg\7w\2\2"+
		"gh\7r\2\2h\32\3\2\2\2ij\7f\2\2jk\7q\2\2kl\7y\2\2lm\7p\2\2m\34\3\2\2\2"+
		"no\7n\2\2op\7g\2\2pq\7h\2\2qr\7v\2\2r\36\3\2\2\2st\7t\2\2tu\7k\2\2uv\7"+
		"i\2\2vw\7j\2\2wx\7v\2\2x \3\2\2\2yz\7k\2\2z{\7p\2\2{|\7\"\2\2|}\7c\2\2"+
		"}~\7\"\2\2~\177\7t\2\2\177\u0080\7c\2\2\u0080\u0081\7p\2\2\u0081\u0082"+
		"\7f\2\2\u0082\u0083\7q\2\2\u0083\u0084\7o\2\2\u0084\u0085\7\"\2\2\u0085"+
		"\u0086\7f\2\2\u0086\u0087\7k\2\2\u0087\u0088\7t\2\2\u0088\u0089\7g\2\2"+
		"\u0089\u008a\7e\2\2\u008a\u008b\7v\2\2\u008b\u008c\7k\2\2\u008c\u008d"+
		"\7q\2\2\u008d\u008e\7p\2\2\u008e\"\3\2\2\2\u008f\u0090\7C\2\2\u0090\u0091"+
		"\7v\2\2\u0091\u0092\7\"\2\2\u0092\u0093\7v\2\2\u0093\u0094\7j\2\2\u0094"+
		"\u0095\7g\2\2\u0095\u0096\7\"\2\2\u0096\u0097\7d\2\2\u0097\u0098\7g\2"+
		"\2\u0098\u0099\7i\2\2\u0099\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c"+
		"\7p\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f\7i\2\2\u009f"+
		"\u00a0\7\"\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7\"\2"+
		"\2\u00a3\u00a4\7e\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7o\2\2\u00a6\u00a7"+
		"\7d\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7v\2\2\u00a9$\3\2\2\2\u00aa\u00ab"+
		"\5)\25\2\u00ab\u00ac\7\60\2\2\u00ac\u00ad\5)\25\2\u00ad&\3\2\2\2\u00ae"+
		"\u00af\7\63\2\2\u00af\u00b0\7\"\2\2\u00b0(\3\2\2\2\u00b1\u00b3\t\2\2\2"+
		"\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5*\3\2\2\2\u00b6\u00b8\t\3\2\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba,\3\2\2\2"+
		"\u00bb\u00bc\t\4\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\27\2\2\u00be.\3"+
		"\2\2\2\u00bf\u00c1\t\5\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b\30"+
		"\2\2\u00c5\60\3\2\2\2\6\2\u00b4\u00b9\u00c2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}