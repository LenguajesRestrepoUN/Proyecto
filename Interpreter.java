import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public class Interpreter {
    public static Symbol.Type getType(int tokenType) {
        switch ( tokenType ) {
            case ClojureParser.LONG :  return Symbol.Type.tENTERO;
            case ClojureParser.STRING: return Symbol.Type.tCADENA;
            case ClojureParser.FLOAT: return Symbol.Type.tREAL;
            case ClojureParser.BOOLEAN: return Symbol.Type.tBOOLEANO;
        }
        return Symbol.Type.tINVALID;
    }

    public static void error(Token t, String msg) {
        System.err.printf("<%d:%d> Error semantico: %s\n", t.getLine(), t.getCharPositionInLine(), msg);
        System.exit(0);
    }

    public static void main(String[] args) throws Exception {

        try {
            ClojureLexer lexer;

            if (args.length > 0)
                lexer = new ClojureLexer(new ANTLRFileStream(args[0]));
            else
                lexer = new ClojureLexer(new ANTLRInputStream(System.in));
            //ANTLRFileStream input = new ANTLRFileStream("input2.txt");
            //lexer = new ClojureLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            ClojureParser parser = new ClojureParser(tokens);

            ParseTree tree = parser.file();

            System.out.println(tree.toStringTree(parser));

            ParseTreeWalker walker = new ParseTreeWalker();
            DefPhase def = new DefPhase();
            walker.walk(def, tree);

        } catch (Exception e) {
            System.err.println("Error (Test): " + e);
        }
    }
}
