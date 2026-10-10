import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Polimorfisme, vriabel bertipe kelas induk (Bunga) menunjuk ke objek kelas anak
        Bunga mawar = new Mawar("Mawar Merah", 25000, "Merah");
        Bunga anggrek = new Anggrek("Anggrek Bulan", 75000, "Hutan Tropis");
        Bunga melati = new Melati("Melati Putih", 15000, "Harum Semerbak");
        Bunga tulip = new Tulip("Tulip Kuning", 45000, "Semi");

        boolean jalan = true;
        
        while(jalan) {
            System.out.println("\n=== TOKO BUNGA DANDELION ===");
            System.out.println("1. Informasi Bunga Mawar");
            System.out.println("2. Informasi Bunga Anggrek");
            System.out.println("3. Informasi Bunga Melati");
            System.out.println("4. Informasi Bunga Tulip");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            
            int pilihan = scanner.nextInt();
            
            switch(pilihan) {
                case 1:
                    mawar.tampilkanInfo();
                    break;
                case 2:
                    anggrek.tampilkanInfo();
                    break;
                case 3:
                    melati.tampilkanInfo();
                    break;
                case 4:
                    tulip.tampilkanInfo();
                    break;
                case 5:
                    System.out.println("Terima kasih telah berkunjung ke Toko Bunga Dandelion!");
                    jalan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak ada!");
            }
        }
        scanner.close();
    }
}