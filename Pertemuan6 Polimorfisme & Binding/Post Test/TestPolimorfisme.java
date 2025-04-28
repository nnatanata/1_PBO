/*
    Nama File   : TestPolimorfisme.java
    Deskripsi   : Kelas utama untuk mengetes konsep polimorfisme pada Pegawai.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 22 April 2025
*/

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");
        
        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);
        
        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

/* 
PERTANYAAN DARI MODUL
1. Jelaskan manfaat polimorfisme pada kasus ini
Jawab:
Polimorfisme mempermudah dalam mengelola banyak jenis objek (Pegawai, Manajer, dan Programmer) dengan cara yang sama.
Pada kasus ini, walaupun Manajer dan Programmer punya cara tampil data yang berbeda, namun dapat memperlakukan 
semua objek itu sebagai Pegawai. Jadi, di dalam ArrayList<Pegawai>, bisa memasukkan Manajer dan Programmer tanpa masalah.
Lalu, saat kita pakai emp.tampilData();, dapat memanggil tampilData() yang sesuai:
Kalau emp itu Manajer maka manggil tampilData() milik Manajer.
Kalau emp itu Programmer maka manggil tampilData() milik Programmer.

2. Apabila pada main program perlu menambahkan pegawai4 dan pegawai5! Apa
permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?
Jawab:
Jika tanpa polimorfisme maka harus bedakan satu per satu tipe pegawai.
Misalnya, jika akan ditambahkan pegawai4 dan pegawai5 maka harus cek:
Apakah merupakan Programmer, Manajer, atau Pegawai.
Permasalahannya:
Kode akan panjang karena harus pakai if-else untuk mengecek tipe objeknya satu-satu,
Dapat terjadi kesalahan jika salah memanggil method atau salah mengelola tipe objek.
Tanpa polimorfisme, program menjadi lebih rumit, susah dikembangkan, dan ada kemungkinan
error saat menambah pegawai baru.
 */