public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int min    = Math.min(a, Math.min(b, c));
        int max    = Math.max(a, Math.max(b, c));
        int median = a + b + c - min - max;

        boolean positive = a > 0 && b > 0 && c > 0;
        boolean expression = min * min + median * median == max * max;

        System.out.println(positive == expression && positive);
    }
}