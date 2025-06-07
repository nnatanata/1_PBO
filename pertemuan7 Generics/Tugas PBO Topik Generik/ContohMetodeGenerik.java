/*
    Nama File   : ContohMetodeGenerik.java
    Deskripsi   : Kelas dengan metode generik untuk menangani objek Datum<T>.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 29 April 2025
*/

public class ContohMetodeGenerik {
    // Metode generik untuk menampilkan isi Datum<T>
    public static <T extends Anabul> void tampilkanAnabul(Datum<T> data) {
        data.getIsi().tampilData();
    }
}
