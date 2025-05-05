import java.util.Random;

public class Main {

    public static void main(String[] args) {

    }

    public String breakPalindrome(String palindrome) {
        if (palindrome.length() == 1)
            return "";

        int i = 0;

        for (; i < palindrome.length() / 2; i++) {
            if (palindrome.charAt(i) != 'a')
                break;
        }

        if (i != palindrome.length() / 2) {
            return palindrome.substring(0, i) + 'a' + palindrome.substring(i + 1);
        } else {
            return palindrome.substring(0, i - 1) + 'b';
        }


        if(palindrome.length() % 2 == 0) {

        }
        else {
            
        }
    }

}