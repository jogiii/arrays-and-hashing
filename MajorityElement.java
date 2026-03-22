import java.util.HashMap;
import java.util.Map;

public class MajorityElement {



    /*
    Given an array nums of size n, return the majority element.

    The majority element is the element that appears more than ⌊n / 2⌋ times in the array. 
    You may assume that the majority element always exists in the array.
        Input: nums = [5,5,1,1,1,5,5]

        Output: 5
    
    
    
    */

        public static void main(String [] args){
            MajorityElement me = new MajorityElement();

            int[] nums = {5,5,1,1,1,5,5};
           int a = me.majorityElement(nums);

           System.out.println(a);
        }

    public int majorityElement(int[] nums){

        int n =nums.length;
        int majority = n/2;
        Map<Integer,Integer> map =countElement(nums);

        for(int key: map.keySet()){
            if (map.get(key) > majority)
                return key ;
        }
        return 0;



    }

    public Map<Integer,Integer> countElement(int[] nums){
        Map<Integer, Integer> countMap = new HashMap<>();

        for(int num : nums){
            if(countMap.containsKey(num)){
                countMap.put(num, countMap.get(num)+1);
            }else{
                countMap.put(num, 1);
            }
        }

        return countMap;
        
    }



    //boyers moore voting algo


    public int majorityElementV2(int[] nums){

        int candidate =0;
        int count =0;

        for (int num : nums){

            if(count ==0){
                candidate = num;
            }
            if(num == candidate){
                count = count +1;
            }else{
                count = count-1;
            }


        }
        return candidate;

    }
    
}
