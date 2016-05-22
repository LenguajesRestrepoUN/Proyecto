
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;
import java.util.HashSet;

public class Test {
    public static void main(String[] args)  {
        HashSet<Numero> set = new HashSet<>();
        set.add(new Numero(1));
        set.add(new Numero(1.1));
        set.add(new Numero(12));
        set.add(new Numero(10.4));
        set.add(new Numero(10.4));
        System.out.println(set);
    }
}
