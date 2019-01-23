// Generated from C:/Users/sergioaleman/Desktop/2018/compi/MonkeyGS/src/Antlr\Scanner.g4 by ANTLR 4.7
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Scanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, RETURN=2, INTEGER=3, STRING=4, TRUE=5, FALSE=6, LEN=7, FIRST=8, 
		LAST=9, REST=10, PUSH=11, FN=12, PUTS=13, IF=14, ELSE=15, COMA=16, PyCOMA=17, 
		IG=18, PIZQ=19, PDER=20, PCI=21, PCD=22, LLI=23, LLD=24, DOSPUN=25, SUM=26, 
		SUB=27, MUL=28, DIV=29, MAY=30, MEN=31, MAYI=32, MENI=33, IGIG=34, WS=35, 
		ID=36, LINE_COMMENT=37, SPECIAL_COMMENT=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LET", "RETURN", "INTEGER", "STRING", "TRUE", "FALSE", "LEN", "FIRST", 
		"LAST", "REST", "PUSH", "FN", "PUTS", "IF", "ELSE", "COMA", "PyCOMA", 
		"IG", "PIZQ", "PDER", "PCI", "PCD", "LLI", "LLD", "DOSPUN", "SUM", "SUB", 
		"MUL", "DIV", "MAY", "MEN", "MAYI", "MENI", "IGIG", "WS", "LETTER", "DIGIT", 
		"ID", "LINE_COMMENT", "SPECIAL_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'let'", "'return'", null, null, "'true'", "'false'", "'len'", "'first'", 
		"'last'", "'rest'", "'push'", "'fn'", "'puts'", "'if'", "'else'", "','", 
		"';'", "'='", "'('", "')'", "'['", "']'", "'{'", "'}'", "':'", "'+'", 
		"'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'=='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LET", "RETURN", "INTEGER", "STRING", "TRUE", "FALSE", "LEN", "FIRST", 
		"LAST", "REST", "PUSH", "FN", "PUTS", "IF", "ELSE", "COMA", "PyCOMA", 
		"IG", "PIZQ", "PDER", "PCI", "PCD", "LLI", "LLD", "DOSPUN", "SUM", "SUB", 
		"MUL", "DIV", "MAY", "MEN", "MAYI", "MENI", "IGIG", "WS", "ID", "LINE_COMMENT", 
		"SPECIAL_COMMENT"
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


	public Scanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scanner.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0113\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4a\n\4\f\4\16\4d\13\4\3\5\3\5"+
		"\7\5h\n\5\f\5\16\5k\13\5\3\5\3\5\7\5o\n\5\f\5\16\5r\13\5\3\5\3\5\7\5v"+
		"\n\5\f\5\16\5y\13\5\3\5\7\5|\n\5\f\5\16\5\177\13\5\5\5\u0081\n\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$"+
		"\6$\u00e3\n$\r$\16$\u00e4\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\7\'\u00f0\n\'"+
		"\f\'\16\'\u00f3\13\'\3(\3(\3(\3(\7(\u00f9\n(\f(\16(\u00fc\13(\3(\5(\u00ff"+
		"\n(\3(\3(\3(\3(\3)\3)\3)\3)\3)\7)\u010a\n)\f)\16)\u010d\13)\3)\3)\3)\3"+
		")\3)\bipw}\u00fa\u010b\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I\2K\2M&O\'Q(\3\2\4\5\2\13\f\17"+
		"\17\"\"\5\2C\\aac|\2\u011d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2"+
		"\5W\3\2\2\2\7^\3\2\2\2\te\3\2\2\2\13\u0084\3\2\2\2\r\u0089\3\2\2\2\17"+
		"\u008f\3\2\2\2\21\u0093\3\2\2\2\23\u0099\3\2\2\2\25\u009e\3\2\2\2\27\u00a3"+
		"\3\2\2\2\31\u00a8\3\2\2\2\33\u00ab\3\2\2\2\35\u00b0\3\2\2\2\37\u00b3\3"+
		"\2\2\2!\u00b8\3\2\2\2#\u00ba\3\2\2\2%\u00bc\3\2\2\2\'\u00be\3\2\2\2)\u00c0"+
		"\3\2\2\2+\u00c2\3\2\2\2-\u00c4\3\2\2\2/\u00c6\3\2\2\2\61\u00c8\3\2\2\2"+
		"\63\u00ca\3\2\2\2\65\u00cc\3\2\2\2\67\u00ce\3\2\2\29\u00d0\3\2\2\2;\u00d2"+
		"\3\2\2\2=\u00d4\3\2\2\2?\u00d6\3\2\2\2A\u00d8\3\2\2\2C\u00db\3\2\2\2E"+
		"\u00de\3\2\2\2G\u00e2\3\2\2\2I\u00e8\3\2\2\2K\u00ea\3\2\2\2M\u00ec\3\2"+
		"\2\2O\u00f4\3\2\2\2Q\u0104\3\2\2\2ST\7n\2\2TU\7g\2\2UV\7v\2\2V\4\3\2\2"+
		"\2WX\7t\2\2XY\7g\2\2YZ\7v\2\2Z[\7w\2\2[\\\7t\2\2\\]\7p\2\2]\6\3\2\2\2"+
		"^b\5K&\2_a\5K&\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\b\3\2\2\2db"+
		"\3\2\2\2e\u0080\7$\2\2fh\13\2\2\2gf\3\2\2\2hk\3\2\2\2ij\3\2\2\2ig\3\2"+
		"\2\2jl\3\2\2\2ki\3\2\2\2lp\7$\2\2mo\13\2\2\2nm\3\2\2\2or\3\2\2\2pq\3\2"+
		"\2\2pn\3\2\2\2qs\3\2\2\2rp\3\2\2\2sw\7$\2\2tv\13\2\2\2ut\3\2\2\2vy\3\2"+
		"\2\2wx\3\2\2\2wu\3\2\2\2x\u0081\3\2\2\2yw\3\2\2\2z|\13\2\2\2{z\3\2\2\2"+
		"|\177\3\2\2\2}~\3\2\2\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\u0080i\3"+
		"\2\2\2\u0080}\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7$\2\2\u0083\n\3"+
		"\2\2\2\u0084\u0085\7v\2\2\u0085\u0086\7t\2\2\u0086\u0087\7w\2\2\u0087"+
		"\u0088\7g\2\2\u0088\f\3\2\2\2\u0089\u008a\7h\2\2\u008a\u008b\7c\2\2\u008b"+
		"\u008c\7n\2\2\u008c\u008d\7u\2\2\u008d\u008e\7g\2\2\u008e\16\3\2\2\2\u008f"+
		"\u0090\7n\2\2\u0090\u0091\7g\2\2\u0091\u0092\7p\2\2\u0092\20\3\2\2\2\u0093"+
		"\u0094\7h\2\2\u0094\u0095\7k\2\2\u0095\u0096\7t\2\2\u0096\u0097\7u\2\2"+
		"\u0097\u0098\7v\2\2\u0098\22\3\2\2\2\u0099\u009a\7n\2\2\u009a\u009b\7"+
		"c\2\2\u009b\u009c\7u\2\2\u009c\u009d\7v\2\2\u009d\24\3\2\2\2\u009e\u009f"+
		"\7t\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7v\2\2\u00a2"+
		"\26\3\2\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7u\2\2\u00a6"+
		"\u00a7\7j\2\2\u00a7\30\3\2\2\2\u00a8\u00a9\7h\2\2\u00a9\u00aa\7p\2\2\u00aa"+
		"\32\3\2\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7v\2\2\u00ae"+
		"\u00af\7u\2\2\u00af\34\3\2\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7h\2\2\u00b2"+
		"\36\3\2\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7u\2\2\u00b6"+
		"\u00b7\7g\2\2\u00b7 \3\2\2\2\u00b8\u00b9\7.\2\2\u00b9\"\3\2\2\2\u00ba"+
		"\u00bb\7=\2\2\u00bb$\3\2\2\2\u00bc\u00bd\7?\2\2\u00bd&\3\2\2\2\u00be\u00bf"+
		"\7*\2\2\u00bf(\3\2\2\2\u00c0\u00c1\7+\2\2\u00c1*\3\2\2\2\u00c2\u00c3\7"+
		"]\2\2\u00c3,\3\2\2\2\u00c4\u00c5\7_\2\2\u00c5.\3\2\2\2\u00c6\u00c7\7}"+
		"\2\2\u00c7\60\3\2\2\2\u00c8\u00c9\7\177\2\2\u00c9\62\3\2\2\2\u00ca\u00cb"+
		"\7<\2\2\u00cb\64\3\2\2\2\u00cc\u00cd\7-\2\2\u00cd\66\3\2\2\2\u00ce\u00cf"+
		"\7/\2\2\u00cf8\3\2\2\2\u00d0\u00d1\7,\2\2\u00d1:\3\2\2\2\u00d2\u00d3\7"+
		"\61\2\2\u00d3<\3\2\2\2\u00d4\u00d5\7@\2\2\u00d5>\3\2\2\2\u00d6\u00d7\7"+
		">\2\2\u00d7@\3\2\2\2\u00d8\u00d9\7@\2\2\u00d9\u00da\7?\2\2\u00daB\3\2"+
		"\2\2\u00db\u00dc\7>\2\2\u00dc\u00dd\7?\2\2\u00ddD\3\2\2\2\u00de\u00df"+
		"\7?\2\2\u00df\u00e0\7?\2\2\u00e0F\3\2\2\2\u00e1\u00e3\t\2\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\b$\2\2\u00e7H\3\2\2\2\u00e8\u00e9\t\3\2\2\u00e9"+
		"J\3\2\2\2\u00ea\u00eb\4\62;\2\u00ebL\3\2\2\2\u00ec\u00f1\5I%\2\u00ed\u00f0"+
		"\5I%\2\u00ee\u00f0\5K&\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2N\3\2\2\2"+
		"\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\61\2\2\u00f5\u00f6\7\61\2\2\u00f6\u00fa"+
		"\3\2\2\2\u00f7\u00f9\13\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2"+
		"\u00fa\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fd\u00ff\7\17\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2"+
		"\u00ff\u0100\3\2\2\2\u0100\u0101\7\f\2\2\u0101\u0102\3\2\2\2\u0102\u0103"+
		"\b(\2\2\u0103P\3\2\2\2\u0104\u0105\7\61\2\2\u0105\u0106\7,\2\2\u0106\u010b"+
		"\3\2\2\2\u0107\u010a\5Q)\2\u0108\u010a\13\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u010c\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7,\2\2\u010f"+
		"\u0110\7\61\2\2\u0110\u0111\3\2\2\2\u0111\u0112\b)\2\2\u0112R\3\2\2\2"+
		"\20\2bipw}\u0080\u00e4\u00ef\u00f1\u00fa\u00fe\u0109\u010b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}