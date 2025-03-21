/*
    Nama File   : IResize.java
    Deskripsi   : Interface yang menunjukkan bahwa sebuah objek dapat di-resize
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 18 Maret 2024
*/

public interface IResize {
    //Menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    //Mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    //Menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}
