package cci_practice;

import java.util.HashMap;

public class FindKPairsFromArr {
    
    public static void findKPairs(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: arr) {
            
            if(map.containsKey((num-k))) {
                System.out.print("{"+num+", "+map.get(num)+"} ");
            } else map.put((num-1), num);
            if(map.containsKey((num+k))) {
                System.out.print("{"+num+", "+map.get(num)+"} ");
            } else map.put((num+k), num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,7,5,9,2,12,3};
        int k =2;
        findKPairs(arr, k);
    }
}
