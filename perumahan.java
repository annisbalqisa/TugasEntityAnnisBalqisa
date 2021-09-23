class perumahann {
    int Id_rumah, nomor_rumah;
    String nama_perumahan, harga, tipe_rumah, alamat_rumah, nama_blok, nama_pemilik, nomor_telepon_pemilik, jenis_pembayaran;

    public perumahann(int Id_rumah, String nama_perumahan, String harga, String tipe_rumah, String alamat_rumah, String nama_blok, int nomor_rumah, String nama_pemilik, String nomor_telepon_pemilik, String jenis_pembayaran){
        this.Id_rumah = Id_rumah;
        this.nama_perumahan = nama_perumahan;
        this.harga = harga;
        this.tipe_rumah = tipe_rumah;
        this.alamat_rumah = alamat_rumah;
        this.nama_blok = nama_blok;
        this.nomor_rumah = nomor_rumah;
        this.nama_pemilik = nama_pemilik;
        this.nomor_telepon_pemilik = nomor_telepon_pemilik;
        this.jenis_pembayaran = jenis_pembayaran;
    }
    int getIdRumah(){
        return Id_rumah;
    }
    String getNamaPerumahan(){
        return "Nama Perumahan : " +nama_perumahan;
    }
    String setHarga(){
        return "Harga : " +harga;
    }
    String getTipeRumah(){
        return "Tipe Rumah : " +tipe_rumah;
    }
    String getAlamatRumah(){
        return "Alamat Rumah : " +alamat_rumah;
    }
    String getNamaBlok(){
        return "Nama Blok : " +nama_blok;
    }
    int getNomorRumah(){
        return nomor_rumah;
    }
    String setNamaPemilik(){
        return "Nama Pemilik : " +nama_pemilik;
    }
    String setNomorTelpPemilik(){
        return "Nomor Telepon Pemilik : " +nomor_telepon_pemilik;
    }
    String setJenisPembayaran(){
        return "Jenis Pembayaran : " +jenis_pembayaran;
    }

public class perumahan{
    public static void main(String[] args) {
        perumahann perum = new perumahann(01, "Neo City", "Rp1.000.000.000", "Cityzen", "Jalan Sooman", "C5", 12, "Annis Balqisa", "089676361971", "Tunai");
        System.out.println("ID Rumah : " +perum.getIdRumah());
        System.out.println(perum.getNamaPerumahan());
        System.out.println(perum.setHarga());
        System.out.println(perum.getTipeRumah());
        System.out.println(perum.getAlamatRumah());
        System.out.println(perum.getNamaBlok());
        System.out.println("Nomor Rumah : " +perum.getNomorRumah());
        System.out.println(perum.setNamaPemilik());
        System.out.println(perum.setNomorTelpPemilik());
        System.out.println(perum.setJenisPembayaran());
    }
}
}
