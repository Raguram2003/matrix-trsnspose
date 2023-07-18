import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[][] matrixTrans(int[][] arr) {
        int ro = arr.length;
        int col = arr[0].length;
        int[][] arra = new int[col][ro];
        if(ro==col)
        {
            for (int i = 0; i < ro; i++) {
                for (int j = 0; j < col; j++) {
                    int temp=0;
                    if (i < j) {
                        temp = arr[i][j];
                        arr[i][j] = arr[j][i];
                        arr[j][i] = temp;
                    }
                }
            }
            return arr;
        }
        else{
            for (int i = 0; i < ro; i++) {
                for (int j = 0; j < col; j++) {
                        arra[j][i] = arr[i][j];
                }
            }
            return arra;
        }
    }
}


public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows size: ");
        int rows = sc.nextInt();
        System.out.print("enter the column size: ");
        int column = sc.nextInt();
        System.out.print("Enter the array elements : ");
        int[][] arr = new int[rows][column];
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Solution answer = new Solution();
        System.out.println(Arrays.deepToString(answer.matrixTrans(arr)));

    }
}
/*
import java.util.Scanner;



public class MinorDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows size: ");
        int rows = sc.nextInt();
        System.out.print("enter the column size: ");
        int column = sc.nextInt();
        System.out.print("Enter the array elements : ");
        int[][] arr = new int[rows][column];
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Solution answer = new Solution();
        if(rows == column) {
            System.out.println(answer.minordiagonalcount(arr));
        }
        else{
            System.out.println("invalid matrix");
        }


    }
}
 */