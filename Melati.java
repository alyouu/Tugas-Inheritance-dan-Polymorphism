public class Melati extends Bunga {
    private String aroma;

    public Melati(String nama, int harga, String aroma) {
        super(nama, harga);
        this.aroma = aroma;
    }

    public void tampilkanInfo() {
        System.out.println("Bunga " + nama + " memiliki aroma " + aroma + " | Harga: Rp" + getHarga());
    }
}