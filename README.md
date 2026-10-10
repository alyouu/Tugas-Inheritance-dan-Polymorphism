# 🌻 Toko Bunga Dandelion |Informasi Katalog Bunga|

Program **Toko Bunga Dandelion** ini dibuat untuk memenuhi tugas mata kuliah Pemrograman Berorientasi Objek (PBO) dengan menerapkan tiga fitur utama OOP berdasarkan materi **Encapsulation**, **Inheritance**, dan **Polymorphism**.

## 📝 Penjelasan Konsep PBO pada Kode

### 1. Encapsulation (Enkapsulasi)
Enkapsulasi digunakan untuk membatasi hak akses terhadap atribut kelas demi menjaga keamanan data.
* **Privat (`private`):** Atribut `harga` pada kelas `Bunga` dibuat `private` sehingga tidak bisa diakses langsung dari luar kelas. Nilai harga diakses menggunakan *getter method* `getHarga()`.
* **Proteksi (`protected`):** Atribut `nama` pada kelas `Bunga` dibuat `protected` agar dapat diwariskan dan diakses langsung oleh kelas-kelas turunannya.

### 2. Inheritance (Pewarisan)
Pewarisan menggunakan kata kunci `extends` untuk mewariskan atribut dan method dari kelas induk (*superclass*) ke kelas anak (*subclass*).
* **Superclass:** `Bunga.java` memuat atribut umum (`nama`, `harga`) serta method `tampilkanInfo()`.
* **Subclass:** Kelas `Mawar`, `Anggrek`, `Melati`, dan `Tulip` meng-`extends Bunga`. Masing-masing kelas anak memanggil konstruktor induk menggunakan kata kunci `super(nama, harga)` dan menambahkan atribut spesifiknya masing-masing (seperti `warna`, `asal`, `aroma`, atau `musim`).

### 3. Polymorphism (Polimorfisme)
Polimorfisme memungkinkan objek dari kelas turunan merespons pemanggilan method yang sama dengan perilaku spesifiknya masing-masing.
* **Implementasi:** Pada kelas induk `Bunga`, terdapat method `tampilkanInfo()`. Method ini didefinisikan ulang pada masing-masing kelas anak (`Mawar`, `Anggrek`, `Melati`, `Tulip`).
* **Penggunaan:** Pada kelas `Main`, variabel bertipe kelas induk `Bunga` dapat menampung instansi dari objek anak (`Bunga mawar = new Mawar(...)`). Saat `mawar.tampilkanInfo()` dipanggil, program akan mengeksekusi method sesuai bentuk objek anak yang dibuat.

## 🚀 Cara Menjalankan Program
1. Compile seluruh file Java dalam folder dengan perintah:
   ```bash
   javac *.java
