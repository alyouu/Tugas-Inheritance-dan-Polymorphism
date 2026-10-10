public class Bunga {
    protected String nama;
    private int harga;

    public Bunga(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void tampilkanInfo() {
        System.out.println("Ini adalah bunga " + nama);
    }
}