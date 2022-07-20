public class ComplexNumber {
    double real;
    double imaginary;

    ComplexNumber(double r, double i) {
        this.real = r;
        this.imaginary = i;
    }

    public String toString() {
        return this.real + " + " + this.imaginary + "i";
    }

    public static ComplexNumber Sum(ComplexNumber a, ComplexNumber b) {
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = a.real + b.real;
        temp.imaginary = a.imaginary + b.imaginary;
        return temp;
    }
}
