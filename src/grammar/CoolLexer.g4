lexer grammar CoolLexer;

tokens{
	ERROR,
	TYPEID,
	OBJECTID,
	BOOL_CONST,
	INT_CONST,
	STR_CONST,
	LPAREN,
	RPAREN,
	COLON,
	ATSYM,
	SEMICOLON,
	COMMA,
	PLUS,
	MINUS,
	STAR,
	SLASH,
	TILDE,
	LT,
	EQUALS,
	LBRACE,
	RBRACE,
	DOT,
	DARROW,
	LE,
	ASSIGN,
	CLASS,
	ELSE,
	FI,
	IF,
	IN,
	INHERITS,
	LET,
	LOOP,
	POOL,
	THEN,
	WHILE,
	CASE,
	ESAC,
	OF,
	NEW,
	ISVOID,
	NOT
}

/*
  DO NOT EDIT CODE ABOVE THIS LINE
*/

@members{

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
}

/*
	WRITE ALL LEXER RULES BELOW
*/

SEMICOLON   : ';';
DARROW      : '=>';
LPAREN	    : '(';
RPAREN	    : ')';
COMMA	    : ',';
LT	    	: '<';
LE	    	: '<=';
EQUALS	    : '=';
LBRACE	    : '{';
RBRACE	    : '}';
DOT	    	: '.';
ASSIGN	    : '<-';
ATSYM	    : '@';
COLON	    : ':';
PLUS	    : '+';
MINUS	    : '-';
STAR	    : '*';
SLASH	    : '/';
TILDE	    : '~';

CASE		: ('c'|'C')('a'|'A')('s'|'S')('e'|'E');
ESAC		: ('e'|'E')('s'|'S')('a'|'A')('c'|'C');
LOOP		: ('l'|'L')('o'|'O')('o'|'O')('p'|'P');
POOL		: ('p'|'P')('o'|'O')('o'|'O')('l'|'L');
CLASS		: ('c'|'C')('l'|'L')('a'|'A')('s'|'S')('s'|'S');
WHILE		: ('w'|'W')('h'|'H')('i'|'I')('l'|'L')('e'|'E');
THEN		: ('t'|'T')('h'|'H')('e'|'E')('n'|'N');
ELSE		: ('e'|'E')('l'|'L')('s'|'S')('e'|'E');
ISVOID		: ('i'|'I')('s'|'S')('v'|'V')('o'|'O')('i'|'I')('d'|'D');
NOT			: ('n'|'N')('o'|'O')('t'|'T');
IN			: ('i'|'I')('n'|'N');
INHERITS	: ('i'|'I')('h'|'H')('e'|'E')('r'|'R')('i'|'I')('t'|'T')('s'|'S');
OF			: ('o'|'O')('f'|'F');
LET			: ('l'|'L')('e'|'E')('t'|'T');
NEW			: ('n'|'N')('e'|'E')('w'|'W');
IF			: ('i'|'I')('f'|'F');
FI			: ('f'|'F')('i'|'I');

fragment NUM	: '0'..'9';
fragment LOWER: 'a'..'z';
fragment UPPER: 'A'..'Z';
fragment LETTER	: ('a'..'z'|'A'..'Z');
BOOL_CONST	: ('t'('r'|'R')('u'|'U')('e'|'E')|'f'('a'|'A')('l'|'L')('s'|'S')('e'|'E'));
TYPEID		: UPPER('_'|LETTER|NUM)*;
OBJECTID	: LOWER('_'|LETTER|NUM)*;
INT_CONST	: NUM+;
WHITESPACE	: [\n\f\r\b\t ]+ -> skip ;

STR_CONST	: '"' (ESC|.)*? '"' { processString() ;} ;
fragment ESC: '\\"' | '\\\\' ;


ERROR	: UNTERM_STR_CONST .(EOF) { reportError("EOF in string constant"); } 		// EOF seen before string termination
	| UNTERM_STR_CONST { reportError("Unterminated string constant"); }		// String not terminated before newline
	| UNTERM_STR_CONST ('\\u0000') UNTERM_STR_CONST '"' { reportError("String contains null character"); }	// String containing null
	;

UNTERM_STR_CONST: '"' (~["\\\n] | '\\' (. | EOF))*;


SELF		: 'self' ;
SELF_TYPE	: 'SELF_TYPE' ;

SINGLE_LINE_COMMENT	: ('--'~('\n' | [EOF])*'\n' | '--'~('\n' | [EOF])*(EOF))  -> skip;

ML_END_COMMENT	: '*)' EOF { reportError("Unmatched *)"); } ;
ML_UN_COMMENT 	: '*)' { reportError("Unmatched *)"); } ;
COMMENT			: '(*'-> pushMode(INCOMMENT), skip;

// program goes in incomment mode when it detects opening of multiline comment and exits 
//when it detects exit of comment
//inincom is to recursively eliminte the opening and closing of comments

mode INCOMMENT;
ERR     	: .(EOF) { reportError("EOF in comment"); } ;
OPENCOMMENT	: '(*' -> pushMode(ININCOM), skip ;
CLOSECOMMENT	: '*)' -> popMode, skip ;
INCOMMENT_T : . -> skip ;

mode ININCOM;
ERR2		: .(EOF) { reportError("EOF in comment"); } ;
OPENCOM		: '(*' -> pushMode(ININCOM), skip ;
ERR3		: '*)' EOF { reportError("EOF in comment"); } ; 
CLOSECOM		: '*)' -> popMode, skip ;
INCOM_TEXT	: . -> skip ;



// defined all the required tokens and rules above