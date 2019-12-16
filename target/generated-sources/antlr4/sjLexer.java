// Generated from sj.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sjLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD", "POW", "NOT", "SCOL", "ASSIGN", "OPAR", "CPAR", 
			"OBRACE", "CBRACE", "TRUE", "FALSE", "NIL", "IF", "ELSE", "WHILE", "PRINT", 
			"PROGRAM", "DEC", "BEGIN", "END", "IMPORT", "IMPORTLANG", "IMPORTIO", 
			"SJCLASS", "PROTECTED", "PUBLIC", "INTEGER", "DOUBLE", "STRING", "INT_SJ", 
			"FLOAT_SJ", "STRING_SJ", "CONST", "ID", "INT", "FLOAT", "TEXT", "COMMENT", 
			"SPACE", "OTHER"
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


	public sjLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sj.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u01c6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+"+
		"\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\78\u0183"+
		"\n8\f8\168\u0186\138\39\79\u0189\n9\f9\169\u018c\139\39\69\u018f\n9\r"+
		"9\169\u0190\3:\7:\u0194\n:\f:\16:\u0197\13:\3:\6:\u019a\n:\r:\16:\u019b"+
		"\3:\3:\7:\u01a0\n:\f:\16:\u01a3\13:\3:\3:\6:\u01a7\n:\r:\16:\u01a8\5:"+
		"\u01ab\n:\3;\3;\3;\3;\7;\u01b1\n;\f;\16;\u01b4\13;\3;\3;\3<\3<\7<\u01ba"+
		"\n<\f<\16<\u01bd\13<\3<\3<\3=\3=\3=\3=\3>\3>\2\2?\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?\3\2\t\5"+
		"\2C\\aac|\6\2\62;C\\aac|\4\2--//\3\2\62;\5\2\f\f\17\17$$\4\2\f\f\17\17"+
		"\5\2\13\f\17\17\"\"\2\u01d0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\u0085\3\2\2\2\7\u0087"+
		"\3\2\2\2\t\u008a\3\2\2\2\13\u0090\3\2\2\2\r\u0096\3\2\2\2\17\u009d\3\2"+
		"\2\2\21\u00a3\3\2\2\2\23\u00a5\3\2\2\2\25\u00a8\3\2\2\2\27\u00ab\3\2\2"+
		"\2\31\u00ae\3\2\2\2\33\u00b0\3\2\2\2\35\u00b3\3\2\2\2\37\u00b5\3\2\2\2"+
		"!\u00b7\3\2\2\2#\u00ba\3\2\2\2%\u00bd\3\2\2\2\'\u00bf\3\2\2\2)\u00c1\3"+
		"\2\2\2+\u00c3\3\2\2\2-\u00c5\3\2\2\2/\u00c7\3\2\2\2\61\u00c9\3\2\2\2\63"+
		"\u00cb\3\2\2\2\65\u00cd\3\2\2\2\67\u00d0\3\2\2\29\u00d2\3\2\2\2;\u00d4"+
		"\3\2\2\2=\u00d6\3\2\2\2?\u00d8\3\2\2\2A\u00dd\3\2\2\2C\u00e3\3\2\2\2E"+
		"\u00e7\3\2\2\2G\u00ea\3\2\2\2I\u00ef\3\2\2\2K\u00f5\3\2\2\2M\u00fb\3\2"+
		"\2\2O\u0103\3\2\2\2Q\u010b\3\2\2\2S\u0111\3\2\2\2U\u0115\3\2\2\2W\u011c"+
		"\3\2\2\2Y\u012c\3\2\2\2[\u013a\3\2\2\2]\u0143\3\2\2\2_\u014d\3\2\2\2a"+
		"\u0154\3\2\2\2c\u015b\3\2\2\2e\u0164\3\2\2\2g\u016e\3\2\2\2i\u0171\3\2"+
		"\2\2k\u0174\3\2\2\2m\u0177\3\2\2\2o\u0180\3\2\2\2q\u018a\3\2\2\2s\u01aa"+
		"\3\2\2\2u\u01ac\3\2\2\2w\u01b7\3\2\2\2y\u01c0\3\2\2\2{\u01c4\3\2\2\2}"+
		"~\7o\2\2~\177\7c\2\2\177\u0080\7k\2\2\u0080\u0081\7p\2\2\u0081\u0082\7"+
		"a\2\2\u0082\u0083\7U\2\2\u0083\u0084\7L\2\2\u0084\4\3\2\2\2\u0085\u0086"+
		"\7.\2\2\u0086\6\3\2\2\2\u0087\u0088\7U\2\2\u0088\u0089\7k\2\2\u0089\b"+
		"\3\2\2\2\u008a\u008b\7U\2\2\u008b\u008c\7k\2\2\u008c\u008d\7p\2\2\u008d"+
		"\u008e\7q\2\2\u008e\u008f\7p\2\2\u008f\n\3\2\2\2\u0090\u0091\7C\2\2\u0091"+
		"\u0092\7n\2\2\u0092\u0093\7q\2\2\u0093\u0094\7t\2\2\u0094\u0095\7u\2\2"+
		"\u0095\f\3\2\2\2\u0096\u0097\7Q\2\2\u0097\u0098\7w\2\2\u0098\u0099\7v"+
		"\2\2\u0099\u009a\7a\2\2\u009a\u009b\7U\2\2\u009b\u009c\7L\2\2\u009c\16"+
		"\3\2\2\2\u009d\u009e\7K\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7a\2\2\u00a0"+
		"\u00a1\7U\2\2\u00a1\u00a2\7L\2\2\u00a2\20\3\2\2\2\u00a3\u00a4\7$\2\2\u00a4"+
		"\22\3\2\2\2\u00a5\u00a6\7$\2\2\u00a6\u00a7\7.\2\2\u00a7\24\3\2\2\2\u00a8"+
		"\u00a9\7~\2\2\u00a9\u00aa\7~\2\2\u00aa\26\3\2\2\2\u00ab\u00ac\7(\2\2\u00ac"+
		"\u00ad\7(\2\2\u00ad\30\3\2\2\2\u00ae\u00af\7?\2\2\u00af\32\3\2\2\2\u00b0"+
		"\u00b1\7#\2\2\u00b1\u00b2\7?\2\2\u00b2\34\3\2\2\2\u00b3\u00b4\7@\2\2\u00b4"+
		"\36\3\2\2\2\u00b5\u00b6\7>\2\2\u00b6 \3\2\2\2\u00b7\u00b8\7@\2\2\u00b8"+
		"\u00b9\7?\2\2\u00b9\"\3\2\2\2\u00ba\u00bb\7>\2\2\u00bb\u00bc\7?\2\2\u00bc"+
		"$\3\2\2\2\u00bd\u00be\7-\2\2\u00be&\3\2\2\2\u00bf\u00c0\7/\2\2\u00c0("+
		"\3\2\2\2\u00c1\u00c2\7,\2\2\u00c2*\3\2\2\2\u00c3\u00c4\7\61\2\2\u00c4"+
		",\3\2\2\2\u00c5\u00c6\7\'\2\2\u00c6.\3\2\2\2\u00c7\u00c8\7`\2\2\u00c8"+
		"\60\3\2\2\2\u00c9\u00ca\7#\2\2\u00ca\62\3\2\2\2\u00cb\u00cc\7=\2\2\u00cc"+
		"\64\3\2\2\2\u00cd\u00ce\7<\2\2\u00ce\u00cf\7?\2\2\u00cf\66\3\2\2\2\u00d0"+
		"\u00d1\7*\2\2\u00d18\3\2\2\2\u00d2\u00d3\7+\2\2\u00d3:\3\2\2\2\u00d4\u00d5"+
		"\7}\2\2\u00d5<\3\2\2\2\u00d6\u00d7\7\177\2\2\u00d7>\3\2\2\2\u00d8\u00d9"+
		"\7v\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7g\2\2\u00dc"+
		"@\3\2\2\2\u00dd\u00de\7h\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7n\2\2\u00e0"+
		"\u00e1\7u\2\2\u00e1\u00e2\7g\2\2\u00e2B\3\2\2\2\u00e3\u00e4\7p\2\2\u00e4"+
		"\u00e5\7k\2\2\u00e5\u00e6\7n\2\2\u00e6D\3\2\2\2\u00e7\u00e8\7k\2\2\u00e8"+
		"\u00e9\7h\2\2\u00e9F\3\2\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7n\2\2\u00ec"+
		"\u00ed\7u\2\2\u00ed\u00ee\7g\2\2\u00eeH\3\2\2\2\u00ef\u00f0\7y\2\2\u00f0"+
		"\u00f1\7j\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7g\2\2"+
		"\u00f4J\3\2\2\2\u00f5\u00f6\7r\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7k\2"+
		"\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7v\2\2\u00faL\3\2\2\2\u00fb\u00fc\7"+
		"r\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7i\2\2\u00ff\u0100"+
		"\7t\2\2\u0100\u0101\7c\2\2\u0101\u0102\7o\2\2\u0102N\3\2\2\2\u0103\u0104"+
		"\7f\2\2\u0104\u0105\7g\2\2\u0105\u0106\7e\2\2\u0106\u0107\7n\2\2\u0107"+
		"\u0108\7c\2\2\u0108\u0109\7t\2\2\u0109\u010a\7g\2\2\u010aP\3\2\2\2\u010b"+
		"\u010c\7d\2\2\u010c\u010d\7g\2\2\u010d\u010e\7i\2\2\u010e\u010f\7k\2\2"+
		"\u010f\u0110\7p\2\2\u0110R\3\2\2\2\u0111\u0112\7g\2\2\u0112\u0113\7p\2"+
		"\2\u0113\u0114\7f\2\2\u0114T\3\2\2\2\u0115\u0116\7k\2\2\u0116\u0117\7"+
		"o\2\2\u0117\u0118\7r\2\2\u0118\u0119\7q\2\2\u0119\u011a\7t\2\2\u011a\u011b"+
		"\7v\2\2\u011bV\3\2\2\2\u011c\u011d\7u\2\2\u011d\u011e\7o\2\2\u011e\u011f"+
		"\7c\2\2\u011f\u0120\7n\2\2\u0120\u0121\7n\2\2\u0121\u0122\7a\2\2\u0122"+
		"\u0123\7l\2\2\u0123\u0124\7c\2\2\u0124\u0125\7x\2\2\u0125\u0126\7c\2\2"+
		"\u0126\u0127\7\60\2\2\u0127\u0128\7n\2\2\u0128\u0129\7c\2\2\u0129\u012a"+
		"\7p\2\2\u012a\u012b\7i\2\2\u012bX\3\2\2\2\u012c\u012d\7u\2\2\u012d\u012e"+
		"\7o\2\2\u012e\u012f\7c\2\2\u012f\u0130\7n\2\2\u0130\u0131\7n\2\2\u0131"+
		"\u0132\7a\2\2\u0132\u0133\7l\2\2\u0133\u0134\7c\2\2\u0134\u0135\7x\2\2"+
		"\u0135\u0136\7c\2\2\u0136\u0137\7\60\2\2\u0137\u0138\7k\2\2\u0138\u0139"+
		"\7q\2\2\u0139Z\3\2\2\2\u013a\u013b\7e\2\2\u013b\u013c\7n\2\2\u013c\u013d"+
		"\7c\2\2\u013d\u013e\7u\2\2\u013e\u013f\7u\2\2\u013f\u0140\7a\2\2\u0140"+
		"\u0141\7U\2\2\u0141\u0142\7L\2\2\u0142\\\3\2\2\2\u0143\u0144\7r\2\2\u0144"+
		"\u0145\7t\2\2\u0145\u0146\7q\2\2\u0146\u0147\7v\2\2\u0147\u0148\7g\2\2"+
		"\u0148\u0149\7e\2\2\u0149\u014a\7v\2\2\u014a\u014b\7g\2\2\u014b\u014c"+
		"\7f\2\2\u014c^\3\2\2\2\u014d\u014e\7r\2\2\u014e\u014f\7w\2\2\u014f\u0150"+
		"\7d\2\2\u0150\u0151\7n\2\2\u0151\u0152\7k\2\2\u0152\u0153\7e\2\2\u0153"+
		"`\3\2\2\2\u0154\u0155\7k\2\2\u0155\u0156\7p\2\2\u0156\u0157\7v\2\2\u0157"+
		"\u0158\7a\2\2\u0158\u0159\7u\2\2\u0159\u015a\7l\2\2\u015ab\3\2\2\2\u015b"+
		"\u015c\7h\2\2\u015c\u015d\7n\2\2\u015d\u015e\7q\2\2\u015e\u015f\7c\2\2"+
		"\u015f\u0160\7v\2\2\u0160\u0161\7a\2\2\u0161\u0162\7u\2\2\u0162\u0163"+
		"\7l\2\2\u0163d\3\2\2\2\u0164\u0165\7u\2\2\u0165\u0166\7v\2\2\u0166\u0167"+
		"\7t\2\2\u0167\u0168\7k\2\2\u0168\u0169\7p\2\2\u0169\u016a\7i\2\2\u016a"+
		"\u016b\7a\2\2\u016b\u016c\7u\2\2\u016c\u016d\7l\2\2\u016df\3\2\2\2\u016e"+
		"\u016f\7\'\2\2\u016f\u0170\7f\2\2\u0170h\3\2\2\2\u0171\u0172\7\'\2\2\u0172"+
		"\u0173\7h\2\2\u0173j\3\2\2\2\u0174\u0175\7\'\2\2\u0175\u0176\7u\2\2\u0176"+
		"l\3\2\2\2\u0177\u0178\7e\2\2\u0178\u0179\7q\2\2\u0179\u017a\7p\2\2\u017a"+
		"\u017b\7u\2\2\u017b\u017c\7v\2\2\u017c\u017d\7c\2\2\u017d\u017e\7p\2\2"+
		"\u017e\u017f\7v\2\2\u017fn\3\2\2\2\u0180\u0184\t\2\2\2\u0181\u0183\t\3"+
		"\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185p\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0189\t\4\2\2"+
		"\u0188\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b"+
		"\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018f\t\5\2\2\u018e"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191r\3\2\2\2\u0192\u0194\t\4\2\2\u0193\u0192\3\2\2\2\u0194\u0197"+
		"\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0199\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0198\u019a\t\5\2\2\u0199\u0198\3\2\2\2\u019a\u019b\3\2"+
		"\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u01a1\7\60\2\2\u019e\u01a0\t\5\2\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3"+
		"\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01ab\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a4\u01a6\7\60\2\2\u01a5\u01a7\t\5\2\2\u01a6\u01a5\3"+
		"\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ab\3\2\2\2\u01aa\u0195\3\2\2\2\u01aa\u01a4\3\2\2\2\u01abt\3\2\2\2"+
		"\u01ac\u01b2\7$\2\2\u01ad\u01b1\n\6\2\2\u01ae\u01af\7$\2\2\u01af\u01b1"+
		"\7$\2\2\u01b0\u01ad\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2"+
		"\2\2\u01b5\u01b6\7$\2\2\u01b6v\3\2\2\2\u01b7\u01bb\7%\2\2\u01b8\u01ba"+
		"\n\7\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\b<"+
		"\2\2\u01bfx\3\2\2\2\u01c0\u01c1\t\b\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3"+
		"\b=\2\2\u01c3z\3\2\2\2\u01c4\u01c5\13\2\2\2\u01c5|\3\2\2\2\16\2\u0184"+
		"\u018a\u0190\u0195\u019b\u01a1\u01a8\u01aa\u01b0\u01b2\u01bb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}