import java.util.ArrayList;
import java.util.List;

public class Gudang {
    private List<BarangGudang> daftarBarang = new ArrayList<>();
    
    public void tambahBarang(BarangGudang b) {
        daftarBarang.add(b);
        System.out.println("Barang " + b.getKodeBarang() + " berhasil ditambahkan ke gudang.");
    }

    public BarangGudang cariBarang(String kode) {
        for (BarangGudang b : daftarBarang) {
            if (b.getKodeBarang().equalsIgnoreCase(kode)) {
                return b;
            }
        }
        return null;
    }

    public void tampilkanSemuaBarang() {
        System.out.println("\n===== DAFTAR BARANG DI GUDANG =====");
        for (BarangGudang b : daftarBarang) {
            b.getInfo();

             }
        }
        
}
