public class GreatCircle {
    public static void main(String[] args) {
        // get the degrees
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double d = Double.parseDouble(args[3]);
        double r = 6371.0;

        // convert degrees to radians
        double x1 = Math.toRadians(a);
        double y1 = Math.toRadians(b);
        double x2 = Math.toRadians(c);
        double y2 = Math.toRadians(d);

        double xBracket = x2 - x1;
        double yBracket = y2 - y1;

        // calculate the math things
        double distance = r * 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(xBracket / 2), 2) + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin(yBracket / 2), 2)));

        System.out.println(distance + " kilometers");
    }
}
