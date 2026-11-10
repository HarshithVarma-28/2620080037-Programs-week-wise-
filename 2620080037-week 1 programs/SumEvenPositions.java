import java.util.Scanner;

public class SumEvenPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = Math.abs(num);
        int sum = 0;
        int position = 1; // 1-based indexing from right to left

        while (temp > 0) {
            int digit = temp % 10;
            if (position % 2 == 0) {
                sum += digit;
            }
            temp /= 10;
            position++;
        }

        System.out.println("Sum of digits at even positions (right to left): " + sum);

        sc.close();
    }
}