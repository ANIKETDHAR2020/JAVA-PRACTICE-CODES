import java.util.ArrayList;
import java.util.Scanner;
public class order_agnostic_bs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter elements (sorted). Type -1 to stop:");

        // dynamic input
        while (true) {
            int x = sc.nextInt();
            if (x == -1) break;
            list.add(x);
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int index = binarySearch(list, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }

    static int binarySearch(ArrayList<Integer> list, int target) {
        int low = 0;
        int high = list.size() - 1;

        if (high < 0) return -1; // empty list safety

        boolean isAsc = list.get(low) < list.get(high);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int midVal = list.get(mid);

            if (midVal == target) return mid;

            if (isAsc) {
                if (target < midVal) high = mid - 1;
                else low = mid + 1;
            } else {
                if (target > midVal) high = mid - 1;
                else low = mid + 1;
            }
        }
        return -1;
    }
}
