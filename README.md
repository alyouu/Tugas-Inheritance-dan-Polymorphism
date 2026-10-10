# 🔷 Sistem Hierarki Bentuk Geometri 

Repositori ini berisi implementasi program berbasis *Command Line Interface* (CLI) menggunakan Java untuk mendemonstrasikan konsep dasar Pemrograman Berorientasi Objek (PBO). Program ini memodelkan hierarki bentuk geometri sederhana untuk menghitung luas dan volume.

**Identitas :**
* **Nama:** Alya Zulfadila
* **NIM:** F1D02510102

---

## 📝 Deskripsi Program dan Struktur Kelas

Program ini terdiri dari satu kelas utama (`Main`) dan empat kelas model yang saling terhubung dalam sebuah hierarki:
1. **`Bentuk` (Superclass):** Kelas dasar yang mendefinisikan properti umum yaitu `warna`.
2. **`BujurSangkar` (Subclass dari Bentuk):** Merepresentasikan bangun datar 2D dengan properti `sisi` dan fungsi perhitungan luas.
3. **`Lingkaran` (Subclass dari Bentuk):** Merepresentasikan bangun datar 2D dengan properti `radius` dan fungsi perhitungan luas menggunakan konstanta `PHI`.
4. **`Silinder` (Subclass dari Lingkaran):** Merepresentasikan bangun ruang 3D yang mewarisi sifat lingkaran, ditambah properti `tinggi` dan fungsi perhitungan volume.

---

## 💡 Analisis Penerapan Konsep OOP

### 1. Encapsulation (Enkapsulasi)
Enkapsulasi digunakan untuk melindungi data dari modifikasi eksternal yang tidak sah.
* **Penerapan:** Seluruh atribut pada kelas model dideklarasikan dengan *access modifier* `private` (contoh: `private String warna;` pada `Bentuk`, `private double sisi;` pada `BujurSangkar`). 
* **Alasan:** Agar atribut tersebut tidak bisa diakses atau diubah secara langsung dari kelas `Main`. Akses ke data tersebut dikontrol ketat melalui metode publik *getter* (contoh: `getWarna()`) dan *setter* (contoh: `setWarna()`).

### 2. Inheritance (Pewarisan)
Pewarisan memungkinkan suatu kelas menurunkan sifat dan perilakunya ke kelas lain, menciptakan hierarki yang logis dan menghindari duplikasi kode.
* **Penerapan:** 
  * `BujurSangkar` dan `Lingkaran` mewarisi atribut dari kelas `Bentuk` menggunakan *keyword* `extends`. Keduanya otomatis memiliki properti `warna` tanpa harus mendeklarasikannya ulang.
  * Pewarisan bertingkat *(multilevel)* terjadi pada kelas `Silinder` yang meng-`extends Lingkaran`. `Silinder` secara tidak langsung mewarisi `warna` dari `Bentuk`, serta secara langsung mewarisi `radius` dan metode `hitungLuas()` dari `Lingkaran`.
* Pemanggilan konstruktor kelas induk dilakukan di dalam konstruktor kelas anak menggunakan fungsi `super(...)`.

### 3. Polymorphism (Polimorfisme)
Polimorfisme (*Dynamic Binding*) adalah kemampuan objek untuk merespons pemanggilan metode yang sama dengan perilaku yang spesifik sesuai bentuk aslinya.
* **Penerapan (Overriding):** Metode `printInfo()` yang ada di kelas induk `Bentuk` ditimpa ulang (*override*) di kelas `BujurSangkar`, `Lingkaran`, dan `Silinder` agar mencetak informasi yang lebih detail (seperti luas dan volume).
* **Penerapan di `Main.java`:** Polimorfisme diimplementasikan dengan membuat tipe array referensi dari kelas induk (`Bentuk[] daftarBentuk = new Bentuk[3];`), namun diisi dengan instansiasi dari kelas-kelas anaknya (`new BujurSangkar()`, `new Lingkaran()`, `new Silinder()`). Saat di-looping dan dipanggil metode `daftarBentuk[i].printInfo()`, Java secara dinamis mengeksekusi metode milik masing-masing objek anak yang bersesuaian, bukan metode milik kelas `Bentuk`.

---

## 🚀 Cara Instalasi dan Eksekusi

1. Pastikan Java Development Kit (JDK) sudah terinstal di komputermu.
2. Unduh atau *clone* repositori ini, pastikan semua file `.java` berada di dalam satu direktori/folder yang sama.
3. Buka *Terminal* / *Command Prompt* dan arahkan ke direktori tersebut.
4. Lakukan kompilasi program dengan perintah:
   ```bash
   javac *.java