import java.util.Scanner;

public class UbahWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input waktu dalam detik
        System.out.print("Masukkan waktu dalam detik: ");
        int totalDetik = input.nextInt();

        // Konversi ke jam, menit, dan detik
        int jam = totalDetik / 3600;
        int sisaDetik = totalDetik % 3600;
        int menit = sisaDetik / 60;
        int detik = sisaDetik % 60;

        // Output hasil konversi
        System.out.printf("%d:%02d:%02d\n", jam, menit, detik);
    }
}
