public class LongestCommonPrefix {

    // Input: strs = ["bat","bag","bank","band"]



    // Output: "ba"

    public static void main(String args[]){
        LongestCommonPrefix lcp = new LongestCommonPrefix();

        // Test Case 1
        String[] strs1 = {"bat", "bag", "bank", "band"};
        System.out.println(lcp.longestCommonPrefix(strs1)); // "ba"

        // Test Case 2
        String[] strs2 = {"flower", "flow", "flight"};
        System.out.println(lcp.longestCommonPrefix(strs2)); // "fl"

        // Test Case 3
        String[] strs3 = {"dog", "racecar", "car"};
        System.out.println(lcp.longestCommonPrefix(strs3)); // ""
    }

    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length ==0)
            return "";

        String prefix = strs[0];

        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
        
    }
    
}
