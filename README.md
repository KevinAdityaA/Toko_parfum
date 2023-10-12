# Toko_parfum
Tugas Posttest PBO

# TokoParfum

## TokoParfum Program README

### Deskripsi
Program TokoParfum adalah aplikasi sederhana untuk mengelola daftar parfum di sebuah toko parfum. Program ini memungkinkan pengguna untuk menambahkan, mengedit, dan menghapus parfum dari daftar toko, serta melihat daftar parfum yang tersedia. Program ini dibuat dalam bahasa pemrograman Java.

### Fitur
1. "Tambah Parfum": Pengguna dapat menambahkan parfum baru ke dalam daftar toko dengan menentukan nama dan harga parfum.
2. "Edit Parfum": Pengguna dapat mengedit parfum yang sudah ada dalam daftar toko dengan memilih nomor parfum yang akan diedit. Pengguna dapat mengubah nama dan harga parfum.
3. "Hapus Parfum": Pengguna dapat menghapus parfum dari daftar toko dengan memilih nomor parfum yang akan dihapus.
4. "Lihat Daftar Parfum": Pengguna dapat melihat daftar semua parfum yang tersedia di toko.
5. "Keluar": Pengguna dapat keluar dari program.

### Struktur Kode
- "TokoParfum.java": Kelas utama yang berisi metode "main" untuk menjalankan program. Ini adalah kelas yang digunakan untuk berinteraksi dengan pengguna dan mengelola operasi parfum.
- "Parfum.java": Kelas yang merepresentasikan parfum. Ini memiliki atribut nama dan harga, serta konstruktor dan metode akses untuk atribut tersebut.
- "JenisParfum.java": Kelas yang merepresentasikan toko parfum. Ini memiliki atribut nama toko dan daftar parfum yang disimpan dalam "ArrayList". Kelas ini juga memiliki metode untuk menambah, mengedit, menghapus, melihat daftar parfum, dan mendapatkan jumlah parfum dalam daftar.

### Access Modifiers
- Dalam kode tersebut, terdapat penggunaan access modifiers seperti "public", "private", dan "final" untuk mengatur tingkat akses ke kelas dan atribut.
- Kelas "Parfum" dan "JenisParfum" menggunakan "public" untuk memungkinkan akses dari luar kelas.
- Atribut "nama" dan "harga" dalam kelas "Parfum" menggunakan "private" untuk menjaga enkapsulasi, yang mengharuskan akses melalui metode get.
- Atribut "JenisParfum" dalam kelas "JenisParfum" menggunakan "final" untuk mencegah perubahan nilai setelah inisialisasi. Ini digunakan untuk mengidentifikasi nama toko yang tetap selama siklus program.

### Best Practices
- Program ini mengikuti beberapa best practices dalam pengembangan perangkat lunak, seperti enkapsulasi (menggunakan "private" untuk atribut dan metode akses), penggunaan metode akses ("getNama", "getHarga"), dan pemisahan tanggung jawab antara kelas ("Parfum" dan "JenisParfum") untuk menjaga kode yang bersih dan mudah dimengerti.

### Collection
- Program ini menggunakan "ArrayList" dari pustaka Java Collections Framework untuk menyimpan dan mengelola daftar parfum. "ArrayList" digunakan dalam kelas "JenisParfum" untuk menyimpan semua parfum yang tersedia di toko. Hal ini memungkinkan penambahan, pengeditan, dan penghapusan parfum dengan mudah.

  

