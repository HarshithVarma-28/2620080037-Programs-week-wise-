import java.util.Scanner;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n && (j - i) <= k; j++) {
                if (nums[i] == nums[j]) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        System.out.println(found);
        sc.close();
    }
}
