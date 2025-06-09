public class JavaOperatorExample{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        b = ++a; // pre increment
        System.out.println(b);
        System.out.println(a);

        int c = 10;
        int d = 0;
        d = c++; // post increment
        System.out.println(d);
        System.out.println(c);
    }
}