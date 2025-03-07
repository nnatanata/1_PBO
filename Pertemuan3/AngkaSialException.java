/* Nama File    : AngkaSialException.java
    Deskripsi   : Eksepsi buatan sendiri, menolak masukan angka 13!
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 4 Maret 2024 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
