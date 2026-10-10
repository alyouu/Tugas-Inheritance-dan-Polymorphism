public class Silinder extends Lingkaran {
    private double tinggi;

    public Silinder(double tinggi, double radius, String warna) {
        super(radius, warna); // Memanggil constructor kelas induk (Lingkaran)
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double t) {
        this.tinggi = t;
    }

    public double hitungVolume() {
        return hitungLuas() * tinggi; // Menggunakan hitungLuas() dari kelas Lingkaran
    }

    @Override
    public void printInfo() {
        System.out.println("Silinder - Warna: " + getWarna() + ", Radius: " + getRadius() + ", Tinggi: " + tinggi + ", Volume: " + hitungVolume());
    }
}