import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gaji kotor : ");
        double gajikotor = sc.nextDouble();

        System.out.print("golongan gaji : ");
        int golongan = sc.nextInt();
        
        double pajak;
        
        if (golongan == 1) {
            pajak = 0.05; //= 5%
            double gajiBersih = gajikotor - (gajikotor * pajak);
            System.out.println("Gaji bersih : " + gajiBersih);
        } else if (golongan == 2) {
            pajak = 0.10; //= 10%
             double gajiBersih = gajikotor - (gajikotor * pajak);
            System.out.println("Gaji bersih : " + gajiBersih);
        }
        else {
           System.out.println("tidak ada gologan gaji");
        }



        }


    }

