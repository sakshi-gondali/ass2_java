// Write a java program to display transpose of given matrix.

import java.util.Scanner;

public class q2 {

    static void accept( int a[][],int num1,int num2){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value for the matrx ");
        for (int i = 0; i <num1 ; i++) {
            for (int k = 0; k < num2; k++) {
                a[i][k]=sc.nextInt();
            }
        }
    }
    static void display(int a[][],int i,int j){
        System.out.println("the matrix is  ");
        for (int i2 = 0; i2 < i; i2++) {
            for (int k = 0; k < j; k++) {
                System.out.print(a[i2][k]+" ");
            }
            System.out.println();
        }
    }
    static void transpose(int a[][],int b[][],int i,int j){
        
        for (int i2 = 0; i2 < i; i2++) {
            for (int k = 0; k < j; k++) {
                b[k][i2]=a[i2][k];
            }
           
        }
    }
    public static void main(String[] args) {
        int a [][]=new int [2][7];
        int b [][]=new int [7][2];
        accept(a, 2, 7);
        display(a, 2, 7);
        transpose(a,b, 2, 7);
        display(b, 7, 2);

    }
}
