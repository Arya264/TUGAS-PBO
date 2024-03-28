package pertemuan2.modul4.user;
public class Mahasiswa extends Orang{
    private String stb;   
    public Mahasiswa(){
        super();
        this.stb="13020220078";
    }
    public Mahasiswa(String stb, String nama){
        super(nama);
        this.stb = stb;
    }
    public String getStb(){
        return stb;
    }
    public void setStb(String stb){
        this.stb =stb;
    }    
    public static void info(){
        System.out.println("Class Mahasiswa");       
    }  
}

