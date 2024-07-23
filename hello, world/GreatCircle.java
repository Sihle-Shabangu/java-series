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
        double x2 = Math.toRadians(b);
        double y1 = Math.toRadians(c);
        double y2 = Math.toRadians(d);

        // calculate the brackets
        double xBracket = (x2 - x1) / 2;
        double yBracket = (y2 - y1) / 2;

        // calculate the math things
        double distance = (2 * r) * Math.asin(Math.sqrt(Math.pow(Math.sin(xBracket), 2) + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin(yBracket), 2)));

        System.out.println(distance + " kilometers");
    }
}
