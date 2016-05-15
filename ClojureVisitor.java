// Generated from C:/Users/jccaleroe/Documents/Proyecto\Clojure.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ClojureParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ClojureVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ClojureParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(ClojureParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formLiteral}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormLiteral(ClojureParser.FormLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formDef}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormDef(ClojureParser.FormDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formDefn}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormDefn(ClojureParser.FormDefnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formPrintln}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormPrintln(ClojureParser.FormPrintlnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formPrint}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormPrint(ClojureParser.FormPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formSum}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormSum(ClojureParser.FormSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formMinus}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormMinus(ClojureParser.FormMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formCallFunction}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormCallFunction(ClojureParser.FormCallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formReader_macro}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormReader_macro(ClojureParser.FormReader_macroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalString}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralString(ClojureParser.LiteralStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalNumber}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralNumber(ClojureParser.LiteralNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalCharacter}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralCharacter(ClojureParser.LiteralCharacterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalNil}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralNil(ClojureParser.LiteralNilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalBOOLEAN}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralBOOLEAN(ClojureParser.LiteralBOOLEANContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalKeyword}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralKeyword(ClojureParser.LiteralKeywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalSymbol}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralSymbol(ClojureParser.LiteralSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalParam_name}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralParam_name(ClojureParser.LiteralParam_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalList}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralList(ClojureParser.LiteralListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalVector}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralVector(ClojureParser.LiteralVectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalMap}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralMap(ClojureParser.LiteralMapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#forms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForms(ClojureParser.FormsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defSymbol}
	 * labeled alternative in {@link ClojureParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefSymbol(ClojureParser.DefSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defSymbolForm}
	 * labeled alternative in {@link ClojureParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefSymbolForm(ClojureParser.DefSymbolFormContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(ClojureParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ClojureParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(ClojureParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(ClojureParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#defn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefn(ClojureParser.DefnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code description}
	 * labeled alternative in {@link ClojureParser#optDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(ClojureParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noDescription}
	 * labeled alternative in {@link ClojureParser#optDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoDescription(ClojureParser.NoDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optparamsParams}
	 * labeled alternative in {@link ClojureParser#optparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptparamsParams(ClojureParser.OptparamsParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optparamsEpsilon}
	 * labeled alternative in {@link ClojureParser#optparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptparamsEpsilon(ClojureParser.OptparamsEpsilonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramsSymbolParams}
	 * labeled alternative in {@link ClojureParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsSymbolParams(ClojureParser.ParamsSymbolParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramsSymbol}
	 * labeled alternative in {@link ClojureParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsSymbol(ClojureParser.ParamsSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optargsArgs}
	 * labeled alternative in {@link ClojureParser#optargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptargsArgs(ClojureParser.OptargsArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optargsEpsilon}
	 * labeled alternative in {@link ClojureParser#optargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptargsEpsilon(ClojureParser.OptargsEpsilonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argsSymbolArgs}
	 * labeled alternative in {@link ClojureParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsSymbolArgs(ClojureParser.ArgsSymbolArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argsSymbol}
	 * labeled alternative in {@link ClojureParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsSymbol(ClojureParser.ArgsSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#callFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(ClojureParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(ClojureParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(ClojureParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(ClojureParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(ClojureParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmLamda}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmLamda(ClojureParser.RmLamdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmMeta_data}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmMeta_data(ClojureParser.RmMeta_dataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmRegex}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmRegex(ClojureParser.RmRegexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmVar_quote}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmVar_quote(ClojureParser.RmVar_quoteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmHost_expr}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmHost_expr(ClojureParser.RmHost_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmSet}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmSet(ClojureParser.RmSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmTag}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmTag(ClojureParser.RmTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmDiscard}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmDiscard(ClojureParser.RmDiscardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmDispatch}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmDispatch(ClojureParser.RmDispatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmDeref}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmDeref(ClojureParser.RmDerefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmQuote}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmQuote(ClojureParser.RmQuoteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmBacktick}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmBacktick(ClojureParser.RmBacktickContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmUnquote}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmUnquote(ClojureParser.RmUnquoteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmUnquote_splicing}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmUnquote_splicing(ClojureParser.RmUnquote_splicingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmGensym}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmGensym(ClojureParser.RmGensymContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuote(ClojureParser.QuoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#backtick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBacktick(ClojureParser.BacktickContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#unquote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquote(ClojureParser.UnquoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#unquote_splicing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquote_splicing(ClojureParser.Unquote_splicingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(ClojureParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#deref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeref(ClojureParser.DerefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#gensym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGensym(ClojureParser.GensymContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(ClojureParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#meta_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeta_data(ClojureParser.Meta_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#var_quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_quote(ClojureParser.Var_quoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#host_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost_expr(ClojureParser.Host_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#discard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscard(ClojureParser.DiscardContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#dispatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDispatch(ClojureParser.DispatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#regex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegex(ClojureParser.RegexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberFloat}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFloat(ClojureParser.NumberFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberHex}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberHex(ClojureParser.NumberHexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberBin}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberBin(ClojureParser.NumberBinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberBign}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberBign(ClojureParser.NumberBignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberLong}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLong(ClojureParser.NumberLongContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charNamed_char}
	 * labeled alternative in {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharNamed_char(ClojureParser.CharNamed_charContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charU_hex_quad}
	 * labeled alternative in {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharU_hex_quad(ClojureParser.CharU_hex_quadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charAny_char}
	 * labeled alternative in {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharAny_char(ClojureParser.CharAny_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#named_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_char(ClojureParser.Named_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#any_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_char(ClojureParser.Any_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#u_hex_quad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitU_hex_quad(ClojureParser.U_hex_quadContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#nil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(ClojureParser.NilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code keywordMacro_keyword}
	 * labeled alternative in {@link ClojureParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordMacro_keyword(ClojureParser.KeywordMacro_keywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code keywordSimple_keyword}
	 * labeled alternative in {@link ClojureParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordSimple_keyword(ClojureParser.KeywordSimple_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#simple_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_keyword(ClojureParser.Simple_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#macro_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_keyword(ClojureParser.Macro_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(ClojureParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#simple_sym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_sym(ClojureParser.Simple_symContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#ns_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNs_symbol(ClojureParser.Ns_symbolContext ctx);
}