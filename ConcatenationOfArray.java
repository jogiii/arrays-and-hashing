public class ConcatenationOfArray {
    public static void main(String args[]){

        int[] nums = {22,21,20,1};

        ConcatenationOfArray coa = new ConcatenationOfArray();

        var ans =coa.getConcatenation(nums);

        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }

    public int[] getConcatenation(int[] nums){
       int n =  nums.length;
       int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }

       return ans;
    }
    
}
