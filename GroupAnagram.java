import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

    /*
    
    
    Example 1:

Input: strs = ["act","pots","tops","cat","stop","hat"]

Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
    
    
    */
public static void main(String args[]){
    GroupAnagram ga = new GroupAnagram();
    String[] strs = {"act","pots","tops","cat","stop","hat"};
    System.out.println(ga.groupAnagramsV2(strs));
}


    public List<List<String>> groupAnagrams(String[] strs){

        List<List<String>> res = new LinkedList<>();
        boolean[] visited = new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(visited[i])
                continue;

            List<String> group = new LinkedList<>();
            group.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){

               boolean check= isAnagram(strs[i],strs[j]);
               if(!visited[j] && check){
                    group.add(strs[j]);
                    visited[j]=true;
               }

            }
            res.add(group);
            
        }
        return res;


        
    }



    public List<List<String>> groupAnagramsV2(String[] strs){
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());

        
    }



    public boolean isAnagram(String s, String t){
        if(s.length() != t.length())
            return false;

        char[] char_count = new char[26];

        for(int i=0;i<s.length();i++){
            char_count[s.charAt(i)-'a']++;
            char_count[t.charAt(i)-'a']--;
        }

        for(char count : char_count){
            if(count != 0)
                return false;
        }
        return true;
    }
    
}
