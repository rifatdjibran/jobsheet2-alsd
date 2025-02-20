class Dosen18 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi() {
        System.out.println();
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama Dosen      : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Dosen Aktif Mengajar" : "Dosen Tidak Aktif Mengajar"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        if (statusAktif) {
            System.out.println("Masa kerja dosen: " + hitungMasaKerja(2021) + " tahun.");
        }
    }

    void setStatusAktif(boolean statusBaru) {
        statusAktif = statusBaru;
    }

    int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - tahunBergabung;
    }

    void ubahKeahlian(String keahlianBaru) {
        bidangKeahlian = keahlianBaru;
    }

    public Dosen18() {
    }

    public Dosen18(String id, String nm, boolean status, int tahun, String keahlian) {
        idDosen = id;
        nama = nm;
        statusAktif = status;
        tahunBergabung = tahun;
        bidangKeahlian = keahlian;
    }
}
