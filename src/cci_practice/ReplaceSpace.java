package cci_practice;

public class ReplaceSpace {
    
    public static void main(String[] args) {
        String value = "Mr John Smith";
        // replaceSpace(value);
        replaceSpaceByModifingString(value.toCharArray());
    }

    private static void replaceSpaceByModifingString(char[] value) {
        int space_count = 0;

        for(int i = 0; i<value.length; i++) {
            if(value[i] == ' ') space_count++;
        }

        int newLenght = value.length + (space_count*2);

        char[]  oldValue = value;
        value = new char[newLenght];
        
        for(int i = oldValue.length-1; i >=0; i--) {
            if(oldValue[i] == ' ') {
                value[newLenght-1] = '0';
                value[newLenght-2] = '2';
                value[newLenght-3] = '%';
                newLenght-=3;
            } else {
                value[newLenght -1] = oldValue[i];
                newLenght--;
            }
        }
        System.out.println("Result: "+new String(value));
    }

    private static void replaceSpace(String value) {
        StringBuilder br = new StringBuilder();

        for(int i = 0; i < value.length(); i++) {
            if(value.charAt(i) == ' ') {
                br.append("%20");
            } else {
                br.append(value.charAt(i));
            }
        }

        System.out.println("Result: "+br.toString());
    }
}
