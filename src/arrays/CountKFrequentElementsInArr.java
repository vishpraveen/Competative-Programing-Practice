package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Map.Entry;

public class CountKFrequentElementsInArr {

    public static int[] countFrequentElements(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            if(map.containsKey(num)) {
                int count = map.get(num);
                map.put(num, count+1);
            } else map.put(num, 1);
        }

        int[] nums2 = new int[k];
        Iterator<Entry<Integer, Integer>> i = map.entrySet().iterator();
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        while(i.hasNext()) {
            if(queue.size() < k) {
                queue.add(i.next().getValue());
            }
        }

        return nums2;
    }
    
    public static void swapArr(int[] nums2, Entry<Integer, Integer> value) {
        for(int i = 0; i < nums2.length; i++) {
            if(nums2[i] == 0) nums2[i] = value.getKey(); 
            else if(nums2[i] < value.getValue()) {
                nums2[i] = value.getKey();
                break;
            }
        }
    }
    public static void main(String args[]) {
        // int[] nums = {1,1,1,2,2,3};
        int[] nums = {1};

        System.out.print(Arrays.toString(countFrequentElements(nums, 1)));
    }
}
