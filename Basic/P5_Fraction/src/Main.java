public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 2);
        f1.output();
        Fraction f2 = new Fraction(5, 3);
        f2.output();
        System.out.println(f1.compareTo(f2));
    }
}