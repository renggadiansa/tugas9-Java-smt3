package perbankan;

public class PenyimpananUang extends Tabungan {
   protected int saldo;
   private double tingkatBunga;

   public PenyimpananUang(int saldo, double tingkatBunga) {
       this.saldo = saldo;
       this.tingkatBunga = tingkatBunga;
   }

   public double cekUang() {
       return saldo + (saldo * tingkatBunga);
   }
}
