import java.util.Scanner;

public class Star24 {
    public static void main(String[] args) {
        // Membuat scanner untuk mengambil input dari pengguna
        Scanner sc = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        // Melakukan perulangan sebanyak N kali
        for(int i = 1; i <= N; i++) {
            System.out.print("*"); // Mencetak bintang tanpa berpindah baris
        }
    }
}
