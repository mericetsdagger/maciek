package org.Exercises;

public class Exercise23 {
//    Remove Leading Zeros From String in Java

    static String removeZero(String string) {
        int i = 0;
        while (i < string.length() && string.charAt(i) == '0')
            i++;
        StringBuffer sb = new StringBuffer(string);
        sb.replace(0, i, "");

        return sb.toString();
    }

    public static void main(String[] args) {
        String string = "000000233312";
        string = removeZero(string);
        System.out.println(string);
    }
}
