public class Minmax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,56,89,1,55,77,99};
        int max = arr[0];
        for (int i = 0; i<arr.length;i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
