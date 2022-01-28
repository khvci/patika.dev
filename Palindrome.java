public class Palindrome {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is abba palindromic? " + isPalindrome("abba"));
        System.out.println("Is kayak palindromic? " + isPalindrome("kayak"));
        System.out.println("Is pink floyd palindromic? " + isPalindrome("pink floyd"));
    }
}
