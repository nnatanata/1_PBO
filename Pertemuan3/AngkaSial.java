/* Nama File    : AngkaSial.java
    Deskripsi   : Program penggunaan exception buatan sendiri, pengenalan klausa 'throw' dan 'throws'
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 4 Maret 2024 */

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+"bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //method getMessage sdh ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka");
        }
    }
}

/*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 * 
 * Tidak, baris 12 yaitu `System.out.println(angka+"bukan angka sial");' tidak akan dieksekusi jika terjadi eksepsi. 
 * Karena ketika method cobaAngka(int angka) dipanggil, program akan mengecek apakah 
 * nilai angka sama dengan 13. Jika iya, maka eksepsi AngkaSialException akan 
 * dilempar menggunakan `throw new AngkaSialException();` yang langsung 
 * menghentikan eksekusi method sebelum mencapai baris 12. 
 * Ketika `as.cobaAngka(13);` dipanggil, program langsung beralih ke blok `catch`
 * sehingga baris 12 tidak dieksekusi. Selain itu, pemanggilan `as.cobaAngka(12);` 
 * tidak akan terjadi karena eksepsi sudah dialihkan ke blok `catch`.
 * Dalam kasus angka `13`, eksekusi akan langsung terhenti sebelum mencapainya.
*/

/*Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 
 * 
 * Iya, baris 21 yaitu '}catch(AngkaSialException ase){' dieksekusi.
 * Hal itu karena ketika method cobaAngka(int angka) dipanggil dalam main(), program akan 
 * mengevaluasi apakah angka == 13. Jika iya, maka program akan melempar 
 * eksepsi AngkaSialException. Saat eksepsi dilempar, eksekusi normal program terhenti,
 * dan program langsung mencari blok catch yang sesuai. 
 * Dalam kasus ini, catch(AngkaSialException ase) cocok dengan eksepsi yang dilempar, 
 * sehingga baris 21 akan dieksekusi.
 */
