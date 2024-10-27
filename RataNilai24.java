import java.util.Scanner;

public class RataNilai24 {
    public static void main(String[] args) {
        // deklarasi inputan
        Scanner input = new Scanner(System.in);

        // deklarasi variable
        float nilai, rataNilai;

        // judul
        System.out.println("========================================");
        System.out.println("================ Siakad ================");
        System.out.println("========================================\n");

        // perulangan untuk tiap mahasiswa
        int i = 1;
        while (i <= 5) {
            int totalNilai = 0;

            System.out.println("Input nilai mahasiswa ke-" + i);

            // perulangan untuk nilai tiap mahasiswa
            for (int j = 1; j <= 5; j++) {
                // input nilai mahasiswa
                System.out.print("Nilai ke-" + j + ": ");
                nilai = input.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;

            // output
            System.out.println("Rata-rata Nilai Mahasiswa ke-" + i + " adalah : " + rataNilai + "\n");

            // tambah nilai i untuk mahasiswa ke-i
            i++;
        }
    }
}
