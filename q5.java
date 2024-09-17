// A) Write a menu driven java program using command line arguments for the following: 
// 1. Addition 2. Subtraction 3. Multiplication 4. Division.

public class q5 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
