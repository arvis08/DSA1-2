package Contest;

import java.util.Scanner;

public class Contest {

    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        long[] start = new long[n];
//        for (int i = 0; i < n; i++) {
//            start[i] = s.nextLong();
//        }
//
//        long[] end = new long[n];
//        for (int i = 0; i < n; i++) {
//            end[i] = s.nextLong();
//        }
//
//        int[] exp = new int[n];
//        for (int i = 0; i < n; i++) {
//            exp[i] = s.nextInt();
//        }
//
//        maximumExperience(start, end, exp, n);
//    }
//
//    public static void maximumExperience(long[] start, long[] end, int[] exp, int n) {
//        int high = 0;
//        int sum = 0;
//        int r = 0;
//        while (r < n) {
////                    if(k==n) return;
//            sum = exp[r];
//            for (int i = r; i < n - 1; i++) {
//                int k = i + 1;
//                while (start[k] < end[i])
//                    k++;
//
////                if (start[k] >= end[i]) {
//                    sum += exp[i + 1];
////                }
//            }
//            high = Math.max(high, sum);
//            r++;
//
//        }
//        System.out.print(high);

        Scanner sc=new Scanner(System.in);
        String p=sc.nextLine();
        String s=sc.nextLine();
        int n=0;
        int t=0;
        for(int i=0;i<s.length();i++){
            char c=(char)s.charAt(i);
            if(c=='N'){
                n++;
            }
            if(c=='T'){
                t++;
            }
        }
        if(n>t){
            System.out.println("Nutan");
        }else{
            System.out.println("Tusla");
        }

    }
}