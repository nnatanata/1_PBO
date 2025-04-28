/*
    Nama File   : Main.java
    Deskripsi   : Kelas utama untuk menjalankan program dan mengetes konsep polimorfisme antara Person dan Student.
    Pembuat     : Code dari modul
    Tanggal     : 22 April 2025
*/

public class Main {
    public static void main(String[] args) {
        Person p;
        p = new Student("Sally");
        p.status(1);
    }
}

/*
SOAL DARI MODUL
1. Output yang didapat adalah?
Jawab:
Now online: Sally

2. Diskusikan bagaimana hasil tersebut didapatkan (hint: apakah “this” pada kelas person dalam
method status dieksekusi ketika compile time atau runtime)
Jawab:
Person p; => mendeklarasikan variabel p bertipe Person.
p = new Student("Sally"); => p diisi objek Student, jadi sebenarnya objeknya adalah Student, meskipun tipe deklarasinya Person (dynamic binding).
p.status(1); => memanggil method status yang didefinisikan di Person.
Dalam method status(int hr) di Person:
Method status memanggil this.isAsleep(hr).
Karena this menunjuk ke objek Student saat runtime, maka yang dipanggil adalah method isAsleep(int hr) milik Student (override).
Evaluasi isAsleep(1) pada Student:
return 2 < hr && 8 > hr;
Jika hr = 1, maka 2 < 1 adalah false, sehingga seluruh ekspresi menjadi false.
Artinya tidak tidur (not asleep).
Karena hasil isAsleep(1) adalah false, maka status akan mengeksekusi:
System.out.println("Now online: " + this);
dan this akan mencetak nama dari objek (toString() mengembalikan name yaitu "Sally").

Kesimpulannya, this pada Person saat memanggil status() merujuk ke objek yang sesungguhnya (Student) saat runtime.
Karena Student mengoverride isAsleep(), maka isAsleep milik Student yang dipanggil, bukan Person.
Jadi, polimorfisme terjadi pada runtime, bukan compile time.
*/

