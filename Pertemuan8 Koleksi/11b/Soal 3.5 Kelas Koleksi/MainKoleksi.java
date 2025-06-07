/*
    Nama File   : MainKoleksi.java
    Deskripsi   : Kelas utama untuk menguji Koleksi dengan elemen karakter.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 6 Mei 2025
*/

public class MainKoleksi {
    public static void main(String[] args) {
        // Membuat objek Koleksi dengan tipe data Character
        Koleksi<Character> koleksiChar = new Koleksi<>();

        // Menambahkan 10 huruf pertama mulai dari 'A' ke dalam koleksi
        for (char c = 'A'; c < 'A' + 10; c++) {
            koleksiChar.add(c);
        }

        // Menampilkan seluruh isi koleksi
        System.out.println("Isi Koleksi:");
        koleksiChar.showAll();
    }
}
