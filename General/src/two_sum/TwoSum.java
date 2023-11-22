package two_sum;

public class TwoSum {

    //[1,2,3,4,5,6], target == 9

    public int[] calculateSum(int[] nums, int target){
        for(int i = 0;i < nums.length;i++){
            for(int j = i + 1; j < nums.length;i++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return nums;
    }

}
