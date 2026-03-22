import java.util.ArrayList;
import java.util.List;

public class RemoveElements {

    /*
            Input: nums = [1,1,2,3,4], val = 1

            Output: [2,3,4]
    
    */


            public static void main( String args[]){
                RemoveElements re = new RemoveElements();
                int a =re.removeElement(new int[]{1,1,2,3,4}, 1);
                System.out.println(a);
            }

    public int removeElement(int[] nums, int val) {

        int k =0;

        for (int i =0;i<nums.length;i++){

            if (nums[i] != val){
                    nums[k] = nums[i];
                    k++;
            }
        }
        return k;
        
    }
    
}
