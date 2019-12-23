// Generated from sj.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		OR=10, AND=11, EQ=12, NEQ=13, GT=14, LT=15, GTEQ=16, LTEQ=17, PLUS=18, 
		MINUS=19, MULT=20, DIV=21, MOD=22, POW=23, NOT=24, SCOL=25, ASSIGN=26, 
		OPAR=27, CPAR=28, OBRACE=29, CBRACE=30, TRUE=31, FALSE=32, NIL=33, IF=34, 
		ELSE=35, WHILE=36, PRINT=37, PROGRAM=38, DEC=39, BEGIN=40, END=41, IMPORT=42, 
		IMPORTLANG=43, IMPORTIO=44, SJCLASS=45, PROTECTED=46, PUBLIC=47, INTEGER=48, 
		DOUBLE=49, STRING=50, INT_SJ=51, FLOAT_SJ=52, STRING_SJ=53, CONST=54, 
		ID=55, INT=56, FLOAT=57, TEXT=58, COMMENT=59, SPACE=60, OTHER=61;
	public static final int
		RULE_program = 0, RULE_libraries = 1, RULE_main_sj = 2, RULE_block = 3, 
		RULE_bibname = 4, RULE_klass = 5, RULE_varDec = 6, RULE_variables = 7, 
		RULE_type = 8, RULE_modifier = 9, RULE_statement = 10, RULE_assignment = 11, 
		RULE_if_statement = 12, RULE_els = 13, RULE_condition_block = 14, RULE_statement_block = 15, 
		RULE_output = 16, RULE_content = 17, RULE_varText = 18, RULE_input = 19, 
		RULE_format = 20, RULE_expr = 21, RULE_t = 22, RULE_op1 = 23, RULE_op2 = 24, 
		RULE_op3 = 25, RULE_op4 = 26, RULE_endExpr = 27, RULE_terminal = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "libraries", "main_sj", "block", "bibname", "klass", "varDec", 
			"variables", "type", "modifier", "statement", "assignment", "if_statement", 
			"els", "condition_block", "statement_block", "output", "content", "varText", 
			"input", "format", "expr", "t", "op1", "op2", "op3", "op4", "endExpr", 
			"terminal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main_SJ'", "','", "'Si'", "'Sinon'", "'Alors'", "'Out_SJ'", "'In_SJ'", 
			"'\"'", "'\",'", "'||'", "'&&'", "'='", "'!='", "'>'", "'<'", "'>='", 
			"'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "';'", "':='", 
			"'('", "')'", "'{'", "'}'", "'true'", "'false'", "'nil'", "'if'", "'else'", 
			"'while'", "'print'", "'program'", "'declare'", "'begin'", "'end'", "'import'", 
			"'small_java.lang'", "'small_java.io'", "'class_SJ'", "'protected'", 
			"'public'", "'int_sj'", "'float_sj'", "'string_sj'", "'%d'", "'%f'", 
			"'%s'", "'constant'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "OR", "AND", 
			"EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", 
			"MOD", "POW", "NOT", "SCOL", "ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", 
			"TRUE", "FALSE", "NIL", "IF", "ELSE", "WHILE", "PRINT", "PROGRAM", "DEC", 
			"BEGIN", "END", "IMPORT", "IMPORTLANG", "IMPORTIO", "SJCLASS", "PROTECTED", 
			"PUBLIC", "INTEGER", "DOUBLE", "STRING", "INT_SJ", "FLOAT_SJ", "STRING_SJ", 
			"CONST", "ID", "INT", "FLOAT", "TEXT", "COMMENT", "SPACE", "OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "sj.g4"; }

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
		public KlassContext klass() {
			return getRuleContext(KlassContext.class,0);
		}
		public TerminalNode OBRACE() { return getToken(sjParser.OBRACE, 0); }
		public Main_sjContext main_sj() {
			return getRuleContext(Main_sjContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(sjParser.CBRACE, 0); }
		public TerminalNode EOF() { return getToken(sjParser.EOF, 0); }
		public List<LibrariesContext> libraries() {
			return getRuleContexts(LibrariesContext.class);
		}
		public LibrariesContext libraries(int i) {
			return getRuleContext(LibrariesContext.class,i);
		}
		public List<VarDecContext> varDec() {
			return getRuleContexts(VarDecContext.class);
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
				setState(58);
				libraries();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			klass();
			setState(65);
			match(OBRACE);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << OTHER))) != 0)) {
				{
				{
				setState(66);
				varDec();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			main_sj();
			setState(73);
			match(CBRACE);
			setState(74);
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

	public static class LibrariesContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(sjParser.IMPORT, 0); }
		public BibnameContext bibname() {
			return getRuleContext(BibnameContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(sjParser.SCOL, 0); }
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
			setState(76);
			match(IMPORT);
			setState(77);
			bibname();
			setState(78);
			match(SCOL);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(sjParser.CBRACE, 0); }
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
			setState(80);
			match(T__0);
			setState(81);
			match(OBRACE);
			setState(82);
			block();
			setState(83);
			match(CBRACE);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << ID) | (1L << OTHER))) != 0)) {
				{
				{
				setState(85);
				statement();
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

	public static class KlassContext extends ParserRuleContext {
		public TerminalNode SJCLASS() { return getToken(sjParser.SJCLASS, 0); }
		public TerminalNode ID() { return getToken(sjParser.ID, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
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
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SJCLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(SJCLASS);
				setState(94);
				match(ID);
				}
				break;
			case PROTECTED:
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				modifier();
				setState(96);
				match(SJCLASS);
				setState(97);
				match(ID);
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

	public static class VarDecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(sjParser.SCOL, 0); }
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
			setState(101);
			type();
			setState(102);
			variables();
			setState(103);
			match(SCOL);
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
		public TerminalNode ID() { return getToken(sjParser.ID, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
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
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(ID);
				setState(107);
				match(T__1);
				setState(108);
				variables();
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
		public TerminalNode DOUBLE() { return getToken(sjParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(sjParser.STRING, 0); }
		public TerminalNode OTHER() { return getToken(sjParser.OTHER, 0); }
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
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(INTEGER);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(DOUBLE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(STRING);
				}
				break;
			case OTHER:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				((TypeContext)_localctx).OTHER = match(OTHER);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==PROTECTED || _la==PUBLIC) ) {
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

	public static class StatementContext extends ParserRuleContext {
		public Token OTHER;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode OTHER() { return getToken(sjParser.OTHER, 0); }
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
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				assignment();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				if_statement();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				output();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				input();
				}
				break;
			case OTHER:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				((StatementContext)_localctx).OTHER = match(OTHER);
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
		public TerminalNode ID() { return getToken(sjParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(sjParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(sjParser.SCOL, 0); }
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
			setState(128);
			match(ID);
			setState(129);
			match(ASSIGN);
			setState(130);
			expr(0);
			setState(131);
			match(SCOL);
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
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public List<ElsContext> els() {
			return getRuleContexts(ElsContext.class);
		}
		public ElsContext els(int i) {
			return getRuleContext(ElsContext.class,i);
		}
		public List<Statement_blockContext> statement_block() {
			return getRuleContexts(Statement_blockContext.class);
		}
		public Statement_blockContext statement_block(int i) {
			return getRuleContext(Statement_blockContext.class,i);
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
			setState(133);
			match(T__2);
			setState(134);
			condition_block();
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					els();
					setState(136);
					statement_block();
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(143);
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

	public static class Condition_blockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
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
			setState(145);
			expr(0);
			setState(146);
			match(T__4);
			setState(147);
			statement_block();
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(sjParser.CBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		enterRule(_localctx, 30, RULE_statement_block);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(OBRACE);
				setState(150);
				block();
				setState(151);
				match(CBRACE);
				}
				break;
			case T__2:
			case T__5:
			case T__6:
			case ID:
			case OTHER:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				statement();
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
		public TerminalNode OPAR() { return getToken(sjParser.OPAR, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(sjParser.CPAR, 0); }
		public TerminalNode SCOL() { return getToken(sjParser.SCOL, 0); }
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
		enterRule(_localctx, 32, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__5);
			setState(157);
			match(OPAR);
			setState(158);
			content();
			setState(159);
			match(CPAR);
			setState(160);
			match(SCOL);
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
		enterRule(_localctx, 34, RULE_content);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(TEXT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				varText();
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
		enterRule(_localctx, 36, RULE_varText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(TEXT);
			setState(167);
			match(T__1);
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168);
				match(ID);
				}
				}
				setState(171); 
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
		public List<TerminalNode> OPAR() { return getTokens(sjParser.OPAR); }
		public TerminalNode OPAR(int i) {
			return getToken(sjParser.OPAR, i);
		}
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public TerminalNode ID() { return getToken(sjParser.ID, 0); }
		public TerminalNode SCOL() { return getToken(sjParser.SCOL, 0); }
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
		enterRule(_localctx, 38, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__6);
			setState(174);
			match(OPAR);
			setState(175);
			match(T__7);
			setState(176);
			format();
			setState(177);
			match(T__8);
			setState(178);
			match(ID);
			setState(179);
			match(OPAR);
			setState(180);
			match(SCOL);
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
		enterRule(_localctx, 40, RULE_format);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_SJ) | (1L << FLOAT_SJ) | (1L << STRING_SJ))) != 0)) ) {
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(185);
			t(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(187);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(188);
					op1();
					setState(189);
					t(0);
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public EndExprContext endExpr() {
			return getRuleContext(EndExprContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public Op2Context op2() {
			return getRuleContext(Op2Context.class,0);
		}
		public Op3Context op3() {
			return getRuleContext(Op3Context.class,0);
		}
		public Op4Context op4() {
			return getRuleContext(Op4Context.class,0);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_t, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(197);
			endExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new TContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_t);
						setState(199);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(200);
						op2();
						setState(201);
						endExpr();
						}
						break;
					case 2:
						{
						_localctx = new TContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_t);
						setState(203);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(204);
						op3();
						setState(205);
						endExpr();
						}
						break;
					case 3:
						{
						_localctx = new TContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_t);
						setState(207);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(208);
						op4();
						setState(209);
						endExpr();
						}
						break;
					}
					} 
				}
				setState(215);
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
		enterRule(_localctx, 46, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class Op2Context extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(sjParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(sjParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(sjParser.MOD, 0); }
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
		enterRule(_localctx, 48, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
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

	public static class Op3Context extends ParserRuleContext {
		public TerminalNode LTEQ() { return getToken(sjParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(sjParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(sjParser.LT, 0); }
		public TerminalNode GT() { return getToken(sjParser.GT, 0); }
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitOp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitOp3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_op3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
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

	public static class Op4Context extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(sjParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(sjParser.NEQ, 0); }
		public Op4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).enterOp4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sjListener ) ((sjListener)listener).exitOp4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sjVisitor ) return ((sjVisitor<? extends T>)visitor).visitOp4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op4Context op4() throws RecognitionException {
		Op4Context _localctx = new Op4Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_op4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !(_la==EQ || _la==NEQ) ) {
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

	public static class EndExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(sjParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(sjParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(sjParser.CPAR, 0); }
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
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(OPAR);
				setState(226);
				expr(0);
				setState(227);
				match(CPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				terminal();
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
		public TerminalNode INT() { return getToken(sjParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(sjParser.FLOAT, 0); }
		public TerminalNode TEXT() { return getToken(sjParser.TEXT, 0); }
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 22:
			return t_sempred((TContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean t_sempred(TContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u00ed\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7f\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tp\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\5\nw\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0081"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u008d\n\16\f\16"+
		"\16\16\u0090\13\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u009d\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u00a7"+
		"\n\23\3\24\3\24\3\24\6\24\u00ac\n\24\r\24\16\24\u00ad\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\7\27\u00c2\n\27\f\27\16\27\u00c5\13\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00d6\n\30\f\30"+
		"\16\30\u00d9\13\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\5\35\u00e9\n\35\3\36\3\36\3\36\2\4,.\37\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\n\3\2-.\3\2\60\61"+
		"\3\2\65\67\3\2\24\25\3\2\26\30\3\2\20\23\3\2\16\17\3\29<\2\u00e5\2?\3"+
		"\2\2\2\4N\3\2\2\2\6R\3\2\2\2\bZ\3\2\2\2\n]\3\2\2\2\fe\3\2\2\2\16g\3\2"+
		"\2\2\20o\3\2\2\2\22v\3\2\2\2\24x\3\2\2\2\26\u0080\3\2\2\2\30\u0082\3\2"+
		"\2\2\32\u0087\3\2\2\2\34\u0091\3\2\2\2\36\u0093\3\2\2\2 \u009c\3\2\2\2"+
		"\"\u009e\3\2\2\2$\u00a6\3\2\2\2&\u00a8\3\2\2\2(\u00af\3\2\2\2*\u00b8\3"+
		"\2\2\2,\u00ba\3\2\2\2.\u00c6\3\2\2\2\60\u00da\3\2\2\2\62\u00dc\3\2\2\2"+
		"\64\u00de\3\2\2\2\66\u00e0\3\2\2\28\u00e8\3\2\2\2:\u00ea\3\2\2\2<>\5\4"+
		"\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\5\f"+
		"\7\2CG\7\37\2\2DF\5\16\b\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3"+
		"\2\2\2IG\3\2\2\2JK\5\6\4\2KL\7 \2\2LM\7\2\2\3M\3\3\2\2\2NO\7,\2\2OP\5"+
		"\n\6\2PQ\7\33\2\2Q\5\3\2\2\2RS\7\3\2\2ST\7\37\2\2TU\5\b\5\2UV\7 \2\2V"+
		"\7\3\2\2\2WY\5\26\f\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\t\3\2"+
		"\2\2\\Z\3\2\2\2]^\t\2\2\2^\13\3\2\2\2_`\7/\2\2`f\79\2\2ab\5\24\13\2bc"+
		"\7/\2\2cd\79\2\2df\3\2\2\2e_\3\2\2\2ea\3\2\2\2f\r\3\2\2\2gh\5\22\n\2h"+
		"i\5\20\t\2ij\7\33\2\2j\17\3\2\2\2kp\79\2\2lm\79\2\2mn\7\4\2\2np\5\20\t"+
		"\2ok\3\2\2\2ol\3\2\2\2p\21\3\2\2\2qw\7\62\2\2rw\7\63\2\2sw\7\64\2\2tu"+
		"\7?\2\2uw\b\n\1\2vq\3\2\2\2vr\3\2\2\2vs\3\2\2\2vt\3\2\2\2w\23\3\2\2\2"+
		"xy\t\3\2\2y\25\3\2\2\2z\u0081\5\30\r\2{\u0081\5\32\16\2|\u0081\5\"\22"+
		"\2}\u0081\5(\25\2~\177\7?\2\2\177\u0081\b\f\1\2\u0080z\3\2\2\2\u0080{"+
		"\3\2\2\2\u0080|\3\2\2\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0081\27\3\2\2\2"+
		"\u0082\u0083\79\2\2\u0083\u0084\7\34\2\2\u0084\u0085\5,\27\2\u0085\u0086"+
		"\7\33\2\2\u0086\31\3\2\2\2\u0087\u0088\7\5\2\2\u0088\u008e\5\36\20\2\u0089"+
		"\u008a\5\34\17\2\u008a\u008b\5 \21\2\u008b\u008d\3\2\2\2\u008c\u0089\3"+
		"\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\33\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\6\2\2\u0092\35\3\2\2\2\u0093"+
		"\u0094\5,\27\2\u0094\u0095\7\7\2\2\u0095\u0096\5 \21\2\u0096\37\3\2\2"+
		"\2\u0097\u0098\7\37\2\2\u0098\u0099\5\b\5\2\u0099\u009a\7 \2\2\u009a\u009d"+
		"\3\2\2\2\u009b\u009d\5\26\f\2\u009c\u0097\3\2\2\2\u009c\u009b\3\2\2\2"+
		"\u009d!\3\2\2\2\u009e\u009f\7\b\2\2\u009f\u00a0\7\35\2\2\u00a0\u00a1\5"+
		"$\23\2\u00a1\u00a2\7\36\2\2\u00a2\u00a3\7\33\2\2\u00a3#\3\2\2\2\u00a4"+
		"\u00a7\7<\2\2\u00a5\u00a7\5&\24\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2"+
		"\2\2\u00a7%\3\2\2\2\u00a8\u00a9\7<\2\2\u00a9\u00ab\7\4\2\2\u00aa\u00ac"+
		"\79\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\'\3\2\2\2\u00af\u00b0\7\t\2\2\u00b0\u00b1\7\35\2"+
		"\2\u00b1\u00b2\7\n\2\2\u00b2\u00b3\5*\26\2\u00b3\u00b4\7\13\2\2\u00b4"+
		"\u00b5\79\2\2\u00b5\u00b6\7\35\2\2\u00b6\u00b7\7\33\2\2\u00b7)\3\2\2\2"+
		"\u00b8\u00b9\t\4\2\2\u00b9+\3\2\2\2\u00ba\u00bb\b\27\1\2\u00bb\u00bc\5"+
		".\30\2\u00bc\u00c3\3\2\2\2\u00bd\u00be\f\4\2\2\u00be\u00bf\5\60\31\2\u00bf"+
		"\u00c0\5.\30\2\u00c0\u00c2\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c2\u00c5\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4-\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c6\u00c7\b\30\1\2\u00c7\u00c8\58\35\2\u00c8\u00d7\3\2\2\2"+
		"\u00c9\u00ca\f\6\2\2\u00ca\u00cb\5\62\32\2\u00cb\u00cc\58\35\2\u00cc\u00d6"+
		"\3\2\2\2\u00cd\u00ce\f\5\2\2\u00ce\u00cf\5\64\33\2\u00cf\u00d0\58\35\2"+
		"\u00d0\u00d6\3\2\2\2\u00d1\u00d2\f\4\2\2\u00d2\u00d3\5\66\34\2\u00d3\u00d4"+
		"\58\35\2\u00d4\u00d6\3\2\2\2\u00d5\u00c9\3\2\2\2\u00d5\u00cd\3\2\2\2\u00d5"+
		"\u00d1\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8/\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\t\5\2\2\u00db\61\3"+
		"\2\2\2\u00dc\u00dd\t\6\2\2\u00dd\63\3\2\2\2\u00de\u00df\t\7\2\2\u00df"+
		"\65\3\2\2\2\u00e0\u00e1\t\b\2\2\u00e1\67\3\2\2\2\u00e2\u00e9\79\2\2\u00e3"+
		"\u00e4\7\35\2\2\u00e4\u00e5\5,\27\2\u00e5\u00e6\7\36\2\2\u00e6\u00e9\3"+
		"\2\2\2\u00e7\u00e9\5:\36\2\u00e8\u00e2\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e99\3\2\2\2\u00ea\u00eb\t\t\2\2\u00eb;\3\2\2\2\21?G"+
		"Zeov\u0080\u008e\u009c\u00a6\u00ad\u00c3\u00d5\u00d7\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}