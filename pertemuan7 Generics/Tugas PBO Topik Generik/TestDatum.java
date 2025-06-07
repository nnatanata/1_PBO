/*
    Nama File   : TestDatum.java
    Deskripsi   : Program utama untuk menguji kelas generik Datum.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 29 April 2025
*/

public class TestDatum {
    public static void main(String[] args) {
        Datum<Anabul> dataKucing = new Datum<>(new Kucing("Kucing"));
        Datum<Anabul> dataAnjing = new Datum<>(new Anjing("Anjing"));
        Datum<Anabul> dataBurung = new Datum<>(new Burung("Burung"));

        dataKucing.getIsi().tampilData();
        System.out.println();
        dataAnjing.getIsi().tampilData();
        System.out.println();
        dataBurung.getIsi().tampilData();
    }
}
