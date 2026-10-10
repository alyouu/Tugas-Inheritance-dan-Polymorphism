public class Anggrek extends Bunga {
    private String asal;

    public Anggrek(String nama, int harga, String asal) {
        super(nama, harga);
        this.asal = asal;
    }

    public void tampilkanInfo() {
        System.out.println("Bunga " + nama + " asli dari " + asal + " | Harga: Rp" + getHarga());
    }
}