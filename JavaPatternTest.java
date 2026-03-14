import java.util.Scanner;

public class JavaPatternTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of the Rows --> ");
      
        int n=sc.nextInt();
        System.out.println();

        int k=1;
        for(int i=0;i<n;i++){
            for (int j = 0; j <= i; j++) {
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
}