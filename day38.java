import java.util.Scanner;

public class day38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int plh;

        System.out.println("===== MENU BENGKEL FAUZIL =====");
        System.out.println("1. OLI");
        System.out.println("2. BENSIN");
        System.out.println("3. BAN DALAM");
        System.out.print("Pesan ki 1 - 3 : ");
        plh = in.nextInt();

        if (plh == 1) {
            System.out.println("OLI");
            System.out.println("Harga: Rp65.000");
        } else if (plh == 2) {
            System.out.println("BENSIN");
            System.out.println("Harga: Rp18.000");
        } else if (plh == 3) {
            System.out.println("BAN DALAM");
            System.out.println("Harga: Rp46.000");
        } else {
            System.out.println("menu tidak tersedia!");
        }

        in.close();
    }
}
