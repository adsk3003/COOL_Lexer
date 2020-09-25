// Generated from CoolLexer.g4 by ANTLR 4.5
package cool;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, TYPEID=2, OBJECTID=3, BOOL_CONST=4, INT_CONST=5, STR_CONST=6, 
		LPAREN=7, RPAREN=8, COLON=9, ATSYM=10, SEMICOLON=11, COMMA=12, PLUS=13, 
		MINUS=14, STAR=15, SLASH=16, TILDE=17, LT=18, EQUALS=19, LBRACE=20, RBRACE=21, 
		DOT=22, DARROW=23, LE=24, ASSIGN=25, CLASS=26, ELSE=27, FI=28, IF=29, 
		IN=30, INHERITS=31, LET=32, LOOP=33, POOL=34, THEN=35, WHILE=36, CASE=37, 
		ESAC=38, OF=39, NEW=40, ISVOID=41, NOT=42, WHITESPACE=43, UNTERM_STR_CONST=44, 
		SELF=45, SELF_TYPE=46, SINGLE_LINE_COMMENT=47, ML_END_COMMENT=48, ML_UN_COMMENT=49, 
		COMMENT=50, ERR=51, OPENCOMMENT=52, CLOSECOMMENT=53, INCOMMENT_T=54, ERR2=55, 
		OPENCOM=56, ERR3=57, CLOSECOM=58, INCOM_TEXT=59;
	public static final int INCOMMENT = 1;
	public static final int ININCOM = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "INCOMMENT", "ININCOM"
	};

	public static final String[] ruleNames = {
		"SEMICOLON", "DARROW", "LPAREN", "RPAREN", "COMMA", "LT", "LE", "EQUALS", 
		"LBRACE", "RBRACE", "DOT", "ASSIGN", "ATSYM", "COLON", "PLUS", "MINUS", 
		"STAR", "SLASH", "TILDE", "CASE", "ESAC", "LOOP", "POOL", "CLASS", "WHILE", 
		"THEN", "ELSE", "ISVOID", "NOT", "IN", "INHERITS", "OF", "LET", "NEW", 
		"IF", "FI", "NUM", "LOWER", "UPPER", "LETTER", "BOOL_CONST", "TYPEID", 
		"OBJECTID", "INT_CONST", "WHITESPACE", "STR_CONST", "ESC", "ERROR", "UNTERM_STR_CONST", 
		"SELF", "SELF_TYPE", "SINGLE_LINE_COMMENT", "ML_END_COMMENT", "ML_UN_COMMENT", 
		"COMMENT", "ERR", "OPENCOMMENT", "CLOSECOMMENT", "INCOMMENT_T", "ERR2", 
		"OPENCOM", "ERR3", "CLOSECOM", "INCOM_TEXT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'('", "')'", "':'", "'@'", 
		"';'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'='", "'{'", 
		"'}'", "'.'", "'=>'", "'<='", "'<-'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'self'", "'SELF_TYPE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "STR_CONST", 
		"LPAREN", "RPAREN", "COLON", "ATSYM", "SEMICOLON", "COMMA", "PLUS", "MINUS", 
		"STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE", "RBRACE", "DOT", "DARROW", 
		"LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "LET", 
		"LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", 
		"NOT", "WHITESPACE", "UNTERM_STR_CONST", "SELF", "SELF_TYPE", "SINGLE_LINE_COMMENT", 
		"ML_END_COMMENT", "ML_UN_COMMENT", "COMMENT", "ERR", "OPENCOMMENT", "CLOSECOMMENT", 
		"INCOMMENT_T", "ERR2", "OPENCOM", "ERR3", "CLOSECOM", "INCOM_TEXT"
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



		/*
			YOU CAN ADD YOUR MEMBER VARIABLES AND METHODS HERE
		*/

		/**
		* Function to report errors.
		* Use this function whenever your lexer encounters any erroneous input
		* DO NOT EDIT THIS FUNCTION
		*/
		public void reportError(String errorString){
			setText(errorString);
			setType(ERROR);
		}

		public void processString() {
			Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
			String text = t.getText();

			//write your code to test strings here
			StringBuilder buf = new StringBuilder(0);

			// iterates the string and checks for \\ and then checks for escape characters
			for(int i = 0; i < text.length(); ++i) {
				if(text.charAt(i) == '\\') {
					if(text.charAt(i+1) == '0')
						reportError("String contains NULL character");
				}
					
				if(text.charAt(i) == '\\') {
					if(text.charAt(i+1) == 'n')
						buf.append('\n');
					else if(text.charAt(i+1) == 'f')
						buf.append('\f');
					else if(text.charAt(i+1) == 't')
						buf.append('\t');
					else if(text.charAt(i+1) == 'b')
						buf.append('\t');
					else if(text.charAt(i+1) == '\"')
						buf.append('\"');
					else if(text.charAt(i+1) == '\\')
						buf.append('\\');
					else
						buf.append(text.charAt(i+1));
					i++;
				}
				else {
					buf.append(text.charAt(i));
				}
			}

			String ntext = buf.toString();

			// reports error if length is > 1024
			if(ntext.length() > 1024) {
				reportError("String constant too long");
				return;
			}
			setText(ntext);
			return;
		}


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 45:
			STR_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 47:
			ERROR_action((RuleContext)_localctx, actionIndex);
			break;
		case 52:
			ML_END_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 53:
			ML_UN_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 55:
			ERR_action((RuleContext)_localctx, actionIndex);
			break;
		case 59:
			ERR2_action((RuleContext)_localctx, actionIndex);
			break;
		case 61:
			ERR3_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STR_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 processString() ;
			break;
		}
	}
	private void ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 reportError("EOF in string constant"); 
			break;
		case 2:
			 reportError("Unterminated string constant"); 
			break;
		case 3:
			 reportError("String contains null character"); 
			break;
		}
	}
	private void ML_END_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 reportError("Unmatched *)"); 
			break;
		}
	}
	private void ML_UN_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 reportError("Unmatched *)"); 
			break;
		}
	}
	private void ERR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			 reportError("EOF in comment"); 
			break;
		}
	}
	private void ERR2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			 reportError("EOF in comment"); 
			break;
		}
	}
	private void ERR3_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			 reportError("EOF in comment"); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2=\u01c9\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3"+
		"$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*"+
		"\u0111\n*\3+\3+\3+\3+\7+\u0117\n+\f+\16+\u011a\13+\3,\3,\3,\3,\7,\u0120"+
		"\n,\f,\16,\u0123\13,\3-\6-\u0126\n-\r-\16-\u0127\3.\6.\u012b\n.\r.\16"+
		".\u012c\3.\3.\3/\3/\3/\7/\u0134\n/\f/\16/\u0137\13/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\5\60\u0140\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0156\n\61"+
		"\3\62\3\62\3\62\3\62\3\62\5\62\u015d\n\62\7\62\u015f\n\62\f\62\16\62\u0162"+
		"\13\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0177\n\65\f\65\16\65\u017a\13\65"+
		"\3\65\3\65\3\65\3\65\3\65\7\65\u0181\n\65\f\65\16\65\u0184\13\65\3\65"+
		"\5\65\u0187\n\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3"+
		";\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3"+
		"@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3\u0135\2B\5\r\7\31\t\t\13\n\r\16\17\24\21"+
		"\32\23\25\25\26\27\27\31\30\33\33\35\f\37\13!\17#\20%\21\'\22)\23+\'-"+
		"(/#\61$\63\34\65&\67%9\35;+=,? A!C)E\"G*I\37K\36M\2O\2Q\2S\2U\6W\4Y\5"+
		"[\7]-_\ba\2c\3e.g/i\60k\61m\62o\63q\64s\65u\66w\67y8{9}:\177;\u0081<\u0083"+
		"=\5\2\3\4\27\4\2EEee\4\2CCcc\4\2UUuu\4\2GGgg\4\2NNnn\4\2QQqq\4\2RRrr\4"+
		"\2YYyy\4\2JJjj\4\2KKkk\4\2VVvv\4\2PPpp\4\2XXxx\4\2FFff\4\2TTtt\4\2HHh"+
		"h\4\2C\\c|\4\2WWww\5\2\n\f\16\17\"\"\5\2\f\f$$^^\5\2\f\fGHQQ\u01d5\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\3u\3\2\2\2\3w\3\2\2\2\3y\3\2\2\2\4{"+
		"\3\2\2\2\4}\3\2\2\2\4\177\3\2\2\2\4\u0081\3\2\2\2\4\u0083\3\2\2\2\5\u0085"+
		"\3\2\2\2\7\u0087\3\2\2\2\t\u008a\3\2\2\2\13\u008c\3\2\2\2\r\u008e\3\2"+
		"\2\2\17\u0090\3\2\2\2\21\u0092\3\2\2\2\23\u0095\3\2\2\2\25\u0097\3\2\2"+
		"\2\27\u0099\3\2\2\2\31\u009b\3\2\2\2\33\u009d\3\2\2\2\35\u00a0\3\2\2\2"+
		"\37\u00a2\3\2\2\2!\u00a4\3\2\2\2#\u00a6\3\2\2\2%\u00a8\3\2\2\2\'\u00aa"+
		"\3\2\2\2)\u00ac\3\2\2\2+\u00ae\3\2\2\2-\u00b3\3\2\2\2/\u00b8\3\2\2\2\61"+
		"\u00bd\3\2\2\2\63\u00c2\3\2\2\2\65\u00c8\3\2\2\2\67\u00ce\3\2\2\29\u00d3"+
		"\3\2\2\2;\u00d8\3\2\2\2=\u00df\3\2\2\2?\u00e3\3\2\2\2A\u00e6\3\2\2\2C"+
		"\u00ee\3\2\2\2E\u00f1\3\2\2\2G\u00f5\3\2\2\2I\u00f9\3\2\2\2K\u00fc\3\2"+
		"\2\2M\u00ff\3\2\2\2O\u0101\3\2\2\2Q\u0103\3\2\2\2S\u0105\3\2\2\2U\u0110"+
		"\3\2\2\2W\u0112\3\2\2\2Y\u011b\3\2\2\2[\u0125\3\2\2\2]\u012a\3\2\2\2_"+
		"\u0130\3\2\2\2a\u013f\3\2\2\2c\u0155\3\2\2\2e\u0157\3\2\2\2g\u0163\3\2"+
		"\2\2i\u0168\3\2\2\2k\u0186\3\2\2\2m\u018a\3\2\2\2o\u0190\3\2\2\2q\u0195"+
		"\3\2\2\2s\u019b\3\2\2\2u\u019f\3\2\2\2w\u01a5\3\2\2\2y\u01ab\3\2\2\2{"+
		"\u01af\3\2\2\2}\u01b3\3\2\2\2\177\u01b9\3\2\2\2\u0081\u01bf\3\2\2\2\u0083"+
		"\u01c5\3\2\2\2\u0085\u0086\7=\2\2\u0086\6\3\2\2\2\u0087\u0088\7?\2\2\u0088"+
		"\u0089\7@\2\2\u0089\b\3\2\2\2\u008a\u008b\7*\2\2\u008b\n\3\2\2\2\u008c"+
		"\u008d\7+\2\2\u008d\f\3\2\2\2\u008e\u008f\7.\2\2\u008f\16\3\2\2\2\u0090"+
		"\u0091\7>\2\2\u0091\20\3\2\2\2\u0092\u0093\7>\2\2\u0093\u0094\7?\2\2\u0094"+
		"\22\3\2\2\2\u0095\u0096\7?\2\2\u0096\24\3\2\2\2\u0097\u0098\7}\2\2\u0098"+
		"\26\3\2\2\2\u0099\u009a\7\177\2\2\u009a\30\3\2\2\2\u009b\u009c\7\60\2"+
		"\2\u009c\32\3\2\2\2\u009d\u009e\7>\2\2\u009e\u009f\7/\2\2\u009f\34\3\2"+
		"\2\2\u00a0\u00a1\7B\2\2\u00a1\36\3\2\2\2\u00a2\u00a3\7<\2\2\u00a3 \3\2"+
		"\2\2\u00a4\u00a5\7-\2\2\u00a5\"\3\2\2\2\u00a6\u00a7\7/\2\2\u00a7$\3\2"+
		"\2\2\u00a8\u00a9\7,\2\2\u00a9&\3\2\2\2\u00aa\u00ab\7\61\2\2\u00ab(\3\2"+
		"\2\2\u00ac\u00ad\7\u0080\2\2\u00ad*\3\2\2\2\u00ae\u00af\t\2\2\2\u00af"+
		"\u00b0\t\3\2\2\u00b0\u00b1\t\4\2\2\u00b1\u00b2\t\5\2\2\u00b2,\3\2\2\2"+
		"\u00b3\u00b4\t\5\2\2\u00b4\u00b5\t\4\2\2\u00b5\u00b6\t\3\2\2\u00b6\u00b7"+
		"\t\2\2\2\u00b7.\3\2\2\2\u00b8\u00b9\t\6\2\2\u00b9\u00ba\t\7\2\2\u00ba"+
		"\u00bb\t\7\2\2\u00bb\u00bc\t\b\2\2\u00bc\60\3\2\2\2\u00bd\u00be\t\b\2"+
		"\2\u00be\u00bf\t\7\2\2\u00bf\u00c0\t\7\2\2\u00c0\u00c1\t\6\2\2\u00c1\62"+
		"\3\2\2\2\u00c2\u00c3\t\2\2\2\u00c3\u00c4\t\6\2\2\u00c4\u00c5\t\3\2\2\u00c5"+
		"\u00c6\t\4\2\2\u00c6\u00c7\t\4\2\2\u00c7\64\3\2\2\2\u00c8\u00c9\t\t\2"+
		"\2\u00c9\u00ca\t\n\2\2\u00ca\u00cb\t\13\2\2\u00cb\u00cc\t\6\2\2\u00cc"+
		"\u00cd\t\5\2\2\u00cd\66\3\2\2\2\u00ce\u00cf\t\f\2\2\u00cf\u00d0\t\n\2"+
		"\2\u00d0\u00d1\t\5\2\2\u00d1\u00d2\t\r\2\2\u00d28\3\2\2\2\u00d3\u00d4"+
		"\t\5\2\2\u00d4\u00d5\t\6\2\2\u00d5\u00d6\t\4\2\2\u00d6\u00d7\t\5\2\2\u00d7"+
		":\3\2\2\2\u00d8\u00d9\t\13\2\2\u00d9\u00da\t\4\2\2\u00da\u00db\t\16\2"+
		"\2\u00db\u00dc\t\7\2\2\u00dc\u00dd\t\13\2\2\u00dd\u00de\t\17\2\2\u00de"+
		"<\3\2\2\2\u00df\u00e0\t\r\2\2\u00e0\u00e1\t\7\2\2\u00e1\u00e2\t\f\2\2"+
		"\u00e2>\3\2\2\2\u00e3\u00e4\t\13\2\2\u00e4\u00e5\t\r\2\2\u00e5@\3\2\2"+
		"\2\u00e6\u00e7\t\13\2\2\u00e7\u00e8\t\n\2\2\u00e8\u00e9\t\5\2\2\u00e9"+
		"\u00ea\t\20\2\2\u00ea\u00eb\t\13\2\2\u00eb\u00ec\t\f\2\2\u00ec\u00ed\t"+
		"\4\2\2\u00edB\3\2\2\2\u00ee\u00ef\t\7\2\2\u00ef\u00f0\t\21\2\2\u00f0D"+
		"\3\2\2\2\u00f1\u00f2\t\6\2\2\u00f2\u00f3\t\5\2\2\u00f3\u00f4\t\f\2\2\u00f4"+
		"F\3\2\2\2\u00f5\u00f6\t\r\2\2\u00f6\u00f7\t\5\2\2\u00f7\u00f8\t\t\2\2"+
		"\u00f8H\3\2\2\2\u00f9\u00fa\t\13\2\2\u00fa\u00fb\t\21\2\2\u00fbJ\3\2\2"+
		"\2\u00fc\u00fd\t\21\2\2\u00fd\u00fe\t\13\2\2\u00feL\3\2\2\2\u00ff\u0100"+
		"\4\62;\2\u0100N\3\2\2\2\u0101\u0102\4c|\2\u0102P\3\2\2\2\u0103\u0104\4"+
		"C\\\2\u0104R\3\2\2\2\u0105\u0106\t\22\2\2\u0106T\3\2\2\2\u0107\u0108\7"+
		"v\2\2\u0108\u0109\t\20\2\2\u0109\u010a\t\23\2\2\u010a\u0111\t\5\2\2\u010b"+
		"\u010c\7h\2\2\u010c\u010d\t\3\2\2\u010d\u010e\t\6\2\2\u010e\u010f\t\4"+
		"\2\2\u010f\u0111\t\5\2\2\u0110\u0107\3\2\2\2\u0110\u010b\3\2\2\2\u0111"+
		"V\3\2\2\2\u0112\u0118\5Q(\2\u0113\u0117\7a\2\2\u0114\u0117\5S)\2\u0115"+
		"\u0117\5M&\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2"+
		"\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119X"+
		"\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u0121\5O\'\2\u011c\u0120\7a\2\2\u011d"+
		"\u0120\5S)\2\u011e\u0120\5M&\2\u011f\u011c\3\2\2\2\u011f\u011d\3\2\2\2"+
		"\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122Z\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0126\5M&\2\u0125\u0124"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\\\3\2\2\2\u0129\u012b\t\24\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2"+
		"\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f"+
		"\b.\2\2\u012f^\3\2\2\2\u0130\u0135\7$\2\2\u0131\u0134\5a\60\2\u0132\u0134"+
		"\13\2\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2"+
		"\u0135\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0138\u0139\7$\2\2\u0139\u013a\b/\3\2\u013a`\3\2\2\2\u013b\u013c"+
		"\7^\2\2\u013c\u0140\7$\2\2\u013d\u013e\7^\2\2\u013e\u0140\7^\2\2\u013f"+
		"\u013b\3\2\2\2\u013f\u013d\3\2\2\2\u0140b\3\2\2\2\u0141\u0142\5e\62\2"+
		"\u0142\u0143\13\2\2\2\u0143\u0144\7\2\2\3\u0144\u0145\b\61\4\2\u0145\u0156"+
		"\3\2\2\2\u0146\u0147\5e\62\2\u0147\u0148\b\61\5\2\u0148\u0156\3\2\2\2"+
		"\u0149\u014a\5e\62\2\u014a\u014b\7^\2\2\u014b\u014c\7w\2\2\u014c\u014d"+
		"\7\62\2\2\u014d\u014e\7\62\2\2\u014e\u014f\7\62\2\2\u014f\u0150\7\62\2"+
		"\2\u0150\u0151\3\2\2\2\u0151\u0152\5e\62\2\u0152\u0153\7$\2\2\u0153\u0154"+
		"\b\61\6\2\u0154\u0156\3\2\2\2\u0155\u0141\3\2\2\2\u0155\u0146\3\2\2\2"+
		"\u0155\u0149\3\2\2\2\u0156d\3\2\2\2\u0157\u0160\7$\2\2\u0158\u015f\n\25"+
		"\2\2\u0159\u015c\7^\2\2\u015a\u015d\13\2\2\2\u015b\u015d\7\2\2\3\u015c"+
		"\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u0158\3\2"+
		"\2\2\u015e\u0159\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161f\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7u\2\2\u0164"+
		"\u0165\7g\2\2\u0165\u0166\7n\2\2\u0166\u0167\7h\2\2\u0167h\3\2\2\2\u0168"+
		"\u0169\7U\2\2\u0169\u016a\7G\2\2\u016a\u016b\7N\2\2\u016b\u016c\7H\2\2"+
		"\u016c\u016d\7a\2\2\u016d\u016e\7V\2\2\u016e\u016f\7[\2\2\u016f\u0170"+
		"\7R\2\2\u0170\u0171\7G\2\2\u0171j\3\2\2\2\u0172\u0173\7/\2\2\u0173\u0174"+
		"\7/\2\2\u0174\u0178\3\2\2\2\u0175\u0177\n\26\2\2\u0176\u0175\3\2\2\2\u0177"+
		"\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2"+
		"\2\2\u017a\u0178\3\2\2\2\u017b\u0187\7\f\2\2\u017c\u017d\7/\2\2\u017d"+
		"\u017e\7/\2\2\u017e\u0182\3\2\2\2\u017f\u0181\n\26\2\2\u0180\u017f\3\2"+
		"\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0187\7\2\2\3\u0186\u0172\3\2"+
		"\2\2\u0186\u017c\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\b\65\2\2\u0189"+
		"l\3\2\2\2\u018a\u018b\7,\2\2\u018b\u018c\7+\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018e\7\2\2\3\u018e\u018f\b\66\7\2\u018fn\3\2\2\2\u0190\u0191\7,\2\2"+
		"\u0191\u0192\7+\2\2\u0192\u0193\3\2\2\2\u0193\u0194\b\67\b\2\u0194p\3"+
		"\2\2\2\u0195\u0196\7*\2\2\u0196\u0197\7,\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0199\b8\t\2\u0199\u019a\b8\2\2\u019ar\3\2\2\2\u019b\u019c\13\2\2\2\u019c"+
		"\u019d\7\2\2\3\u019d\u019e\b9\n\2\u019et\3\2\2\2\u019f\u01a0\7*\2\2\u01a0"+
		"\u01a1\7,\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\b:\13\2\u01a3\u01a4\b:\2"+
		"\2\u01a4v\3\2\2\2\u01a5\u01a6\7,\2\2\u01a6\u01a7\7+\2\2\u01a7\u01a8\3"+
		"\2\2\2\u01a8\u01a9\b;\f\2\u01a9\u01aa\b;\2\2\u01aax\3\2\2\2\u01ab\u01ac"+
		"\13\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\b<\2\2\u01aez\3\2\2\2\u01af"+
		"\u01b0\13\2\2\2\u01b0\u01b1\7\2\2\3\u01b1\u01b2\b=\r\2\u01b2|\3\2\2\2"+
		"\u01b3\u01b4\7*\2\2\u01b4\u01b5\7,\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7"+
		"\b>\13\2\u01b7\u01b8\b>\2\2\u01b8~\3\2\2\2\u01b9\u01ba\7,\2\2\u01ba\u01bb"+
		"\7+\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\7\2\2\3\u01bd\u01be\b?\16\2\u01be"+
		"\u0080\3\2\2\2\u01bf\u01c0\7,\2\2\u01c0\u01c1\7+\2\2\u01c1\u01c2\3\2\2"+
		"\2\u01c2\u01c3\b@\f\2\u01c3\u01c4\b@\2\2\u01c4\u0082\3\2\2\2\u01c5\u01c6"+
		"\13\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\bA\2\2\u01c8\u0084\3\2\2\2\26"+
		"\2\3\4\u0110\u0116\u0118\u011f\u0121\u0127\u012c\u0133\u0135\u013f\u0155"+
		"\u015c\u015e\u0160\u0178\u0182\u0186\17\b\2\2\3/\2\3\61\3\3\61\4\3\61"+
		"\5\3\66\6\3\67\7\7\3\2\39\b\7\4\2\6\2\2\3=\t\3?\n";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}