/*
    Nama File   : BangunDatar.java
    Deskripsi   : Abstract class sebagai superclass Persegi dan Lingkaran
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 18 Maret 2024
*/

public abstract class BangunDatar {
    /***********ATRIBUT***************/
    private String warna;
    private String border;

    /***********METHOD***************/
    //Konstruktor
    public BangunDatar(String warna, String border) {
        this.warna = warna;
        this.border = border;
    }

    //Getter dan Setter
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    //Abstract Method
    public abstract double getLuas();
    public abstract double getKeliling();

    //Method untuk membandingkan luas dan keliling
    public boolean isEqualLuas(BangunDatar x) {
        return this.getLuas() == x.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar x) {
        return this.getKeliling() == x.getKeliling();
    }

    //Method untuk mencetak informasi
    public void printInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}

// === JAWABAN PERTANYAAN DI MODUL ===
/*Apakah method yang dibuat pada langkah nomor 4 dapat digunakan untuk membandingkan objek 
bangun datar yang berbeda?

Ya, method yang dibuat dapat digunakan untuk membandingkan objek bangun datar yang berbeda 
asalkan mereka memiliki metode perhitungan luas dan keliling yang sama dalam hierarki inheritance.

Dalam kasus ini, jika kita memiliki method seperti:
public boolean isEqualLuas(BangunDatar bd) {
    return this.hitungLuas() == bd.hitungLuas();
}

isEqualLuas() dapat digunakan untuk membandingkan luas antara objek persegi dan lingkaran karena 
keduanya mewarisi class BangunDatar dan memiliki implementasi hitungLuas(). */

/* Jika BangunDatar tidak dijadikan sebagai abstract class, dapatkah Anda membuat method isEqualLuas() dan 
isEqualKeliling pada class BangunDatar? Mengapa?

Ya, secara teknis bisa, tetapi kurang tepat secara desain.
Jika BangunDatar adalah class biasa (non-abstract), kita tetap bisa menambahkan method seperti ini:

public boolean isEqualLuas(BangunDatar bd) {
    return this.hitungLuas() == bd.hitungLuas();
}

public boolean isEqualKeliling(BangunDatar bd) {
    return this.hitungKeliling() == bd.hitungKeliling();
}

Namun, ada masalah utama:
Class BangunDatar akan harus memiliki implementasi untuk hitungLuas() dan hitungKeliling(),
tetapi secara konsep, BangunDatar sendiri tidak memiliki bentuk konkret untuk bisa dihitung
luas atau kelilingnya secara langsung. Solusi yang lebih baik adalah menjadikan BangunDatar 
sebagai abstract class, sehingga method hitungLuas() dan hitungKeliling() harus diimplementasikan
oleh subclass seperti Persegi dan Lingkaran.
*/

/* Apakah kelebihan saat class BangunDatar dijadikan sebagai abstract class daripada non-abstract class?
Menggunakan abstract class untuk BangunDatar memiliki beberapa keunggulan:
Memastikan bahwa subclass harus mengimplementasikan method spesifik,
Menghindari instansiasi langsung dari class yang tidak seharusnya dibuat objeknya,
Memudahkan perluasan (Extensibility) dalam desain program
*/