package evaluasi;
import java.io.BufferedReader;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.InputStreamReader;


import evaluasi.HitungNilai.HitungNilaiAkhir;
import evaluasi.Mahasiswa.Identitas;
import evaluasi.Mahasiswa.Nilai;
import java.io.IOException;

public class Utama {
    public static void main(String[] args) throws IOException{
        BufferedReader masukan = new BufferedReader(new InputStreamReader(System.in));
        Identitas identitas = new Identitas();
        HitungNilaiAkhir hitungnilai = new HitungNilaiAkhir();
        Nilai nilai = new Nilai();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        identitas.setNama(input.nextLine());
        System.out.print("Masukkan Stsmbuk : ");
        identitas.setStambuk(input.nextLine());
        
        System.out.print("Masukkan Nilai Tugas 1 : ");
        nilai.setTugas1(Integer.parseInt(masukan.readLine()));
        System.out.print("Masukkan Nilai Tugas 2 : ");
        nilai.setTugas2(Integer.parseInt(masukan.readLine()));

       System.out.print("Masukkan Nilai Mid : ");
       nilai.setMid(Integer.parseInt(masukan.readLine()));
       System.out.print("Masukkan Nilai Uas : ");
       nilai.setUas(Integer.parseInt(masukan.readLine()));
       
       double tugas = hitungnilai.nilaiTugas(nilai.getTugas1(), nilai.getTugas2());
       double na = hitungnilai.nilaiAkhir(tugas, nilai.getMid(), nilai.getUas());
       
        JOptionPane.showMessageDialog(null, "Nama: " + identitas.getNama()+ 
                "\nStambuk: " + identitas.getStambuk()+
                "\nNilai Tugas: " + tugas + 
                "\nNilai MID: " + nilai.getMid()+ 
                "\nNilai UAS: "+ nilai.getUas()+ 
                "\nNilai Akhir: " + na);        
    }    
}
