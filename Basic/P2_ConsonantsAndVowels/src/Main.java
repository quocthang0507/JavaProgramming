public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    public static void Check(char input) {
        boolean isVowel = false;
        switch (input) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                isVowel = true;
        }
        if (isVowel)
            System.out.println(input + " is vowel");
        else {
            if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z'))
                System.out.println(input + " is consonant");
            else
                System.out.println(input + " is not in alphabet");
        }
    }
}