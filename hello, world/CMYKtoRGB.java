import static java.lang.Double.parseDouble;
import static java.lang.Math.*;

public class CMYKtoRGB {
    public static void main(String[] args) {
        double c = parseDouble(args[0]);
        double m = parseDouble(args[1]);
        double y = parseDouble(args[2]);
        double k = parseDouble(args[3]);
        double white = 1 - k;

        int red = (int) round(255 * white * (1 - c));
        int green = (int) round(255 * white * (1 - m));
        int blue = (int) round(255 * white * (1 - y));

        System.out.println("red   = " + red);
        System.out.println("green = " + green);
        System.out.println("blue  = " + blue);


    }
}
