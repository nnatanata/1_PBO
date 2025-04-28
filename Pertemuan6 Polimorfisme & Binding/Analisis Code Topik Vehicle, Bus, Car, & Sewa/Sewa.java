/*
    Nama File   : Sewa.java
    Deskripsi   : Kelas utama untuk menjalankan program sewa kendaraan dan mengetes konsep polimorfisme.
    Pembuat     : Code dari modul
    Tanggal     : 22 April 2025
*/

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();

        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
    }
}

/*
PERTANYAAN DARI MODUL
1. Anggap jika kita mempunyai method hitungSewa(Vehicle v), 
analisalah keuntungan penggunaan teknik polimorfisme inclusion
Jawab:
Keuntungan Polimorfisme Inclusion:
- Dapat menerima semua jenis objek turunan.
  hitungSewa(Vehicle v) bisa dipakai untuk Vehicle, Car, Bus, bahkan jenis lain yang nanti dibuat, tanpa perlu diubah kodenya.
- Lebih fleksibel dan sederhana.
  Tidak perlu bikin method hitungSewaCar(Car c), hitungSewaBus(Bus b), dsb. Cukup satu method saja (hitungSewa(Vehicle v)).
- Memudahkan pengembangan.
  Jika nanti mau nambah jenis kendaraan baru (misal Motor, Truck), tidak perlu ubah method hitungSewa, karena semua tetap dianggap Vehicle.
- Saat kita memanggil v.calRent(), Java akan otomatis memilih method calRent yang sesuai dengan objek aslinya (Car, Bus, atau Vehicle).
 */
