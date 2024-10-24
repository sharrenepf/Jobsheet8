import java.util.Scanner;

public class Square24 {
    public static void main(String[] args) {
        // Membuat scanner untuk mengambil input dari pengguna
        Scanner sc = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        // Perulangan luar untuk baris
        for(int iOuter = 1; iOuter <= N; iOuter++) {
            // Perulangan dalam untuk mencetak bintang di setiap baris
            for(int i = 1; i <= N; i++) {
                System.out.print("*");
            }
            // Berpindah ke baris baru setelah mencetak satu baris bintang
            System.out.println();
        }
    }
}
