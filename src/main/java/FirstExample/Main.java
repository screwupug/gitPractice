package FirstExample;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("anna"));
    }

    public static boolean isPalindrome(String input) {
        char[] array = input.toLowerCase().toCharArray();

        for (int i = 0, j = array.length - 1;  i < array.length / 2; i++, j--) {
            if (array[i] != array[j]) {
                return false;
            }
        }
        return true;
    }
}
