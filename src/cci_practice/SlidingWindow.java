package cci_practice;

import java.util.HashMap;

public class SlidingWindow {
    
    private void slidigWindow(String b, String s) {
        HashMap<Character, Integer> subStr = new HashMap<>();
        HashMap<Character, Integer> str = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(subStr.containsKey(s.charAt(i))) {
                Integer count = subStr.get(s.charAt(i));
                subStr.put(s.charAt(i), count+1);
            } else subStr.put(s.charAt(i), 1);
        }

        for (int i = 0; i < b.length() - s.length()+1; i++) {
            for (int j = i; j < s.length()+i; j++) {
                if(str.containsKey(b.charAt(j))) {
                    Integer count = str.get(b.charAt(j));
                    str.put(b.charAt(j), count+1);
                } else str.put(b.charAt(j), 1);
            }
            
            if(str.equals(subStr)) {
                System.out.println("found from index: " +i+ "till: " + (i+s.length()-1));
            }
            str = new HashMap<>();
        }
    }
    public static void main(String[] args) {
        String b = "cbabadcbbabbcbabaabccbabc";
        String s = "abbc";

        SlidingWindow sw = new SlidingWindow();
        sw.slidigWindow(b, s);
    }
}
