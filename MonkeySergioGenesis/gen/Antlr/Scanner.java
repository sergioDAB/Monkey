// Generated from C:/Users/Arrieta/IdeaProjects/MiniPython/src/Antlr\Scanner.g4 by ANTLR 4.6
package Antlr;

  import Antlr.DenterHelper;

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
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, INTEGER=3, STRING=4, CHAR=5, DEF=6, IF=7, ELSE=8, 
		WHILE=9, RETURN=10, NEWLINE=11, PRINT=12, LEN=13, DOSPUNTOS=14, COMA=15, 
		ASIGN=16, PIZQ=17, PDER=18, PCIZQ=19, PCDER=20, SUMA=21, MUL=22, DIV=23, 
		RESTA=24, MENOR=25, MAYOR=26, MENORIGUAL=27, MAYORIGUAL=28, IGUAL=29, 
		DIFERENTE=30, NUM=31, IDENTIFIER=32, STR=33, CHR=34, LINE_COMMENT=35, 
		SPECIAL_COMMENT=36, WS=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INTEGER", "STRING", "CHAR", "DEF", "IF", "ELSE", "WHILE", "RETURN", "NEWLINE", 
		"PRINT", "LEN", "DOSPUNTOS", "COMA", "ASIGN", "PIZQ", "PDER", "PCIZQ", 
		"PCDER", "SUMA", "MUL", "DIV", "RESTA", "MENOR", "MAYOR", "MENORIGUAL", 
		"MAYORIGUAL", "IGUAL", "DIFERENTE", "NUM", "IDENTIFIER", "STR", "CHR", 
		"CharContenido", "CharInicial", "LINE_COMMENT", "SPECIAL_COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'integer'", "'string'", "'char'", "'def'", "'if'", 
		"'else'", "'while'", "'return'", null, "'print'", "'len'", "':'", "','", 
		"'='", "'('", "')'", "'['", "']'", "'+'", "'*'", "'/'", "'-'", "'<'", 
		"'>'", "'<='", "'>='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INDENT", "DEDENT", "INTEGER", "STRING", "CHAR", "DEF", "IF", "ELSE", 
		"WHILE", "RETURN", "NEWLINE", "PRINT", "LEN", "DOSPUNTOS", "COMA", "ASIGN", 
		"PIZQ", "PDER", "PCIZQ", "PCDER", "SUMA", "MUL", "DIV", "RESTA", "MENOR", 
		"MAYOR", "MENORIGUAL", "MAYORIGUAL", "IGUAL", "DIFERENTE", "NUM", "IDENTIFIER", 
		"STR", "CHR", "LINE_COMMENT", "SPECIAL_COMMENT", "WS"
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


	  private final DenterHelper denter = new DenterHelper(NEWLINE,
	                                                       MyParser.INDENT,
	                                                       MyParser.DEDENT)
	  {
	    @Override
	    public Token pullToken() {
	      return Scanner.super.nextToken();
	    }
	  };

	  @Override
	     public Token nextToken() {
	       return denter.nextToken();
	     }
	  public void notifyListeners(LexerNoViableAltException e) {
	      String text = this._input.getText(Interval.of(this._tokenStartCharIndex, this._input.index()));
	      String msg = "No se puede reconocer el token: \'" + this.getErrorDisplay(text) + "\'";
	      ANTLRErrorListener listener = this.getErrorListenerDispatch();
	      listener.syntaxError(this, (Object)null, this._tokenStartLine, this._tokenStartCharPositionInLine, msg, e);
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
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u010f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\5\n|\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0084\n\n\f\n\16\n\u0087"+
		"\13\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008f\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\7\36\u00c4\n\36\f\36\16\36\u00c7\13\36\5\36\u00c9\n\36\3"+
		"\37\3\37\7\37\u00cd\n\37\f\37\16\37\u00d0\13\37\3 \3 \3 \3 \7 \u00d6\n"+
		" \f \16 \u00d9\13 \3 \3 \3!\3!\3!\3!\3\"\3\"\5\"\u00e3\n\"\3#\3#\3$\3"+
		"$\7$\u00e9\n$\f$\16$\u00ec\13$\3$\5$\u00ef\n$\3$\3$\3$\3$\3%\3%\3%\3%"+
		"\3%\3%\7%\u00fb\n%\f%\16%\u00fe\13%\3%\3%\3%\3%\3%\3%\3&\6&\u0107\n&\r"+
		"&\16&\u0108\3&\5&\u010c\n&\3&\3&\4\u00ea\u00fc\2\'\3\5\5\6\7\7\t\b\13"+
		"\t\r\n\17\13\21\f\23\r\25\16\27\17\31\20\33\21\35\22\37\23!\24#\25%\26"+
		"\'\27)\30+\31-\32/\33\61\34\63\35\65\36\67\379 ;!=\"?#A$C\2E\2G%I&K\'"+
		"\3\2\6\3\2$$\7\2\62;aa\u00b9\u00b9\u0302\u0371\u2041\u2042\17\2C\\c|\u00c2"+
		"\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072"+
		"\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\4\2\13\f\17\17"+
		"\u011c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\3M\3\2\2\2\5U\3\2\2\2\7\\\3\2\2\2\ta\3\2\2\2\13e\3\2\2\2\rh"+
		"\3\2\2\2\17m\3\2\2\2\21s\3\2\2\2\23\u008e\3\2\2\2\25\u0090\3\2\2\2\27"+
		"\u0096\3\2\2\2\31\u009a\3\2\2\2\33\u009c\3\2\2\2\35\u009e\3\2\2\2\37\u00a0"+
		"\3\2\2\2!\u00a2\3\2\2\2#\u00a4\3\2\2\2%\u00a6\3\2\2\2\'\u00a8\3\2\2\2"+
		")\u00aa\3\2\2\2+\u00ac\3\2\2\2-\u00ae\3\2\2\2/\u00b0\3\2\2\2\61\u00b2"+
		"\3\2\2\2\63\u00b4\3\2\2\2\65\u00b7\3\2\2\2\67\u00ba\3\2\2\29\u00bd\3\2"+
		"\2\2;\u00c8\3\2\2\2=\u00ca\3\2\2\2?\u00d1\3\2\2\2A\u00dc\3\2\2\2C\u00e2"+
		"\3\2\2\2E\u00e4\3\2\2\2G\u00e6\3\2\2\2I\u00f4\3\2\2\2K\u010b\3\2\2\2M"+
		"N\7k\2\2NO\7p\2\2OP\7v\2\2PQ\7g\2\2QR\7i\2\2RS\7g\2\2ST\7t\2\2T\4\3\2"+
		"\2\2UV\7u\2\2VW\7v\2\2WX\7t\2\2XY\7k\2\2YZ\7p\2\2Z[\7i\2\2[\6\3\2\2\2"+
		"\\]\7e\2\2]^\7j\2\2^_\7c\2\2_`\7t\2\2`\b\3\2\2\2ab\7f\2\2bc\7g\2\2cd\7"+
		"h\2\2d\n\3\2\2\2ef\7k\2\2fg\7h\2\2g\f\3\2\2\2hi\7g\2\2ij\7n\2\2jk\7u\2"+
		"\2kl\7g\2\2l\16\3\2\2\2mn\7y\2\2no\7j\2\2op\7k\2\2pq\7n\2\2qr\7g\2\2r"+
		"\20\3\2\2\2st\7t\2\2tu\7g\2\2uv\7v\2\2vw\7w\2\2wx\7t\2\2xy\7p\2\2y\22"+
		"\3\2\2\2z|\7\17\2\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\u0085\7\f\2\2~\177"+
		"\7\"\2\2\177\u0080\7\"\2\2\u0080\u0081\7\"\2\2\u0081\u0084\7\"\2\2\u0082"+
		"\u0084\7\13\2\2\u0083~\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008f\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\u0089\7\17\2\2\u0089\u008a\7\f\2\2\u008a\u008b\7\"\2\2"+
		"\u008b\u008c\7\"\2\2\u008c\u008d\7\"\2\2\u008d\u008f\7\"\2\2\u008e{\3"+
		"\2\2\2\u008e\u0088\3\2\2\2\u008f\24\3\2\2\2\u0090\u0091\7r\2\2\u0091\u0092"+
		"\7t\2\2\u0092\u0093\7k\2\2\u0093\u0094\7p\2\2\u0094\u0095\7v\2\2\u0095"+
		"\26\3\2\2\2\u0096\u0097\7n\2\2\u0097\u0098\7g\2\2\u0098\u0099\7p\2\2\u0099"+
		"\30\3\2\2\2\u009a\u009b\7<\2\2\u009b\32\3\2\2\2\u009c\u009d\7.\2\2\u009d"+
		"\34\3\2\2\2\u009e\u009f\7?\2\2\u009f\36\3\2\2\2\u00a0\u00a1\7*\2\2\u00a1"+
		" \3\2\2\2\u00a2\u00a3\7+\2\2\u00a3\"\3\2\2\2\u00a4\u00a5\7]\2\2\u00a5"+
		"$\3\2\2\2\u00a6\u00a7\7_\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7-\2\2\u00a9("+
		"\3\2\2\2\u00aa\u00ab\7,\2\2\u00ab*\3\2\2\2\u00ac\u00ad\7\61\2\2\u00ad"+
		",\3\2\2\2\u00ae\u00af\7/\2\2\u00af.\3\2\2\2\u00b0\u00b1\7>\2\2\u00b1\60"+
		"\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3\62\3\2\2\2\u00b4\u00b5\7>\2\2\u00b5"+
		"\u00b6\7?\2\2\u00b6\64\3\2\2\2\u00b7\u00b8\7@\2\2\u00b8\u00b9\7?\2\2\u00b9"+
		"\66\3\2\2\2\u00ba\u00bb\7?\2\2\u00bb\u00bc\7?\2\2\u00bc8\3\2\2\2\u00bd"+
		"\u00be\7#\2\2\u00be\u00bf\7?\2\2\u00bf:\3\2\2\2\u00c0\u00c9\7\62\2\2\u00c1"+
		"\u00c5\4\63;\2\u00c2\u00c4\4\62;\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c1\3\2\2\2\u00c9<\3\2\2\2"+
		"\u00ca\u00ce\5E#\2\u00cb\u00cd\5C\"\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf>\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00d7\7$\2\2\u00d2\u00d3\7$\2\2\u00d3\u00d6\7$\2"+
		"\2\u00d4\u00d6\n\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00db\7$\2\2\u00db@\3\2\2\2\u00dc\u00dd\7)\2\2\u00dd"+
		"\u00de\5E#\2\u00de\u00df\7)\2\2\u00dfB\3\2\2\2\u00e0\u00e3\5E#\2\u00e1"+
		"\u00e3\t\3\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3D\3\2\2\2"+
		"\u00e4\u00e5\t\4\2\2\u00e5F\3\2\2\2\u00e6\u00ea\7%\2\2\u00e7\u00e9\13"+
		"\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00eb\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ef\7\17"+
		"\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\7\f\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b$\2\2\u00f3H\3\2\2\2\u00f4"+
		"\u00f5\7$\2\2\u00f5\u00f6\7$\2\2\u00f6\u00f7\7$\2\2\u00f7\u00fc\3\2\2"+
		"\2\u00f8\u00fb\5I%\2\u00f9\u00fb\13\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7$\2\2\u0100\u0101\7$\2"+
		"\2\u0101\u0102\7$\2\2\u0102\u0103\3\2\2\2\u0103\u0104\b%\2\2\u0104J\3"+
		"\2\2\2\u0105\u0107\7\"\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u010c\t\5"+
		"\2\2\u010b\u0106\3\2\2\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\b&\2\2\u010eL\3\2\2\2\23\2{\u0083\u0085\u008e\u00c5\u00c8\u00ce"+
		"\u00d5\u00d7\u00e2\u00ea\u00ee\u00fa\u00fc\u0108\u010b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}