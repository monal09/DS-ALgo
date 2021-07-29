import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] nums = {10,8,20,4,5};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int left, int right){
      if(left < right) {
          int part = partition(nums, left, right);
          quickSort(nums, left, part - 1);
          quickSort(nums, part + 1, right);
      }
    }

    public static int partition(int[] nums, int left, int right){
        int pivot = nums[right];
        int i = left - 1;

        for(int j = left; j < right;j++){
          if(nums[j] < pivot){
              i++;
              swap(nums, i, j);
          }
        }

        swap(nums, i+1, right);
        return i+1;
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
