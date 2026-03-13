/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rahmatia Alam
 */
import java.util.Scanner;
public class indeksprestasiMain {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=". repeat(70));
        System.out.println(" SISTEM PERHITUNGAN INDEKS PRESTASI SEMESTER (IPS)");
        System.out.println("=". repeat(70));
        
        System.out.print("Masukkan nama Mahasiswa : ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan NIM Mahasiswa : ");
        String nim = scanner.nextLine();
                
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
        int totalMK = 0;
        while(true) {
            try{
                System.out.print("Masukkan jumlah mata kuliah yang ingin diambil : ");
                totalMK = Integer.parseInt(scanner.nextLine().trim());
                if (totalMK <= 0){
                    System.out.println("[!] Jumlah mata kuliah harus lebih dari 0. Coba lagi. ");
                    continue;
                }
                break;
            } catch (NumberFormatException e){
                System.out.println("[1] input tidak valid. Masukkan angka bulat. ");
            }
        }
        System.out.println("\nMasukkan data untuk setiap mata kuliah: ");
        System.out.println("Nilai yang diterima: A, A-, B+, B- , C+, C, D, E");
        System.out.println("-".repeat(70));
        
        for (int i = 1; i<= totalMK; i++){
            System.out.println("\n[Mata kuliah ke-" + i + "]");
            
            System.out.println("Nama mata kuliah :");
            String namaMK = scanner.nextLine();
            
            int sks = 0;
            while(true){
                try {
                    System.out.print("Jumlah SKS :");
                    sks = Integer.parseInt(scanner.nextLine().trim());
                    if (sks <= 0){
                        System.out.println(" SKS harus lebih dari 0. Coba lagi. ");
                        continue;
                    }
                    break;
                } catch(NumberFormatException e){
                    System.out.println("Input tidak valid. Masukkan angka bulat. ");        
                }
            }
            
            MataKuliah mk = null;
            while (mk == null){
                try{
                    System.out.print("Nilai huruf : ");
                    String nilaiHuruf = scanner.nextLine(). trim();
                    mk = new MataKuliah(sks, nilaiHuruf, namaMK);
                } catch (IllegalArgumentException e){
                    System.out.println(" [!] " + e.getMessage());
                }
            }
            mahasiswa.tambahMataKuliah(mk);
        }
        mahasiswa.tampilkanInfo();
        
        scanner.close();
    }
    
}
