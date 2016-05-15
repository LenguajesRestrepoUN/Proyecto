grammar Clojure;

file: form *;

form: literal       #formLiteral
    | def           #formDef
    | defn          #formDefn
    | println       #formPrintln
    | print         #formPrint
    | sum           #formSum
    | minus         #formMinus
    | or            #formOr
    | and           #formAnd
    | str           #formStr
    | callFunction  #formCallFunction
    | reader_macro  #formReader_macro
    ;

literal
    : STRING            #literalString
    | number            #literalNumber
    | character         #literalCharacter
    | nil               #literalNil
    | BOOLEAN           #literalBOOLEAN
    | keyword           #literalKeyword
    | symbol            #literalSymbol
    | PARAM_NAME        #literalParam_name
    | list              #literalList
    | vector            #literalVector
    | map               #literalMap
    ;

forms: form* ;

def: '(' DEF symbol ')'        #defSymbol
   | '(' DEF symbol form')'    #defSymbolForm
   ;

println: '(' PRINTLN forms ')';
print: '(' PRINT forms ')';

sum: '(' SUM forms ')';
minus: '(' MINUS forms ')';

or: '(' OR forms ')';
and: '(' AND forms ')';
str: '(' STR forms ')';

defn: '(' DEFN symbol optDescription '[' optparams ']' forms ')'    #singleDefn
    | '(' DEFN symbol optDescription  arity+ ')'    #defnArity
    ;

arity: '(' '[' optparams ']' forms ')';

optDescription: STRING      #description
              |             #noDescription
              ;

optparams : params  #optparamsParams
     |              #optparamsEpsilon
     ;

params : symbol params               #paramsSymbolParams
    | symbol                         #paramsSymbol
    ;

optargs : args  #optargsArgs
     |          #optargsEpsilon
     ;

args : form args    #argsSymbolArgs
    | form          #argsSymbol
    ;

callFunction: '(' symbol optargs ')' ;

list: '\'(' forms ')' ;

vector: '[' forms ']' ;

map: '{' (form form)* '}' ;

set: '#{' forms '}' ;

reader_macro
    : lambda            #rmLamda
    | meta_data         #rmMeta_data
    | regex             #rmRegex
    | var_quote         #rmVar_quote
    | host_expr         #rmHost_expr
    | set               #rmSet
    | tag               #rmTag
    | discard           #rmDiscard
    | dispatch          #rmDispatch
    | deref             #rmDeref
    | quote             #rmQuote
    | backtick          #rmBacktick
    | unquote           #rmUnquote
    | unquote_splicing  #rmUnquote_splicing
    | gensym            #rmGensym
    ;

// TJP added '&' (gather a variable number of arguments)
quote : '\'' form;

backtick : '`' form;

unquote : '~' form;

unquote_splicing : '~@' form;

tag : '^' form form;

deref : '@' form;

gensym : SYMBOL '#';

lambda : '#(' form* ')';

meta_data : '#^' (map form | form);

var_quote : '#\'' symbol;

host_expr : '#+' form form;

discard : '#_' form;

dispatch : '#' symbol form;

regex : '#' STRING;

number
    : FLOAT     #numberFloat
    | HEX       #numberHex
    | BIN       #numberBin
    | BIGN      #numberBign
    | LONG      #numberLong
    ;

character
    : named_char    #charNamed_char
    | u_hex_quad    #charU_hex_quad
    | any_char      #charAny_char
    ;

named_char: CHAR_NAMED ;
any_char: CHAR_ANY ;
u_hex_quad: CHAR_U ;

nil: NIL;

keyword
    : macro_keyword     #keywordMacro_keyword
    | simple_keyword    #keywordSimple_keyword
    ;

simple_keyword: ':' symbol;
macro_keyword: ':' ':' symbol;

symbol: ns_symbol
        | simple_sym
        ;

simple_sym: SYMBOL;
ns_symbol: NS_SYMBOL;

// Lexers
//--------------------------------------------------------------------

DEF: 'def';
DEFN: 'defn';
PRINTLN: 'println';
PRINT: 'print';
SUM: '+';
MINUS: '-';
OR: 'or';
AND: 'and';
STR: 'str';

STRING : '"' ( ~'"' | '\\' '"' )* '"' ;

FLOAT
    : '-'? [0-9]+ FLOAT_TAIL
    | '-'? 'Infinity'
    | '-'? 'NaN'
    ;

fragment
FLOAT_TAIL
    : FLOAT_DECIMAL FLOAT_EXP
    | FLOAT_DECIMAL
    | FLOAT_EXP
    ;

fragment
FLOAT_DECIMAL : '.' [0-9]+;

fragment
FLOAT_EXP : [eE] '-'? [0-9]+ ;

fragment
HEXD: [0-9a-fA-F] ;
HEX: '0' [xX] HEXD+ ;
BIN: '0' [bB] [10]+ ;
LONG: '-'? [0-9]+[lL]?;
BIGN: '-'? [0-9]+[nN];

CHAR_U : '\\' 'u'[0-9D-Fd-f] HEXD HEXD HEXD ;

CHAR_NAMED
    : '\\' ( 'newline'
           | 'return'
           | 'space'
           | 'tab'
           | 'formfeed'
           | 'backspace' ) ;

CHAR_ANY : '\\' . ;

NIL : 'nil';

BOOLEAN : 'true'
        | 'false'
        ;

SYMBOL : '.'
       | '/'
       | NAME
       ;

NS_SYMBOL
    : NAME '/' SYMBOL
    ;

PARAM_NAME: '%' ((('1'..'9')('0'..'9')*)|'&')? ;

// Fragments
//--------------------------------------------------------------------

fragment
NAME: SYMBOL_HEAD SYMBOL_REST* (':' SYMBOL_REST+)* ;

fragment
SYMBOL_HEAD
    : ~('0' .. '9'
        | '^' | '`' | '\'' | '"' | '#' | '~' | '@' | ':' | '/' | '%' | '(' | ')' | '[' | ']' | '{' | '}'
        | [ \n\r\t\,]
        )
    ;

fragment
SYMBOL_REST
    : SYMBOL_HEAD
    | '0'..'9'
    | '.'
    ;

// Discard
//--------------------------------------------------------------------

fragment
WS : [ \n\r\t\,] ;

fragment
COMMENT: ';' ~[\r\n]* ;

TRASH
    : ( WS | COMMENT ) -> channel(HIDDEN)
    ;
