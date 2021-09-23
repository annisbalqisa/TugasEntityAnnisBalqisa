class pendudukk {
    int Id_penduduk, usia;
    String nama_pemilik_rumah, jenis_kelamin, nomor_telepon, status, nomor_npwp, alamat_rumah;

    public pendudukk(int Id_penduduk, String nama_pemilik_rumah, String jenis_kelamin, String nomor_telepon, String status, int usia, String nomor_npwp, String alamat_rumah){
        this.Id_penduduk = Id_penduduk;
        this.nama_pemilik_rumah = nama_pemilik_rumah;
        this.jenis_kelamin = jenis_kelamin;
        this.nomor_telepon = nomor_telepon;
        this.status = status;
        this.usia = usia;
        this.nomor_npwp = nomor_npwp;
        this.alamat_rumah = alamat_rumah;
    }
    int getIdPenduduk(){
        return Id_penduduk;
    }
    String getNamaPemilik(){
        return "Nama Pemilik Rumah : " +nama_pemilik_rumah;
    }
    String getJenisKelamin(){
        return "Jenis Kelamin : " +jenis_kelamin;
    }
    String setTelepon(){
        return "Nomor Telepon : " +nomor_telepon;
    }
    String setStatus(){
        return "Status : " +status;
    }
    int setUsia(){
        return usia;
    }
    String getNoNPWP(){
        return "Nomor NPWP : " +nomor_npwp;
    }
    String getAlamat(){
        return "Alamat Rumah : " +alamat_rumah;
    }

public class penduduk{
    public static void main(String[] args) {
        pendudukk warga = new pendudukk(01, "Annis Balqisa", "Perempuan", "089676361971", "Belum Menikah", 25, "092532993408000", "Jalan Kaliurang no. 2");
        System.out.println("ID Penduduk : " +warga.getIdPenduduk());
        System.out.println(warga.getNamaPemilik());
        System.out.println(warga.getJenisKelamin());
        System.out.println(warga.setTelepon());
        System.out.println("Usia : " +warga.setUsia());
        System.out.println(warga.getNoNPWP());
        System.out.println(warga.getAlamat());
    }
}
}
