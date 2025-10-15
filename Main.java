import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Gudang gudang = new Gudang();

        // Input beberapa barang di awal
        gudang.tambahBarang(new BarangGudang("B001", "Kabel Listrik", 50));
        gudang.tambahBarang(new BarangGudang("B002", "Lampu LED", 100));
        gudang.tambahBarang(new BarangGudang("B003", "Stop Kontak", 75));

        int pilihan;

        do {
            System.out.println("\n=== SISTEM INVENTORI GUDANG ===");
            System.out.println("1. Tambah Stok Barang");
            System.out.println("2. Kurangi Stok Barang");
            System.out.println("3. Tampilkan Laporan Barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    String kodeTambah = input.nextLine();
                    BarangGudang barangTambah = gudang.cariBarang(kodeTambah);
                    if (barangTambah != null) {
                        System.out.print("Masukkan jumlah stok yang akan ditambah: ");
                        int tambah = input.nextInt();
                        barangTambah.tambahStok(tambah);
                    } else {
                        System.out.println("Barang dengan kode tersebut tidak ditemukan!");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan kode barang: ");
                    String kodeKurang = input.nextLine();
                    BarangGudang barangKurang = gudang.cariBarang(kodeKurang);
                    if (barangKurang != null) {
                        System.out.print("Masukkan jumlah stok yang akan dikurangi: ");
                        int kurang = input.nextInt();
                        barangKurang.kurangiStok(kurang);
                    } else {
                        System.out.println("Barang dengan kode tersebut tidak ditemukan!");
                    }
                    break;

                case 3:
                    gudang.tampilkanSemuaBarang();
                    break;

                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);

        input.close();
    }
}

