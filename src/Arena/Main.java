package Arena;

public class Main {
    public static void printLeaders(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
        {
            int j;
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] <=arr[j])
                    break;
            }
            if (j == size)
                System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        printLeaders(arr, n);
    }



    //arena multiple
//    public static int [] countOfNumbers(int A[],int n){
//        int [] resa = new int[n];
//
//        for(int i=0;i<n;i++)
//        {
//            int count =0;
//            for(int j=i+1;j<n;j++)
//            {
//                if(A[j]%A[i]==0)
//                {
//                    count++;
//                }
//            }
//            resa[i]=count;
//        }
//
//        return resa;
//    }
}
