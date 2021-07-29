import java.util.Arrays;

public class AllNegativeToFront {
    public static void main(String[] args) {
        int[] arr = {-1, 5, -6, 7, -10};

        moveNegative(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveNegative(int[] arr){
        int start = 0;
        for(int i = 0; i < arr.length; i++){
          if(arr[i] < 0){
              swap(arr, start, i);
              start++;
          }
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
