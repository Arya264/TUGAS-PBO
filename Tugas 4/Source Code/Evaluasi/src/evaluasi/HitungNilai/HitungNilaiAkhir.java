package evaluasi.HitungNilai;

public class HitungNilaiAkhir {
    public static double nilaiTugas(int tugas1, int tugas2){
        return (tugas1+tugas2)/2.0;
    }
    public static double nilaiAkhir(double tugas, int mid,int uas){
        return (tugas*0.4)+(mid*0.3)+(uas*0.3);
    }
}
