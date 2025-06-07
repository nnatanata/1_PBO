/*
    Nama File   : TestSenjata.java
    Deskripsi   : Kelas untuk menguji implementasi Senjata dan KontrolSenjata dengan beberapa skenario menembak dan mengisi peluru.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 29 April 2025
*/

public class TestSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");

        KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
        KontrolSenjata kontrolM16 = new KontrolSenjata(m16);

        kontrolAK47.menembak(2);         // gagal karena peluru habis
        kontrolAK47.isiPeluru(3);        // isi 3 peluru
        kontrolAK47.menembak(5);         // menembak 5 kali, sisa 0

        System.out.println("================================");

        kontrolM16.menembak(1);          // gagal
        kontrolM16.isiPeluru(5);         // isi 5 peluru
        kontrolM16.menembak(2);          // tembak 2 kali, sisa 3
    }
}
