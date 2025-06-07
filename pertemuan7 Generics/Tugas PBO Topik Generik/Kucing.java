/*
    Nama File   : Kucing.java
    Deskripsi   : Kelas turunan dari Anabul yang merepresentasikan Kucing. 
                  Kucing bergerak dengan melata dan bersuara meong.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 22 April 2025
*/

public class Kucing extends Anabul {
    public Kucing() {
        super();
    }

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " bergerak dengan: Melata ");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi: Meong");
    }
}
