/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rahmatia Alam
 */
public class MataKuliah extends Akademikentity {
    private int sks;
    private String nilaiHuruf;
    private int bobot;
    private int nilaiMutu;

    public MataKuliah(int sks, String nilaiHuruf, String nama) {
        super(nama);
        this.sks = sks;
        setNilaiHuruf(nilaiHuruf);
    }
    
    private int konversiNilai(String nilaiHuruf){
        switch (nilaiHuruf.toUpperCase().trim()){
            case "A": return 40;
            case "A-": return 37;
            case "B+": return 33;
            case "B": return 30;
            case "B-": return 27;
            case "C+": return 23;
            case "C": return 20;
            case "D": return 10;
            case "E": return 0;
            default:
                throw new IllegalArgumentException("Nilai huruf tidak valid :" + nilaiHuruf +
                        "\nNilai yang diterima: A, A-, B+, B, B-, C+, C, D, E");
        }        
    }
    
    private void hitungNilaiMutu(){
        this.nilaiMutu = this.bobot * this.sks;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        if (sks <= 0 ) throw new IllegalArgumentException("SKS harus lebih dari 0!");
        this.sks = sks;
        hitungNilaiMutu();
    }

    public String getNilaiHuruf() {
        return nilaiHuruf;
    }

    public void setNilaiHuruf(String nilaiHuruf) {
        this.bobot = konversiNilai(nilaiHuruf);
        this.nilaiHuruf = nilaiHuruf.toUpperCase().trim();
        hitungNilaiMutu();
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(int bobot) {
        this.bobot = bobot;
    }

    public double getNilaiMutu() {
        return nilaiMutu;
    }

    public void setNilaiMutu(int nilaiMutu) {
        this.nilaiMutu = nilaiMutu;
    }

    @Override
    public void tampilkanInfo() {
        System.out.printf(" %-28s | %4d | %-5s | %5d | %10d%n ",
                getNama(), sks, nilaiHuruf, bobot, nilaiMutu); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
