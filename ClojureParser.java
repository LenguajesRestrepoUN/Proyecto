// Generated from C:/Users/jccaleroe/Documents/Proyecto\Clojure.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClojureParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, DEF=22, DEFN=23, PRINTLN=24, PRINT=25, 
		SUM=26, MINUS=27, MULT=28, DIV=29, OR=30, AND=31, STR=32, LOOP=33, RECUR=34, 
		SI=35, INC=36, MAYOR=37, MENOR=38, MAYORIGUAL=39, MENORIGUAL=40, IGUAL=41, 
		HACER=42, WHEN=43, ISNIL=44, NTH=45, GET=46, CONTAINS=47, CONJ=48, FIRST=49, 
		MAP=50, STRING=51, AMPER=52, NIL=53, LET=54, TAKE=55, REDUCE=56, FN=57, 
		FLOAT=58, HEX=59, BIN=60, LONG=61, BIGN=62, CHAR_U=63, CHAR_NAMED=64, 
		CHAR_ANY=65, BOOLEAN=66, SYMBOL=67, NS_SYMBOL=68, PARAM_NAME=69, TRASH=70;
	public static final int
		RULE_file = 0, RULE_mainForm = 1, RULE_auxform = 2, RULE_priorForm = 3, 
		RULE_form = 4, RULE_literal = 5, RULE_forms = 6, RULE_auxforms = 7, RULE_list = 8, 
		RULE_vector = 9, RULE_map = 10, RULE_set = 11, RULE_def = 12, RULE_println = 13, 
		RULE_print = 14, RULE_sum = 15, RULE_minus = 16, RULE_mult = 17, RULE_div = 18, 
		RULE_or = 19, RULE_and = 20, RULE_str = 21, RULE_optDescription = 22, 
		RULE_optparams = 23, RULE_symbols = 24, RULE_params = 25, RULE_optLoopParams = 26, 
		RULE_loopParams = 27, RULE_optargs = 28, RULE_args = 29, RULE_defn = 30, 
		RULE_fn = 31, RULE_arity = 32, RULE_callFunction = 33, RULE_loop = 34, 
		RULE_recur = 35, RULE_siFalseForm = 36, RULE_si = 37, RULE_hacer = 38, 
		RULE_mayor = 39, RULE_menor = 40, RULE_mayorIgual = 41, RULE_menorIgual = 42, 
		RULE_igual = 43, RULE_inc = 44, RULE_when = 45, RULE_isNil = 46, RULE_defecto = 47, 
		RULE_nth = 48, RULE_get = 49, RULE_contains = 50, RULE_conj = 51, RULE_first = 52, 
		RULE_keywordGet = 53, RULE_functionMap = 54, RULE_take = 55, RULE_reduce = 56, 
		RULE_letParams = 57, RULE_let = 58, RULE_callFunction2 = 59, RULE_reader_macro = 60, 
		RULE_quote = 61, RULE_backtick = 62, RULE_unquote = 63, RULE_unquote_splicing = 64, 
		RULE_tag = 65, RULE_deref = 66, RULE_gensym = 67, RULE_lambda = 68, RULE_meta_data = 69, 
		RULE_var_quote = 70, RULE_host_expr = 71, RULE_discard = 72, RULE_dispatch = 73, 
		RULE_regex = 74, RULE_number = 75, RULE_character = 76, RULE_named_char = 77, 
		RULE_any_char = 78, RULE_u_hex_quad = 79, RULE_nil = 80, RULE_keyword = 81, 
		RULE_simple_keyword = 82, RULE_macro_keyword = 83, RULE_symbol = 84, RULE_simple_sym = 85, 
		RULE_ns_symbol = 86;
	public static final String[] ruleNames = {
		"file", "mainForm", "auxform", "priorForm", "form", "literal", "forms", 
		"auxforms", "list", "vector", "map", "set", "def", "println", "print", 
		"sum", "minus", "mult", "div", "or", "and", "str", "optDescription", "optparams", 
		"symbols", "params", "optLoopParams", "loopParams", "optargs", "args", 
		"defn", "fn", "arity", "callFunction", "loop", "recur", "siFalseForm", 
		"si", "hacer", "mayor", "menor", "mayorIgual", "menorIgual", "igual", 
		"inc", "when", "isNil", "defecto", "nth", "get", "contains", "conj", "first", 
		"keywordGet", "functionMap", "take", "reduce", "letParams", "let", "callFunction2", 
		"reader_macro", "quote", "backtick", "unquote", "unquote_splicing", "tag", 
		"deref", "gensym", "lambda", "meta_data", "var_quote", "host_expr", "discard", 
		"dispatch", "regex", "number", "character", "named_char", "any_char", 
		"u_hex_quad", "nil", "keyword", "simple_keyword", "macro_keyword", "symbol", 
		"simple_sym", "ns_symbol"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "''('", "')'", "'['", "']'", "'{'", "'}'", "'#{'", "'('", "'''", 
		"'`'", "'~'", "'~@'", "'^'", "'@'", "'#'", "'#('", "'#^'", "'#''", "'#+'", 
		"'#_'", "':'", "'def'", "'defn'", "'println'", "'print'", "'+'", "'-'", 
		"'*'", "'/'", "'or'", "'and'", "'str'", "'loop'", "'recur'", "'if'", "'inc'", 
		"'>'", "'<'", "'>='", "'<='", "'='", "'do'", "'when'", "'nil?'", "'nth'", 
		"'get'", "'contains?'", "'conj'", "'first'", "'map'", null, "'&'", "'nil'", 
		"'let'", "'take'", "'reduce'", "'fn'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "DEF", "DEFN", 
		"PRINTLN", "PRINT", "SUM", "MINUS", "MULT", "DIV", "OR", "AND", "STR", 
		"LOOP", "RECUR", "SI", "INC", "MAYOR", "MENOR", "MAYORIGUAL", "MENORIGUAL", 
		"IGUAL", "HACER", "WHEN", "ISNIL", "NTH", "GET", "CONTAINS", "CONJ", "FIRST", 
		"MAP", "STRING", "AMPER", "NIL", "LET", "TAKE", "REDUCE", "FN", "FLOAT", 
		"HEX", "BIN", "LONG", "BIGN", "CHAR_U", "CHAR_NAMED", "CHAR_ANY", "BOOLEAN", 
		"SYMBOL", "NS_SYMBOL", "PARAM_NAME", "TRASH"
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
	public String getGrammarFileName() { return "Clojure.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ClojureParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public MainFormContext mainForm() {
			return getRuleContext(MainFormContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			mainForm();
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

	public static class MainFormContext extends ParserRuleContext {
		public MainFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainForm; }
	 
		public MainFormContext() { }
		public void copyFrom(MainFormContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MainFormsContext extends MainFormContext {
		public AuxformContext auxform() {
			return getRuleContext(AuxformContext.class,0);
		}
		public MainFormContext mainForm() {
			return getRuleContext(MainFormContext.class,0);
		}
		public MainFormsContext(MainFormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterMainForms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitMainForms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitMainForms(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MainFormFormContext extends MainFormContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public MainFormFormContext(MainFormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterMainFormForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitMainFormForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitMainFormForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFormContext mainForm() throws RecognitionException {
		MainFormContext _localctx = new MainFormContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainForm);
		try {
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new MainFormsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				auxform();
				setState(177);
				mainForm();
				}
				break;
			case 2:
				_localctx = new MainFormFormContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				form();
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

	public static class AuxformContext extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public AuxformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxform; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterAuxform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitAuxform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitAuxform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxformContext auxform() throws RecognitionException {
		AuxformContext _localctx = new AuxformContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_auxform);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			form();
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

	public static class PriorFormContext extends ParserRuleContext {
		public PriorFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priorForm; }
	 
		public PriorFormContext() { }
		public void copyFrom(PriorFormContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PriorFormsContext extends PriorFormContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public PriorFormContext priorForm() {
			return getRuleContext(PriorFormContext.class,0);
		}
		public PriorFormsContext(PriorFormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterPriorForms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitPriorForms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitPriorForms(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PriorFormFormContext extends PriorFormContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public PriorFormFormContext(PriorFormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterPriorFormForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitPriorFormForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitPriorFormForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PriorFormContext priorForm() throws RecognitionException {
		PriorFormContext _localctx = new PriorFormContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_priorForm);
		try {
			setState(188);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new PriorFormsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				form();
				setState(185);
				priorForm();
				}
				break;
			case 2:
				_localctx = new PriorFormFormContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				form();
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

	public static class FormContext extends ParserRuleContext {
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
	 
		public FormContext() { }
		public void copyFrom(FormContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormHacerContext extends FormContext {
		public HacerContext hacer() {
			return getRuleContext(HacerContext.class,0);
		}
		public FormHacerContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormHacer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormHacer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormHacer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormPrintContext extends FormContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public FormPrintContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormCallFunctionContext extends FormContext {
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public FormCallFunctionContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormIsNilContext extends FormContext {
		public IsNilContext isNil() {
			return getRuleContext(IsNilContext.class,0);
		}
		public FormIsNilContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormIsNil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormIsNil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormIsNil(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormsiContext extends FormContext {
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public FormsiContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormsi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormsi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormsi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormPrintlnContext extends FormContext {
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public FormPrintlnContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormPrintln(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormMenorContext extends FormContext {
		public MenorContext menor() {
			return getRuleContext(MenorContext.class,0);
		}
		public FormMenorContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormMenor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormMenor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormCallFunction2Context extends FormContext {
		public CallFunction2Context callFunction2() {
			return getRuleContext(CallFunction2Context.class,0);
		}
		public FormCallFunction2Context(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormCallFunction2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormCallFunction2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormCallFunction2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormMayorIgualContext extends FormContext {
		public MayorIgualContext mayorIgual() {
			return getRuleContext(MayorIgualContext.class,0);
		}
		public FormMayorIgualContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormMayorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormMayorIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormMayorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormTakeContext extends FormContext {
		public TakeContext take() {
			return getRuleContext(TakeContext.class,0);
		}
		public FormTakeContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormTake(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormTake(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormTake(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormReader_macroContext extends FormContext {
		public Reader_macroContext reader_macro() {
			return getRuleContext(Reader_macroContext.class,0);
		}
		public FormReader_macroContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormReader_macro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormReader_macro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormReader_macro(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormStrContext extends FormContext {
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public FormStrContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormContainsContext extends FormContext {
		public ContainsContext contains() {
			return getRuleContext(ContainsContext.class,0);
		}
		public FormContainsContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormContains(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormContains(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormContains(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormMinusContext extends FormContext {
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public FormMinusContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormOrContext extends FormContext {
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public FormOrContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormDefnContext extends FormContext {
		public DefnContext defn() {
			return getRuleContext(DefnContext.class,0);
		}
		public FormDefnContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormDefn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormNthContext extends FormContext {
		public NthContext nth() {
			return getRuleContext(NthContext.class,0);
		}
		public FormNthContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormNth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormNth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormNth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormLiteralContext extends FormContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FormLiteralContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormReduceContext extends FormContext {
		public ReduceContext reduce() {
			return getRuleContext(ReduceContext.class,0);
		}
		public FormReduceContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormReduce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormReduce(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormReduce(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormWhenContext extends FormContext {
		public WhenContext when() {
			return getRuleContext(WhenContext.class,0);
		}
		public FormWhenContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormWhen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormIncContext extends FormContext {
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public FormIncContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormInc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormLetContext extends FormContext {
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public FormLetContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormRecurContext extends FormContext {
		public RecurContext recur() {
			return getRuleContext(RecurContext.class,0);
		}
		public FormRecurContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormRecur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormRecur(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormRecur(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormMultContext extends FormContext {
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public FormMultContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormGetContext extends FormContext {
		public GetContext get() {
			return getRuleContext(GetContext.class,0);
		}
		public FormGetContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormGet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormAndContext extends FormContext {
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public FormAndContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormLoopContext extends FormContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public FormLoopContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormDivContext extends FormContext {
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public FormDivContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormFnContext extends FormContext {
		public FnContext fn() {
			return getRuleContext(FnContext.class,0);
		}
		public FormFnContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormFn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormFn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormFn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormFirstContext extends FormContext {
		public FirstContext first() {
			return getRuleContext(FirstContext.class,0);
		}
		public FormFirstContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormFirst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormFunctionMapContext extends FormContext {
		public FunctionMapContext functionMap() {
			return getRuleContext(FunctionMapContext.class,0);
		}
		public FormFunctionMapContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormFunctionMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormFunctionMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormFunctionMap(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormConjContext extends FormContext {
		public ConjContext conj() {
			return getRuleContext(ConjContext.class,0);
		}
		public FormConjContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormConj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormConj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormConj(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormSumContext extends FormContext {
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public FormSumContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormSum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormMayorContext extends FormContext {
		public MayorContext mayor() {
			return getRuleContext(MayorContext.class,0);
		}
		public FormMayorContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormMayor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormMayor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormMayor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormIgualContext extends FormContext {
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public FormIgualContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormMenorIgualContext extends FormContext {
		public MenorIgualContext menorIgual() {
			return getRuleContext(MenorIgualContext.class,0);
		}
		public FormMenorIgualContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormMenorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormMenorIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormMenorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormDefContext extends FormContext {
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public FormDefContext(FormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_form);
		try {
			setState(227);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new FormLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				literal();
				}
				break;
			case 2:
				_localctx = new FormDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				def();
				}
				break;
			case 3:
				_localctx = new FormDefnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				defn();
				}
				break;
			case 4:
				_localctx = new FormPrintlnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				println();
				}
				break;
			case 5:
				_localctx = new FormPrintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				print();
				}
				break;
			case 6:
				_localctx = new FormSumContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				sum();
				}
				break;
			case 7:
				_localctx = new FormMinusContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(196);
				minus();
				}
				break;
			case 8:
				_localctx = new FormMultContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(197);
				mult();
				}
				break;
			case 9:
				_localctx = new FormDivContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(198);
				div();
				}
				break;
			case 10:
				_localctx = new FormOrContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(199);
				or();
				}
				break;
			case 11:
				_localctx = new FormAndContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(200);
				and();
				}
				break;
			case 12:
				_localctx = new FormStrContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(201);
				str();
				}
				break;
			case 13:
				_localctx = new FormLoopContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(202);
				loop();
				}
				break;
			case 14:
				_localctx = new FormsiContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(203);
				si();
				}
				break;
			case 15:
				_localctx = new FormMayorContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(204);
				mayor();
				}
				break;
			case 16:
				_localctx = new FormMenorContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(205);
				menor();
				}
				break;
			case 17:
				_localctx = new FormMayorIgualContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(206);
				mayorIgual();
				}
				break;
			case 18:
				_localctx = new FormMenorIgualContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(207);
				menorIgual();
				}
				break;
			case 19:
				_localctx = new FormIgualContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(208);
				igual();
				}
				break;
			case 20:
				_localctx = new FormIncContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(209);
				inc();
				}
				break;
			case 21:
				_localctx = new FormHacerContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(210);
				hacer();
				}
				break;
			case 22:
				_localctx = new FormWhenContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(211);
				when();
				}
				break;
			case 23:
				_localctx = new FormIsNilContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(212);
				isNil();
				}
				break;
			case 24:
				_localctx = new FormNthContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(213);
				nth();
				}
				break;
			case 25:
				_localctx = new FormContainsContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(214);
				contains();
				}
				break;
			case 26:
				_localctx = new FormConjContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(215);
				conj();
				}
				break;
			case 27:
				_localctx = new FormGetContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(216);
				get();
				}
				break;
			case 28:
				_localctx = new FormFirstContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(217);
				first();
				}
				break;
			case 29:
				_localctx = new FormLetContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(218);
				let();
				}
				break;
			case 30:
				_localctx = new FormFunctionMapContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(219);
				functionMap();
				}
				break;
			case 31:
				_localctx = new FormTakeContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(220);
				take();
				}
				break;
			case 32:
				_localctx = new FormReduceContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(221);
				reduce();
				}
				break;
			case 33:
				_localctx = new FormCallFunctionContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(222);
				callFunction();
				}
				break;
			case 34:
				_localctx = new FormRecurContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(223);
				recur();
				}
				break;
			case 35:
				_localctx = new FormReader_macroContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(224);
				reader_macro();
				}
				break;
			case 36:
				_localctx = new FormCallFunction2Context(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(225);
				callFunction2();
				}
				break;
			case 37:
				_localctx = new FormFnContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(226);
				fn();
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralNumberContext extends LiteralContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LiteralNumberContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLiteralNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLiteralNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLiteralNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralMapContext extends LiteralContext {
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public LiteralMapContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLiteralMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLiteralMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLiteralMap(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralStringContext extends LiteralContext {
		public TerminalNode STRING() { return getToken(ClojureParser.STRING, 0); }
		public LiteralStringContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLiteralString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLiteralString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLiteralString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralBOOLEANContext extends LiteralContext {
		public TerminalNode BOOLEAN() { return getToken(ClojureParser.BOOLEAN, 0); }
		public LiteralBOOLEANContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLiteralBOOLEAN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLiteralBOOLEAN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLiteralBOOLEAN(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralListContext extends LiteralContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public LiteralListContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLiteralList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLiteralList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLiteralList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralVectorContext extends LiteralContext {
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public LiteralVectorContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLiteralVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLiteralVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLiteralVector(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralCharacterContext extends LiteralContext {
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public LiteralCharacterContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLiteralCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLiteralCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLiteralCharacter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralParam_nameContext extends LiteralContext {
		public TerminalNode PARAM_NAME() { return getToken(ClojureParser.PARAM_NAME, 0); }
		public LiteralParam_nameContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLiteralParam_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLiteralParam_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLiteralParam_name(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralKeywordContext extends LiteralContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public LiteralKeywordContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLiteralKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLiteralKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLiteralKeyword(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralNilContext extends LiteralContext {
		public NilContext nil() {
			return getRuleContext(NilContext.class,0);
		}
		public LiteralNilContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLiteralNil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLiteralNil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLiteralNil(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralSymbolContext extends LiteralContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public LiteralSymbolContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLiteralSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLiteralSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLiteralSymbol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralSetContext extends LiteralContext {
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public LiteralSetContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLiteralSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLiteralSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLiteralSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_literal);
		try {
			setState(241);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new LiteralStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(STRING);
				}
				break;
			case FLOAT:
			case HEX:
			case BIN:
			case LONG:
			case BIGN:
				_localctx = new LiteralNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				number();
				}
				break;
			case CHAR_U:
			case CHAR_NAMED:
			case CHAR_ANY:
				_localctx = new LiteralCharacterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				character();
				}
				break;
			case NIL:
				_localctx = new LiteralNilContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				nil();
				}
				break;
			case BOOLEAN:
				_localctx = new LiteralBOOLEANContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(233);
				match(BOOLEAN);
				}
				break;
			case T__20:
				_localctx = new LiteralKeywordContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(234);
				keyword();
				}
				break;
			case SUM:
			case MINUS:
			case MULT:
			case DIV:
			case STR:
			case INC:
			case MAYOR:
			case MENOR:
			case MAYORIGUAL:
			case MENORIGUAL:
			case IGUAL:
			case SYMBOL:
			case NS_SYMBOL:
				_localctx = new LiteralSymbolContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(235);
				symbol();
				}
				break;
			case PARAM_NAME:
				_localctx = new LiteralParam_nameContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(236);
				match(PARAM_NAME);
				}
				break;
			case T__0:
				_localctx = new LiteralListContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(237);
				list();
				}
				break;
			case T__2:
				_localctx = new LiteralVectorContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(238);
				vector();
				}
				break;
			case T__4:
				_localctx = new LiteralMapContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(239);
				map();
				}
				break;
			case T__6:
				_localctx = new LiteralSetContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(240);
				set();
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

	public static class FormsContext extends ParserRuleContext {
		public FormsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forms; }
	 
		public FormsContext() { }
		public void copyFrom(FormsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormsFormContext extends FormsContext {
		public PriorFormContext priorForm() {
			return getRuleContext(PriorFormContext.class,0);
		}
		public FormsFormContext(FormsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormsForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormsForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormsForm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormsEpsilonContext extends FormsContext {
		public FormsEpsilonContext(FormsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFormsEpsilon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFormsEpsilon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFormsEpsilon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormsContext forms() throws RecognitionException {
		FormsContext _localctx = new FormsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forms);
		try {
			setState(245);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case SUM:
			case MINUS:
			case MULT:
			case DIV:
			case STR:
			case INC:
			case MAYOR:
			case MENOR:
			case MAYORIGUAL:
			case MENORIGUAL:
			case IGUAL:
			case STRING:
			case NIL:
			case FLOAT:
			case HEX:
			case BIN:
			case LONG:
			case BIGN:
			case CHAR_U:
			case CHAR_NAMED:
			case CHAR_ANY:
			case BOOLEAN:
			case SYMBOL:
			case NS_SYMBOL:
			case PARAM_NAME:
				_localctx = new FormsFormContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				priorForm();
				}
				break;
			case T__1:
			case T__3:
			case T__5:
				_localctx = new FormsEpsilonContext(_localctx);
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

	public static class AuxformsContext extends ParserRuleContext {
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public AuxformsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxforms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterAuxforms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitAuxforms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitAuxforms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxformsContext auxforms() throws RecognitionException {
		AuxformsContext _localctx = new AuxformsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_auxforms);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			forms();
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

	public static class ListContext extends ParserRuleContext {
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__0);
			setState(250);
			forms();
			setState(251);
			match(T__1);
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

	public static class VectorContext extends ParserRuleContext {
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__2);
			setState(254);
			forms();
			setState(255);
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

	public static class MapContext extends ParserRuleContext {
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__4);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << SUM) | (1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << STR) | (1L << INC) | (1L << MAYOR) | (1L << MENOR) | (1L << MAYORIGUAL) | (1L << MENORIGUAL) | (1L << IGUAL) | (1L << STRING) | (1L << NIL) | (1L << FLOAT) | (1L << HEX) | (1L << BIN) | (1L << LONG) | (1L << BIGN) | (1L << CHAR_U))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CHAR_NAMED - 64)) | (1L << (CHAR_ANY - 64)) | (1L << (BOOLEAN - 64)) | (1L << (SYMBOL - 64)) | (1L << (NS_SYMBOL - 64)) | (1L << (PARAM_NAME - 64)))) != 0)) {
				{
				{
				setState(258);
				form();
				setState(259);
				form();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(T__5);
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

	public static class SetContext extends ParserRuleContext {
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__6);
			setState(269);
			forms();
			setState(270);
			match(T__5);
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

	public static class DefContext extends ParserRuleContext {
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
	 
		public DefContext() { }
		public void copyFrom(DefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefSymbolContext extends DefContext {
		public TerminalNode DEF() { return getToken(ClojureParser.DEF, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public DefSymbolContext(DefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterDefSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitDefSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitDefSymbol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefSymbolFormContext extends DefContext {
		public TerminalNode DEF() { return getToken(ClojureParser.DEF, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public DefSymbolFormContext(DefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterDefSymbolForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitDefSymbolForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitDefSymbolForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_def);
		try {
			setState(283);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new DefSymbolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(T__7);
				setState(273);
				match(DEF);
				setState(274);
				symbol();
				setState(275);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new DefSymbolFormContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(T__7);
				setState(278);
				match(DEF);
				setState(279);
				symbol();
				setState(280);
				form();
				setState(281);
				match(T__1);
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

	public static class PrintlnContext extends ParserRuleContext {
		public TerminalNode PRINTLN() { return getToken(ClojureParser.PRINTLN, 0); }
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__7);
			setState(286);
			match(PRINTLN);
			setState(287);
			forms();
			setState(288);
			match(T__1);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ClojureParser.PRINT, 0); }
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__7);
			setState(291);
			match(PRINT);
			setState(292);
			forms();
			setState(293);
			match(T__1);
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

	public static class SumContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(ClojureParser.SUM, 0); }
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__7);
			setState(296);
			match(SUM);
			setState(297);
			forms();
			setState(298);
			match(T__1);
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

	public static class MinusContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(ClojureParser.MINUS, 0); }
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__7);
			setState(301);
			match(MINUS);
			setState(302);
			forms();
			setState(303);
			match(T__1);
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

	public static class MultContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(ClojureParser.MULT, 0); }
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__7);
			setState(306);
			match(MULT);
			setState(307);
			forms();
			setState(308);
			match(T__1);
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

	public static class DivContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(ClojureParser.DIV, 0); }
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__7);
			setState(311);
			match(DIV);
			setState(312);
			forms();
			setState(313);
			match(T__1);
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

	public static class OrContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(ClojureParser.OR, 0); }
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__7);
			setState(316);
			match(OR);
			setState(317);
			forms();
			setState(318);
			match(T__1);
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

	public static class AndContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(ClojureParser.AND, 0); }
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(T__7);
			setState(321);
			match(AND);
			setState(322);
			forms();
			setState(323);
			match(T__1);
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

	public static class StrContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(ClojureParser.STR, 0); }
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__7);
			setState(326);
			match(STR);
			setState(327);
			forms();
			setState(328);
			match(T__1);
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

	public static class OptDescriptionContext extends ParserRuleContext {
		public OptDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optDescription; }
	 
		public OptDescriptionContext() { }
		public void copyFrom(OptDescriptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DescriptionContext extends OptDescriptionContext {
		public TerminalNode STRING() { return getToken(ClojureParser.STRING, 0); }
		public DescriptionContext(OptDescriptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NoDescriptionContext extends OptDescriptionContext {
		public NoDescriptionContext(OptDescriptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterNoDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitNoDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitNoDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptDescriptionContext optDescription() throws RecognitionException {
		OptDescriptionContext _localctx = new OptDescriptionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_optDescription);
		try {
			setState(332);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new DescriptionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(STRING);
				}
				break;
			case T__2:
			case T__7:
				_localctx = new NoDescriptionContext(_localctx);
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

	public static class OptparamsContext extends ParserRuleContext {
		public OptparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optparams; }
	 
		public OptparamsContext() { }
		public void copyFrom(OptparamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OptparamsParamsContext extends OptparamsContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public OptparamsParamsContext(OptparamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterOptparamsParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitOptparamsParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitOptparamsParams(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptparamsEpsilonContext extends OptparamsContext {
		public OptparamsEpsilonContext(OptparamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterOptparamsEpsilon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitOptparamsEpsilon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitOptparamsEpsilon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptparamsContext optparams() throws RecognitionException {
		OptparamsContext _localctx = new OptparamsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_optparams);
		try {
			setState(336);
			switch (_input.LA(1)) {
			case T__2:
			case SUM:
			case MINUS:
			case MULT:
			case DIV:
			case STR:
			case INC:
			case MAYOR:
			case MENOR:
			case MAYORIGUAL:
			case MENORIGUAL:
			case IGUAL:
			case AMPER:
			case SYMBOL:
			case NS_SYMBOL:
				_localctx = new OptparamsParamsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				params();
				}
				break;
			case T__3:
				_localctx = new OptparamsEpsilonContext(_localctx);
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

	public static class SymbolsContext extends ParserRuleContext {
		public SymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbols; }
	 
		public SymbolsContext() { }
		public void copyFrom(SymbolsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SymbolsSymbolContext extends SymbolsContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public SymbolsSymbolContext(SymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSymbolsSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSymbolsSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSymbolsSymbol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SymbolsEpsilonContext extends SymbolsContext {
		public SymbolsEpsilonContext(SymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSymbolsEpsilon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSymbolsEpsilon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSymbolsEpsilon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolsContext symbols() throws RecognitionException {
		SymbolsContext _localctx = new SymbolsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_symbols);
		try {
			setState(342);
			switch (_input.LA(1)) {
			case SUM:
			case MINUS:
			case MULT:
			case DIV:
			case STR:
			case INC:
			case MAYOR:
			case MENOR:
			case MAYORIGUAL:
			case MENORIGUAL:
			case IGUAL:
			case SYMBOL:
			case NS_SYMBOL:
				_localctx = new SymbolsSymbolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				symbol();
				setState(339);
				symbols();
				}
				break;
			case T__3:
				_localctx = new SymbolsEpsilonContext(_localctx);
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

	public static class ParamsContext extends ParserRuleContext {
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	 
		public ParamsContext() { }
		public void copyFrom(ParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamsSymbolContext extends ParamsContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ParamsSymbolContext(ParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterParamsSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitParamsSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitParamsSymbol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamsRestParameterContext extends ParamsContext {
		public TerminalNode AMPER() { return getToken(ClojureParser.AMPER, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ParamsRestParameterContext(ParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterParamsRestParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitParamsRestParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitParamsRestParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamsSymbolParamsContext extends ParamsContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsSymbolParamsContext(ParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterParamsSymbolParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitParamsSymbolParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitParamsSymbolParams(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamsDestructuringContext extends ParamsContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public ParamsDestructuringContext(ParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterParamsDestructuring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitParamsDestructuring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitParamsDestructuring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamsDestructuringParamsContext extends ParamsContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsDestructuringParamsContext(ParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterParamsDestructuringParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitParamsDestructuringParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitParamsDestructuringParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_params);
		try {
			setState(361);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ParamsSymbolParamsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				symbol();
				setState(345);
				params();
				}
				break;
			case 2:
				_localctx = new ParamsSymbolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				symbol();
				}
				break;
			case 3:
				_localctx = new ParamsRestParameterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				match(AMPER);
				setState(349);
				symbol();
				}
				break;
			case 4:
				_localctx = new ParamsDestructuringParamsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				match(T__2);
				setState(351);
				symbol();
				setState(352);
				symbols();
				setState(353);
				match(T__3);
				setState(354);
				params();
				}
				break;
			case 5:
				_localctx = new ParamsDestructuringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(356);
				match(T__2);
				setState(357);
				symbol();
				setState(358);
				symbols();
				setState(359);
				match(T__3);
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

	public static class OptLoopParamsContext extends ParserRuleContext {
		public OptLoopParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optLoopParams; }
	 
		public OptLoopParamsContext() { }
		public void copyFrom(OptLoopParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OptLoopParamsParamsContext extends OptLoopParamsContext {
		public LoopParamsContext loopParams() {
			return getRuleContext(LoopParamsContext.class,0);
		}
		public OptLoopParamsParamsContext(OptLoopParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterOptLoopParamsParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitOptLoopParamsParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitOptLoopParamsParams(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptLoopParamsEpsilonContext extends OptLoopParamsContext {
		public OptLoopParamsEpsilonContext(OptLoopParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterOptLoopParamsEpsilon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitOptLoopParamsEpsilon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitOptLoopParamsEpsilon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptLoopParamsContext optLoopParams() throws RecognitionException {
		OptLoopParamsContext _localctx = new OptLoopParamsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_optLoopParams);
		try {
			setState(365);
			switch (_input.LA(1)) {
			case SUM:
			case MINUS:
			case MULT:
			case DIV:
			case STR:
			case INC:
			case MAYOR:
			case MENOR:
			case MAYORIGUAL:
			case MENORIGUAL:
			case IGUAL:
			case SYMBOL:
			case NS_SYMBOL:
				_localctx = new OptLoopParamsParamsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				loopParams();
				}
				break;
			case T__3:
				_localctx = new OptLoopParamsEpsilonContext(_localctx);
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

	public static class LoopParamsContext extends ParserRuleContext {
		public LoopParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopParams; }
	 
		public LoopParamsContext() { }
		public void copyFrom(LoopParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopParamsSymbolContext extends LoopParamsContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public LoopParamsSymbolContext(LoopParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLoopParamsSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLoopParamsSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLoopParamsSymbol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopParamsSymbolParamsContext extends LoopParamsContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public LoopParamsContext loopParams() {
			return getRuleContext(LoopParamsContext.class,0);
		}
		public LoopParamsSymbolParamsContext(LoopParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLoopParamsSymbolParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLoopParamsSymbolParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLoopParamsSymbolParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopParamsContext loopParams() throws RecognitionException {
		LoopParamsContext _localctx = new LoopParamsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_loopParams);
		try {
			setState(374);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new LoopParamsSymbolParamsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				symbol();
				setState(368);
				form();
				setState(369);
				loopParams();
				}
				break;
			case 2:
				_localctx = new LoopParamsSymbolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				symbol();
				setState(372);
				form();
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

	public static class OptargsContext extends ParserRuleContext {
		public OptargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optargs; }
	 
		public OptargsContext() { }
		public void copyFrom(OptargsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OptargsEpsilonContext extends OptargsContext {
		public OptargsEpsilonContext(OptargsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterOptargsEpsilon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitOptargsEpsilon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitOptargsEpsilon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptargsArgsContext extends OptargsContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public OptargsArgsContext(OptargsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterOptargsArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitOptargsArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitOptargsArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptargsContext optargs() throws RecognitionException {
		OptargsContext _localctx = new OptargsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_optargs);
		try {
			setState(378);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case SUM:
			case MINUS:
			case MULT:
			case DIV:
			case STR:
			case INC:
			case MAYOR:
			case MENOR:
			case MAYORIGUAL:
			case MENORIGUAL:
			case IGUAL:
			case STRING:
			case NIL:
			case FLOAT:
			case HEX:
			case BIN:
			case LONG:
			case BIGN:
			case CHAR_U:
			case CHAR_NAMED:
			case CHAR_ANY:
			case BOOLEAN:
			case SYMBOL:
			case NS_SYMBOL:
			case PARAM_NAME:
				_localctx = new OptargsArgsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				args();
				}
				break;
			case T__1:
				_localctx = new OptargsEpsilonContext(_localctx);
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

	public static class ArgsContext extends ParserRuleContext {
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	 
		public ArgsContext() { }
		public void copyFrom(ArgsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgsSymbolContext extends ArgsContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public ArgsSymbolContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterArgsSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitArgsSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitArgsSymbol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgsSymbolArgsContext extends ArgsContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgsSymbolArgsContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterArgsSymbolArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitArgsSymbolArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitArgsSymbolArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_args);
		try {
			setState(384);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ArgsSymbolArgsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				form();
				setState(381);
				args();
				}
				break;
			case 2:
				_localctx = new ArgsSymbolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				form();
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

	public static class DefnContext extends ParserRuleContext {
		public DefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defn; }
	 
		public DefnContext() { }
		public void copyFrom(DefnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefnArityContext extends DefnContext {
		public TerminalNode DEFN() { return getToken(ClojureParser.DEFN, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public OptDescriptionContext optDescription() {
			return getRuleContext(OptDescriptionContext.class,0);
		}
		public List<ArityContext> arity() {
			return getRuleContexts(ArityContext.class);
		}
		public ArityContext arity(int i) {
			return getRuleContext(ArityContext.class,i);
		}
		public DefnArityContext(DefnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterDefnArity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitDefnArity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitDefnArity(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleDefnContext extends DefnContext {
		public TerminalNode DEFN() { return getToken(ClojureParser.DEFN, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public OptDescriptionContext optDescription() {
			return getRuleContext(OptDescriptionContext.class,0);
		}
		public OptparamsContext optparams() {
			return getRuleContext(OptparamsContext.class,0);
		}
		public AuxformsContext auxforms() {
			return getRuleContext(AuxformsContext.class,0);
		}
		public SingleDefnContext(DefnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSingleDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSingleDefn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSingleDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefnContext defn() throws RecognitionException {
		DefnContext _localctx = new DefnContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_defn);
		int _la;
		try {
			setState(407);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new SingleDefnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(T__7);
				setState(387);
				match(DEFN);
				setState(388);
				symbol();
				setState(389);
				optDescription();
				setState(390);
				match(T__2);
				setState(391);
				optparams();
				setState(392);
				match(T__3);
				setState(393);
				auxforms();
				setState(394);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new DefnArityContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(T__7);
				setState(397);
				match(DEFN);
				setState(398);
				symbol();
				setState(399);
				optDescription();
				setState(401); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(400);
					arity();
					}
					}
					setState(403); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__7 );
				setState(405);
				match(T__1);
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

	public static class FnContext extends ParserRuleContext {
		public TerminalNode FN() { return getToken(ClojureParser.FN, 0); }
		public OptparamsContext optparams() {
			return getRuleContext(OptparamsContext.class,0);
		}
		public AuxformsContext auxforms() {
			return getRuleContext(AuxformsContext.class,0);
		}
		public FnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnContext fn() throws RecognitionException {
		FnContext _localctx = new FnContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(T__7);
			setState(410);
			match(FN);
			setState(411);
			match(T__2);
			setState(412);
			optparams();
			setState(413);
			match(T__3);
			setState(414);
			auxforms();
			setState(415);
			match(T__1);
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

	public static class ArityContext extends ParserRuleContext {
		public OptparamsContext optparams() {
			return getRuleContext(OptparamsContext.class,0);
		}
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public ArityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterArity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitArity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitArity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArityContext arity() throws RecognitionException {
		ArityContext _localctx = new ArityContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(T__7);
			setState(418);
			match(T__2);
			setState(419);
			optparams();
			setState(420);
			match(T__3);
			setState(421);
			forms();
			setState(422);
			match(T__1);
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

	public static class CallFunctionContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public OptargsContext optargs() {
			return getRuleContext(OptargsContext.class,0);
		}
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_callFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(T__7);
			setState(425);
			symbol();
			setState(426);
			optargs();
			setState(427);
			match(T__1);
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(ClojureParser.LOOP, 0); }
		public OptLoopParamsContext optLoopParams() {
			return getRuleContext(OptLoopParamsContext.class,0);
		}
		public AuxformsContext auxforms() {
			return getRuleContext(AuxformsContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T__7);
			setState(430);
			match(LOOP);
			setState(431);
			match(T__2);
			setState(432);
			optLoopParams();
			setState(433);
			match(T__3);
			setState(434);
			auxforms();
			setState(435);
			match(T__1);
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

	public static class RecurContext extends ParserRuleContext {
		public TerminalNode RECUR() { return getToken(ClojureParser.RECUR, 0); }
		public OptargsContext optargs() {
			return getRuleContext(OptargsContext.class,0);
		}
		public RecurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterRecur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitRecur(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitRecur(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecurContext recur() throws RecognitionException {
		RecurContext _localctx = new RecurContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_recur);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(T__7);
			setState(438);
			match(RECUR);
			setState(439);
			optargs();
			setState(440);
			match(T__1);
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

	public static class SiFalseFormContext extends ParserRuleContext {
		public SiFalseFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siFalseForm; }
	 
		public SiFalseFormContext() { }
		public void copyFrom(SiFalseFormContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FalseFormContext extends SiFalseFormContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public FalseFormContext(SiFalseFormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFalseForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFalseForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFalseForm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseEpsilonContext extends SiFalseFormContext {
		public FalseEpsilonContext(SiFalseFormContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFalseEpsilon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFalseEpsilon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFalseEpsilon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiFalseFormContext siFalseForm() throws RecognitionException {
		SiFalseFormContext _localctx = new SiFalseFormContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_siFalseForm);
		try {
			setState(444);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case SUM:
			case MINUS:
			case MULT:
			case DIV:
			case STR:
			case INC:
			case MAYOR:
			case MENOR:
			case MAYORIGUAL:
			case MENORIGUAL:
			case IGUAL:
			case STRING:
			case NIL:
			case FLOAT:
			case HEX:
			case BIN:
			case LONG:
			case BIGN:
			case CHAR_U:
			case CHAR_NAMED:
			case CHAR_ANY:
			case BOOLEAN:
			case SYMBOL:
			case NS_SYMBOL:
			case PARAM_NAME:
				_localctx = new FalseFormContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				form();
				}
				break;
			case T__1:
				_localctx = new FalseEpsilonContext(_localctx);
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

	public static class SiContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(ClojureParser.SI, 0); }
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public SiFalseFormContext siFalseForm() {
			return getRuleContext(SiFalseFormContext.class,0);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(T__7);
			setState(447);
			match(SI);
			setState(448);
			form();
			setState(449);
			form();
			setState(450);
			siFalseForm();
			setState(451);
			match(T__1);
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

	public static class HacerContext extends ParserRuleContext {
		public TerminalNode HACER() { return getToken(ClojureParser.HACER, 0); }
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public HacerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hacer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterHacer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitHacer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitHacer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HacerContext hacer() throws RecognitionException {
		HacerContext _localctx = new HacerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_hacer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(T__7);
			setState(454);
			match(HACER);
			setState(455);
			forms();
			setState(456);
			match(T__1);
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

	public static class MayorContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(ClojureParser.MAYOR, 0); }
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public MayorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterMayor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitMayor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitMayor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MayorContext mayor() throws RecognitionException {
		MayorContext _localctx = new MayorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_mayor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(T__7);
			setState(459);
			match(MAYOR);
			setState(460);
			forms();
			setState(461);
			match(T__1);
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

	public static class MenorContext extends ParserRuleContext {
		public TerminalNode MENOR() { return getToken(ClojureParser.MENOR, 0); }
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public MenorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitMenor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitMenor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenorContext menor() throws RecognitionException {
		MenorContext _localctx = new MenorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_menor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(T__7);
			setState(464);
			match(MENOR);
			setState(465);
			forms();
			setState(466);
			match(T__1);
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

	public static class MayorIgualContext extends ParserRuleContext {
		public TerminalNode MAYORIGUAL() { return getToken(ClojureParser.MAYORIGUAL, 0); }
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public MayorIgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayorIgual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterMayorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitMayorIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitMayorIgual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MayorIgualContext mayorIgual() throws RecognitionException {
		MayorIgualContext _localctx = new MayorIgualContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_mayorIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(T__7);
			setState(469);
			match(MAYORIGUAL);
			setState(470);
			forms();
			setState(471);
			match(T__1);
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

	public static class MenorIgualContext extends ParserRuleContext {
		public TerminalNode MENORIGUAL() { return getToken(ClojureParser.MENORIGUAL, 0); }
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public MenorIgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menorIgual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterMenorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitMenorIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitMenorIgual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenorIgualContext menorIgual() throws RecognitionException {
		MenorIgualContext _localctx = new MenorIgualContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_menorIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(T__7);
			setState(474);
			match(MENORIGUAL);
			setState(475);
			forms();
			setState(476);
			match(T__1);
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

	public static class IgualContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(ClojureParser.IGUAL, 0); }
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public IgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitIgual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgualContext igual() throws RecognitionException {
		IgualContext _localctx = new IgualContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(T__7);
			setState(479);
			match(IGUAL);
			setState(480);
			forms();
			setState(481);
			match(T__1);
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

	public static class IncContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(ClojureParser.INC, 0); }
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_inc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(T__7);
			setState(484);
			match(INC);
			setState(485);
			form();
			setState(486);
			match(T__1);
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

	public static class WhenContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(ClojureParser.WHEN, 0); }
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public WhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenContext when() throws RecognitionException {
		WhenContext _localctx = new WhenContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_when);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(T__7);
			setState(489);
			match(WHEN);
			setState(490);
			forms();
			setState(491);
			match(T__1);
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

	public static class IsNilContext extends ParserRuleContext {
		public TerminalNode ISNIL() { return getToken(ClojureParser.ISNIL, 0); }
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public IsNilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isNil; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterIsNil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitIsNil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitIsNil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsNilContext isNil() throws RecognitionException {
		IsNilContext _localctx = new IsNilContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_isNil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(T__7);
			setState(494);
			match(ISNIL);
			setState(495);
			form();
			setState(496);
			match(T__1);
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

	public static class DefectoContext extends ParserRuleContext {
		public DefectoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defecto; }
	 
		public DefectoContext() { }
		public void copyFrom(DefectoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefaultEpsilonContext extends DefectoContext {
		public DefaultEpsilonContext(DefectoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterDefaultEpsilon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitDefaultEpsilon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitDefaultEpsilon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefaultFormContext extends DefectoContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public DefaultFormContext(DefectoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterDefaultForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitDefaultForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitDefaultForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefectoContext defecto() throws RecognitionException {
		DefectoContext _localctx = new DefectoContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_defecto);
		try {
			setState(500);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case SUM:
			case MINUS:
			case MULT:
			case DIV:
			case STR:
			case INC:
			case MAYOR:
			case MENOR:
			case MAYORIGUAL:
			case MENORIGUAL:
			case IGUAL:
			case STRING:
			case NIL:
			case FLOAT:
			case HEX:
			case BIN:
			case LONG:
			case BIGN:
			case CHAR_U:
			case CHAR_NAMED:
			case CHAR_ANY:
			case BOOLEAN:
			case SYMBOL:
			case NS_SYMBOL:
			case PARAM_NAME:
				_localctx = new DefaultFormContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				form();
				}
				break;
			case T__1:
				_localctx = new DefaultEpsilonContext(_localctx);
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

	public static class NthContext extends ParserRuleContext {
		public TerminalNode NTH() { return getToken(ClojureParser.NTH, 0); }
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public NthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterNth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitNth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitNth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NthContext nth() throws RecognitionException {
		NthContext _localctx = new NthContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_nth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(T__7);
			setState(503);
			match(NTH);
			setState(504);
			form();
			setState(505);
			form();
			setState(506);
			match(T__1);
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

	public static class GetContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(ClojureParser.GET, 0); }
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public DefectoContext defecto() {
			return getRuleContext(DefectoContext.class,0);
		}
		public GetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitGet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetContext get() throws RecognitionException {
		GetContext _localctx = new GetContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(T__7);
			setState(509);
			match(GET);
			setState(510);
			form();
			setState(511);
			form();
			setState(512);
			defecto();
			setState(513);
			match(T__1);
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

	public static class ContainsContext extends ParserRuleContext {
		public ContainsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contains; }
	 
		public ContainsContext() { }
		public void copyFrom(ContainsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ContainssetContext extends ContainsContext {
		public TerminalNode CONTAINS() { return getToken(ClojureParser.CONTAINS, 0); }
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public ContainssetContext(ContainsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterContainsset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitContainsset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitContainsset(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainsvectorContext extends ContainsContext {
		public TerminalNode CONTAINS() { return getToken(ClojureParser.CONTAINS, 0); }
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public ContainsvectorContext(ContainsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterContainsvector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitContainsvector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitContainsvector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainsContext contains() throws RecognitionException {
		ContainsContext _localctx = new ContainsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_contains);
		try {
			setState(527);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ContainssetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				match(T__7);
				setState(516);
				match(CONTAINS);
				setState(517);
				set();
				setState(518);
				form();
				setState(519);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new ContainsvectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				match(T__7);
				setState(522);
				match(CONTAINS);
				setState(523);
				vector();
				setState(524);
				form();
				setState(525);
				match(T__1);
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

	public static class ConjContext extends ParserRuleContext {
		public TerminalNode CONJ() { return getToken(ClojureParser.CONJ, 0); }
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public ConjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterConj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitConj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitConj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjContext conj() throws RecognitionException {
		ConjContext _localctx = new ConjContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_conj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(T__7);
			setState(530);
			match(CONJ);
			setState(531);
			form();
			setState(532);
			form();
			setState(533);
			match(T__1);
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

	public static class FirstContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(ClojureParser.FIRST, 0); }
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public FirstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstContext first() throws RecognitionException {
		FirstContext _localctx = new FirstContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_first);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(T__7);
			setState(536);
			match(FIRST);
			setState(537);
			form();
			setState(538);
			match(T__1);
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

	public static class KeywordGetContext extends ParserRuleContext {
		public KeywordGetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordGet; }
	 
		public KeywordGetContext() { }
		public void copyFrom(KeywordGetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LastKeywordGetContext extends KeywordGetContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public LastKeywordGetContext(KeywordGetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLastKeywordGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLastKeywordGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLastKeywordGet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstKeywordGetContext extends KeywordGetContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public FirstKeywordGetContext(KeywordGetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFirstKeywordGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFirstKeywordGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFirstKeywordGet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordGetContext keywordGet() throws RecognitionException {
		KeywordGetContext _localctx = new KeywordGetContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_keywordGet);
		try {
			setState(550);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new FirstKeywordGetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(T__7);
				setState(541);
				keyword();
				setState(542);
				form();
				setState(543);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new LastKeywordGetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				match(T__7);
				setState(546);
				form();
				setState(547);
				keyword();
				setState(548);
				match(T__1);
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

	public static class FunctionMapContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(ClojureParser.MAP, 0); }
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public FunctionMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterFunctionMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitFunctionMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFunctionMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionMapContext functionMap() throws RecognitionException {
		FunctionMapContext _localctx = new FunctionMapContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_functionMap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(T__7);
			setState(553);
			match(MAP);
			setState(554);
			form();
			setState(555);
			form();
			setState(556);
			match(T__1);
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

	public static class TakeContext extends ParserRuleContext {
		public TerminalNode TAKE() { return getToken(ClojureParser.TAKE, 0); }
		public TerminalNode LONG() { return getToken(ClojureParser.LONG, 0); }
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public TakeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_take; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterTake(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitTake(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitTake(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TakeContext take() throws RecognitionException {
		TakeContext _localctx = new TakeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_take);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(T__7);
			setState(559);
			match(TAKE);
			setState(560);
			match(LONG);
			setState(561);
			form();
			setState(562);
			match(T__1);
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

	public static class ReduceContext extends ParserRuleContext {
		public TerminalNode REDUCE() { return getToken(ClojureParser.REDUCE, 0); }
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public ReduceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reduce; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterReduce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitReduce(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitReduce(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReduceContext reduce() throws RecognitionException {
		ReduceContext _localctx = new ReduceContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_reduce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(T__7);
			setState(565);
			match(REDUCE);
			setState(566);
			form();
			setState(567);
			form();
			setState(568);
			match(T__1);
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

	public static class LetParamsContext extends ParserRuleContext {
		public LetParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letParams; }
	 
		public LetParamsContext() { }
		public void copyFrom(LetParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LetParamsSymbolContext extends LetParamsContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public LetParamsSymbolContext(LetParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLetParamsSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLetParamsSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLetParamsSymbol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetParamsSymbolParamsContext extends LetParamsContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public LetParamsContext letParams() {
			return getRuleContext(LetParamsContext.class,0);
		}
		public LetParamsSymbolParamsContext(LetParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLetParamsSymbolParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLetParamsSymbolParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLetParamsSymbolParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetParamsContext letParams() throws RecognitionException {
		LetParamsContext _localctx = new LetParamsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_letParams);
		try {
			setState(577);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new LetParamsSymbolParamsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				symbol();
				setState(571);
				form();
				setState(572);
				letParams();
				}
				break;
			case 2:
				_localctx = new LetParamsSymbolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				symbol();
				setState(575);
				form();
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

	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(ClojureParser.LET, 0); }
		public LetParamsContext letParams() {
			return getRuleContext(LetParamsContext.class,0);
		}
		public FormsContext forms() {
			return getRuleContext(FormsContext.class,0);
		}
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(T__7);
			setState(580);
			match(LET);
			setState(581);
			match(T__2);
			setState(582);
			letParams();
			setState(583);
			match(T__3);
			setState(584);
			forms();
			setState(585);
			match(T__1);
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

	public static class CallFunction2Context extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public OptargsContext optargs() {
			return getRuleContext(OptargsContext.class,0);
		}
		public CallFunction2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterCallFunction2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitCallFunction2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitCallFunction2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunction2Context callFunction2() throws RecognitionException {
		CallFunction2Context _localctx = new CallFunction2Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_callFunction2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(T__7);
			setState(588);
			form();
			setState(589);
			optargs();
			setState(590);
			match(T__1);
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

	public static class Reader_macroContext extends ParserRuleContext {
		public Reader_macroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reader_macro; }
	 
		public Reader_macroContext() { }
		public void copyFrom(Reader_macroContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RmUnquote_splicingContext extends Reader_macroContext {
		public Unquote_splicingContext unquote_splicing() {
			return getRuleContext(Unquote_splicingContext.class,0);
		}
		public RmUnquote_splicingContext(Reader_macroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterRmUnquote_splicing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitRmUnquote_splicing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitRmUnquote_splicing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RmMeta_dataContext extends Reader_macroContext {
		public Meta_dataContext meta_data() {
			return getRuleContext(Meta_dataContext.class,0);
		}
		public RmMeta_dataContext(Reader_macroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterRmMeta_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitRmMeta_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitRmMeta_data(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RmDerefContext extends Reader_macroContext {
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public RmDerefContext(Reader_macroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterRmDeref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitRmDeref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitRmDeref(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RmTagContext extends Reader_macroContext {
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public RmTagContext(Reader_macroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterRmTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitRmTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitRmTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RmUnquoteContext extends Reader_macroContext {
		public UnquoteContext unquote() {
			return getRuleContext(UnquoteContext.class,0);
		}
		public RmUnquoteContext(Reader_macroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterRmUnquote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitRmUnquote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitRmUnquote(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RmGensymContext extends Reader_macroContext {
		public GensymContext gensym() {
			return getRuleContext(GensymContext.class,0);
		}
		public RmGensymContext(Reader_macroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterRmGensym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitRmGensym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitRmGensym(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RmDiscardContext extends Reader_macroContext {
		public DiscardContext discard() {
			return getRuleContext(DiscardContext.class,0);
		}
		public RmDiscardContext(Reader_macroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterRmDiscard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitRmDiscard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitRmDiscard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RmQuoteContext extends Reader_macroContext {
		public QuoteContext quote() {
			return getRuleContext(QuoteContext.class,0);
		}
		public RmQuoteContext(Reader_macroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterRmQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitRmQuote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitRmQuote(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RmBacktickContext extends Reader_macroContext {
		public BacktickContext backtick() {
			return getRuleContext(BacktickContext.class,0);
		}
		public RmBacktickContext(Reader_macroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterRmBacktick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitRmBacktick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitRmBacktick(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RmRegexContext extends Reader_macroContext {
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public RmRegexContext(Reader_macroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterRmRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitRmRegex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitRmRegex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RmHost_exprContext extends Reader_macroContext {
		public Host_exprContext host_expr() {
			return getRuleContext(Host_exprContext.class,0);
		}
		public RmHost_exprContext(Reader_macroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterRmHost_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitRmHost_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitRmHost_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RmVar_quoteContext extends Reader_macroContext {
		public Var_quoteContext var_quote() {
			return getRuleContext(Var_quoteContext.class,0);
		}
		public RmVar_quoteContext(Reader_macroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterRmVar_quote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitRmVar_quote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitRmVar_quote(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RmLamdaContext extends Reader_macroContext {
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public RmLamdaContext(Reader_macroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterRmLamda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitRmLamda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitRmLamda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RmSetContext extends Reader_macroContext {
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public RmSetContext(Reader_macroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterRmSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitRmSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitRmSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RmDispatchContext extends Reader_macroContext {
		public DispatchContext dispatch() {
			return getRuleContext(DispatchContext.class,0);
		}
		public RmDispatchContext(Reader_macroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterRmDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitRmDispatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitRmDispatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reader_macroContext reader_macro() throws RecognitionException {
		Reader_macroContext _localctx = new Reader_macroContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_reader_macro);
		try {
			setState(607);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new RmLamdaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				lambda();
				}
				break;
			case 2:
				_localctx = new RmMeta_dataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				meta_data();
				}
				break;
			case 3:
				_localctx = new RmRegexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(594);
				regex();
				}
				break;
			case 4:
				_localctx = new RmVar_quoteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(595);
				var_quote();
				}
				break;
			case 5:
				_localctx = new RmHost_exprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(596);
				host_expr();
				}
				break;
			case 6:
				_localctx = new RmSetContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(597);
				set();
				}
				break;
			case 7:
				_localctx = new RmTagContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(598);
				tag();
				}
				break;
			case 8:
				_localctx = new RmDiscardContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(599);
				discard();
				}
				break;
			case 9:
				_localctx = new RmDispatchContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(600);
				dispatch();
				}
				break;
			case 10:
				_localctx = new RmDerefContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(601);
				deref();
				}
				break;
			case 11:
				_localctx = new RmQuoteContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(602);
				quote();
				}
				break;
			case 12:
				_localctx = new RmBacktickContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(603);
				backtick();
				}
				break;
			case 13:
				_localctx = new RmUnquoteContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(604);
				unquote();
				}
				break;
			case 14:
				_localctx = new RmUnquote_splicingContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(605);
				unquote_splicing();
				}
				break;
			case 15:
				_localctx = new RmGensymContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(606);
				gensym();
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

	public static class QuoteContext extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public QuoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitQuote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitQuote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuoteContext quote() throws RecognitionException {
		QuoteContext _localctx = new QuoteContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(T__8);
			setState(610);
			form();
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

	public static class BacktickContext extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public BacktickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backtick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterBacktick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitBacktick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitBacktick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BacktickContext backtick() throws RecognitionException {
		BacktickContext _localctx = new BacktickContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_backtick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(T__9);
			setState(613);
			form();
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

	public static class UnquoteContext extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public UnquoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unquote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterUnquote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitUnquote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitUnquote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnquoteContext unquote() throws RecognitionException {
		UnquoteContext _localctx = new UnquoteContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unquote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(T__10);
			setState(616);
			form();
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

	public static class Unquote_splicingContext extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public Unquote_splicingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unquote_splicing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterUnquote_splicing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitUnquote_splicing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitUnquote_splicing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unquote_splicingContext unquote_splicing() throws RecognitionException {
		Unquote_splicingContext _localctx = new Unquote_splicingContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unquote_splicing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(T__11);
			setState(619);
			form();
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

	public static class TagContext extends ParserRuleContext {
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(T__12);
			setState(622);
			form();
			setState(623);
			form();
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

	public static class DerefContext extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public DerefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterDeref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitDeref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitDeref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerefContext deref() throws RecognitionException {
		DerefContext _localctx = new DerefContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_deref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(T__13);
			setState(626);
			form();
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

	public static class GensymContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(ClojureParser.SYMBOL, 0); }
		public GensymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gensym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterGensym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitGensym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitGensym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GensymContext gensym() throws RecognitionException {
		GensymContext _localctx = new GensymContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_gensym);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(SYMBOL);
			setState(629);
			match(T__14);
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

	public static class LambdaContext extends ParserRuleContext {
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_lambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(T__15);
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << SUM) | (1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << STR) | (1L << INC) | (1L << MAYOR) | (1L << MENOR) | (1L << MAYORIGUAL) | (1L << MENORIGUAL) | (1L << IGUAL) | (1L << STRING) | (1L << NIL) | (1L << FLOAT) | (1L << HEX) | (1L << BIN) | (1L << LONG) | (1L << BIGN) | (1L << CHAR_U))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CHAR_NAMED - 64)) | (1L << (CHAR_ANY - 64)) | (1L << (BOOLEAN - 64)) | (1L << (SYMBOL - 64)) | (1L << (NS_SYMBOL - 64)) | (1L << (PARAM_NAME - 64)))) != 0)) {
				{
				{
				setState(632);
				form();
				}
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(638);
			match(T__1);
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

	public static class Meta_dataContext extends ParserRuleContext {
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public Meta_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meta_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterMeta_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitMeta_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitMeta_data(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Meta_dataContext meta_data() throws RecognitionException {
		Meta_dataContext _localctx = new Meta_dataContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_meta_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(T__16);
			setState(645);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(641);
				map();
				setState(642);
				form();
				}
				break;
			case 2:
				{
				setState(644);
				form();
				}
				break;
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

	public static class Var_quoteContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Var_quoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_quote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterVar_quote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitVar_quote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitVar_quote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_quoteContext var_quote() throws RecognitionException {
		Var_quoteContext _localctx = new Var_quoteContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_var_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(T__17);
			setState(648);
			symbol();
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

	public static class Host_exprContext extends ParserRuleContext {
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public Host_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterHost_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitHost_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitHost_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Host_exprContext host_expr() throws RecognitionException {
		Host_exprContext _localctx = new Host_exprContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_host_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(T__18);
			setState(651);
			form();
			setState(652);
			form();
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

	public static class DiscardContext extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public DiscardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterDiscard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitDiscard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitDiscard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiscardContext discard() throws RecognitionException {
		DiscardContext _localctx = new DiscardContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_discard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(T__19);
			setState(655);
			form();
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

	public static class DispatchContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public DispatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitDispatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitDispatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DispatchContext dispatch() throws RecognitionException {
		DispatchContext _localctx = new DispatchContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_dispatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(T__14);
			setState(658);
			symbol();
			setState(659);
			form();
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

	public static class RegexContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ClojureParser.STRING, 0); }
		public RegexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitRegex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitRegex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexContext regex() throws RecognitionException {
		RegexContext _localctx = new RegexContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_regex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(T__14);
			setState(662);
			match(STRING);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberBignContext extends NumberContext {
		public TerminalNode BIGN() { return getToken(ClojureParser.BIGN, 0); }
		public NumberBignContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterNumberBign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitNumberBign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitNumberBign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberFloatContext extends NumberContext {
		public TerminalNode FLOAT() { return getToken(ClojureParser.FLOAT, 0); }
		public NumberFloatContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterNumberFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitNumberFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitNumberFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberHexContext extends NumberContext {
		public TerminalNode HEX() { return getToken(ClojureParser.HEX, 0); }
		public NumberHexContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterNumberHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitNumberHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitNumberHex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberBinContext extends NumberContext {
		public TerminalNode BIN() { return getToken(ClojureParser.BIN, 0); }
		public NumberBinContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterNumberBin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitNumberBin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitNumberBin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberLongContext extends NumberContext {
		public TerminalNode LONG() { return getToken(ClojureParser.LONG, 0); }
		public NumberLongContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterNumberLong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitNumberLong(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitNumberLong(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_number);
		try {
			setState(669);
			switch (_input.LA(1)) {
			case FLOAT:
				_localctx = new NumberFloatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				match(FLOAT);
				}
				break;
			case HEX:
				_localctx = new NumberHexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				match(HEX);
				}
				break;
			case BIN:
				_localctx = new NumberBinContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(666);
				match(BIN);
				}
				break;
			case BIGN:
				_localctx = new NumberBignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(667);
				match(BIGN);
				}
				break;
			case LONG:
				_localctx = new NumberLongContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(668);
				match(LONG);
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

	public static class CharacterContext extends ParserRuleContext {
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
	 
		public CharacterContext() { }
		public void copyFrom(CharacterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharU_hex_quadContext extends CharacterContext {
		public U_hex_quadContext u_hex_quad() {
			return getRuleContext(U_hex_quadContext.class,0);
		}
		public CharU_hex_quadContext(CharacterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterCharU_hex_quad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitCharU_hex_quad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitCharU_hex_quad(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharAny_charContext extends CharacterContext {
		public Any_charContext any_char() {
			return getRuleContext(Any_charContext.class,0);
		}
		public CharAny_charContext(CharacterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterCharAny_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitCharAny_char(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitCharAny_char(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharNamed_charContext extends CharacterContext {
		public Named_charContext named_char() {
			return getRuleContext(Named_charContext.class,0);
		}
		public CharNamed_charContext(CharacterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterCharNamed_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitCharNamed_char(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitCharNamed_char(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_character);
		try {
			setState(674);
			switch (_input.LA(1)) {
			case CHAR_NAMED:
				_localctx = new CharNamed_charContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				named_char();
				}
				break;
			case CHAR_U:
				_localctx = new CharU_hex_quadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				u_hex_quad();
				}
				break;
			case CHAR_ANY:
				_localctx = new CharAny_charContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(673);
				any_char();
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

	public static class Named_charContext extends ParserRuleContext {
		public TerminalNode CHAR_NAMED() { return getToken(ClojureParser.CHAR_NAMED, 0); }
		public Named_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterNamed_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitNamed_char(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitNamed_char(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Named_charContext named_char() throws RecognitionException {
		Named_charContext _localctx = new Named_charContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_named_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(CHAR_NAMED);
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

	public static class Any_charContext extends ParserRuleContext {
		public TerminalNode CHAR_ANY() { return getToken(ClojureParser.CHAR_ANY, 0); }
		public Any_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterAny_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitAny_char(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitAny_char(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_charContext any_char() throws RecognitionException {
		Any_charContext _localctx = new Any_charContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_any_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(CHAR_ANY);
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

	public static class U_hex_quadContext extends ParserRuleContext {
		public TerminalNode CHAR_U() { return getToken(ClojureParser.CHAR_U, 0); }
		public U_hex_quadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_u_hex_quad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterU_hex_quad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitU_hex_quad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitU_hex_quad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final U_hex_quadContext u_hex_quad() throws RecognitionException {
		U_hex_quadContext _localctx = new U_hex_quadContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_u_hex_quad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(CHAR_U);
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

	public static class NilContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(ClojureParser.NIL, 0); }
		public NilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterNil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitNil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitNil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NilContext nil() throws RecognitionException {
		NilContext _localctx = new NilContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_nil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(NIL);
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

	public static class KeywordContext extends ParserRuleContext {
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	 
		public KeywordContext() { }
		public void copyFrom(KeywordContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class KeywordMacro_keywordContext extends KeywordContext {
		public Macro_keywordContext macro_keyword() {
			return getRuleContext(Macro_keywordContext.class,0);
		}
		public KeywordMacro_keywordContext(KeywordContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterKeywordMacro_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitKeywordMacro_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitKeywordMacro_keyword(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KeywordSimple_keywordContext extends KeywordContext {
		public Simple_keywordContext simple_keyword() {
			return getRuleContext(Simple_keywordContext.class,0);
		}
		public KeywordSimple_keywordContext(KeywordContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterKeywordSimple_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitKeywordSimple_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitKeywordSimple_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_keyword);
		try {
			setState(686);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new KeywordMacro_keywordContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				macro_keyword();
				}
				break;
			case 2:
				_localctx = new KeywordSimple_keywordContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				simple_keyword();
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

	public static class Simple_keywordContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Simple_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSimple_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSimple_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSimple_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_keywordContext simple_keyword() throws RecognitionException {
		Simple_keywordContext _localctx = new Simple_keywordContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_simple_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(T__20);
			setState(689);
			symbol();
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

	public static class Macro_keywordContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Macro_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterMacro_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitMacro_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitMacro_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_keywordContext macro_keyword() throws RecognitionException {
		Macro_keywordContext _localctx = new Macro_keywordContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_macro_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(T__20);
			setState(692);
			match(T__20);
			setState(693);
			symbol();
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

	public static class SymbolContext extends ParserRuleContext {
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
	 
		public SymbolContext() { }
		public void copyFrom(SymbolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Symbol_ns_symbolContext extends SymbolContext {
		public Ns_symbolContext ns_symbol() {
			return getRuleContext(Ns_symbolContext.class,0);
		}
		public Symbol_ns_symbolContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSymbol_ns_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSymbol_ns_symbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSymbol_ns_symbol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Symbol_simple_symContext extends SymbolContext {
		public Simple_symContext simple_sym() {
			return getRuleContext(Simple_symContext.class,0);
		}
		public Symbol_simple_symContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSymbol_simple_sym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSymbol_simple_sym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSymbol_simple_sym(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Symbol_SumContext extends SymbolContext {
		public TerminalNode SUM() { return getToken(ClojureParser.SUM, 0); }
		public Symbol_SumContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSymbol_Sum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSymbol_Sum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSymbol_Sum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Symbol_MENORContext extends SymbolContext {
		public TerminalNode MENOR() { return getToken(ClojureParser.MENOR, 0); }
		public Symbol_MENORContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSymbol_MENOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSymbol_MENOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSymbol_MENOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Symbol_MENORIGUALContext extends SymbolContext {
		public TerminalNode MENORIGUAL() { return getToken(ClojureParser.MENORIGUAL, 0); }
		public Symbol_MENORIGUALContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSymbol_MENORIGUAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSymbol_MENORIGUAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSymbol_MENORIGUAL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Symbol_DIVContext extends SymbolContext {
		public TerminalNode DIV() { return getToken(ClojureParser.DIV, 0); }
		public Symbol_DIVContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSymbol_DIV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSymbol_DIV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSymbol_DIV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Symbol_STRContext extends SymbolContext {
		public TerminalNode STR() { return getToken(ClojureParser.STR, 0); }
		public Symbol_STRContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSymbol_STR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSymbol_STR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSymbol_STR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Symbol_MULTContext extends SymbolContext {
		public TerminalNode MULT() { return getToken(ClojureParser.MULT, 0); }
		public Symbol_MULTContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSymbol_MULT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSymbol_MULT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSymbol_MULT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Symbol_MAYORIGUALContext extends SymbolContext {
		public TerminalNode MAYORIGUAL() { return getToken(ClojureParser.MAYORIGUAL, 0); }
		public Symbol_MAYORIGUALContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSymbol_MAYORIGUAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSymbol_MAYORIGUAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSymbol_MAYORIGUAL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Symbol_MINUSContext extends SymbolContext {
		public TerminalNode MINUS() { return getToken(ClojureParser.MINUS, 0); }
		public Symbol_MINUSContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSymbol_MINUS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSymbol_MINUS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSymbol_MINUS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Symbol_INCContext extends SymbolContext {
		public TerminalNode INC() { return getToken(ClojureParser.INC, 0); }
		public Symbol_INCContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSymbol_INC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSymbol_INC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSymbol_INC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Symbol_MAYORContext extends SymbolContext {
		public TerminalNode MAYOR() { return getToken(ClojureParser.MAYOR, 0); }
		public Symbol_MAYORContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSymbol_MAYOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSymbol_MAYOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSymbol_MAYOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Symbol_IGUALContext extends SymbolContext {
		public TerminalNode IGUAL() { return getToken(ClojureParser.IGUAL, 0); }
		public Symbol_IGUALContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSymbol_IGUAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSymbol_IGUAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSymbol_IGUAL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_symbol);
		try {
			setState(708);
			switch (_input.LA(1)) {
			case NS_SYMBOL:
				_localctx = new Symbol_ns_symbolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				ns_symbol();
				}
				break;
			case SYMBOL:
				_localctx = new Symbol_simple_symContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				simple_sym();
				}
				break;
			case SUM:
				_localctx = new Symbol_SumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(697);
				match(SUM);
				}
				break;
			case MINUS:
				_localctx = new Symbol_MINUSContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(698);
				match(MINUS);
				}
				break;
			case MULT:
				_localctx = new Symbol_MULTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(699);
				match(MULT);
				}
				break;
			case DIV:
				_localctx = new Symbol_DIVContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(700);
				match(DIV);
				}
				break;
			case INC:
				_localctx = new Symbol_INCContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(701);
				match(INC);
				}
				break;
			case MAYOR:
				_localctx = new Symbol_MAYORContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(702);
				match(MAYOR);
				}
				break;
			case MAYORIGUAL:
				_localctx = new Symbol_MAYORIGUALContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(703);
				match(MAYORIGUAL);
				}
				break;
			case MENOR:
				_localctx = new Symbol_MENORContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(704);
				match(MENOR);
				}
				break;
			case MENORIGUAL:
				_localctx = new Symbol_MENORIGUALContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(705);
				match(MENORIGUAL);
				}
				break;
			case IGUAL:
				_localctx = new Symbol_IGUALContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(706);
				match(IGUAL);
				}
				break;
			case STR:
				_localctx = new Symbol_STRContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(707);
				match(STR);
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

	public static class Simple_symContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(ClojureParser.SYMBOL, 0); }
		public Simple_symContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_sym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterSimple_sym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitSimple_sym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitSimple_sym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_symContext simple_sym() throws RecognitionException {
		Simple_symContext _localctx = new Simple_symContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_simple_sym);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(SYMBOL);
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

	public static class Ns_symbolContext extends ParserRuleContext {
		public TerminalNode NS_SYMBOL() { return getToken(ClojureParser.NS_SYMBOL, 0); }
		public Ns_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ns_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).enterNs_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClojureListener ) ((ClojureListener)listener).exitNs_symbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitNs_symbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ns_symbolContext ns_symbol() throws RecognitionException {
		Ns_symbolContext _localctx = new Ns_symbolContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_ns_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(NS_SYMBOL);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3H\u02cd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u00b7\n\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\5\5\u00bf\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00e6\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00f4\n\7\3\b\3\b\5\b\u00f8\n\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u0108\n\f"+
		"\f\f\16\f\u010b\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u011e\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\5\30\u014f\n\30\3\31\3\31\5\31\u0153\n\31\3\32\3\32\3\32\3\32\5\32\u0159"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u016c\n\33\3\34\3\34\5\34\u0170\n\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\5\35\u0179\n\35\3\36\3\36\5\36\u017d\n\36"+
		"\3\37\3\37\3\37\3\37\5\37\u0183\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \6 \u0194\n \r \16 \u0195\3 \3 \5 \u019a\n \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3&\3&\5&\u01bf\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3"+
		",\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\5\61\u01f7\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\5\64\u0212\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67"+
		"\u0229\n\67\38\38\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3"+
		";\3;\3;\3;\3;\3;\5;\u0244\n;\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0262\n>\3?\3?\3?\3@\3"+
		"@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\7F\u027c\n"+
		"F\fF\16F\u027f\13F\3F\3F\3G\3G\3G\3G\3G\5G\u0288\nG\3H\3H\3H\3I\3I\3I"+
		"\3I\3J\3J\3J\3K\3K\3K\3K\3L\3L\3L\3M\3M\3M\3M\3M\5M\u02a0\nM\3N\3N\3N"+
		"\5N\u02a5\nN\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\5S\u02b1\nS\3T\3T\3T\3U\3U"+
		"\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u02c7\nV\3W\3W\3X\3X"+
		"\3X\2\2Y\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\2\2\u02de\2\u00b0\3\2\2\2\4\u00b6"+
		"\3\2\2\2\6\u00b8\3\2\2\2\b\u00be\3\2\2\2\n\u00e5\3\2\2\2\f\u00f3\3\2\2"+
		"\2\16\u00f7\3\2\2\2\20\u00f9\3\2\2\2\22\u00fb\3\2\2\2\24\u00ff\3\2\2\2"+
		"\26\u0103\3\2\2\2\30\u010e\3\2\2\2\32\u011d\3\2\2\2\34\u011f\3\2\2\2\36"+
		"\u0124\3\2\2\2 \u0129\3\2\2\2\"\u012e\3\2\2\2$\u0133\3\2\2\2&\u0138\3"+
		"\2\2\2(\u013d\3\2\2\2*\u0142\3\2\2\2,\u0147\3\2\2\2.\u014e\3\2\2\2\60"+
		"\u0152\3\2\2\2\62\u0158\3\2\2\2\64\u016b\3\2\2\2\66\u016f\3\2\2\28\u0178"+
		"\3\2\2\2:\u017c\3\2\2\2<\u0182\3\2\2\2>\u0199\3\2\2\2@\u019b\3\2\2\2B"+
		"\u01a3\3\2\2\2D\u01aa\3\2\2\2F\u01af\3\2\2\2H\u01b7\3\2\2\2J\u01be\3\2"+
		"\2\2L\u01c0\3\2\2\2N\u01c7\3\2\2\2P\u01cc\3\2\2\2R\u01d1\3\2\2\2T\u01d6"+
		"\3\2\2\2V\u01db\3\2\2\2X\u01e0\3\2\2\2Z\u01e5\3\2\2\2\\\u01ea\3\2\2\2"+
		"^\u01ef\3\2\2\2`\u01f6\3\2\2\2b\u01f8\3\2\2\2d\u01fe\3\2\2\2f\u0211\3"+
		"\2\2\2h\u0213\3\2\2\2j\u0219\3\2\2\2l\u0228\3\2\2\2n\u022a\3\2\2\2p\u0230"+
		"\3\2\2\2r\u0236\3\2\2\2t\u0243\3\2\2\2v\u0245\3\2\2\2x\u024d\3\2\2\2z"+
		"\u0261\3\2\2\2|\u0263\3\2\2\2~\u0266\3\2\2\2\u0080\u0269\3\2\2\2\u0082"+
		"\u026c\3\2\2\2\u0084\u026f\3\2\2\2\u0086\u0273\3\2\2\2\u0088\u0276\3\2"+
		"\2\2\u008a\u0279\3\2\2\2\u008c\u0282\3\2\2\2\u008e\u0289\3\2\2\2\u0090"+
		"\u028c\3\2\2\2\u0092\u0290\3\2\2\2\u0094\u0293\3\2\2\2\u0096\u0297\3\2"+
		"\2\2\u0098\u029f\3\2\2\2\u009a\u02a4\3\2\2\2\u009c\u02a6\3\2\2\2\u009e"+
		"\u02a8\3\2\2\2\u00a0\u02aa\3\2\2\2\u00a2\u02ac\3\2\2\2\u00a4\u02b0\3\2"+
		"\2\2\u00a6\u02b2\3\2\2\2\u00a8\u02b5\3\2\2\2\u00aa\u02c6\3\2\2\2\u00ac"+
		"\u02c8\3\2\2\2\u00ae\u02ca\3\2\2\2\u00b0\u00b1\5\4\3\2\u00b1\3\3\2\2\2"+
		"\u00b2\u00b3\5\6\4\2\u00b3\u00b4\5\4\3\2\u00b4\u00b7\3\2\2\2\u00b5\u00b7"+
		"\5\n\6\2\u00b6\u00b2\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\5\3\2\2\2\u00b8"+
		"\u00b9\5\n\6\2\u00b9\7\3\2\2\2\u00ba\u00bb\5\n\6\2\u00bb\u00bc\5\b\5\2"+
		"\u00bc\u00bf\3\2\2\2\u00bd\u00bf\5\n\6\2\u00be\u00ba\3\2\2\2\u00be\u00bd"+
		"\3\2\2\2\u00bf\t\3\2\2\2\u00c0\u00e6\5\f\7\2\u00c1\u00e6\5\32\16\2\u00c2"+
		"\u00e6\5> \2\u00c3\u00e6\5\34\17\2\u00c4\u00e6\5\36\20\2\u00c5\u00e6\5"+
		" \21\2\u00c6\u00e6\5\"\22\2\u00c7\u00e6\5$\23\2\u00c8\u00e6\5&\24\2\u00c9"+
		"\u00e6\5(\25\2\u00ca\u00e6\5*\26\2\u00cb\u00e6\5,\27\2\u00cc\u00e6\5F"+
		"$\2\u00cd\u00e6\5L\'\2\u00ce\u00e6\5P)\2\u00cf\u00e6\5R*\2\u00d0\u00e6"+
		"\5T+\2\u00d1\u00e6\5V,\2\u00d2\u00e6\5X-\2\u00d3\u00e6\5Z.\2\u00d4\u00e6"+
		"\5N(\2\u00d5\u00e6\5\\/\2\u00d6\u00e6\5^\60\2\u00d7\u00e6\5b\62\2\u00d8"+
		"\u00e6\5f\64\2\u00d9\u00e6\5h\65\2\u00da\u00e6\5d\63\2\u00db\u00e6\5j"+
		"\66\2\u00dc\u00e6\5v<\2\u00dd\u00e6\5n8\2\u00de\u00e6\5p9\2\u00df\u00e6"+
		"\5r:\2\u00e0\u00e6\5D#\2\u00e1\u00e6\5H%\2\u00e2\u00e6\5z>\2\u00e3\u00e6"+
		"\5x=\2\u00e4\u00e6\5@!\2\u00e5\u00c0\3\2\2\2\u00e5\u00c1\3\2\2\2\u00e5"+
		"\u00c2\3\2\2\2\u00e5\u00c3\3\2\2\2\u00e5\u00c4\3\2\2\2\u00e5\u00c5\3\2"+
		"\2\2\u00e5\u00c6\3\2\2\2\u00e5\u00c7\3\2\2\2\u00e5\u00c8\3\2\2\2\u00e5"+
		"\u00c9\3\2\2\2\u00e5\u00ca\3\2\2\2\u00e5\u00cb\3\2\2\2\u00e5\u00cc\3\2"+
		"\2\2\u00e5\u00cd\3\2\2\2\u00e5\u00ce\3\2\2\2\u00e5\u00cf\3\2\2\2\u00e5"+
		"\u00d0\3\2\2\2\u00e5\u00d1\3\2\2\2\u00e5\u00d2\3\2\2\2\u00e5\u00d3\3\2"+
		"\2\2\u00e5\u00d4\3\2\2\2\u00e5\u00d5\3\2\2\2\u00e5\u00d6\3\2\2\2\u00e5"+
		"\u00d7\3\2\2\2\u00e5\u00d8\3\2\2\2\u00e5\u00d9\3\2\2\2\u00e5\u00da\3\2"+
		"\2\2\u00e5\u00db\3\2\2\2\u00e5\u00dc\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5"+
		"\u00de\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e0\3\2\2\2\u00e5\u00e1\3\2"+
		"\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\13\3\2\2\2\u00e7\u00f4\7\65\2\2\u00e8\u00f4\5\u0098M\2\u00e9\u00f4\5"+
		"\u009aN\2\u00ea\u00f4\5\u00a2R\2\u00eb\u00f4\7D\2\2\u00ec\u00f4\5\u00a4"+
		"S\2\u00ed\u00f4\5\u00aaV\2\u00ee\u00f4\7G\2\2\u00ef\u00f4\5\22\n\2\u00f0"+
		"\u00f4\5\24\13\2\u00f1\u00f4\5\26\f\2\u00f2\u00f4\5\30\r\2\u00f3\u00e7"+
		"\3\2\2\2\u00f3\u00e8\3\2\2\2\u00f3\u00e9\3\2\2\2\u00f3\u00ea\3\2\2\2\u00f3"+
		"\u00eb\3\2\2\2\u00f3\u00ec\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00ee\3\2"+
		"\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f4\r\3\2\2\2\u00f5\u00f8\5\b\5\2\u00f6\u00f8\3\2\2\2"+
		"\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\17\3\2\2\2\u00f9\u00fa"+
		"\5\16\b\2\u00fa\21\3\2\2\2\u00fb\u00fc\7\3\2\2\u00fc\u00fd\5\16\b\2\u00fd"+
		"\u00fe\7\4\2\2\u00fe\23\3\2\2\2\u00ff\u0100\7\5\2\2\u0100\u0101\5\16\b"+
		"\2\u0101\u0102\7\6\2\2\u0102\25\3\2\2\2\u0103\u0109\7\7\2\2\u0104\u0105"+
		"\5\n\6\2\u0105\u0106\5\n\6\2\u0106\u0108\3\2\2\2\u0107\u0104\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7\b\2\2\u010d\27\3\2\2\2\u010e\u010f"+
		"\7\t\2\2\u010f\u0110\5\16\b\2\u0110\u0111\7\b\2\2\u0111\31\3\2\2\2\u0112"+
		"\u0113\7\n\2\2\u0113\u0114\7\30\2\2\u0114\u0115\5\u00aaV\2\u0115\u0116"+
		"\7\4\2\2\u0116\u011e\3\2\2\2\u0117\u0118\7\n\2\2\u0118\u0119\7\30\2\2"+
		"\u0119\u011a\5\u00aaV\2\u011a\u011b\5\n\6\2\u011b\u011c\7\4\2\2\u011c"+
		"\u011e\3\2\2\2\u011d\u0112\3\2\2\2\u011d\u0117\3\2\2\2\u011e\33\3\2\2"+
		"\2\u011f\u0120\7\n\2\2\u0120\u0121\7\32\2\2\u0121\u0122\5\16\b\2\u0122"+
		"\u0123\7\4\2\2\u0123\35\3\2\2\2\u0124\u0125\7\n\2\2\u0125\u0126\7\33\2"+
		"\2\u0126\u0127\5\16\b\2\u0127\u0128\7\4\2\2\u0128\37\3\2\2\2\u0129\u012a"+
		"\7\n\2\2\u012a\u012b\7\34\2\2\u012b\u012c\5\16\b\2\u012c\u012d\7\4\2\2"+
		"\u012d!\3\2\2\2\u012e\u012f\7\n\2\2\u012f\u0130\7\35\2\2\u0130\u0131\5"+
		"\16\b\2\u0131\u0132\7\4\2\2\u0132#\3\2\2\2\u0133\u0134\7\n\2\2\u0134\u0135"+
		"\7\36\2\2\u0135\u0136\5\16\b\2\u0136\u0137\7\4\2\2\u0137%\3\2\2\2\u0138"+
		"\u0139\7\n\2\2\u0139\u013a\7\37\2\2\u013a\u013b\5\16\b\2\u013b\u013c\7"+
		"\4\2\2\u013c\'\3\2\2\2\u013d\u013e\7\n\2\2\u013e\u013f\7 \2\2\u013f\u0140"+
		"\5\16\b\2\u0140\u0141\7\4\2\2\u0141)\3\2\2\2\u0142\u0143\7\n\2\2\u0143"+
		"\u0144\7!\2\2\u0144\u0145\5\16\b\2\u0145\u0146\7\4\2\2\u0146+\3\2\2\2"+
		"\u0147\u0148\7\n\2\2\u0148\u0149\7\"\2\2\u0149\u014a\5\16\b\2\u014a\u014b"+
		"\7\4\2\2\u014b-\3\2\2\2\u014c\u014f\7\65\2\2\u014d\u014f\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f/\3\2\2\2\u0150\u0153\5\64\33"+
		"\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\61"+
		"\3\2\2\2\u0154\u0155\5\u00aaV\2\u0155\u0156\5\62\32\2\u0156\u0159\3\2"+
		"\2\2\u0157\u0159\3\2\2\2\u0158\u0154\3\2\2\2\u0158\u0157\3\2\2\2\u0159"+
		"\63\3\2\2\2\u015a\u015b\5\u00aaV\2\u015b\u015c\5\64\33\2\u015c\u016c\3"+
		"\2\2\2\u015d\u016c\5\u00aaV\2\u015e\u015f\7\66\2\2\u015f\u016c\5\u00aa"+
		"V\2\u0160\u0161\7\5\2\2\u0161\u0162\5\u00aaV\2\u0162\u0163\5\62\32\2\u0163"+
		"\u0164\7\6\2\2\u0164\u0165\5\64\33\2\u0165\u016c\3\2\2\2\u0166\u0167\7"+
		"\5\2\2\u0167\u0168\5\u00aaV\2\u0168\u0169\5\62\32\2\u0169\u016a\7\6\2"+
		"\2\u016a\u016c\3\2\2\2\u016b\u015a\3\2\2\2\u016b\u015d\3\2\2\2\u016b\u015e"+
		"\3\2\2\2\u016b\u0160\3\2\2\2\u016b\u0166\3\2\2\2\u016c\65\3\2\2\2\u016d"+
		"\u0170\58\35\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2"+
		"\2\2\u0170\67\3\2\2\2\u0171\u0172\5\u00aaV\2\u0172\u0173\5\n\6\2\u0173"+
		"\u0174\58\35\2\u0174\u0179\3\2\2\2\u0175\u0176\5\u00aaV\2\u0176\u0177"+
		"\5\n\6\2\u0177\u0179\3\2\2\2\u0178\u0171\3\2\2\2\u0178\u0175\3\2\2\2\u0179"+
		"9\3\2\2\2\u017a\u017d\5<\37\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2\2\2"+
		"\u017c\u017b\3\2\2\2\u017d;\3\2\2\2\u017e\u017f\5\n\6\2\u017f\u0180\5"+
		"<\37\2\u0180\u0183\3\2\2\2\u0181\u0183\5\n\6\2\u0182\u017e\3\2\2\2\u0182"+
		"\u0181\3\2\2\2\u0183=\3\2\2\2\u0184\u0185\7\n\2\2\u0185\u0186\7\31\2\2"+
		"\u0186\u0187\5\u00aaV\2\u0187\u0188\5.\30\2\u0188\u0189\7\5\2\2\u0189"+
		"\u018a\5\60\31\2\u018a\u018b\7\6\2\2\u018b\u018c\5\20\t\2\u018c\u018d"+
		"\7\4\2\2\u018d\u019a\3\2\2\2\u018e\u018f\7\n\2\2\u018f\u0190\7\31\2\2"+
		"\u0190\u0191\5\u00aaV\2\u0191\u0193\5.\30\2\u0192\u0194\5B\"\2\u0193\u0192"+
		"\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0198\7\4\2\2\u0198\u019a\3\2\2\2\u0199\u0184\3\2"+
		"\2\2\u0199\u018e\3\2\2\2\u019a?\3\2\2\2\u019b\u019c\7\n\2\2\u019c\u019d"+
		"\7;\2\2\u019d\u019e\7\5\2\2\u019e\u019f\5\60\31\2\u019f\u01a0\7\6\2\2"+
		"\u01a0\u01a1\5\20\t\2\u01a1\u01a2\7\4\2\2\u01a2A\3\2\2\2\u01a3\u01a4\7"+
		"\n\2\2\u01a4\u01a5\7\5\2\2\u01a5\u01a6\5\60\31\2\u01a6\u01a7\7\6\2\2\u01a7"+
		"\u01a8\5\16\b\2\u01a8\u01a9\7\4\2\2\u01a9C\3\2\2\2\u01aa\u01ab\7\n\2\2"+
		"\u01ab\u01ac\5\u00aaV\2\u01ac\u01ad\5:\36\2\u01ad\u01ae\7\4\2\2\u01ae"+
		"E\3\2\2\2\u01af\u01b0\7\n\2\2\u01b0\u01b1\7#\2\2\u01b1\u01b2\7\5\2\2\u01b2"+
		"\u01b3\5\66\34\2\u01b3\u01b4\7\6\2\2\u01b4\u01b5\5\20\t\2\u01b5\u01b6"+
		"\7\4\2\2\u01b6G\3\2\2\2\u01b7\u01b8\7\n\2\2\u01b8\u01b9\7$\2\2\u01b9\u01ba"+
		"\5:\36\2\u01ba\u01bb\7\4\2\2\u01bbI\3\2\2\2\u01bc\u01bf\5\n\6\2\u01bd"+
		"\u01bf\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bd\3\2\2\2\u01bfK\3\2\2\2"+
		"\u01c0\u01c1\7\n\2\2\u01c1\u01c2\7%\2\2\u01c2\u01c3\5\n\6\2\u01c3\u01c4"+
		"\5\n\6\2\u01c4\u01c5\5J&\2\u01c5\u01c6\7\4\2\2\u01c6M\3\2\2\2\u01c7\u01c8"+
		"\7\n\2\2\u01c8\u01c9\7,\2\2\u01c9\u01ca\5\16\b\2\u01ca\u01cb\7\4\2\2\u01cb"+
		"O\3\2\2\2\u01cc\u01cd\7\n\2\2\u01cd\u01ce\7\'\2\2\u01ce\u01cf\5\16\b\2"+
		"\u01cf\u01d0\7\4\2\2\u01d0Q\3\2\2\2\u01d1\u01d2\7\n\2\2\u01d2\u01d3\7"+
		"(\2\2\u01d3\u01d4\5\16\b\2\u01d4\u01d5\7\4\2\2\u01d5S\3\2\2\2\u01d6\u01d7"+
		"\7\n\2\2\u01d7\u01d8\7)\2\2\u01d8\u01d9\5\16\b\2\u01d9\u01da\7\4\2\2\u01da"+
		"U\3\2\2\2\u01db\u01dc\7\n\2\2\u01dc\u01dd\7*\2\2\u01dd\u01de\5\16\b\2"+
		"\u01de\u01df\7\4\2\2\u01dfW\3\2\2\2\u01e0\u01e1\7\n\2\2\u01e1\u01e2\7"+
		"+\2\2\u01e2\u01e3\5\16\b\2\u01e3\u01e4\7\4\2\2\u01e4Y\3\2\2\2\u01e5\u01e6"+
		"\7\n\2\2\u01e6\u01e7\7&\2\2\u01e7\u01e8\5\n\6\2\u01e8\u01e9\7\4\2\2\u01e9"+
		"[\3\2\2\2\u01ea\u01eb\7\n\2\2\u01eb\u01ec\7-\2\2\u01ec\u01ed\5\16\b\2"+
		"\u01ed\u01ee\7\4\2\2\u01ee]\3\2\2\2\u01ef\u01f0\7\n\2\2\u01f0\u01f1\7"+
		".\2\2\u01f1\u01f2\5\n\6\2\u01f2\u01f3\7\4\2\2\u01f3_\3\2\2\2\u01f4\u01f7"+
		"\5\n\6\2\u01f5\u01f7\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7"+
		"a\3\2\2\2\u01f8\u01f9\7\n\2\2\u01f9\u01fa\7/\2\2\u01fa\u01fb\5\n\6\2\u01fb"+
		"\u01fc\5\n\6\2\u01fc\u01fd\7\4\2\2\u01fdc\3\2\2\2\u01fe\u01ff\7\n\2\2"+
		"\u01ff\u0200\7\60\2\2\u0200\u0201\5\n\6\2\u0201\u0202\5\n\6\2\u0202\u0203"+
		"\5`\61\2\u0203\u0204\7\4\2\2\u0204e\3\2\2\2\u0205\u0206\7\n\2\2\u0206"+
		"\u0207\7\61\2\2\u0207\u0208\5\30\r\2\u0208\u0209\5\n\6\2\u0209\u020a\7"+
		"\4\2\2\u020a\u0212\3\2\2\2\u020b\u020c\7\n\2\2\u020c\u020d\7\61\2\2\u020d"+
		"\u020e\5\24\13\2\u020e\u020f\5\n\6\2\u020f\u0210\7\4\2\2\u0210\u0212\3"+
		"\2\2\2\u0211\u0205\3\2\2\2\u0211\u020b\3\2\2\2\u0212g\3\2\2\2\u0213\u0214"+
		"\7\n\2\2\u0214\u0215\7\62\2\2\u0215\u0216\5\n\6\2\u0216\u0217\5\n\6\2"+
		"\u0217\u0218\7\4\2\2\u0218i\3\2\2\2\u0219\u021a\7\n\2\2\u021a\u021b\7"+
		"\63\2\2\u021b\u021c\5\n\6\2\u021c\u021d\7\4\2\2\u021dk\3\2\2\2\u021e\u021f"+
		"\7\n\2\2\u021f\u0220\5\u00a4S\2\u0220\u0221\5\n\6\2\u0221\u0222\7\4\2"+
		"\2\u0222\u0229\3\2\2\2\u0223\u0224\7\n\2\2\u0224\u0225\5\n\6\2\u0225\u0226"+
		"\5\u00a4S\2\u0226\u0227\7\4\2\2\u0227\u0229\3\2\2\2\u0228\u021e\3\2\2"+
		"\2\u0228\u0223\3\2\2\2\u0229m\3\2\2\2\u022a\u022b\7\n\2\2\u022b\u022c"+
		"\7\64\2\2\u022c\u022d\5\n\6\2\u022d\u022e\5\n\6\2\u022e\u022f\7\4\2\2"+
		"\u022fo\3\2\2\2\u0230\u0231\7\n\2\2\u0231\u0232\79\2\2\u0232\u0233\7?"+
		"\2\2\u0233\u0234\5\n\6\2\u0234\u0235\7\4\2\2\u0235q\3\2\2\2\u0236\u0237"+
		"\7\n\2\2\u0237\u0238\7:\2\2\u0238\u0239\5\n\6\2\u0239\u023a\5\n\6\2\u023a"+
		"\u023b\7\4\2\2\u023bs\3\2\2\2\u023c\u023d\5\u00aaV\2\u023d\u023e\5\n\6"+
		"\2\u023e\u023f\5t;\2\u023f\u0244\3\2\2\2\u0240\u0241\5\u00aaV\2\u0241"+
		"\u0242\5\n\6\2\u0242\u0244\3\2\2\2\u0243\u023c\3\2\2\2\u0243\u0240\3\2"+
		"\2\2\u0244u\3\2\2\2\u0245\u0246\7\n\2\2\u0246\u0247\78\2\2\u0247\u0248"+
		"\7\5\2\2\u0248\u0249\5t;\2\u0249\u024a\7\6\2\2\u024a\u024b\5\16\b\2\u024b"+
		"\u024c\7\4\2\2\u024cw\3\2\2\2\u024d\u024e\7\n\2\2\u024e\u024f\5\n\6\2"+
		"\u024f\u0250\5:\36\2\u0250\u0251\7\4\2\2\u0251y\3\2\2\2\u0252\u0262\5"+
		"\u008aF\2\u0253\u0262\5\u008cG\2\u0254\u0262\5\u0096L\2\u0255\u0262\5"+
		"\u008eH\2\u0256\u0262\5\u0090I\2\u0257\u0262\5\30\r\2\u0258\u0262\5\u0084"+
		"C\2\u0259\u0262\5\u0092J\2\u025a\u0262\5\u0094K\2\u025b\u0262\5\u0086"+
		"D\2\u025c\u0262\5|?\2\u025d\u0262\5~@\2\u025e\u0262\5\u0080A\2\u025f\u0262"+
		"\5\u0082B\2\u0260\u0262\5\u0088E\2\u0261\u0252\3\2\2\2\u0261\u0253\3\2"+
		"\2\2\u0261\u0254\3\2\2\2\u0261\u0255\3\2\2\2\u0261\u0256\3\2\2\2\u0261"+
		"\u0257\3\2\2\2\u0261\u0258\3\2\2\2\u0261\u0259\3\2\2\2\u0261\u025a\3\2"+
		"\2\2\u0261\u025b\3\2\2\2\u0261\u025c\3\2\2\2\u0261\u025d\3\2\2\2\u0261"+
		"\u025e\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0260\3\2\2\2\u0262{\3\2\2\2"+
		"\u0263\u0264\7\13\2\2\u0264\u0265\5\n\6\2\u0265}\3\2\2\2\u0266\u0267\7"+
		"\f\2\2\u0267\u0268\5\n\6\2\u0268\177\3\2\2\2\u0269\u026a\7\r\2\2\u026a"+
		"\u026b\5\n\6\2\u026b\u0081\3\2\2\2\u026c\u026d\7\16\2\2\u026d\u026e\5"+
		"\n\6\2\u026e\u0083\3\2\2\2\u026f\u0270\7\17\2\2\u0270\u0271\5\n\6\2\u0271"+
		"\u0272\5\n\6\2\u0272\u0085\3\2\2\2\u0273\u0274\7\20\2\2\u0274\u0275\5"+
		"\n\6\2\u0275\u0087\3\2\2\2\u0276\u0277\7E\2\2\u0277\u0278\7\21\2\2\u0278"+
		"\u0089\3\2\2\2\u0279\u027d\7\22\2\2\u027a\u027c\5\n\6\2\u027b\u027a\3"+
		"\2\2\2\u027c\u027f\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		"\u0280\3\2\2\2\u027f\u027d\3\2\2\2\u0280\u0281\7\4\2\2\u0281\u008b\3\2"+
		"\2\2\u0282\u0287\7\23\2\2\u0283\u0284\5\26\f\2\u0284\u0285\5\n\6\2\u0285"+
		"\u0288\3\2\2\2\u0286\u0288\5\n\6\2\u0287\u0283\3\2\2\2\u0287\u0286\3\2"+
		"\2\2\u0288\u008d\3\2\2\2\u0289\u028a\7\24\2\2\u028a\u028b\5\u00aaV\2\u028b"+
		"\u008f\3\2\2\2\u028c\u028d\7\25\2\2\u028d\u028e\5\n\6\2\u028e\u028f\5"+
		"\n\6\2\u028f\u0091\3\2\2\2\u0290\u0291\7\26\2\2\u0291\u0292\5\n\6\2\u0292"+
		"\u0093\3\2\2\2\u0293\u0294\7\21\2\2\u0294\u0295\5\u00aaV\2\u0295\u0296"+
		"\5\n\6\2\u0296\u0095\3\2\2\2\u0297\u0298\7\21\2\2\u0298\u0299\7\65\2\2"+
		"\u0299\u0097\3\2\2\2\u029a\u02a0\7<\2\2\u029b\u02a0\7=\2\2\u029c\u02a0"+
		"\7>\2\2\u029d\u02a0\7@\2\2\u029e\u02a0\7?\2\2\u029f\u029a\3\2\2\2\u029f"+
		"\u029b\3\2\2\2\u029f\u029c\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u029e\3\2"+
		"\2\2\u02a0\u0099\3\2\2\2\u02a1\u02a5\5\u009cO\2\u02a2\u02a5\5\u00a0Q\2"+
		"\u02a3\u02a5\5\u009eP\2\u02a4\u02a1\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4"+
		"\u02a3\3\2\2\2\u02a5\u009b\3\2\2\2\u02a6\u02a7\7B\2\2\u02a7\u009d\3\2"+
		"\2\2\u02a8\u02a9\7C\2\2\u02a9\u009f\3\2\2\2\u02aa\u02ab\7A\2\2\u02ab\u00a1"+
		"\3\2\2\2\u02ac\u02ad\7\67\2\2\u02ad\u00a3\3\2\2\2\u02ae\u02b1\5\u00a8"+
		"U\2\u02af\u02b1\5\u00a6T\2\u02b0\u02ae\3\2\2\2\u02b0\u02af\3\2\2\2\u02b1"+
		"\u00a5\3\2\2\2\u02b2\u02b3\7\27\2\2\u02b3\u02b4\5\u00aaV\2\u02b4\u00a7"+
		"\3\2\2\2\u02b5\u02b6\7\27\2\2\u02b6\u02b7\7\27\2\2\u02b7\u02b8\5\u00aa"+
		"V\2\u02b8\u00a9\3\2\2\2\u02b9\u02c7\5\u00aeX\2\u02ba\u02c7\5\u00acW\2"+
		"\u02bb\u02c7\7\34\2\2\u02bc\u02c7\7\35\2\2\u02bd\u02c7\7\36\2\2\u02be"+
		"\u02c7\7\37\2\2\u02bf\u02c7\7&\2\2\u02c0\u02c7\7\'\2\2\u02c1\u02c7\7)"+
		"\2\2\u02c2\u02c7\7(\2\2\u02c3\u02c7\7*\2\2\u02c4\u02c7\7+\2\2\u02c5\u02c7"+
		"\7\"\2\2\u02c6\u02b9\3\2\2\2\u02c6\u02ba\3\2\2\2\u02c6\u02bb\3\2\2\2\u02c6"+
		"\u02bc\3\2\2\2\u02c6\u02bd\3\2\2\2\u02c6\u02be\3\2\2\2\u02c6\u02bf\3\2"+
		"\2\2\u02c6\u02c0\3\2\2\2\u02c6\u02c1\3\2\2\2\u02c6\u02c2\3\2\2\2\u02c6"+
		"\u02c3\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c5\3\2\2\2\u02c7\u00ab\3\2"+
		"\2\2\u02c8\u02c9\7E\2\2\u02c9\u00ad\3\2\2\2\u02ca\u02cb\7F\2\2\u02cb\u00af"+
		"\3\2\2\2\37\u00b6\u00be\u00e5\u00f3\u00f7\u0109\u011d\u014e\u0152\u0158"+
		"\u016b\u016f\u0178\u017c\u0182\u0195\u0199\u01be\u01f6\u0211\u0228\u0243"+
		"\u0261\u027d\u0287\u029f\u02a4\u02b0\u02c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}