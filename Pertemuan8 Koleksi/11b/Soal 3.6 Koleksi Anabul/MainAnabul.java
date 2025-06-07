/*
    Nama File   : MainAnabul.java
    Deskripsi   : Kelas utama untuk menguji KoleksiAnabul.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 6 Mei 2025
*/

public class MainAnabul {
    public static void main(String[] args) {
        KoleksiAnabul koleksi = new KoleksiAnabul();

        koleksi.add(new Kucing("Mimi"));
        koleksi.add(new Anjing("Doggo"));
        koleksi.add(new Burung("Tweety"));
        koleksi.add(new Kucing("Oyen"));
        koleksi.add(new Anjing("Bulldog"));
        koleksi.add(new Burung("Kenari"));
        koleksi.add(new Kucing("Meow"));
        koleksi.add(new Burung("Beo"));
        koleksi.add(new Anjing("Pug"));
        koleksi.add(new Kucing("Luna"));

        koleksi.showAll();
    }
}
