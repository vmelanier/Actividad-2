import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome
{

    public static void main(String[] args)
    {
        String message = null;

        boolean is_palindrome = false;

        StringBuilder string_builder = new StringBuilder(word);
        String reversed_word = string_builder.reverse().toString();

        is_palindrome = word.equals(reversed_word);

        return is_palindrome;

    }

    public static void main(String[] args) {

        String word = "palabra";

        if (isPalindrome(word)) {
            System.out.println(Es palindromo);
        } else {
            System.out.println(No es palindromo);
        }

    }

}
