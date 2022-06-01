package mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mock {
    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 2, 3, 4}, {2, 4, 5, 2}, {1, 2, 3, 4, 5, 6}, {}};

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                list.add(matrix[i][j]);
            }
        }

        int[] arr=new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=list.get(i);
        }
//        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
//        System.out.println(Arrays.toString(arr));
    }
}
