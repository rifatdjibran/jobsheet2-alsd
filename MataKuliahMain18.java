public class MataKuliahMain18 {
    public static void main(String[] args) {
        
        
        MataKuliah18 mk1 = new MataKuliah18();
        mk1.kodeMK = "123";
        mk1.nama = "Pemrograman Dasar";
        mk1.sks = 3;
        mk1.jumlahJam = 10;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(5);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        
        MataKuliah18 mk2 = new MataKuliah18("234", "Struktur Data", 4, 12);
        mk2.tampilInformasi();
        mk2.tambahJam(3);
        mk2.kurangiJam(5);
        mk2.tampilInformasi();

        
        MataKuliah18 mk3 = new MataKuliah18("456", "Basis Data", 2, 8);
        mk3.tampilInformasi();
        mk3.tambahJam(2);
        mk3.kurangiJam(4);
        mk3.tampilInformasi();
    }
}
