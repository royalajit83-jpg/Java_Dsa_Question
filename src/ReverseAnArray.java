public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1};

        int left = 0;
        int right = arr.length-1;

        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " ");

        }

    }
}
