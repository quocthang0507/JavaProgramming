import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        scanner.close();
        Check(ch);
    }

    public static void Check(char ch) {
        boolean isVowel = false;
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                isVowel = true;
        }
        if (isVowel)
            System.out.println(ch + " is vowel");
        else {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                System.out.println(ch + " is consonant");
            else
                System.out.println(ch + " is not in alphabet");
        }
    }
}