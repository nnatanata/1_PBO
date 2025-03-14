/*
    Nama File   : Main.java
    Deskripsi   : Program utama yang digunakan untuk membuat objek dari class DosenTetap, DosenTamu, dan Tendik
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 11 Maret 2024
*/

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap(
            "9545647548", "78647324", "Dr. Lana Del Rey S.Kom.,M.Kom.", 
            LocalDate.of(1990, 5, 5), 
            LocalDate.of(2015, 1, 1), 
            5000000.00, "Fakultas Sains dan Matematika"
        );
        
        DosenTamu dosenTamu = new DosenTamu(
            "9545647549", "73546728", "Dr. The Weekday S.Si.,M.Eng.", 
            LocalDate.of(1985, 8, 15), 
            LocalDate.of(2020, 6, 1), 
            4500000.00, "Fakultas Teknik", 
            LocalDate.of(2026, 6, 1)
        );
        
        Tendik tendik = new Tendik(
            "9545647550", "Budiono Siregar", 
            LocalDate.of(1988, 3, 25), 
            LocalDate.of(2018, 5, 1), 
            3500000.00, "Akademik"
        );
        
        System.out.println("=== Informasi Dosen Tetap ===");
        dosenTetap.printInfo();
        
        System.out.println("\n=== Informasi Dosen Tamu ===");
        dosenTamu.printInfo();
        
        System.out.println("\n=== Informasi Tenaga Kependidikan ===");
        tendik.printInfo();
    }
}