// Write a java program to display following pattern:
// 1
// 01
// 010
// 1010

public class q3 {

    public static void main(String[] args) {
        for (int i = 0; i <5; i++) {
            for (int j = 0; j < i; j++) {
                if (j%2==0){
                    System.out.print(0);
                }
                else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
    
}