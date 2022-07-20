public class main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(5.2, 4.4);
        ComplexNumber c2 = new ComplexNumber(2.0, 7.3);
        ComplexNumber temp = ComplexNumber.Sum(c1, c2);
        System.out.printf("Ket qua la: " + temp.toString());
    }
}
