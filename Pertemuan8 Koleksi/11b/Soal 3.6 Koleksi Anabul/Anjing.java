/*
    Nama File   : Anjing.java
    Deskripsi   : Kelas turunan dari Anabul yang merepresentasikan Anjing. 
                  Anjing bergerak dengan melata dan bersuara guk-guk.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 22 April 2025
*/

public class Anjing extends Anabul {
    public Anjing() {
        super();
    }

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " bergerak dengan: Melata ");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi: Guk-guk");
    }
}
