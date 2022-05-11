package arrays;

import java.util.HashMap;
import java.util.Map;

public class BeautifulArray {
    
    public static int minDeletion(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int x: nums) {
            if(!map.containsKey(x)) map.put(x, 1);
            else {
                Integer val = (Integer) map.get(x);
                System.out.println(val);
                if(x % 2 !=0) {
                    int result = (x % 2);
                    System.out.println("mod result = "+ result);
                    map.put(x, val+1);
                }
            }
        }
        
        int count = 0;
        for(Map.Entry<Integer, Integer> m : map.entrySet()){    
            Integer val = m.getValue();
            if(val >= 2) count++;
        }  
        
        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,2,2,3,3};
        System.out.println(minDeletion(nums));
        
    }
}
