package top100;

import java.util.*;

public class lc49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for (String s:strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String key=Arrays.toString(chars);
            List<String> list=map.getOrDefault(key,new ArrayList<String>());
            list.add(s);
            map.put(key,list);
        }

        return new ArrayList<List<String>>(map.values());
    }
}
