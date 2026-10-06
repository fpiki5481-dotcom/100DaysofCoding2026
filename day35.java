import java.util.Scanner;

public class day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //if bersarang
            int nilai = sc.nextInt();
            int kehadiran = sc.nextInt();

            if (nilai >= 75) {
                System.out.println("nilai ujian anda lulus");
                if (kehadiran >= 80) {
                    System.out.println("anda mendapat predikat pujian");
                } else {
                    System.out.println("kehadiran anda kurang dari 80%, tidak dapat predikat");
                }
            } else {
                System.out.println("nilai ujian anda tidak lulus");
            }
              
        }

    }
