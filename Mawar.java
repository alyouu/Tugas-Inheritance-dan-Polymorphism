public class Mawar extends Bunga {
    private String warna;

    public Mawar(String nama, int harga, String warna) {
        super(nama, harga);
        this.warna = warna;
    }

    public void tampilkanInfo() {
        System.out.println("Bunga " + nama + " berwarna " + warna + " | Harga: Rp" + getHarga());
    }
}