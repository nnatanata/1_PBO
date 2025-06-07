/*
    Nama File   : Burung.java
    Deskripsi   : Kelas turunan dari Anabul yang merepresentasikan Burung.
                  Burung bergerak dengan terbang dan bersuara cuit.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 22 April 2025
*/

public class Burung extends Anabul {
    public Burung() {
        super();
    }

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " bergerak dengan: Terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi: Cuit");
    }
}
