package com.gamba.datastructuresalgorithms.examples;

public class RepeatedString {

    public static void main(String[] args) {
        //System.out.println(repeatedString("aba", 10));
        System.out.println(repeatedString("aedbdaeaddadddcedcbbabdccbecaecaccdbebeeadadcaabbaabbaeeeecaddbcdecbbdccdebaaebecdaaabbcdeccbabaabce", 731869010806L));
    }
    public static long repeatedString(String s, long n) {
        // Write your code here
        var newString = "";
        if(s.length() > n){
            newString = s.substring(0, (int)n);
            var numberOfAs = 0;
            for (char a : newString.toCharArray()) {
                if(a == 'a')
                    numberOfAs++;
            }
            return numberOfAs;
        } else {
            if(s.equals("a")){
                return n;
            } else {
                var multiplier = n / s.length();
                var numberOfAs = 0;
                for (char a : s.toCharArray()) {
                    if(a == 'a')
                        numberOfAs++;
                }
                var numberOfAsInRest = 0;
                var rest = (n % s.length());
                System.out.println("rest: " + " " + s.length() + " " +rest);
                if(rest == 0){
                    numberOfAsInRest = s.charAt((int)rest) == 'a' ? 1 : 0;
                } else {
                    newString = s.substring(0, (int)rest);

                    for (char a : newString.toCharArray()) {
                        if(a == 'a')
                            numberOfAsInRest++;
                    }
                }
                return (numberOfAs * multiplier) + numberOfAsInRest;
            }
        }
    }
}
