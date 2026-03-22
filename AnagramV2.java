public class AnagramV2 {





    public boolean isAnagram(String s, String t){
        if(s.length() != t.length())
            return false;
        char[] arr = new char[26];
        for(int i =0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;

        }

        for(char count:arr){
            if(count !=0)
                return false;
        }
        return true;
    }
    
}
