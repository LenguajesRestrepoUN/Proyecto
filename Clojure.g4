grammar Clojure;

file: mainForm;

mainForm: form mainForm       #mainForms
        | form                #mainFormForm
        ;

priorForm: form priorForm       #priorForms
         | form                 #priorFormForm
         ;

form: literal       #formLiteral
    | def           #formDef
    | defn          #formDefn
    | println       #formPrintln
    | print         #formPrint
    | sum           #formSum
    | minus         #formMinus
    | mult          #formMult
    | div           #formDiv
    | or            #formOr
    | and           #formAnd
    | str           #formStr
    | loop          #formLoop
    | si            #formsi
    | mayor         #formMayor
    | menor         #formMenor
    | mayorIgual    #formMayorIgual
    | menorIgual    #formMenorIgual
    | igual         #formIgual
    | inc           #formInc
    | hacer         #formHacer
    | when          #formWhen
    | isNil         #formIsNil
    | nth           #formNth
    | contains      #formContains
    | conj          #formConj
    | get           #formGet
    | first         #formFirst
    | let           #formLet
    | functionMap   #formFunctionMap
    | take          #formTake
    | reduce        #formReduce
    | callFunction  #formCallFunction
    | recur         #formRecur
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
    | set               #literalSet
    ;

forms: priorForm    #formsForm
     |              #formsEpsilon
     ;
auxforms: forms;

list: '\'(' forms ')' ;
vector: '[' forms ']' ;
map: '{' (form form)* '}' ;
set: '#{' forms '}' ;

def: '(' DEF symbol ')'        #defSymbol
   | '(' DEF symbol form')'    #defSymbolForm
   ;

println: '(' PRINTLN form ')';
print: '(' PRINT forms ')';

sum: '(' SUM forms ')';
minus: '(' MINUS forms ')';
mult: '(' MULT forms ')';
div: '(' DIV forms ')';

or: '(' OR forms ')';
and: '(' AND forms ')';
str: '(' STR forms ')';

optDescription: STRING      #description
              |             #noDescription
              ;

optparams : params  #optparamsParams
          |         #optparamsEpsilon
          ;
symbols: symbol symbols      #symbolsSymbol
       |                     #symbolsEpsilon
       ;

params : symbol params                      #paramsSymbolParams
       | symbol                             #paramsSymbol
       | AMPER symbol                       #paramsRestParameter
       | '[' symbol symbols ']' params      #paramsDestructuringParams
       | '[' symbol symbols ']'             #paramsDestructuring
       ;

optLoopParams : loopParams  #optLoopParamsParams
     |                      #optLoopParamsEpsilon
     ;

loopParams : symbol form loopParams      #loopParamsSymbolParams
    | symbol form                        #loopParamsSymbol
    ;

optargs : args  #optargsArgs
     |          #optargsEpsilon
     ;

args : form args    #argsSymbolArgs
    | form          #argsSymbol
    ;

defn: '(' DEFN symbol optDescription '[' optparams ']' auxforms ')'    #singleDefn
    | '(' DEFN symbol optDescription  arity+ ')'                    #defnArity
    ;

arity: '(' '[' optparams ']' forms ')';

callFunction: '(' symbol optargs ')' ;

loop: '(' LOOP '[' optLoopParams ']' forms ')';

recur: '(' RECUR optargs ')';

siOptForm: form form    #siTrueFalse
         | form         #siTrue
         ;

si: '(' SI form siOptForm ')';
hacer: '(' HACER forms ')';
mayor: '(' MAYOR forms ')';
menor: '(' MENOR forms ')';
mayorIgual: '(' MAYORIGUAL forms ')';
menorIgual: '(' MENORIGUAL forms ')';
igual: '(' IGUAL forms ')';
inc: '(' INC form ')';
when: '(' WHEN forms ')';
isNil: '(' ISNIL form ')';

vl: vector     #vlVector
  | list       #vlList
  ;

vm: vector  #vmVector
  | map     #vmMap
  ;

defecto: form   #defaultForm
       |        #defaultEpsilon
       ;

nth: '(' NTH vl form')';
get: '(' GET vm form defecto')';
contains: '(' CONTAINS set form ')';

vls: vector     #vlsVector
   | list       #vlsList
   | set        #vlsSet
   ;

conj: '(' CONJ vls form ')';
first: '(' FIRST vl ')';

ms: map     #msMap
  | set     #msSet
  ;

keywordGet: '(' keyword ms ')'  #firstKeywordGet
          | '(' ms keyword ')'  #lastKeywordGet
          ;

letParams : symbol form letParams      #letParamsSymbolParams
          | symbol form                #letParamsSymbol
          ;

let: '(' LET '[' letParams ']' forms ')';

functionMap: '(' MAP form vls ')';

vlsm: vector    #vlsmVector
   | list       #vlsmList
   | set        #vlsmSet
   | map        #vlsmMap
   ;

take: '(' TAKE LONG vlsm')';

reduce: '(' REDUCE form vls')';

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
MULT: '*';
DIV: '/';
OR: 'or';
AND: 'and';
STR: 'str';
LOOP: 'loop';
RECUR: 'recur';
SI: 'if';
INC: 'inc';
MAYOR: '>';
MENOR: '<';
MAYORIGUAL: '>=';
MENORIGUAL: '<=';
IGUAL: '=';
HACER: 'do';
WHEN: 'when';
ISNIL: 'nil?';
NTH: 'nth';
GET: 'get';
CONTAINS: 'contains?';
CONJ: 'conj';
FIRST: 'first';
MAP: 'map';
STRING : '"' ( ~'"' | '\\' '"' )* '"' ;
AMPER: '&';
NIL: 'nil';
LET: 'let';
TAKE: 'take';
REDUCE: 'reduce';

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
