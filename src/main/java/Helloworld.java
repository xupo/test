import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by poxu on 16/9/27.
 */
public class Helloworld {
    public static void main(String[] args) {
        System.out.print("OK");
        printName("c");
    }

    public static void printName(String arg){
        System.out.print("a");
        Collections.synchronizedList(new ArrayList<String>());
    }

}

