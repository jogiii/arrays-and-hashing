import java.util.Arrays;

public class Anagram {

    public static void main(String args[]){
        Anagram a = new Anagram();
        boolean test = a.isAnagram("jar", "jam");
        System.out.println(test);
    }
// brute force
    public boolean isAnagram(String s, String t){
        char[] ss =s.toCharArray();
        char[] tt =t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
       return String.valueOf(ss).equals(String.valueOf(tt));
    }
//optimal solution
    public boolean isAnagramV2(String s, String t){
        //length check early exit
        if(s.length() !=t.length())
            return false;

        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int c:count){
            if(c != 0)
                return false;
        }
        return true;


    }
    
}
