// Generated from C:/Users/jccaleroe/Documents/Proyecto/src\Clojure.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClojureParser}.
 */
public interface ClojureListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClojureParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(ClojureParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(ClojureParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formLiteral}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormLiteral(ClojureParser.FormLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formLiteral}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormLiteral(ClojureParser.FormLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formList}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormList(ClojureParser.FormListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formList}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormList(ClojureParser.FormListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formVector}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormVector(ClojureParser.FormVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formVector}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormVector(ClojureParser.FormVectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formMap}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormMap(ClojureParser.FormMapContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formMap}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormMap(ClojureParser.FormMapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formReader_macro}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormReader_macro(ClojureParser.FormReader_macroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formReader_macro}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormReader_macro(ClojureParser.FormReader_macroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#forms}.
	 * @param ctx the parse tree
	 */
	void enterForms(ClojureParser.FormsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#forms}.
	 * @param ctx the parse tree
	 */
	void exitForms(ClojureParser.FormsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(ClojureParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(ClojureParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(ClojureParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(ClojureParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(ClojureParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(ClojureParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(ClojureParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(ClojureParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmLamda}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmLamda(ClojureParser.RmLamdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmLamda}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmLamda(ClojureParser.RmLamdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmMeta_data}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmMeta_data(ClojureParser.RmMeta_dataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmMeta_data}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmMeta_data(ClojureParser.RmMeta_dataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmRegex}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmRegex(ClojureParser.RmRegexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmRegex}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmRegex(ClojureParser.RmRegexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmVar_quote}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmVar_quote(ClojureParser.RmVar_quoteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmVar_quote}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmVar_quote(ClojureParser.RmVar_quoteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmHost_expr}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmHost_expr(ClojureParser.RmHost_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmHost_expr}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmHost_expr(ClojureParser.RmHost_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmSet}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmSet(ClojureParser.RmSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmSet}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmSet(ClojureParser.RmSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmTag}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmTag(ClojureParser.RmTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmTag}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmTag(ClojureParser.RmTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmDiscard}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmDiscard(ClojureParser.RmDiscardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmDiscard}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmDiscard(ClojureParser.RmDiscardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmDispatch}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmDispatch(ClojureParser.RmDispatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmDispatch}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmDispatch(ClojureParser.RmDispatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmDeref}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmDeref(ClojureParser.RmDerefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmDeref}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmDeref(ClojureParser.RmDerefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmQuote}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmQuote(ClojureParser.RmQuoteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmQuote}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmQuote(ClojureParser.RmQuoteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmBacktick}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmBacktick(ClojureParser.RmBacktickContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmBacktick}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmBacktick(ClojureParser.RmBacktickContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmUnquote}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmUnquote(ClojureParser.RmUnquoteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmUnquote}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmUnquote(ClojureParser.RmUnquoteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmUnquote_splicing}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmUnquote_splicing(ClojureParser.RmUnquote_splicingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmUnquote_splicing}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmUnquote_splicing(ClojureParser.RmUnquote_splicingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmGensym}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmGensym(ClojureParser.RmGensymContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmGensym}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmGensym(ClojureParser.RmGensymContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#quote}.
	 * @param ctx the parse tree
	 */
	void enterQuote(ClojureParser.QuoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#quote}.
	 * @param ctx the parse tree
	 */
	void exitQuote(ClojureParser.QuoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#backtick}.
	 * @param ctx the parse tree
	 */
	void enterBacktick(ClojureParser.BacktickContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#backtick}.
	 * @param ctx the parse tree
	 */
	void exitBacktick(ClojureParser.BacktickContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#unquote}.
	 * @param ctx the parse tree
	 */
	void enterUnquote(ClojureParser.UnquoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#unquote}.
	 * @param ctx the parse tree
	 */
	void exitUnquote(ClojureParser.UnquoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#unquote_splicing}.
	 * @param ctx the parse tree
	 */
	void enterUnquote_splicing(ClojureParser.Unquote_splicingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#unquote_splicing}.
	 * @param ctx the parse tree
	 */
	void exitUnquote_splicing(ClojureParser.Unquote_splicingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(ClojureParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(ClojureParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#deref}.
	 * @param ctx the parse tree
	 */
	void enterDeref(ClojureParser.DerefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#deref}.
	 * @param ctx the parse tree
	 */
	void exitDeref(ClojureParser.DerefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#gensym}.
	 * @param ctx the parse tree
	 */
	void enterGensym(ClojureParser.GensymContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#gensym}.
	 * @param ctx the parse tree
	 */
	void exitGensym(ClojureParser.GensymContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(ClojureParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(ClojureParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#meta_data}.
	 * @param ctx the parse tree
	 */
	void enterMeta_data(ClojureParser.Meta_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#meta_data}.
	 * @param ctx the parse tree
	 */
	void exitMeta_data(ClojureParser.Meta_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#var_quote}.
	 * @param ctx the parse tree
	 */
	void enterVar_quote(ClojureParser.Var_quoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#var_quote}.
	 * @param ctx the parse tree
	 */
	void exitVar_quote(ClojureParser.Var_quoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#host_expr}.
	 * @param ctx the parse tree
	 */
	void enterHost_expr(ClojureParser.Host_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#host_expr}.
	 * @param ctx the parse tree
	 */
	void exitHost_expr(ClojureParser.Host_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#discard}.
	 * @param ctx the parse tree
	 */
	void enterDiscard(ClojureParser.DiscardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#discard}.
	 * @param ctx the parse tree
	 */
	void exitDiscard(ClojureParser.DiscardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#dispatch}.
	 * @param ctx the parse tree
	 */
	void enterDispatch(ClojureParser.DispatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#dispatch}.
	 * @param ctx the parse tree
	 */
	void exitDispatch(ClojureParser.DispatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#regex}.
	 * @param ctx the parse tree
	 */
	void enterRegex(ClojureParser.RegexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#regex}.
	 * @param ctx the parse tree
	 */
	void exitRegex(ClojureParser.RegexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalString}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralString(ClojureParser.LiteralStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalString}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralString(ClojureParser.LiteralStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalNumber}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralNumber(ClojureParser.LiteralNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalNumber}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralNumber(ClojureParser.LiteralNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalCharacter}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralCharacter(ClojureParser.LiteralCharacterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalCharacter}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralCharacter(ClojureParser.LiteralCharacterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalNil}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralNil(ClojureParser.LiteralNilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalNil}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralNil(ClojureParser.LiteralNilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalBOOLEAN}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralBOOLEAN(ClojureParser.LiteralBOOLEANContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalBOOLEAN}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralBOOLEAN(ClojureParser.LiteralBOOLEANContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalKeyword}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralKeyword(ClojureParser.LiteralKeywordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalKeyword}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralKeyword(ClojureParser.LiteralKeywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalSymbol}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralSymbol(ClojureParser.LiteralSymbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalSymbol}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralSymbol(ClojureParser.LiteralSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalParam_name}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralParam_name(ClojureParser.LiteralParam_nameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalParam_name}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralParam_name(ClojureParser.LiteralParam_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(ClojureParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(ClojureParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#hex}.
	 * @param ctx the parse tree
	 */
	void enterHex(ClojureParser.HexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#hex}.
	 * @param ctx the parse tree
	 */
	void exitHex(ClojureParser.HexContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#bin}.
	 * @param ctx the parse tree
	 */
	void enterBin(ClojureParser.BinContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#bin}.
	 * @param ctx the parse tree
	 */
	void exitBin(ClojureParser.BinContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#bign}.
	 * @param ctx the parse tree
	 */
	void enterBign(ClojureParser.BignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#bign}.
	 * @param ctx the parse tree
	 */
	void exitBign(ClojureParser.BignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberFloat}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberFloat(ClojureParser.NumberFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberFloat}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberFloat(ClojureParser.NumberFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberHex}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberHex(ClojureParser.NumberHexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberHex}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberHex(ClojureParser.NumberHexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberBin}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberBin(ClojureParser.NumberBinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberBin}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberBin(ClojureParser.NumberBinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberBign}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberBign(ClojureParser.NumberBignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberBign}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberBign(ClojureParser.NumberBignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberLong}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberLong(ClojureParser.NumberLongContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberLong}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberLong(ClojureParser.NumberLongContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charNamed_char}
	 * labeled alternative in {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharNamed_char(ClojureParser.CharNamed_charContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charNamed_char}
	 * labeled alternative in {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharNamed_char(ClojureParser.CharNamed_charContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charU_hex_quad}
	 * labeled alternative in {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharU_hex_quad(ClojureParser.CharU_hex_quadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charU_hex_quad}
	 * labeled alternative in {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharU_hex_quad(ClojureParser.CharU_hex_quadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charAny_char}
	 * labeled alternative in {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharAny_char(ClojureParser.CharAny_charContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charAny_char}
	 * labeled alternative in {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharAny_char(ClojureParser.CharAny_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#named_char}.
	 * @param ctx the parse tree
	 */
	void enterNamed_char(ClojureParser.Named_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#named_char}.
	 * @param ctx the parse tree
	 */
	void exitNamed_char(ClojureParser.Named_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#any_char}.
	 * @param ctx the parse tree
	 */
	void enterAny_char(ClojureParser.Any_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#any_char}.
	 * @param ctx the parse tree
	 */
	void exitAny_char(ClojureParser.Any_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#u_hex_quad}.
	 * @param ctx the parse tree
	 */
	void enterU_hex_quad(ClojureParser.U_hex_quadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#u_hex_quad}.
	 * @param ctx the parse tree
	 */
	void exitU_hex_quad(ClojureParser.U_hex_quadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#nil}.
	 * @param ctx the parse tree
	 */
	void enterNil(ClojureParser.NilContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#nil}.
	 * @param ctx the parse tree
	 */
	void exitNil(ClojureParser.NilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code keywordMacro_keyword}
	 * labeled alternative in {@link ClojureParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeywordMacro_keyword(ClojureParser.KeywordMacro_keywordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code keywordMacro_keyword}
	 * labeled alternative in {@link ClojureParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeywordMacro_keyword(ClojureParser.KeywordMacro_keywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code keywordSimple_keyword}
	 * labeled alternative in {@link ClojureParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeywordSimple_keyword(ClojureParser.KeywordSimple_keywordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code keywordSimple_keyword}
	 * labeled alternative in {@link ClojureParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeywordSimple_keyword(ClojureParser.KeywordSimple_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#simple_keyword}.
	 * @param ctx the parse tree
	 */
	void enterSimple_keyword(ClojureParser.Simple_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#simple_keyword}.
	 * @param ctx the parse tree
	 */
	void exitSimple_keyword(ClojureParser.Simple_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#macro_keyword}.
	 * @param ctx the parse tree
	 */
	void enterMacro_keyword(ClojureParser.Macro_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#macro_keyword}.
	 * @param ctx the parse tree
	 */
	void exitMacro_keyword(ClojureParser.Macro_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(ClojureParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(ClojureParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#simple_sym}.
	 * @param ctx the parse tree
	 */
	void enterSimple_sym(ClojureParser.Simple_symContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#simple_sym}.
	 * @param ctx the parse tree
	 */
	void exitSimple_sym(ClojureParser.Simple_symContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#ns_symbol}.
	 * @param ctx the parse tree
	 */
	void enterNs_symbol(ClojureParser.Ns_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#ns_symbol}.
	 * @param ctx the parse tree
	 */
	void exitNs_symbol(ClojureParser.Ns_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#param_name}.
	 * @param ctx the parse tree
	 */
	void enterParam_name(ClojureParser.Param_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#param_name}.
	 * @param ctx the parse tree
	 */
	void exitParam_name(ClojureParser.Param_nameContext ctx);
}