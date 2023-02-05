// Generated from e:\UnityProjects\GRERPG\Assets\ANTLR\lib/Move.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MoveLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, FlOAT=9, 
		ONE=10, INT=11, ID=12, WS=13, NL=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "FlOAT", 
		"ONE", "INT", "ID", "WS", "NL"
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


	public MoveLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Move.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\6\fa\n\f\r\f\16\fb\3\r\6\rf\n\r\r\r\16\rg\3\16"+
		"\3\16\3\16\3\16\3\17\6\17o\n\17\r\17\16\17p\3\17\3\17\2\2\20\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\6\3\2"+
		"\62;\4\2C\\c|\4\2\13\13\"\"\4\2\f\f\17\17\2v\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\3\37\3\2\2\2\5$\3\2\2\2\7*\3\2\2\2\t/\3\2\2\2\13\62\3\2"+
		"\2\2\r\67\3\2\2\2\17<\3\2\2\2\21B\3\2\2\2\23X\3\2\2\2\25\\\3\2\2\2\27"+
		"`\3\2\2\2\31e\3\2\2\2\33i\3\2\2\2\35n\3\2\2\2\37 \7o\2\2 !\7q\2\2!\"\7"+
		"x\2\2\"#\7g\2\2#\4\3\2\2\2$%\7u\2\2%&\7v\2\2&\'\7g\2\2\'(\7r\2\2()\7u"+
		"\2\2)\6\3\2\2\2*+\7u\2\2+,\7v\2\2,-\7g\2\2-.\7r\2\2.\b\3\2\2\2/\60\7w"+
		"\2\2\60\61\7r\2\2\61\n\3\2\2\2\62\63\7f\2\2\63\64\7q\2\2\64\65\7y\2\2"+
		"\65\66\7p\2\2\66\f\3\2\2\2\678\7n\2\289\7g\2\29:\7h\2\2:;\7v\2\2;\16\3"+
		"\2\2\2<=\7t\2\2=>\7k\2\2>?\7i\2\2?@\7j\2\2@A\7v\2\2A\20\3\2\2\2BC\7k\2"+
		"\2CD\7p\2\2DE\7\"\2\2EF\7c\2\2FG\7\"\2\2GH\7t\2\2HI\7c\2\2IJ\7p\2\2JK"+
		"\7f\2\2KL\7q\2\2LM\7o\2\2MN\7\"\2\2NO\7f\2\2OP\7k\2\2PQ\7t\2\2QR\7g\2"+
		"\2RS\7e\2\2ST\7v\2\2TU\7k\2\2UV\7q\2\2VW\7p\2\2W\22\3\2\2\2XY\5\27\f\2"+
		"YZ\7\60\2\2Z[\5\27\f\2[\24\3\2\2\2\\]\7\63\2\2]^\7\"\2\2^\26\3\2\2\2_"+
		"a\t\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\30\3\2\2\2df\t\3\2"+
		"\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\32\3\2\2\2ij\t\4\2\2jk\3\2"+
		"\2\2kl\b\16\2\2l\34\3\2\2\2mo\t\5\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq"+
		"\3\2\2\2qr\3\2\2\2rs\b\17\2\2s\36\3\2\2\2\6\2bgp\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}