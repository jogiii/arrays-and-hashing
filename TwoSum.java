import java.util.HashMap;

public class TwoSum {
    public static void main(String args[]){
        TwoSum ts = new TwoSum();
        int[] nums = {3,4,5,6};
       int[] ind =  ts.twoSum(nums, 7);
       for(int i : ind){
        System.out.println(i);
       }
    }

    // my approach, but it is failing at negative numbers

    public int[] twoSum(int[] nums, int target){

        int[] ind = new int[2];

        for(int i=0;i<nums.length;i++){
           int rem = nums[i] - target;
           int pos_rem = Math.abs(rem);
           for(int j =i+1;j<nums.length;j++){
                if(pos_rem == nums[j]){
                    ind[0] = i;
                    ind[1] = j;
                    return ind;
                }
           }
        }
        return ind;

    }
// brute force O(n2)
    public int[] twoSumV2(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }


    public int[] twoSumV3(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int rem = target -nums[i];

            if(map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }
        }
        return new int[]{};
    }


    
}
