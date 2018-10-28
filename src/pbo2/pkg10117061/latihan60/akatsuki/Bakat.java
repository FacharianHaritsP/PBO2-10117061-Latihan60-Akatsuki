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
public class Bakat {
protected boolean doujutsu;
protected String jutsu;
protected String element;

    public Bakat(boolean doujutsu, String jutsu, String element) {
        this.doujutsu = doujutsu;
        this.jutsu = jutsu;
        this.element = element;
    }

    public boolean isDoujutsu() {
        return doujutsu;
    }

    public String getJutsu() {
        return jutsu;
    }

    public String getElement() {
        return element;
    }




}
