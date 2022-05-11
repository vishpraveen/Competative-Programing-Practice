package cci_practice;

import java.util.HashMap;

public class SlidingWindowOptimised {
    
    private void slidigWindow(String b, String s) {
        HashMap<Character, Integer> subStr = new HashMap<>();
        HashMap<Character, Integer> str = new HashMap<>();
        int l = 0, r = 0;
        int window = s.length() -1;
        
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            subStr.put(ch, 0); 
            str.put(ch, 0); 
        }

        for(int i = 0; i< s.length(); i++) {
            if(!subStr.containsKey(s.charAt(i))) {
                subStr.put(s.charAt(i), 1);
            } else {
                Integer value = subStr.get(s.charAt(i));
                subStr.put(s.charAt(i), value+1);
            }
        }

        while((r< b.length())) {
            if(r <= window) {
                if(!str.containsKey(b.charAt(r))) {
                    str.put(b.charAt(r), 1);
                } else {
                    Integer value = str.get(b.charAt(r));
                    str.put(b.charAt(r), value+1);
                }
                r++;
            } else {
                if(!str.containsKey(b.charAt(r))) {
                    str.put(b.charAt(r), 1);
                } else {
                    Integer value = str.get(b.charAt(r));
                    str.put(b.charAt(r), value+1);
                }
                r++;
                l++;
                Integer value = str.get(b.charAt(l-1));
                str.put(b.charAt(l-1), value-1);
            }

            if(subStr.equals(str)) {
                System.out.println("found from: "+l+ " to: "+r);
            }
        }
    }

    public static void main(String[] args) {
        // String b = "cbabadcbbabbcbabaabccbabc";
        String b = "abbcdbcabddabbcadbcab";
        String s = "abbc";

        SlidingWindowOptimised swo = new SlidingWindowOptimised();
        swo.slidigWindow(b, s);
    }
}
