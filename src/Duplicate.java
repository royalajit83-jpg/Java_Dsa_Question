public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,6,6,2,3,4,5,6,6,7,8,7};
        int duplicate = findDuplicate(arr);

        if (duplicate != -1){
            System.out.println("duplicate found " + duplicate);
        }else {
            System.out.println("dupliicate not foound ");
        }
    }

    public static int findDuplicate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }

        }
         return -1;
    }
}
