package perbankan;

public class PengambilanUang extends Tabungan {
    private int proteksi;

    public PengambilanUang(int saldo, int tingkatBunga, int proteksi) {
        super(saldo, tingkatBunga);
        this.proteksi = proteksi;
    }

    public boolean ambilUang(int jumlah) {
        if (jumlah <= saldo && jumlah <= saldo - proteksi) {
            saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }
}
