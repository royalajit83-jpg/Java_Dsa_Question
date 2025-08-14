public class DD {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4};
        int[] result = removeD(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] removeD(int[] newArr) {
        int left = 0;
        for (int i = 1; i < newArr.length; i++) {
            if (newArr[i] != newArr[left]) {
                left++;
                newArr[left] = newArr[i];
            }
         }

         // Create a new array of the unique elements
        int[] result = new int[left + 1];
        System.arraycopy(newArr, 0, result, 0, left + 1);

        return result; // Return the new array with unique elements
    }
}
