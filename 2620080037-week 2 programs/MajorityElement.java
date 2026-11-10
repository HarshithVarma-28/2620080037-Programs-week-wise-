import java.util.ArrayList;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        ArrayList<Integer> res = new ArrayList<>();
        int limit = n / 3;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }

            if (count > limit && !res.contains(nums[i])) {
                res.add(nums[i]);
            }
        }

        System.out.println("Majority elements: " + res);
        sc.close();
    }
}
