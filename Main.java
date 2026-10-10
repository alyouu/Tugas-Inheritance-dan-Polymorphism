public class Main {
    public static void main(String[] args) {
        // Mendemonstrasikan Polimorfisme dengan Array
        // Membuat wadah bertipe kelas induk (Bentuk) sebanyak 3 ruang
        Bentuk[] daftarBentuk = new Bentuk[3];

        // Mengisi masing-masing ruang dengan objek dari kelas anak
        daftarBentuk[0] = new BujurSangkar(5.0, "Merah");
        daftarBentuk[1] = new Lingkaran(10.0, "Biru");
        daftarBentuk[2] = new Silinder(15.0, 7.0, "Hijau"); // tinggi=15, radius=7

        System.out.println("= BENTUK GEOMETRI =");
        
        // Looping untuk memanggil method printInfo()
        // Ini adalah implementasi Polimorfisme (Dynamic Binding)
        // Program otomatis tahu printInfo() mana yang harus dieksekusi sesuai bentuknya
        for (int i = 0; i < daftarBentuk.length; i++) {
            daftarBentuk[i].printInfo();
        }
    }
}