
    import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class BarangGudang
 public class BarangGudang {
    private String kodeBarang;
    private String namaBarang;
    private int stok;

    public BarangGudang(String kodeBarang, String namaBarang, int stok) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    public void tambahStok(int jumlah) {
        stok += jumlah;
        System.out.println("Stok " + namaBarang + " berhasil ditambah sebanyak " + jumlah);
    }

    public void kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
            System.out.println("Stok " + namaBarang + " berhasil dikurangi sebanyak " + jumlah);
        } else {
            System.out.println("Stok tidak mencukupi untuk dikurangi!");
        }
    }

    public void getInfo() {
        System.out.println("Kode: " + kodeBarang + ", Nama: " + namaBarang + ", Stok: " + stok);
    }

    public String getKodeBarang() {
        return kodeBarang;
    }
}

