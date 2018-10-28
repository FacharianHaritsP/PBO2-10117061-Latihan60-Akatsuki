/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan60.akatsuki;
/**
 *Nama      : Fachrian Harits P
 *Kelas     : IF-2
 *NIM       : 10117061
 *Deskripsi : Program untuk menampilkan tiga karakter favorit
 * 
 */
public class AnggotaSatu extends Bakat{
    
    private String desa;
    private String nama;

    public AnggotaSatu(String desa, String nama, boolean doujutsu, String jutsu, String element) {
        super(doujutsu, jutsu, element);
        this.desa = desa;
        this.nama = nama;
        System.out.println("Nama : " +nama );
        System.out.println("Asal Desa : " +desa );
        System.out.println("Pengguna doujutsu : " +doujutsu );
        System.out.println("Jutsu andalan : " +jutsu );
        System.out.println("Elemen yang sering di gunakan : " +element );
    
    }

    public String getDesa() {
        return desa;
    }

    public String getNama() {
        return nama;
    }

 
    
    
}
