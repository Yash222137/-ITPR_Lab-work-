import java.util.Scanner;

public class Pattern1 {
    public static void main( String []args){
        //priting a right angle triangle
        int n;
        // to store number of rows
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        n = sc.nextInt();
        // varification whether no. of rows is positve or not
        if (n>0){
            for(int row =1 ; row <= n ; row++) {
                for(int col =1 ; col <= row ; col++){
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}
}
