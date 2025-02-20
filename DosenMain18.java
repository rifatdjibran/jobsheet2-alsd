public class DosenMain18 {
    public static void main(String[] args) {
        Dosen18 dosen1 = new Dosen18();
        dosen1.idDosen = "01";
        dosen1.nama = "Dosen 1";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Pemrograman";

        dosen1.tampilkanInformasi();
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Struktur Data");
        dosen1.tampilkanInformasi();

        Dosen18 dosen2 = new Dosen18("02", "Dosen 2", true, 2015, "Pemrograman");
        dosen2.ubahKeahlian("Algoritma");
        dosen2.tampilkanInformasi();

        Dosen18 dosen3 = new Dosen18("03", "Dosen 3", false, 2018, "Basis Data");
        dosen3.tampilkanInformasi();
    }
}
