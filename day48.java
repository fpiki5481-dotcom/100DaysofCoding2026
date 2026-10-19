import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
       
        Scanner sc = new  Scanner(System.in);

        System.out.print("angka 1 : ");
        int angka1 = sc.nextInt();

        System.out.print("operator +,-,*,/ : ");
        char operator = sc.next().charAt(0);

        System.out.print("angka 2 : ");
        int angka2 = sc.nextInt();
        switch (operator) {
            case ('+'):
            System.out.println(angka1 + angka2);
            break;
            case ('-'): 
            System.out.println(angka1 - angka2);
            break;
            case ('*'):
            System.out.println(angka1 * angka2);
             break;
            case ('/'): 
            System.out.println(angka1 / angka2);
            break;
            default:
            System.out.println("Operator salah");
        }
        
    }
}
    

