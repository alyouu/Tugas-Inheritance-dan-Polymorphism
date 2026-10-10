public class Tulip extends Bunga {
    private String musim;

    public Tulip(String nama, int harga, String musim) {
        super(nama, harga);
        this.musim = musim;
    }

    public void tampilkanInfo() {
        System.out.println("Bunga " + nama + " mekar pada musim " + musim + " | Harga: Rp" + getHarga());
    }
}