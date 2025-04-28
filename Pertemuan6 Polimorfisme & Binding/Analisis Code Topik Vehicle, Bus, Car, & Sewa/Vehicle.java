/*
    Nama File   : Vehicle.java
    Deskripsi   : Kelas dasar untuk kendaraan yang memiliki metode menghitung harga sewa.
    Pembuat     : Code dari modul
    Tanggal     : 22 April 2025
*/

public class Vehicle {
    void calRent(int distance, float price) {
        float fare = distance * price;
        System.out.println("vehicle price = " + fare);
    }
}