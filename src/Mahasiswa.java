/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rahmatia Alam
 */
import java.util.ArrayList;
import java.util.List;
public class Mahasiswa extends Akademikentity {
    
    private final String nim;
    private final List<MataKuliah> daftarMataKuliah;
    
    public Mahasiswa(String nama, String nim){
        super(nama);
        this.nim = nim;
        this.daftarMataKuliah = new ArrayList<>();
    }
    public void tambahMataKuliah(MataKuliah mk){
        daftarMataKuliah.add(mk);
    }
    public int getTotalSKS(){
        int total = 0;
        for (MataKuliah mk : daftarMataKuliah){
            total += mk.getSks();
        }
        return total;
    }
    public double getTotalNilaiMutu(){
            double total = 0;
            for (MataKuliah mk : daftarMataKuliah){
                total += mk.getNilaiMutu();
            }
            return total;
    } 
    public double hitungIndeksPrestasi(){
        int totalSKS = getTotalSKS();
        if (totalSKS == 0) return 0.0;
        return getTotalNilaiMutu() / totalSKS / 10.0;
    }     
    
    public String getPredikat(){
        double ips = hitungIndeksPrestasi();
        if (ips >= 3.51) return "Dengan Pujian Cumlaude";
        else if (ips >= 3.00) return "Sangat Memuaskan";
        else if (ips >=2.50) return "Memuaskan";
        else if (ips >= 2.00) return "Cukup";
        else return "Kurang";
    }

    public String getNim() {
        return nim;
    }

    public List<MataKuliah> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }
     
    @Override
    public void tampilkanInfo(){
        
        System.out.printf(" Total Nilai Mutu = %.0f%n", getTotalNilaiMutu());
        System.out.printf(" Total SKS = %d%n", getTotalSKS());
        System.out.printf(" IPS = %.0f / %d / 10%n", getTotalNilaiMutu(), getTotalSKS());
        System.out.printf(" IPS = %.2f%n", hitungIndeksPrestasi());
        System.out.println(" Predikat : " + getPredikat());
        System.out.println("-".repeat(68));
        System.out.printf(" %-30s | %-4s | %-5s | %-6s | %-11s%n", "Mata Kuliah" , "SKS", "Nilai", "Bobot", "Nilai Mutu");
        System.out.println("-".repeat(68));
        System.out.println("=".repeat(68));
        
        for(MataKuliah mk : daftarMataKuliah){
            mk.tampilkanInfo();
        }
        
        System.out.println("-". repeat(68));
        System.out.printf("%-28s| %4d | %-5s | %5s| %10s%n",
                "TOTAL", getTotalSKS(), "", "", getTotalNilaiMutu());
        System.out.println("=". repeat(68));
        
        System.out.println("--");
        System.out.println("|Rumus : Indeks Prestasi = Total (Bobot x SKS) / Total SKS / 10 |");
        System.out.println("--");
        System.out.println("Detail Nilai Mutu tiap Mata Kuliah (Bobot x SKS) : ");
        
        for (MataKuliah mk : daftarMataKuliah){
            System.out.printf(" %-26s : %.0f x %d = %.0f%n",
                    mk.getNama(), mk.getBobot(), mk.getSks(), mk.getNilaiMutu());
        }
             

        System.out.printf(" Total Nilai Mutu = %.0f\n", getTotalNilaiMutu());
        System.out.printf(" Total SKS = %d%n",  getTotalSKS());
        System.out.printf(" IPS = %.0f / %d / 10%n", getTotalNilaiMutu(), getTotalSKS());
        System.out.printf(" IPS = %.2f\n", hitungIndeksPrestasi());
        System.out.printf(" Predikat : %s%n", getPredikat());
        System.out.println("=".repeat(68));
    }
    
}
