import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int expectedSum = 0;
        for (int i = 0; i <= n; i++) {
            expectedSum += i;
        }

        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }

        System.out.println("Missing number: " + (expectedSum - actualSum));
        sc.close();
    }
}
