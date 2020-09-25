# COOL Compiler #

BOOL_CONST: Can be true or false. 't' and 'f' are not capiltalized. 

EOF_STRING: If EOF is reached inside a string an error is reported

STR_CONST: A string constant begins with a double quotes and ends with double quotes. The action processString() is called that formats the string and checks if errors of null character or unescaped new line characters or if string lenghth exceeds the limit. 

INT_CONST: One or more than one digit

COMMENT: A single line comment that beins with '--' and ends with '\n'
MULTI_LINE COMMENT: Nested blocks of comments are allowed in COOL. And so, MULTI_LINE comment 						is defined recursively. 

TYPE_ID: Tokenise all that have an Upper case letter for first character and are followed by any letter, number or underscore

WHITESPACE  : Tokenise a white space character

ML_UN_COMMENT: Identifies a '*)' that doesn't have a corresponding '(*'


ERRORS:
All possible errors can be of only 8 types:
1)EOF in string constant
2)EOF in comment
3)String constant too long
4)Unterminated string constant
5)String contains null character
6)Single backslash
7)Umatched *)


ERROR HANDLING:

1) An EOF in string constant occurs when opening double quotes are present, but before the closing double quotes are encountered, EOF is encountered. This is recognised by placing the EOF_STRING rule and give the regular expression of open double quotes terminated by EOF. This rule is placed before the STR_CONST

2) An EOF in comment occurs when opening (* are present, but before the closing *) are encountered, EOF is encountered. 

3) String constant too long: If the number of characters enclosed between two double quotes is more than 1024. This is recognised by getting the string into processString() and checking the length

4)Unterminated string constant: When the charcater '\n' is encountered inside the string but is not escaped before by a preceding '\', then an error is raised. This is recognised by processing the string and iterating over the characters of string and checking for the condition

5)String contains null character: If the string contains the '\0' character, error is raised. Recognised by iterating over the string and checking for the condition

6)Single backslash: If a sting contains only one \, error is raised

7) Unmatched *): If a matching (* is not found for *)
