package org.Exercises.Geeksforgeeks.Powtórka;

public class Remove_zero_from_string {
    static String removeZero(String str) {

        int i = 0;
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }
        StringBuffer sb = new StringBuffer(str);
        sb.replace(0, i, "");
        return sb.toString();
    }

    public static void main(String[] args) {

        String name = "000001112222";
        String s = removeZero(name);
        System.out.println(s);
    }
}
