package in.kgcoding.Test;

public class Temp {
    public static void main(String[] args) {
        int[] arr = {3,5,7,2,6};
        int target = 9;
        int[] result = TwoSum(arr,target);
        if (result == null){
            System.out.println(-1);
        }else{
            System.out.println(result[0] + " " + result[1]);
        }

    }

    public static int[] TwoSum(int[] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    return new int[] {i,j};
                }
            }

        }

        return null;
    }
}
