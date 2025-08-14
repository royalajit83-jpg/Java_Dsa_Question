import java.util.Arrays;

public class MergeAr {
    public static void main(String[] args) {
        int[] arr1 = {3,1,2,5,6};
        int[] arr2 = {7,4,8,9,10};
        int[] result = MergeArr(arr1,arr2);
        System.out.println();
        System.out.println(Arrays.toString(result));


    }
    public static int[] MergeArr(int[] arr1,int[] arr2){
       int[] mergedArr = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            mergedArr[i] = arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            mergedArr[arr1.length+i] = arr2[i];

        }
        for (int i = 0; i < mergedArr.length; i++) {
            System.out.print( mergedArr[i]+" ");

        }
        int temp;
        for (int i = 0; i < mergedArr.length; i++) {
            for (int j = i+1; j < mergedArr.length; j++) {
                if (mergedArr[i]>mergedArr[j]){
                    temp=mergedArr[i];
                    mergedArr[i] =mergedArr[j];
                    mergedArr[j] =temp;

                }

            }

        }
        return mergedArr;
    }
}
