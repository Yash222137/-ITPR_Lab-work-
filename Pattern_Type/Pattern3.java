 import java.util.Scanner;
 public class Pattern3 {


     public static void main( String []args){
        //priting a right angle triangle
        int n;
        // to store number of rows
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        n = sc.nextInt();
        // varification whether no. of rows is positve or not
        for( int row=1; row<=n; row++){
            for(int i=1; i<=(n-row); i++ ){
                System.out.print(" ");
            }
            for(int j=1;j<=(row*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
