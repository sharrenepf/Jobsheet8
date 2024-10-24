import java.util.Scanner;

public class TriangleModif24 {
    public static void main(String[] args) {
        // Membuat scanner untuk mengambil input dari pengguna
        Scanner sc = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt(); 
        

        // Inisialisasi variabel untuk perulangan luar
        int i = 0;

        // Perulangan luar untuk mencetak baris
        while (i <= N) {
            // Inisialisasi variabel untuk perulangan dalam
            int j = 0;

            // Perulangan dalam untuk mencetak bintang di setiap baris
            while (j < i) {
                System.out.print("*");
                j++;
            }

            // Pindah ke baris baru setelah selesai mencetak bintang di satu baris
            System.out.println();
            
            // Menambah nilai i untuk iterasi berikutnya
            i++;
        }
    }
}
