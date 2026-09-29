import java.util.Scanner;

public class day28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Operator perbandingan == dan !=

        System.out.print("nilai A : ");
        int A = sc.nextInt();
        
        System.out.print("nilai B : ");
        int B = sc.nextInt(); 
       

        if (A == B){
            System.out.println(" nilai A sama dengan nilai B");
            return;
        }
        if (A != B){
            System.out.println("nilai A tidak sama dengan nilai B");
        }
             
    }
}
