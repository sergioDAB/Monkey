// Generated from C:/Users/Arrieta/IdeaProjects/MiniPython/src/Antlr\MyParser.g4 by ANTLR 4.6
package Antlr;

  import Exeptions.MyExeption;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_defStatement = 2, RULE_argList = 3, 
		RULE_moreArgs = 4, RULE_ifStatement = 5, RULE_whileStatement = 6, RULE_returnStatement = 7, 
		RULE_printStatement = 8, RULE_asignStatement = 9, RULE_functionCallStatement = 10, 
		RULE_sequence = 11, RULE_moreStatement = 12, RULE_expression = 13, RULE_comparison = 14, 
		RULE_additionExpression = 15, RULE_additionFactor = 16, RULE_multiplicationExpression = 17, 
		RULE_multiplicationFactor = 18, RULE_elementExpression = 19, RULE_elementAccess = 20, 
		RULE_functionCallExpression = 21, RULE_expressionList = 22, RULE_moreExpressions = 23, 
		RULE_primitiveExpression = 24, RULE_listExpression = 25;
	public static final String[] ruleNames = {
		"program", "statement", "defStatement", "argList", "moreArgs", "ifStatement", 
		"whileStatement", "returnStatement", "printStatement", "asignStatement", 
		"functionCallStatement", "sequence", "moreStatement", "expression", "comparison", 
		"additionExpression", "additionFactor", "multiplicationExpression", "multiplicationFactor", 
		"elementExpression", "elementAccess", "functionCallExpression", "expressionList", 
		"moreExpressions", "primitiveExpression", "listExpression"
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

	@Override
	public String getGrammarFileName() { return "MyParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	  public MyParser(TokenStream input, MyExeption ex) {
	  		super(input);
	  		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	  		this._errHandler = ex;
	  	}

	public MyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramaContext extends ProgramContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode EOF() { return getToken(MyParser.EOF, 0); }
		public ProgramaContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgramaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			statement();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << PRINT) | (1L << LEN) | (1L << PIZQ) | (1L << PCIZQ) | (1L << NUM) | (1L << IDENTIFIER) | (1L << STR) | (1L << CHR))) != 0)) {
				{
				{
				setState(53);
				statement();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatFuncCallContext extends StatementContext {
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public StatFuncCallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStatFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStatFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStatFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatWhileContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public StatWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStatWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStatWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStatWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatAsignContext extends StatementContext {
		public AsignStatementContext asignStatement() {
			return getRuleContext(AsignStatementContext.class,0);
		}
		public StatAsignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStatAsign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStatAsign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStatAsign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatPrintContext extends StatementContext {
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatPrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStatPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStatPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStatPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatDefContext extends StatementContext {
		public DefStatementContext defStatement() {
			return getRuleContext(DefStatementContext.class,0);
		}
		public StatDefContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStatDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStatDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStatDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatIfContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public StatIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStatIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStatIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStatIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatReturnContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStatReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStatReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStatReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new StatDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				defStatement();
				}
				break;
			case 2:
				_localctx = new StatIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				ifStatement();
				}
				break;
			case 3:
				_localctx = new StatReturnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				returnStatement();
				}
				break;
			case 4:
				_localctx = new StatPrintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				printStatement();
				}
				break;
			case 5:
				_localctx = new StatWhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				whileStatement();
				}
				break;
			case 6:
				_localctx = new StatAsignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				asignStatement();
				}
				break;
			case 7:
				_localctx = new StatFuncCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				functionCallStatement();
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

	public static class DefStatementContext extends ParserRuleContext {
		public DefStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defStatement; }
	 
		public DefStatementContext() { }
		public void copyFrom(DefStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefStatNodoContext extends DefStatementContext {
		public TerminalNode DEF() { return getToken(MyParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode PIZQ() { return getToken(MyParser.PIZQ, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MyParser.PDER, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(MyParser.DOSPUNTOS, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public DefStatNodoContext(DefStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterDefStatNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitDefStatNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitDefStatNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefStatementContext defStatement() throws RecognitionException {
		DefStatementContext _localctx = new DefStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_defStatement);
		try {
			_localctx = new DefStatNodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(DEF);
			setState(71);
			match(IDENTIFIER);
			setState(72);
			match(PIZQ);
			setState(73);
			argList();
			setState(74);
			match(PDER);
			setState(75);
			match(DOSPUNTOS);
			setState(76);
			sequence();
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

	public static class ArgListContext extends ParserRuleContext {
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
	 
		public ArgListContext() { }
		public void copyFrom(ArgListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgListLlenaContext extends ArgListContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public MoreArgsContext moreArgs() {
			return getRuleContext(MoreArgsContext.class,0);
		}
		public ArgListLlenaContext(ArgListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterArgListLlena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitArgListLlena(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitArgListLlena(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgListVaciaContext extends ArgListContext {
		public ArgListVaciaContext(ArgListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterArgListVacia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitArgListVacia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitArgListVacia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argList);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new ArgListLlenaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(IDENTIFIER);
				setState(79);
				moreArgs();
				}
				break;
			case PDER:
				_localctx = new ArgListVaciaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class MoreArgsContext extends ParserRuleContext {
		public MoreArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreArgs; }
	 
		public MoreArgsContext() { }
		public void copyFrom(MoreArgsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MoreArgsNodoContext extends MoreArgsContext {
		public List<TerminalNode> COMA() { return getTokens(MyParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MyParser.COMA, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyParser.IDENTIFIER, i);
		}
		public MoreArgsNodoContext(MoreArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterMoreArgsNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitMoreArgsNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMoreArgsNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreArgsContext moreArgs() throws RecognitionException {
		MoreArgsContext _localctx = new MoreArgsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_moreArgs);
		int _la;
		try {
			_localctx = new MoreArgsNodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(83);
				match(COMA);
				setState(84);
				match(IDENTIFIER);
				}
				}
				setState(89);
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatNodoContext extends IfStatementContext {
		public TerminalNode IF() { return getToken(MyParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> DOSPUNTOS() { return getTokens(MyParser.DOSPUNTOS); }
		public TerminalNode DOSPUNTOS(int i) {
			return getToken(MyParser.DOSPUNTOS, i);
		}
		public List<SequenceContext> sequence() {
			return getRuleContexts(SequenceContext.class);
		}
		public SequenceContext sequence(int i) {
			return getRuleContext(SequenceContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MyParser.ELSE, 0); }
		public IfStatNodoContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterIfStatNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitIfStatNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitIfStatNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		try {
			_localctx = new IfStatNodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(IF);
			setState(91);
			expression();
			setState(92);
			match(DOSPUNTOS);
			setState(93);
			sequence();
			setState(94);
			match(ELSE);
			setState(95);
			match(DOSPUNTOS);
			setState(96);
			sequence();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	 
		public WhileStatementContext() { }
		public void copyFrom(WhileStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatNodoContext extends WhileStatementContext {
		public TerminalNode WHILE() { return getToken(MyParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(MyParser.DOSPUNTOS, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public WhileStatNodoContext(WhileStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterWhileStatNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitWhileStatNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitWhileStatNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStatement);
		try {
			_localctx = new WhileStatNodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(WHILE);
			setState(99);
			expression();
			setState(100);
			match(DOSPUNTOS);
			setState(101);
			sequence();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnStatNodoContext extends ReturnStatementContext {
		public TerminalNode RETURN() { return getToken(MyParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MyParser.NEWLINE, 0); }
		public ReturnStatNodoContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterReturnStatNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitReturnStatNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitReturnStatNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnStatement);
		try {
			_localctx = new ReturnStatNodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(RETURN);
			setState(104);
			expression();
			setState(105);
			match(NEWLINE);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	 
		public PrintStatementContext() { }
		public void copyFrom(PrintStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStatNodoContext extends PrintStatementContext {
		public TerminalNode PRINT() { return getToken(MyParser.PRINT, 0); }
		public TerminalNode PIZQ() { return getToken(MyParser.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MyParser.PDER, 0); }
		public TerminalNode NEWLINE() { return getToken(MyParser.NEWLINE, 0); }
		public PrintStatNodoContext(PrintStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterPrintStatNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitPrintStatNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitPrintStatNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printStatement);
		try {
			_localctx = new PrintStatNodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(PRINT);
			setState(108);
			match(PIZQ);
			setState(109);
			expression();
			setState(110);
			match(PDER);
			setState(111);
			match(NEWLINE);
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

	public static class AsignStatementContext extends ParserRuleContext {
		public AsignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignStatement; }
	 
		public AsignStatementContext() { }
		public void copyFrom(AsignStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsignStatNodoContext extends AsignStatementContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode ASIGN() { return getToken(MyParser.ASIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MyParser.NEWLINE, 0); }
		public AsignStatNodoContext(AsignStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterAsignStatNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitAsignStatNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitAsignStatNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignStatementContext asignStatement() throws RecognitionException {
		AsignStatementContext _localctx = new AsignStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asignStatement);
		try {
			_localctx = new AsignStatNodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(IDENTIFIER);
			setState(114);
			match(ASIGN);
			setState(115);
			expression();
			setState(116);
			match(NEWLINE);
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

	public static class FunctionCallStatementContext extends ParserRuleContext {
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
	 
		public FunctionCallStatementContext() { }
		public void copyFrom(FunctionCallStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncCallNodoContext extends FunctionCallStatementContext {
		public PrimitiveExpressionContext primitiveExpression() {
			return getRuleContext(PrimitiveExpressionContext.class,0);
		}
		public TerminalNode PIZQ() { return getToken(MyParser.PIZQ, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MyParser.PDER, 0); }
		public TerminalNode NEWLINE() { return getToken(MyParser.NEWLINE, 0); }
		public FuncCallNodoContext(FunctionCallStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFuncCallNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFuncCallNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitFuncCallNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionCallStatement);
		try {
			_localctx = new FuncCallNodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			primitiveExpression();
			setState(119);
			match(PIZQ);
			setState(120);
			expressionList();
			setState(121);
			match(PDER);
			setState(122);
			match(NEWLINE);
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

	public static class SequenceContext extends ParserRuleContext {
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
	 
		public SequenceContext() { }
		public void copyFrom(SequenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SequenceNodoContext extends SequenceContext {
		public TerminalNode INDENT() { return getToken(MyParser.INDENT, 0); }
		public MoreStatementContext moreStatement() {
			return getRuleContext(MoreStatementContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(MyParser.DEDENT, 0); }
		public SequenceNodoContext(SequenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterSequenceNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitSequenceNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitSequenceNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sequence);
		try {
			_localctx = new SequenceNodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(INDENT);
			setState(125);
			moreStatement();
			setState(126);
			match(DEDENT);
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

	public static class MoreStatementContext extends ParserRuleContext {
		public MoreStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreStatement; }
	 
		public MoreStatementContext() { }
		public void copyFrom(MoreStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MoreStatNodoContext extends MoreStatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MoreStatNodoContext(MoreStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterMoreStatNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitMoreStatNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMoreStatNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreStatementContext moreStatement() throws RecognitionException {
		MoreStatementContext _localctx = new MoreStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_moreStatement);
		int _la;
		try {
			_localctx = new MoreStatNodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			statement();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << PRINT) | (1L << LEN) | (1L << PIZQ) | (1L << PCIZQ) | (1L << NUM) | (1L << IDENTIFIER) | (1L << STR) | (1L << CHR))) != 0)) {
				{
				{
				setState(129);
				statement();
				}
				}
				setState(134);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprsNodoContext extends ExpressionContext {
		public AdditionExpressionContext additionExpression() {
			return getRuleContext(AdditionExpressionContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ExprsNodoContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterExprsNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitExprsNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitExprsNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			_localctx = new ExprsNodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			additionExpression();
			setState(136);
			comparison();
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

	public static class ComparisonContext extends ParserRuleContext {
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	 
		public ComparisonContext() { }
		public void copyFrom(ComparisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompNodoContext extends ComparisonContext {
		public List<AdditionExpressionContext> additionExpression() {
			return getRuleContexts(AdditionExpressionContext.class);
		}
		public AdditionExpressionContext additionExpression(int i) {
			return getRuleContext(AdditionExpressionContext.class,i);
		}
		public List<TerminalNode> MENOR() { return getTokens(MyParser.MENOR); }
		public TerminalNode MENOR(int i) {
			return getToken(MyParser.MENOR, i);
		}
		public List<TerminalNode> MAYOR() { return getTokens(MyParser.MAYOR); }
		public TerminalNode MAYOR(int i) {
			return getToken(MyParser.MAYOR, i);
		}
		public List<TerminalNode> MENORIGUAL() { return getTokens(MyParser.MENORIGUAL); }
		public TerminalNode MENORIGUAL(int i) {
			return getToken(MyParser.MENORIGUAL, i);
		}
		public List<TerminalNode> MAYORIGUAL() { return getTokens(MyParser.MAYORIGUAL); }
		public TerminalNode MAYORIGUAL(int i) {
			return getToken(MyParser.MAYORIGUAL, i);
		}
		public List<TerminalNode> IGUAL() { return getTokens(MyParser.IGUAL); }
		public TerminalNode IGUAL(int i) {
			return getToken(MyParser.IGUAL, i);
		}
		public List<TerminalNode> DIFERENTE() { return getTokens(MyParser.DIFERENTE); }
		public TerminalNode DIFERENTE(int i) {
			return getToken(MyParser.DIFERENTE, i);
		}
		public CompNodoContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterCompNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitCompNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitCompNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparison);
		int _la;
		try {
			_localctx = new CompNodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOR) | (1L << MAYOR) | (1L << MENORIGUAL) | (1L << MAYORIGUAL) | (1L << IGUAL) | (1L << DIFERENTE))) != 0)) {
				{
				{
				setState(138);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOR) | (1L << MAYOR) | (1L << MENORIGUAL) | (1L << MAYORIGUAL) | (1L << IGUAL) | (1L << DIFERENTE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(139);
				additionExpression();
				}
				}
				setState(144);
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

	public static class AdditionExpressionContext extends ParserRuleContext {
		public AdditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExpression; }
	 
		public AdditionExpressionContext() { }
		public void copyFrom(AdditionExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddExprNodoContext extends AdditionExpressionContext {
		public MultiplicationExpressionContext multiplicationExpression() {
			return getRuleContext(MultiplicationExpressionContext.class,0);
		}
		public AdditionFactorContext additionFactor() {
			return getRuleContext(AdditionFactorContext.class,0);
		}
		public AddExprNodoContext(AdditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterAddExprNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitAddExprNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitAddExprNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionExpressionContext additionExpression() throws RecognitionException {
		AdditionExpressionContext _localctx = new AdditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_additionExpression);
		try {
			_localctx = new AddExprNodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			multiplicationExpression();
			setState(146);
			additionFactor();
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

	public static class AdditionFactorContext extends ParserRuleContext {
		public AdditionFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionFactor; }
	 
		public AdditionFactorContext() { }
		public void copyFrom(AdditionFactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddFactorNodoContext extends AdditionFactorContext {
		public List<MultiplicationExpressionContext> multiplicationExpression() {
			return getRuleContexts(MultiplicationExpressionContext.class);
		}
		public MultiplicationExpressionContext multiplicationExpression(int i) {
			return getRuleContext(MultiplicationExpressionContext.class,i);
		}
		public List<TerminalNode> SUMA() { return getTokens(MyParser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(MyParser.SUMA, i);
		}
		public List<TerminalNode> RESTA() { return getTokens(MyParser.RESTA); }
		public TerminalNode RESTA(int i) {
			return getToken(MyParser.RESTA, i);
		}
		public AddFactorNodoContext(AdditionFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterAddFactorNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitAddFactorNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitAddFactorNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionFactorContext additionFactor() throws RecognitionException {
		AdditionFactorContext _localctx = new AdditionFactorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_additionFactor);
		int _la;
		try {
			_localctx = new AddFactorNodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUMA || _la==RESTA) {
				{
				{
				setState(148);
				_la = _input.LA(1);
				if ( !(_la==SUMA || _la==RESTA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(149);
				multiplicationExpression();
				}
				}
				setState(154);
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

	public static class MultiplicationExpressionContext extends ParserRuleContext {
		public MultiplicationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicationExpression; }
	 
		public MultiplicationExpressionContext() { }
		public void copyFrom(MultiplicationExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MulExprNodoContext extends MultiplicationExpressionContext {
		public ElementExpressionContext elementExpression() {
			return getRuleContext(ElementExpressionContext.class,0);
		}
		public MultiplicationFactorContext multiplicationFactor() {
			return getRuleContext(MultiplicationFactorContext.class,0);
		}
		public MulExprNodoContext(MultiplicationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterMulExprNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitMulExprNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMulExprNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicationExpressionContext multiplicationExpression() throws RecognitionException {
		MultiplicationExpressionContext _localctx = new MultiplicationExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multiplicationExpression);
		try {
			_localctx = new MulExprNodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			elementExpression();
			setState(156);
			multiplicationFactor();
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

	public static class MultiplicationFactorContext extends ParserRuleContext {
		public MultiplicationFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicationFactor; }
	 
		public MultiplicationFactorContext() { }
		public void copyFrom(MultiplicationFactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MulFactorNodoContext extends MultiplicationFactorContext {
		public List<ElementExpressionContext> elementExpression() {
			return getRuleContexts(ElementExpressionContext.class);
		}
		public ElementExpressionContext elementExpression(int i) {
			return getRuleContext(ElementExpressionContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(MyParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(MyParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(MyParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(MyParser.DIV, i);
		}
		public MulFactorNodoContext(MultiplicationFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterMulFactorNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitMulFactorNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMulFactorNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicationFactorContext multiplicationFactor() throws RecognitionException {
		MultiplicationFactorContext _localctx = new MultiplicationFactorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiplicationFactor);
		int _la;
		try {
			_localctx = new MulFactorNodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(158);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(159);
				elementExpression();
				}
				}
				setState(164);
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

	public static class ElementExpressionContext extends ParserRuleContext {
		public ElementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementExpression; }
	 
		public ElementExpressionContext() { }
		public void copyFrom(ElementExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElmtExprNodoContext extends ElementExpressionContext {
		public PrimitiveExpressionContext primitiveExpression() {
			return getRuleContext(PrimitiveExpressionContext.class,0);
		}
		public ElementAccessContext elementAccess() {
			return getRuleContext(ElementAccessContext.class,0);
		}
		public ElmtExprNodoContext(ElementExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterElmtExprNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitElmtExprNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitElmtExprNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementExpressionContext elementExpression() throws RecognitionException {
		ElementExpressionContext _localctx = new ElementExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elementExpression);
		try {
			_localctx = new ElmtExprNodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			primitiveExpression();
			setState(166);
			elementAccess();
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

	public static class ElementAccessContext extends ParserRuleContext {
		public ElementAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAccess; }
	 
		public ElementAccessContext() { }
		public void copyFrom(ElementAccessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElmtAccessNodoContext extends ElementAccessContext {
		public List<TerminalNode> PCIZQ() { return getTokens(MyParser.PCIZQ); }
		public TerminalNode PCIZQ(int i) {
			return getToken(MyParser.PCIZQ, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> PCDER() { return getTokens(MyParser.PCDER); }
		public TerminalNode PCDER(int i) {
			return getToken(MyParser.PCDER, i);
		}
		public ElmtAccessNodoContext(ElementAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterElmtAccessNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitElmtAccessNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitElmtAccessNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementAccessContext elementAccess() throws RecognitionException {
		ElementAccessContext _localctx = new ElementAccessContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elementAccess);
		int _la;
		try {
			_localctx = new ElmtAccessNodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PCIZQ) {
				{
				{
				setState(168);
				match(PCIZQ);
				setState(169);
				expression();
				setState(170);
				match(PCDER);
				}
				}
				setState(176);
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

	public static class FunctionCallExpressionContext extends ParserRuleContext {
		public FunctionCallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallExpression; }
	 
		public FunctionCallExpressionContext() { }
		public void copyFrom(FunctionCallExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncCallExprContext extends FunctionCallExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public TerminalNode PIZQ() { return getToken(MyParser.PIZQ, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MyParser.PDER, 0); }
		public FuncCallExprContext(FunctionCallExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFuncCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFuncCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitFuncCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallExpressionContext functionCallExpression() throws RecognitionException {
		FunctionCallExpressionContext _localctx = new FunctionCallExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionCallExpression);
		try {
			_localctx = new FuncCallExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(IDENTIFIER);
			setState(178);
			match(PIZQ);
			setState(179);
			expressionList();
			setState(180);
			match(PDER);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	 
		public ExpressionListContext() { }
		public void copyFrom(ExpressionListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprListEpsilonContext extends ExpressionListContext {
		public ExprListEpsilonContext(ExpressionListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterExprListEpsilon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitExprListEpsilon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitExprListEpsilon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprListNodoContext extends ExpressionListContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MoreExpressionsContext moreExpressions() {
			return getRuleContext(MoreExpressionsContext.class,0);
		}
		public ExprListNodoContext(ExpressionListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterExprListNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitExprListNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitExprListNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionList);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEN:
			case PIZQ:
			case PCIZQ:
			case NUM:
			case IDENTIFIER:
			case STR:
			case CHR:
				_localctx = new ExprListNodoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				expression();
				setState(183);
				moreExpressions();
				}
				break;
			case PDER:
			case PCDER:
				_localctx = new ExprListEpsilonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class MoreExpressionsContext extends ParserRuleContext {
		public MoreExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreExpressions; }
	 
		public MoreExpressionsContext() { }
		public void copyFrom(MoreExpressionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MoreExprNodoContext extends MoreExpressionsContext {
		public List<TerminalNode> COMA() { return getTokens(MyParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MyParser.COMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MoreExprNodoContext(MoreExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterMoreExprNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitMoreExprNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMoreExprNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreExpressionsContext moreExpressions() throws RecognitionException {
		MoreExpressionsContext _localctx = new MoreExpressionsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_moreExpressions);
		int _la;
		try {
			_localctx = new MoreExprNodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(188);
				match(COMA);
				setState(189);
				expression();
				}
				}
				setState(194);
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

	public static class PrimitiveExpressionContext extends ParserRuleContext {
		public PrimitiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveExpression; }
	 
		public PrimitiveExpressionContext() { }
		public void copyFrom(PrimitiveExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntPriExprNodoContext extends PrimitiveExpressionContext {
		public TerminalNode NUM() { return getToken(MyParser.NUM, 0); }
		public IntPriExprNodoContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterIntPriExprNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitIntPriExprNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitIntPriExprNodo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListPriExprNodoContext extends PrimitiveExpressionContext {
		public ListExpressionContext listExpression() {
			return getRuleContext(ListExpressionContext.class,0);
		}
		public ListPriExprNodoContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterListPriExprNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitListPriExprNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitListPriExprNodo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrPriExprNodoContext extends PrimitiveExpressionContext {
		public TerminalNode STR() { return getToken(MyParser.STR, 0); }
		public StrPriExprNodoContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStrPriExprNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStrPriExprNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStrPriExprNodo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharPriExprNodoContext extends PrimitiveExpressionContext {
		public TerminalNode CHR() { return getToken(MyParser.CHR, 0); }
		public CharPriExprNodoContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterCharPriExprNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitCharPriExprNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitCharPriExprNodo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPriExprNodoContext extends PrimitiveExpressionContext {
		public TerminalNode PIZQ() { return getToken(MyParser.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MyParser.PDER, 0); }
		public ExprPriExprNodoContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterExprPriExprNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitExprPriExprNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitExprPriExprNodo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdPriExprNodoContext extends PrimitiveExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MyParser.IDENTIFIER, 0); }
		public IdPriExprNodoContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterIdPriExprNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitIdPriExprNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitIdPriExprNodo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LenPriExprNodoContext extends PrimitiveExpressionContext {
		public TerminalNode LEN() { return getToken(MyParser.LEN, 0); }
		public TerminalNode PIZQ() { return getToken(MyParser.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MyParser.PDER, 0); }
		public LenPriExprNodoContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterLenPriExprNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitLenPriExprNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitLenPriExprNodo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallPriExprNodoContext extends PrimitiveExpressionContext {
		public FunctionCallExpressionContext functionCallExpression() {
			return getRuleContext(FunctionCallExpressionContext.class,0);
		}
		public FuncCallPriExprNodoContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFuncCallPriExprNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFuncCallPriExprNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitFuncCallPriExprNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveExpressionContext primitiveExpression() throws RecognitionException {
		PrimitiveExpressionContext _localctx = new PrimitiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_primitiveExpression);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new IntPriExprNodoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(NUM);
				}
				break;
			case 2:
				_localctx = new StrPriExprNodoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(STR);
				}
				break;
			case 3:
				_localctx = new IdPriExprNodoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new CharPriExprNodoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				match(CHR);
				}
				break;
			case 5:
				_localctx = new ExprPriExprNodoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				match(PIZQ);
				setState(200);
				expression();
				setState(201);
				match(PDER);
				}
				break;
			case 6:
				_localctx = new ListPriExprNodoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				listExpression();
				}
				break;
			case 7:
				_localctx = new LenPriExprNodoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				match(LEN);
				setState(205);
				match(PIZQ);
				setState(206);
				expression();
				setState(207);
				match(PDER);
				}
				break;
			case 8:
				_localctx = new FuncCallPriExprNodoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(209);
				functionCallExpression();
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

	public static class ListExpressionContext extends ParserRuleContext {
		public ListExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpression; }
	 
		public ListExpressionContext() { }
		public void copyFrom(ListExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListExprNodoContext extends ListExpressionContext {
		public TerminalNode PCIZQ() { return getToken(MyParser.PCIZQ, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode PCDER() { return getToken(MyParser.PCDER, 0); }
		public ListExprNodoContext(ListExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterListExprNodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitListExprNodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitListExprNodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListExpressionContext listExpression() throws RecognitionException {
		ListExpressionContext _localctx = new ListExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_listExpression);
		try {
			_localctx = new ListExprNodoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(PCIZQ);
			setState(213);
			expressionList();
			setState(214);
			match(PCDER);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u00db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3G\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\5\5T\n\5\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\7\16\u0085\n\16\f\16\16\16\u0088\13\16\3\17\3\17\3\17\3\20\3\20\7\20"+
		"\u008f\n\20\f\20\16\20\u0092\13\20\3\21\3\21\3\21\3\22\3\22\7\22\u0099"+
		"\n\22\f\22\16\22\u009c\13\22\3\23\3\23\3\23\3\24\3\24\7\24\u00a3\n\24"+
		"\f\24\16\24\u00a6\13\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00af"+
		"\n\26\f\26\16\26\u00b2\13\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\5\30\u00bd\n\30\3\31\3\31\7\31\u00c1\n\31\f\31\16\31\u00c4\13\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\5\32\u00d5\n\32\3\33\3\33\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\5\3\2\33 \4\2\27\27\32\32\3"+
		"\2\30\31\u00d7\2\66\3\2\2\2\4F\3\2\2\2\6H\3\2\2\2\bS\3\2\2\2\nY\3\2\2"+
		"\2\f\\\3\2\2\2\16d\3\2\2\2\20i\3\2\2\2\22m\3\2\2\2\24s\3\2\2\2\26x\3\2"+
		"\2\2\30~\3\2\2\2\32\u0082\3\2\2\2\34\u0089\3\2\2\2\36\u0090\3\2\2\2 \u0093"+
		"\3\2\2\2\"\u009a\3\2\2\2$\u009d\3\2\2\2&\u00a4\3\2\2\2(\u00a7\3\2\2\2"+
		"*\u00b0\3\2\2\2,\u00b3\3\2\2\2.\u00bc\3\2\2\2\60\u00c2\3\2\2\2\62\u00d4"+
		"\3\2\2\2\64\u00d6\3\2\2\2\66:\5\4\3\2\679\5\4\3\28\67\3\2\2\29<\3\2\2"+
		"\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\2\2\3>\3\3\2\2\2?G\5\6"+
		"\4\2@G\5\f\7\2AG\5\20\t\2BG\5\22\n\2CG\5\16\b\2DG\5\24\13\2EG\5\26\f\2"+
		"F?\3\2\2\2F@\3\2\2\2FA\3\2\2\2FB\3\2\2\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2"+
		"G\5\3\2\2\2HI\7\b\2\2IJ\7\"\2\2JK\7\23\2\2KL\5\b\5\2LM\7\24\2\2MN\7\20"+
		"\2\2NO\5\30\r\2O\7\3\2\2\2PQ\7\"\2\2QT\5\n\6\2RT\3\2\2\2SP\3\2\2\2SR\3"+
		"\2\2\2T\t\3\2\2\2UV\7\21\2\2VX\7\"\2\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2Y"+
		"Z\3\2\2\2Z\13\3\2\2\2[Y\3\2\2\2\\]\7\t\2\2]^\5\34\17\2^_\7\20\2\2_`\5"+
		"\30\r\2`a\7\n\2\2ab\7\20\2\2bc\5\30\r\2c\r\3\2\2\2de\7\13\2\2ef\5\34\17"+
		"\2fg\7\20\2\2gh\5\30\r\2h\17\3\2\2\2ij\7\f\2\2jk\5\34\17\2kl\7\r\2\2l"+
		"\21\3\2\2\2mn\7\16\2\2no\7\23\2\2op\5\34\17\2pq\7\24\2\2qr\7\r\2\2r\23"+
		"\3\2\2\2st\7\"\2\2tu\7\22\2\2uv\5\34\17\2vw\7\r\2\2w\25\3\2\2\2xy\5\62"+
		"\32\2yz\7\23\2\2z{\5.\30\2{|\7\24\2\2|}\7\r\2\2}\27\3\2\2\2~\177\7\3\2"+
		"\2\177\u0080\5\32\16\2\u0080\u0081\7\4\2\2\u0081\31\3\2\2\2\u0082\u0086"+
		"\5\4\3\2\u0083\u0085\5\4\3\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\33\3\2\2\2\u0088\u0086\3\2\2"+
		"\2\u0089\u008a\5 \21\2\u008a\u008b\5\36\20\2\u008b\35\3\2\2\2\u008c\u008d"+
		"\t\2\2\2\u008d\u008f\5 \21\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\37\3\2\2\2\u0092\u0090\3\2\2"+
		"\2\u0093\u0094\5$\23\2\u0094\u0095\5\"\22\2\u0095!\3\2\2\2\u0096\u0097"+
		"\t\3\2\2\u0097\u0099\5$\23\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b#\3\2\2\2\u009c\u009a\3\2\2\2"+
		"\u009d\u009e\5(\25\2\u009e\u009f\5&\24\2\u009f%\3\2\2\2\u00a0\u00a1\t"+
		"\4\2\2\u00a1\u00a3\5(\25\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\'\3\2\2\2\u00a6\u00a4\3\2\2\2"+
		"\u00a7\u00a8\5\62\32\2\u00a8\u00a9\5*\26\2\u00a9)\3\2\2\2\u00aa\u00ab"+
		"\7\25\2\2\u00ab\u00ac\5\34\17\2\u00ac\u00ad\7\26\2\2\u00ad\u00af\3\2\2"+
		"\2\u00ae\u00aa\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1+\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\"\2\2\u00b4"+
		"\u00b5\7\23\2\2\u00b5\u00b6\5.\30\2\u00b6\u00b7\7\24\2\2\u00b7-\3\2\2"+
		"\2\u00b8\u00b9\5\34\17\2\u00b9\u00ba\5\60\31\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd/\3\2\2\2"+
		"\u00be\u00bf\7\21\2\2\u00bf\u00c1\5\34\17\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\61\3\2\2"+
		"\2\u00c4\u00c2\3\2\2\2\u00c5\u00d5\7!\2\2\u00c6\u00d5\7#\2\2\u00c7\u00d5"+
		"\7\"\2\2\u00c8\u00d5\7$\2\2\u00c9\u00ca\7\23\2\2\u00ca\u00cb\5\34\17\2"+
		"\u00cb\u00cc\7\24\2\2\u00cc\u00d5\3\2\2\2\u00cd\u00d5\5\64\33\2\u00ce"+
		"\u00cf\7\17\2\2\u00cf\u00d0\7\23\2\2\u00d0\u00d1\5\34\17\2\u00d1\u00d2"+
		"\7\24\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d5\5,\27\2\u00d4\u00c5\3\2\2\2"+
		"\u00d4\u00c6\3\2\2\2\u00d4\u00c7\3\2\2\2\u00d4\u00c8\3\2\2\2\u00d4\u00c9"+
		"\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5"+
		"\63\3\2\2\2\u00d6\u00d7\7\25\2\2\u00d7\u00d8\5.\30\2\u00d8\u00d9\7\26"+
		"\2\2\u00d9\65\3\2\2\2\16:FSY\u0086\u0090\u009a\u00a4\u00b0\u00bc\u00c2"+
		"\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}