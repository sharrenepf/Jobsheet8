public class  Tugas124 {
    public static void main(String[] args) {
        // deklarasi variable 
        int n = 7;
        int h = 1;

        // logic 
        // mengulang per baris
        while (h <= n) {
            int i = 1;
            while (i <= n) {
                if (h == 1 || h == n || i == 1 || i == n) {
                    System.out.print("7 "); 
                } else {
                    System.out.print("  "); 
                }
                i++;
            }

            System.out.println();
            
            h++;
        }
    }
}

