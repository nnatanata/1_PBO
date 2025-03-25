/*
    Nama File   : Main.java
    Deskripsi   : Class utama untuk menjalankan program.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 11 Maret 2024
*/

public class Main {
    public static void main(String[] args) {
        Fakultas FSM = new Fakultas("Sains dan Matematika", 5000000, 7000000);
        Fakultas FEB = new Fakultas("Ekonomi dan Bisnis", 4000000, 6000000);

        FSM.printInfo();
        System.out.println();
        FEB.printInfo();
        System.out.println();

        Mahasiswa mhs1 = new Mahasiswa("Budiono Siregar", "kapallawd@gmail.com", "2406012313099", 3, FSM);
        Mahasiswa mhs2 = new Mahasiswa("Denis", "Denis@gmail.com", "21098746532099", 6, FEB);

        mhs1.printInfo();
        System.out.println();
        mhs2.printInfo();
        System.out.println();

        Dosen dosen1 = new Dosen("Dr. Eka", "eko@univ.ac.id", "A001", 10, FSM);
        Dosen dosen2 = new Dosen("Prof. Dani", "Dani@univ.ac.id", "B001", 5, FEB);

        dosen1.printInfo();
        System.out.println();
        dosen2.printInfo();
        System.out.println();

        Tendik tendik1 = new Tendik("Pak Bowo", "bowo@univ.ac.id", "T001", 15);
        Tendik tendik2 = new Tendik("Bu Sri", "sri@univ.ac.id", "T002", 8);

        tendik1.printInfo();
        System.out.println();
        tendik2.printInfo();

        System.out.println("\n=== Jumlah Instance ===");
        System.out.println("Mahasiswa: " + Mahasiswa.count);
        System.out.println("Dosen    : " + Dosen.count);
        System.out.println("Tendik   : " + Tendik.count);
    }
}
