public class Palindrome
{

    public static boolean isPalindrome(String word)
    {
        boolean is_palindrome = false;

        StringBuilder string_builder = new StringBuilder(word);
        String reversed_word = string_builder.reverse().toString();

        is_palindrome = word.equals(reversed_word);

        return is_palindrome;

    }

    public static void main(String[] args) {

        String word = "palabra";

        if (isPalindrome(word)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

}
