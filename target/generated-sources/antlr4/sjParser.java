// Generated from sj.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sjParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, OR=5, AND=6, EQ=7, NEQ=8, GT=9, LT=10, 
		GTEQ=11, LTEQ=12, PLUS=13, MINUS=14, MULT=15, DIV=16, MOD=17, POW=18, 
		NOT=19, SCOL=20, ASSIGN=21, OPAR=22, CPAR=23, OBRACE=24, CBRACE=25, IF=26, 
		ELSE=27, IMPORT=28, IMPORTLANG=29, IMPORTIO=30, SJCLASS=31, SJMAIN=32, 
		INSJ=33, OUTSJ=34, PROTECTED=35, PUBLIC=36, INTEGER=37, DOUBLE=38, STRING=39, 
		INT_SJ=40, FLOAT_SJ=41, STRING_SJ=42, ID=43, INT=44, FLOAT=45, TEXT=46, 
		COMMENT=47, SPACE=48, OTHER=49;
	public static final String[] tokenNames = {
		"<INVALID>", "'Alors'", "'\"'", "'\",'", "','", "'|'", "'&'", "'='", "'!='", 
		"'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", 
		"'!'", "';'", "':='", "'('", "')'", "'{'", "'}'", "'Si'", "'Sinon'", "'import'", 
		"'small_java.lang'", "'small_java.io'", "'class_SJ'", "'main_SJ'", "'In_SJ'", 
		"'Out_SJ'", "'protected'", "'public'", "'int_sj'", "'float_sj'", "'string_sj'", 
		"'%d'", "'%f'", "'%s'", "ID", "INT", "FLOAT", "TEXT", "COMMENT", "SPACE", 
		"OTHER"
	};
	public static final int
		RULE_program = 0, RULE_libraries = 1, RULE_main_sj = 2, RULE_block = 3, 
		RULE_bibname = 4, RULE_klass = 5, RULE_varDec = 6, RULE_variables = 7, 
		RULE_type = 8, RULE_modifier = 9, RULE_statement = 10, RULE_assignment = 11, 
		RULE_if_statement = 12, RULE_els = 13, RULE_condition_block = 14, RULE_comparaison = 15, 
		RULE_operator = 16, RULE_statement_block = 17, RULE_output = 18, RULE_content = 19, 
		RULE_varText = 20, RULE_input = 21, RULE_format = 22, RULE_expr = 23, 
		RULE_t = 24, RULE_op1 = 25, RULE_op2 = 26, RULE_endExpr = 27, RULE_terminal = 28;
	public static final String[] ruleNames = {
		"program", "libraries", "main_sj", "block", "bibname", "klass", "varDec", 
		"variables", "type", "modifier", "statement", "assignment", "if_statement", 
		"els", "condition_block", "comparaison", "operator", "statement_block", 
		"output", "content", "varText", "input", "format", "expr", "t", "op1", 
		"op2", "endExpr", "terminal"
	};

	@Override
	public String getGrammarFileName() { return "sj.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sjParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(sjParser.OBRACE, 0); }
		public Main_sjContext main_sj() {
			return getRuleContext(Main_sjContext.class,0);
		}
		public KlassContext klass() {
			return getRuleContext(KlassContext.class,0);
		}
		public List<VarDecContext> varDec() {
			return getRuleContexts(VarDecContext.class);
		}
		public List<LibrariesContext> libraries() {
			return getRuleContexts(LibrariesContext.class);
		}
		public TerminalNode CBRACE() { return getToken(sjParser.CBRACE, 0); }
		public TerminalNode EOF() { return getToken(sjParser.EOF, 0); }
		public LibrariesContext libraries(int i) {
			return getRuleContext(LibrariesContext.class,i);
		}
		public VarDecContext varDec(int i) {
			return getRuleContext(VarDecContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(58); libraries();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64); klass();
			setState(65); match(OBRACE);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << OTHER))) != 0)) {
				{
				{
				setState(66); varDec();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72); main_sj();
			setState(73); match(CBRACE);
			setState(74); match(EOF);
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

	public static class LibrariesContext extends ParserRuleContext {
		public TerminalNode SCOL() { return getToken(sjParser.SCOL, 0); }
		public BibnameContext bibname() {
			return getRuleContext(BibnameContext.class,0);
		}
		public TerminalNode IMPORT() { return getToken(sjParser.IMPORT, 0); }
		public LibrariesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterLibraries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitLibraries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitLibraries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibrariesContext libraries() throws RecognitionException {
		LibrariesContext _localctx = new LibrariesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_libraries);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(IMPORT);
			setState(77); bibname();
			setState(78); match(SCOL);
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

	public static class Main_sjContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(sjParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(sjParser.CBRACE, 0); }
		public TerminalNode SJMAIN() { return getToken(sjParser.SJMAIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Main_sjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_sj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterMain_sj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitMain_sj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitMain_sj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_sjContext main_sj() throws RecognitionException {
		Main_sjContext _localctx = new Main_sjContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_sj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(SJMAIN);
			setState(81); match(OBRACE);
			setState(82); block();
			setState(83); match(CBRACE);
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

	public static class BlockContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << INSJ) | (1L << OUTSJ) | (1L << ID) | (1L << OTHER))) != 0)) {
				{
				{
				setState(85); statement();
				}
				}
				setState(90);
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

	public static class BibnameContext extends ParserRuleContext {
		public TerminalNode IMPORTLANG() { return getToken(sjParser.IMPORTLANG, 0); }
		public TerminalNode IMPORTIO() { return getToken(sjParser.IMPORTIO, 0); }
		public BibnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bibname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterBibname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitBibname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitBibname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BibnameContext bibname() throws RecognitionException {
		BibnameContext _localctx = new BibnameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bibname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==IMPORTLANG || _la==IMPORTIO) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class KlassContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(sjParser.ID, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode SJCLASS() { return getToken(sjParser.SJCLASS, 0); }
		public KlassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_klass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterKlass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitKlass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitKlass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KlassContext klass() throws RecognitionException {
		KlassContext _localctx = new KlassContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_klass);
		try {
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93); match(SJCLASS);
				setState(94); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95); modifier();
				setState(96); match(SJCLASS);
				setState(97); match(ID);
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

	public static class VarDecContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(sjParser.SCOL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); type();
			setState(102); variables();
			setState(103); match(SCOL);
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

	public static class VariablesContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode ID() { return getToken(sjParser.ID, 0); }
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variables);
		try {
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); match(ID);
				setState(107); match(T__0);
				setState(108); variables();
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

	public static class TypeContext extends ParserRuleContext {
		public Token OTHER;
		public TerminalNode INTEGER() { return getToken(sjParser.INTEGER, 0); }
		public TerminalNode OTHER() { return getToken(sjParser.OTHER, 0); }
		public TerminalNode STRING() { return getToken(sjParser.STRING, 0); }
		public TerminalNode DOUBLE() { return getToken(sjParser.DOUBLE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(116);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(111); match(INTEGER);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(112); match(DOUBLE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(113); match(STRING);
				}
				break;
			case OTHER:
				enterOuterAlt(_localctx, 4);
				{
				setState(114); ((TypeContext)_localctx).OTHER = match(OTHER);
				System.err.println("Unknown type : " + (((TypeContext)_localctx).OTHER!=null?((TypeContext)_localctx).OTHER.getText():null));
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

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode PROTECTED() { return getToken(sjParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(sjParser.PUBLIC, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_modifier);
		try {
			setState(121);
			switch (_input.LA(1)) {
			case PROTECTED:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); match(PROTECTED);
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); match(PUBLIC);
				}
				break;
			case SJCLASS:
				enterOuterAlt(_localctx, 3);
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

	public static class StatementContext extends ParserRuleContext {
		public Token OTHER;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode OTHER() { return getToken(sjParser.OTHER, 0); }
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(129);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(123); assignment();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); if_statement();
				}
				break;
			case OUTSJ:
				enterOuterAlt(_localctx, 3);
				{
				setState(125); output();
				}
				break;
			case INSJ:
				enterOuterAlt(_localctx, 4);
				{
				setState(126); input();
				}
				break;
			case OTHER:
				enterOuterAlt(_localctx, 5);
				{
				setState(127); ((StatementContext)_localctx).OTHER = match(OTHER);
				System.err.println("Unknown statement : " + (((StatementContext)_localctx).OTHER!=null?((StatementContext)_localctx).OTHER.getText():null));
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode SCOL() { return getToken(sjParser.SCOL, 0); }
		public TerminalNode ID() { return getToken(sjParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(sjParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); match(ID);
			setState(132); match(ASSIGN);
			setState(133); expr(0);
			setState(134); match(SCOL);
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

	public static class If_statementContext extends ParserRuleContext {
		public ElsContext els(int i) {
			return getRuleContext(ElsContext.class,i);
		}
		public TerminalNode IF() { return getToken(sjParser.IF, 0); }
		public Statement_blockContext statement_block(int i) {
			return getRuleContext(Statement_blockContext.class,i);
		}
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public List<ElsContext> els() {
			return getRuleContexts(ElsContext.class);
		}
		public List<Statement_blockContext> statement_block() {
			return getRuleContexts(Statement_blockContext.class);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(IF);
			setState(137); condition_block();
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(138); els();
					setState(139); statement_block();
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ElsContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(sjParser.ELSE, 0); }
		public ElsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_els; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterEls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitEls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitEls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsContext els() throws RecognitionException {
		ElsContext _localctx = new ElsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_els);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(ELSE);
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

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode CPAR() { return getToken(sjParser.CPAR, 0); }
		public ComparaisonContext comparaison() {
			return getRuleContext(ComparaisonContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(sjParser.OPAR, 0); }
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(OPAR);
			setState(149); comparaison();
			setState(150); match(CPAR);
			setState(151); match(T__3);
			setState(152); statement_block();
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

	public static class ComparaisonContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ComparaisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparaison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterComparaison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitComparaison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitComparaison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparaisonContext comparaison() throws RecognitionException {
		ComparaisonContext _localctx = new ComparaisonContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparaison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); expr(0);
			setState(155); operator();
			setState(156); expr(0);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(sjParser.NOT, 0); }
		public TerminalNode NEQ() { return getToken(sjParser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(sjParser.LTEQ, 0); }
		public TerminalNode LT() { return getToken(sjParser.LT, 0); }
		public TerminalNode GT() { return getToken(sjParser.GT, 0); }
		public TerminalNode AND() { return getToken(sjParser.AND, 0); }
		public TerminalNode EQ() { return getToken(sjParser.EQ, 0); }
		public TerminalNode OR() { return getToken(sjParser.OR, 0); }
		public TerminalNode GTEQ() { return getToken(sjParser.GTEQ, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Statement_blockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(sjParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(sjParser.CBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterStatement_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitStatement_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitStatement_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement_block);
		try {
			setState(165);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(160); match(OBRACE);
				setState(161); block();
				setState(162); match(CBRACE);
				}
				break;
			case IF:
			case INSJ:
			case OUTSJ:
			case ID:
			case OTHER:
				enterOuterAlt(_localctx, 2);
				{
				setState(164); statement();
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

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode SCOL() { return getToken(sjParser.SCOL, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(sjParser.CPAR, 0); }
		public TerminalNode OUTSJ() { return getToken(sjParser.OUTSJ, 0); }
		public TerminalNode OPAR() { return getToken(sjParser.OPAR, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(OUTSJ);
			setState(168); match(OPAR);
			setState(169); content();
			setState(170); match(CPAR);
			setState(171); match(SCOL);
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

	public static class ContentContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(sjParser.TEXT, 0); }
		public VarTextContext varText() {
			return getRuleContext(VarTextContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_content);
		try {
			setState(175);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173); match(TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174); varText();
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

	public static class VarTextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(sjParser.TEXT, 0); }
		public List<TerminalNode> ID() { return getTokens(sjParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sjParser.ID, i);
		}
		public VarTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterVarText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitVarText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitVarText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTextContext varText() throws RecognitionException {
		VarTextContext _localctx = new VarTextContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_varText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); match(TEXT);
			setState(178); match(T__0);
			setState(180); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(179); match(ID);
				}
				}
				setState(182); 
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode SCOL() { return getToken(sjParser.SCOL, 0); }
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public TerminalNode ID() { return getToken(sjParser.ID, 0); }
		public TerminalNode OPAR(int i) {
			return getToken(sjParser.OPAR, i);
		}
		public TerminalNode INSJ() { return getToken(sjParser.INSJ, 0); }
		public List<TerminalNode> OPAR() { return getTokens(sjParser.OPAR); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); match(INSJ);
			setState(185); match(OPAR);
			setState(186); match(T__2);
			setState(187); format();
			setState(188); match(T__1);
			setState(189); match(ID);
			setState(190); match(OPAR);
			setState(191); match(SCOL);
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

	public static class FormatContext extends ParserRuleContext {
		public TerminalNode INT_SJ() { return getToken(sjParser.INT_SJ, 0); }
		public TerminalNode FLOAT_SJ() { return getToken(sjParser.FLOAT_SJ, 0); }
		public TerminalNode STRING_SJ() { return getToken(sjParser.STRING_SJ, 0); }
		public FormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormatContext format() throws RecognitionException {
		FormatContext _localctx = new FormatContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_format);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_SJ) | (1L << FLOAT_SJ) | (1L << STRING_SJ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ExprContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Op1Context op1() {
			return getRuleContext(Op1Context.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(196); t(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(198);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(199); op1();
					setState(200); t(0);
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public EndExprContext endExpr() {
			return getRuleContext(EndExprContext.class,0);
		}
		public Op2Context op2() {
			return getRuleContext(Op2Context.class,0);
		}
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		return t(0);
	}

	private TContext t(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TContext _localctx = new TContext(_ctx, _parentState);
		TContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_t, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(208); endExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_t);
					setState(210);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(211); op2();
					setState(212); endExpr();
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Op1Context extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(sjParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(sjParser.MINUS, 0); }
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitOp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitOp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Op2Context extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(sjParser.MULT, 0); }
		public TerminalNode MOD() { return getToken(sjParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(sjParser.DIV, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitOp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class EndExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(sjParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public EndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterEndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitEndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitEndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndExprContext endExpr() throws RecognitionException {
		EndExprContext _localctx = new EndExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_endExpr);
		try {
			setState(230);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224); match(OPAR);
				setState(225); expr(0);
				setState(226); match(CPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228); terminal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class TerminalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(sjParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(sjParser.TEXT, 0); }
		public TerminalNode INT() { return getToken(sjParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(sjParser.FLOAT, 0); }
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_terminal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << TEXT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23: return expr_sempred((ExprContext)_localctx, predIndex);
		case 24: return t_sempred((TContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean t_sempred(TContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u00ed\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7f\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tp\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\5\nw\n\n\3\13\3\13\3\13\5\13|\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u0084\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7"+
		"\16\u0090\n\16\f\16\16\16\u0093\13\16\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00a8"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u00b2\n\25\3\26\3\26"+
		"\3\26\6\26\u00b7\n\26\r\26\16\26\u00b8\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u00cd"+
		"\n\31\f\31\16\31\u00d0\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u00d9"+
		"\n\32\f\32\16\32\u00dc\13\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\5\35\u00e9\n\35\3\36\3\36\3\36\2\4\60\62\37\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\b\3\2\37 \4\2\7\16"+
		"\25\25\3\2*,\3\2\17\20\3\2\21\23\3\2-\60\u00e6\2?\3\2\2\2\4N\3\2\2\2\6"+
		"R\3\2\2\2\bZ\3\2\2\2\n]\3\2\2\2\fe\3\2\2\2\16g\3\2\2\2\20o\3\2\2\2\22"+
		"v\3\2\2\2\24{\3\2\2\2\26\u0083\3\2\2\2\30\u0085\3\2\2\2\32\u008a\3\2\2"+
		"\2\34\u0094\3\2\2\2\36\u0096\3\2\2\2 \u009c\3\2\2\2\"\u00a0\3\2\2\2$\u00a7"+
		"\3\2\2\2&\u00a9\3\2\2\2(\u00b1\3\2\2\2*\u00b3\3\2\2\2,\u00ba\3\2\2\2."+
		"\u00c3\3\2\2\2\60\u00c5\3\2\2\2\62\u00d1\3\2\2\2\64\u00dd\3\2\2\2\66\u00df"+
		"\3\2\2\28\u00e8\3\2\2\2:\u00ea\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?"+
		"=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\5\f\7\2CG\7\32\2\2DF\5\16\b"+
		"\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\5\6\4"+
		"\2KL\7\33\2\2LM\7\2\2\3M\3\3\2\2\2NO\7\36\2\2OP\5\n\6\2PQ\7\26\2\2Q\5"+
		"\3\2\2\2RS\7\"\2\2ST\7\32\2\2TU\5\b\5\2UV\7\33\2\2V\7\3\2\2\2WY\5\26\f"+
		"\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\t\3\2\2\2\\Z\3\2\2\2]^\t"+
		"\2\2\2^\13\3\2\2\2_`\7!\2\2`f\7-\2\2ab\5\24\13\2bc\7!\2\2cd\7-\2\2df\3"+
		"\2\2\2e_\3\2\2\2ea\3\2\2\2f\r\3\2\2\2gh\5\22\n\2hi\5\20\t\2ij\7\26\2\2"+
		"j\17\3\2\2\2kp\7-\2\2lm\7-\2\2mn\7\6\2\2np\5\20\t\2ok\3\2\2\2ol\3\2\2"+
		"\2p\21\3\2\2\2qw\7\'\2\2rw\7(\2\2sw\7)\2\2tu\7\63\2\2uw\b\n\1\2vq\3\2"+
		"\2\2vr\3\2\2\2vs\3\2\2\2vt\3\2\2\2w\23\3\2\2\2x|\7%\2\2y|\7&\2\2z|\3\2"+
		"\2\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\25\3\2\2\2}\u0084\5\30\r\2~\u0084"+
		"\5\32\16\2\177\u0084\5&\24\2\u0080\u0084\5,\27\2\u0081\u0082\7\63\2\2"+
		"\u0082\u0084\b\f\1\2\u0083}\3\2\2\2\u0083~\3\2\2\2\u0083\177\3\2\2\2\u0083"+
		"\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0084\27\3\2\2\2\u0085\u0086\7-\2\2"+
		"\u0086\u0087\7\27\2\2\u0087\u0088\5\60\31\2\u0088\u0089\7\26\2\2\u0089"+
		"\31\3\2\2\2\u008a\u008b\7\34\2\2\u008b\u0091\5\36\20\2\u008c\u008d\5\34"+
		"\17\2\u008d\u008e\5$\23\2\u008e\u0090\3\2\2\2\u008f\u008c\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\33\3\2\2"+
		"\2\u0093\u0091\3\2\2\2\u0094\u0095\7\35\2\2\u0095\35\3\2\2\2\u0096\u0097"+
		"\7\30\2\2\u0097\u0098\5 \21\2\u0098\u0099\7\31\2\2\u0099\u009a\7\3\2\2"+
		"\u009a\u009b\5$\23\2\u009b\37\3\2\2\2\u009c\u009d\5\60\31\2\u009d\u009e"+
		"\5\"\22\2\u009e\u009f\5\60\31\2\u009f!\3\2\2\2\u00a0\u00a1\t\3\2\2\u00a1"+
		"#\3\2\2\2\u00a2\u00a3\7\32\2\2\u00a3\u00a4\5\b\5\2\u00a4\u00a5\7\33\2"+
		"\2\u00a5\u00a8\3\2\2\2\u00a6\u00a8\5\26\f\2\u00a7\u00a2\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8%\3\2\2\2\u00a9\u00aa\7$\2\2\u00aa\u00ab\7\30\2\2"+
		"\u00ab\u00ac\5(\25\2\u00ac\u00ad\7\31\2\2\u00ad\u00ae\7\26\2\2\u00ae\'"+
		"\3\2\2\2\u00af\u00b2\7\60\2\2\u00b0\u00b2\5*\26\2\u00b1\u00af\3\2\2\2"+
		"\u00b1\u00b0\3\2\2\2\u00b2)\3\2\2\2\u00b3\u00b4\7\60\2\2\u00b4\u00b6\7"+
		"\6\2\2\u00b5\u00b7\7-\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9+\3\2\2\2\u00ba\u00bb\7#\2\2\u00bb"+
		"\u00bc\7\30\2\2\u00bc\u00bd\7\4\2\2\u00bd\u00be\5.\30\2\u00be\u00bf\7"+
		"\5\2\2\u00bf\u00c0\7-\2\2\u00c0\u00c1\7\30\2\2\u00c1\u00c2\7\26\2\2\u00c2"+
		"-\3\2\2\2\u00c3\u00c4\t\4\2\2\u00c4/\3\2\2\2\u00c5\u00c6\b\31\1\2\u00c6"+
		"\u00c7\5\62\32\2\u00c7\u00ce\3\2\2\2\u00c8\u00c9\f\4\2\2\u00c9\u00ca\5"+
		"\64\33\2\u00ca\u00cb\5\62\32\2\u00cb\u00cd\3\2\2\2\u00cc\u00c8\3\2\2\2"+
		"\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\61"+
		"\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\b\32\1\2\u00d2\u00d3\58\35\2"+
		"\u00d3\u00da\3\2\2\2\u00d4\u00d5\f\4\2\2\u00d5\u00d6\5\66\34\2\u00d6\u00d7"+
		"\58\35\2\u00d7\u00d9\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\63\3\2\2\2\u00dc\u00da\3\2\2"+
		"\2\u00dd\u00de\t\5\2\2\u00de\65\3\2\2\2\u00df\u00e0\t\6\2\2\u00e0\67\3"+
		"\2\2\2\u00e1\u00e9\7-\2\2\u00e2\u00e3\7\30\2\2\u00e3\u00e4\5\60\31\2\u00e4"+
		"\u00e5\7\31\2\2\u00e5\u00e9\3\2\2\2\u00e6\u00e9\5:\36\2\u00e7\u00e9\3"+
		"\2\2\2\u00e8\u00e1\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e99\3\2\2\2\u00ea\u00eb\t\7\2\2\u00eb;\3\2\2\2\21?G"+
		"Zeov{\u0083\u0091\u00a7\u00b1\u00b8\u00ce\u00da\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}