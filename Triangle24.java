import java.util.Scanner;

public class Triangle24 {
    public static void main(String[] args) {
        // Membuat scanner untuk mengambil input dari pengguna
        Scanner sc = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        // Perulangan untuk mencetak segitiga
        for(int i = 1; i <= N; i++) {
            // Mencetak bintang sebanyak nilai i
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Berpindah ke baris baru setelah mencetak satu baris bintang
            System.out.println();
        }
    }
}
