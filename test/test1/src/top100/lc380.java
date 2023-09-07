package top100;

import javax.sound.sampled.EnumControl;
import java.util.*;

public class lc380 {
    class RandomizedSet {
        List<Integer> arr;
        Map<Integer,Integer> map;
        Random random;
        public RandomizedSet() {
            arr=new ArrayList<>();
            map=new HashMap<>();
            random=new Random();
        }

        public boolean insert(int val) {
            if (map.containsKey(val)){
                return false;
            }
            int index=arr.size();
            map.put(val,index);
            arr.add(val);
            return true;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)){
                return false;
            }
            int index=map.get(val);
            int last= arr.get(arr.size()-1);
            arr.set(index,last);
            map.put(last,index);
            arr.remove(arr.size()-1);
            map.remove(val);
            return true;
        }

        public int getRandom() {
            int r=random.nextInt(arr.size());
            return arr.get(r);
        }
    }

}
