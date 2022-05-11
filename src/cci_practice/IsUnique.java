package cci_practice;

import java.util.HashMap;

public class IsUnique {
    
    private boolean checkIsUnique(String word) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < word.length(); i++) {
            if(map.containsKey(word.charAt(i))) return false;
            else map.put(word.charAt(i), 1);
        }
        return true;
    } 

    public static void main(String[] args) {
        IsUnique isUnique = new IsUnique();
        String word = "abca";
        System.out.println(word+ " is unique: "+isUnique.checkIsUnique(word));
    }
}
