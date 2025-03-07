/* Nama File    : Asersi2.java
    Deskripsi   : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 4 Maret 2024 */

// class Lingkaran
class Lingkaran{
        private double jariJari;
        public Lingkaran(double jariJari){
            this.jariJari = jariJari;
        }
        public double hitungKeliling(){
            double keliling = 2*Math.PI*jariJari;
            return keliling;
        }
    }
// class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "
                +kelilingLingkaran);
        
    }
}

/* Secara konsep, ada yang kurang tepat pada program Asersi2 di atas. 

Jika program dijalankan tanpa opsi -ea (enable assertions), 
maka pernyataan assert(jariJari > 0): "jari jari tidak boleh nol!" akan diabaikan, 
sehingga objek Lingkaran tetap dapat dibuat dengan nilai jari-jari nol, yang secara matematis tidak valid. 
Selain itu, asersi diletakkan setelah variabel jariJari ditetapkan ke nol, 
sehingga pengecekan ini tidak efektif karena nilai tersebut sudah pasti salah sejak awal.*/