/*
    Nama File   : BangunDatarGenericTest.java
    Deskripsi   : Program utama untuk menguji kelas generic BangunDatarGeneric
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 7 Juni 2025
*/

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran: " + bdg.hitungKeliling());
        System.out.println("tipe generic: " + bdg.get().getClass().getName());
    }
}

/* 
Pertanyaan:
Cobalah pada saat praktikum : Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti 
dengan karakter yang lain seperti, T1,T2,T1234. Simpulkan apa yang anda lakukan ! 

Jawaban/Kesimpulan:

Huruf T pada generic hanyalah konvensi (tradisi pemrograman) untuk menyatakan "Type". 
Kita bisa menggantinya dengan nama lain seperti T1, T1234, dan lainnya, 
selama kita konsisten dalam penggunaannya di seluruh kelas tersebut. 
Tidak memengaruhi fungsionalitas, hanya gaya penulisan.

*/ 