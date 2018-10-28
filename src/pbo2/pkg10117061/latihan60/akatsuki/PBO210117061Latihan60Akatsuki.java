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
public class PBO210117061Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        System.out.println("===Top 3 Favourite character in akatsuki===");
        AnggotaSatu satu = new AnggotaSatu("konoha", "Uchiha Itachi", true, 
                                           "katon-goukakyuu", "katon");
        AnggotaDua dua = new AnggotaDua("Ame", "Yahoki(Pain Tendo)", true,
                                        "Shinra tensei", "suiton");
        AnggotaTiga tiga = new AnggotaTiga("Iwa", "Deidara", false, 
                                           "C2", "Douton,Bakuton");
    }
    
}
