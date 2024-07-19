import static java.lang.Double.parseDouble;
import static java.lang.Math.*;

public class GreatCircle {
    public static void main(String[] args) {
        // get the degrees
        double a = parseDouble(args[0]);
        double b = parseDouble(args[1]);
        double c = parseDouble(args[2]);
        double d = parseDouble(args[3]);
        double r = 6371.0;

        // convert degrees to radians
        double x1 = toRadians(a);
        double x2 = toRadians(b);
        double y1 = toRadians(c);
        double y2 = toRadians(d);

        // calculate the brackets
        double xBracket = (x2 - x1) / 2;
        double yBracket = (y2 - y1) / 2;

        // calculate the math things
        double distance = (2 * r) * asin(sqrt(pow(sin(xBracket), 2) + cos(x1) * cos(x2) * pow(sin(yBracket), 2)));

        System.out.println(distance + " kilometers");
    }
}
