package pertemuan2.modul4.user;
public class Orang {
    public String nama;   
    public Orang() {this.nama="Aminah";}
    public Orang(String nama){
        this.nama = nama;    
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public static void info(){
        System.out.println("Class Orang");
    }
}
