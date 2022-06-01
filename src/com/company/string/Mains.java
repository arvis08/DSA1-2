package com.company.String;

import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("enter the string");
//        String str = s.next();
//        System.out.println(palindrome(str));
//
//        System.out.println(maxPower(str));
        System.out.println(toggleCase("aBcDeF"));
    }

    public static int palindrome(String str) {
//         str="123321";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return 0;
            }
        }
        return 1;
    }

    public static void reverse(String str) {
        int len = str.length() - 1;
        while (len >= 0) {
            String str2 = "";
            str2 = str2 + str.charAt(len);
            len--;
            System.out.print(str2);
        }
//        System.out.println(str2);
    }

    public static int maxPower(String s) {
        int ans = 0;
        int count = 0;
        char last = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (last == curr) {
                count++;
            } else {
                last = curr;
                count = 1;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }

    public static String toggleCase(String s) {
        String ans = "";
        StringBuilder answer=new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr >= 'a' && curr <= 'z') {
                char newChar = (char) (curr + 'A' - 'a');
                ans = ans + newChar;
                answer.append(newChar);
            } else {
                char newChar = (char) (curr + 'a' - 'A');
                ans = ans + newChar;
                answer.append(newChar);
            }
        }
        return answer.toString();
    }
}