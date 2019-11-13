package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 242题 异位字符串
 * Created by my on 2019/11/13.
 */
public class Question242 {

    public static void main(String[] args) {
        /**
         s="anagram"
         t="nagaram"
         */
        String s = "aacc";//aacc
        String t = "ccac";//ccac
       boolean bn = new Question242().isAnagram(s,t);
       //ab ,a
        System.out.println(bn);
    }
    public boolean isAnagram(String s, String t) {

        if(s.length() == 0 && t.length()==0){
            return true;
        }
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
        char [] sArr = s.toCharArray();
        char [] tArr = t.toCharArray();
        for (char c : sArr){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        for(char c : tArr){
            if(map.containsKey(c)){
                int res = map.get(c)-1;
                if(res == 0 ){
                    map.remove(c);
                }else{
                    map.put(c,res);
                }

            }else {
                return false;
            }
        }

        return true;
    }

}
