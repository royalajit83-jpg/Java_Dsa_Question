import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        int num = 8751;
        int result = sortDigits(num);
        System.out.println(result);  // Output: 1578
    }

    public static int sortDigits(int num) {
        List<Integer> list = new ArrayList<>();

        // Step 1: Extract digits
        while (num != 0) {
            int last_digit = num % 10;
            list.add(last_digit);
            num /= 10;
        }

        // Step 2: Sort the list manually (selection sort)
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(i)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        // Step 3: Build the sorted number
        int sortedNum = 0;
        for (int digit : list) {
            sortedNum = sortedNum * 10 + digit;
        }

        return sortedNum;
    }
}
