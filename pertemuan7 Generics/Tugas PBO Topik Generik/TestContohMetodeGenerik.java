/*
    Nama File   : TestContohMetodeGenerik.java
    Deskripsi   : Program utama untuk menguji metode generik di kelas ContohMetodeGenerik.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 29 April 2025
*/

public class TestContohMetodeGenerik {
    public static void main(String[] args) {
        Datum<Kucing> dataKucing = new Datum<>(new Kucing("Kucing"));
        Datum<Anjing> dataAnjing = new Datum<>(new Anjing("Anjing"));
        Datum<Burung> dataBurung = new Datum<>(new Burung("Burung"));

        ContohMetodeGenerik.tampilkanAnabul(dataKucing);
        System.out.println();
        ContohMetodeGenerik.tampilkanAnabul(dataAnjing);
        System.out.println();
        ContohMetodeGenerik.tampilkanAnabul(dataBurung);
    }
}
