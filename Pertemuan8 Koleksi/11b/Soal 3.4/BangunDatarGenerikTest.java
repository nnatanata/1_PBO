/*
    Nama File   : BangunDatarGenerikTest.java
    Deskripsi   : Kelas untuk menguji penggunaan BangunDatarGenerik.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 6 Mei 2025
*/
public class BangunDatarGenerikTest {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);
        PersegiPanjang pp = new PersegiPanjang(6, 4);
        Segitiga segitiga = new Segitiga(6, 4, 5, 5, 6);

        BangunDatarGenerik<Persegi> bd1 = new BangunDatarGenerik<>();
        bd1.set(persegi);
        System.out.println("Luas Persegi: " + bd1.hitungLuas());
        System.out.println("Keliling Persegi: " + bd1.hitungKeliling());

        BangunDatarGenerik<PersegiPanjang> bd2 = new BangunDatarGenerik<>();
        bd2.set(pp);
        System.out.println("Luas Persegi Panjang: " + bd2.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + bd2.hitungKeliling());

        BangunDatarGenerik<Segitiga> bd3 = new BangunDatarGenerik<>();
        bd3.set(segitiga);
        System.out.println("Luas Segitiga: " + bd3.hitungLuas());
        System.out.println("Keliling Segitiga: " + bd3.hitungKeliling());
    }
}
