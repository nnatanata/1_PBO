/*
    Nama File   : BangunDatarGeneric.java
    Deskripsi   : Kelas generic untuk meng-handle objek turunan dari BangunDatar
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 7 Juni 2025
*/

public class BangunDatarGeneric<T1234 extends BangunDatar> {
    private T1234 bangunDatar;

    public void set(T1234 tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T1234 get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}
