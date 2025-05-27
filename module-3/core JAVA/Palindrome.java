import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(input).reverse().toString();
        if (input.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
