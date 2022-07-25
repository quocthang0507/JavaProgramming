import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, lcm;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = scanner.nextInt();
        System.out.print("Enter second number: ");
        b = scanner.nextInt();
        scanner.close();
        lcm = LCM(a, b);
        System.out.println("Least common multiple of " + a + " and " + b + " is " + lcm);
    }

    public static int LCM(int a, int b) {
        int lcm = Math.max(a, b);
        while (true) {
            if (lcm % a == 0 && lcm % b == 0)
                return lcm;
            ++lcm;
        }
    }
}