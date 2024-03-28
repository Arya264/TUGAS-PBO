package pertemuan2.modul4.user;
public class Utama {
    public static void main(String[] args){
        Orang orang = new Orang();
        orang.nama = "Muh.Yusran";
        System.out.println("Stb : "+orang.nama);
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2= new Mahasiswa("13020220078 ","Yusran");
        Orang.info();
        Mahasiswa.info();
    }
}

