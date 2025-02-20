class MataKuliah18 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi() { 
        System.out.println("\nKode Mata Kuliah   : " + kodeMK);
        System.out.println("Nama Mata Kuliah   : " + nama);
        System.out.println("SKS                : " + sks);
        System.out.println("Jumlah Jam         : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks); 
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam bertambah menjadi: " + jumlahJam); 
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jam berhasil dikurangi. Jumlah jam sekarang: " + jumlahJam); 
        } else {
            System.out.println("Jumlah jam tidak cukup untuk dikurangi.");
        }
    }

    
    public MataKuliah18() {}

    
    public MataKuliah18(String kode, String nm, int sks, int jam) {
        kodeMK = kode;
        nama = nm;
        this.sks = sks;
        jumlahJam = jam;
    }
}
