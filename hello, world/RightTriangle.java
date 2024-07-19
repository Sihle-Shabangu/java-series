import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class RightTriangle {
    public static void main(String[] args) {
        if (args.length == 3){
            List<Integer> sides = new LinkedList<Integer>() {{
                add(parseInt(args[0]));
                add(parseInt(args[1]));
                add(parseInt(args[2]));
            } };

            sides.sort(null);
            int a = sides.get(0);
            int b = sides.get(1);
            int c = sides.get(2);

            if (pow(a,2) + pow(b,2) == pow(c,2)){
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }else{
            System.out.println("Not enough arguments");
        }

    }
}
