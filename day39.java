import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        
        System.out.println("=== Program Kalkulator Sederhana Java ===");
        
        System.out.print("angka pertama: ");
         int angka1 = sc.nextInt();
        
        System.out.print("Operator  : ");
        char operator = sc.next().charAt(0);

        System.out.print("angka kedua: ");
         int angka2 = sc.nextInt();

         System.out.print("Hasil operator :");

         if (operator == '+') {
            System.out.println(angka1 + angka2);
         } else if(operator == '-') {
            System.out.println(angka1 - angka2);
         } else if (operator == '*') {
            System.out.println(angka1 * angka2);
         } else if (operator == '/') {
            System.out.println(angka1 / angka2);
         } else if (operator == '%'){
            System.out.println(angka1 % angka2);
         }
         else {
            System.out.println("invalid");
         }

        }
      
    }

