package cci_practice;

import java.util.HashMap;

public class FindIndexesofFirstAndLast {

    private void findIndixesOf(int[] arr, int x) {
        int firstIndex =-1;
        int lastIndex = -1;

        for(int i = 0; i< arr.length; i++) {
            if(arr[i] == x) {
                if(firstIndex == -1) firstIndex = i;
                else if(lastIndex == -1) lastIndex = i;
                else lastIndex++;
            }
        }

        System.out.println("indices: "+firstIndex +" "+lastIndex);
    }

    private void findDistanceBetweenTwoWords(String[] arr, String word1, String word2) {

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i< arr.length; i++) {
            map.put(arr[i], i);
        }

        System.out.println("Result: "+Math.abs(map.get(word1)-map.get(word2)));
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 7, 7, 7, 7};
        int x = 7;

        String[] arr1 = {"the", "quick", "brown", "fox", "pass"};
        String word1 = "quick";
        String word2 = "fox";

        FindIndexesofFirstAndLast index = new FindIndexesofFirstAndLast();
        index.findIndixesOf(arr, x);

        index.findDistanceBetweenTwoWords(arr1, word1, word2);

    }
}
