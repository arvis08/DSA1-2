package rahul;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static class pair
    {
        int first, second;
        public pair(int first, int second)
        {
            this.first = first;
            this.second = second;
        }
    }
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }

            int min=sumSubarrayMins(arr,n);
            int max=findMaxSum(arr,n);

            System.out.print(max-min);
        }


        public static int sumSubarrayMins(int A[], int n)
        {
            int []left = new int[n];
            int []right = new int[n];

            Stack<pair> s1 = new Stack<pair>();
            Stack<pair> s2 = new Stack<pair>();

            // getting number of element strictly larger
            // than A[i] on Left.
            for (int i = 0; i < n; ++i)
            {
                int cnt = 1;

                // get elements from stack until element
                // greater than A[i] found
                while (!s1.isEmpty() &&
                        (s1.peek().first) > A[i])
                {
                    cnt += s1.peek().second;
                    s1.pop();
                }

                s1.push(new pair(A[i], cnt));
                left[i] = cnt;
            }

            // getting number of element larger
            // than A[i] on Right.
            for (int i = n - 1; i >= 0; --i)
            {
                int cnt = 1;

                // get elements from stack until element
                // greater or equal to A[i] found
                while (!s2.isEmpty() &&
                        (s2.peek().first) >= A[i])
                {
                    cnt += s2.peek().second;
                    s2.pop();
                }

                s2.push(new pair(A[i], cnt));
                right[i] = cnt;
            }

            int result = 0;

            // calculating required resultult
            for (int i = 0; i < n; ++i)
                result = (result + A[i] * left[i] *
                        right[i]);

            return result;
        }

///////////////////////////////////////////////
        public static int findMaxSum(int arr[], int n)
        {
            // Arrays for maintaining left and right count
            int CL[] = new int[n], CR[] = new int[n];

            // Stack for storing the indexes
            Stack<Integer> q = new Stack<Integer>();

            // Calculate left count for every index
            for (int i = 0; i < n; i++)
            {
                while (q.size() != 0 && arr[q.peek()] <= arr[i])
                {
                    CL[i] += CL[q.peek()] + 1;
                    q.pop();
                }
                q.push(i);
            }

            // Clear the stack
            while (q.size() != 0)
                q.pop();

            // Calculate right count for every index
            for (int i = n - 1; i >= 0; i--)
            {
                while (q.size() != 0 && arr[q.peek()] < arr[i])
                {
                    CR[i] += CR[q.peek()] + 1;
                    q.pop();
                }
                q.push(i);
            }

            // Clear the stack
            while (q.size() != 0)
                q.pop();

            // To store the required sum
            int ans = 0;

            // Calculate the final sum
            for (int i = 0; i < n; i++)
                ans += (CL[i] + 1) * (CR[i] + 1) * arr[i];

            return ans;
        }





//    public static void old(){
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int[] arr=new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i]=s.nextInt();
//        }
//
////        int max=-1;
////        int secMax=-1;
////        for (int i = 0; i < n; i++) {
////            if(arr[i]>max){
////                secMax=max;
////                max=arr[i];
////            }
////        }
////        if(arr[n-1]>secMax && max!=arr[n-1])
////        secMax=arr[n-1];
////        System.out.println(secMax);
//
//        //16 17 4 3 5 2
//
//
//        int i=0;
//
//        for (int j = i+1; j < n; j++) {
//
//            if (arr[i] > arr[j]) {
//                j++;
//            } else if (arr[i] <= arr[j]) {
//                i = j;
//                j++;
//            }
//        }
//        System.out.println(arr[i]);
//    }
}
