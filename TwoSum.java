import java.util.HashMap;

public class TwoSum {
    public static void main(String args[]){

       TwoSum ts = new TwoSum();

        // Test Case 1: Basic
        int[] nums1 = {3, 4, 5, 6};
        int target1 = 7;
        int[] ans1 = ts.twoSumV2(nums1, target1);
        System.out.println("Test 1: [" + ans1[0] + ", " + ans1[1] + "]"); // [0,1]

        // Test Case 2: Negative numbers
        int[] nums2 = {-3, 4, 5, -1};
        int target2 = 1;
        int[] ans2 = ts.twoSum(nums2, target2);
        System.out.println("Test 2: [" + ans2[0] + ", " + ans2[1] + "]"); // [0,1]

        // Test Case 3: Large numbers
        int[] nums3 = {100, 200, 300, 400};
        int target3 = 500;
        int[] ans3 = ts.twoSum(nums3, target3);
        System.out.println("Test 3: [" + ans3[0] + ", " + ans3[1] + "]"); // [0,3]
    }

    /*
    Input: 
    nums = [3,4,5,6], target = 7

    Output: [0,1]
    
    */

    public int[] twoSum(int[] nums, int target){
        // brute force
        int[] result = new int[2];
        for(int i=0 ;i<nums.length;i++){
            int res= target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(res == nums[j]){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }  

            }
        }
        return result;
        

    }


    //hashmap method


    public int[] twoSumV2(int[] num, int target){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<num.length;i++){
            int rem = target- num[i];

            if(map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }
            map.put(num[i], i);
        }
        return new int[]{};

    }

   
    
}
