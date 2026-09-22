import java.util.Scanner;
public class day21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String umur = sc.nextLine();
        String tinggi = sc.nextLine();
        String kelamin = sc.nextLine();
        String b = sc.nextLine();
        String berat =sc.nextLine();

        int umurInt = Integer.parseInt(umur);
        System.out.println("String Umur dalam bentuk integer : " + umurInt);

        double tinggiDouble = Double.parseDouble(tinggi);
        System.out.println("String Tinggi dalam bentuk double : " + tinggiDouble);

        char Char = kelamin.charAt(0);
        System.out.println("String kelamin dalam tipe data char : " + Char);

        boolean bBoolean = Boolean.parseBoolean(b);
        System.out.println("String status mahasiswa dalam bentuk boolean : " + bBoolean);

        float f = Float.parseFloat(berat);
        System.out.println("Srting berat dalam bentuk float : " + f);
    }
}
