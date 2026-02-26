import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String args[]){
        int[] nums = {1,2,3,4,4};
        ContainsDuplicate cd = new ContainsDuplicate();
        var val =cd.hasDuplicate2(nums);
        System.out.println(val);

    }
//brute force method O(n²)
    public boolean hasDuplicate(int[] nums){

        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] == nums[j])
                    return true;
            }
        }

        return false;

    }

    public boolean hasDuplicate2(int[] nums){
        HashSet<Integer> seen = new HashSet<>();

        for(int num:nums){
            if(seen.contains(num))
                return true;

            seen.add(num);
        }
        return false;
    }
    
}
