/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mobil.mobil;

/**
 *
 * @author user
 */
public class Mobil {
         String aktifitas;
        String warna;
        int kecepatan;
        String bahanbakar="pertamax";
        
        void cekKecepatan()
        {
        if (kecepatan==0)
            aktifitas="parkir";
        else
        aktifitas="jalan";
}
        void cetakAtribut()
        {
        System.out.println("Aktifitas = "+aktifitas);
        System.out.println("Warna = "+warna);
        System.out.println("Kecepatan = "+kecepatan);
        System.out.println("Bahan bakar = "+bahanbakar);
        }
        public static void main(String[] args)
        {
        Mobil mobilku = new Mobil();
        Mobil mobilmu = new Mobil();
        mobilku.kecepatan=0;
        mobilku.warna="merah";
        mobilku.cekKecepatan();
        mobilku.cetakAtribut();
        mobilmu.kecepatan=2;
        mobilmu.cekKecepatan();
        mobilmu.warna="hitam";
        mobilmu.cetakAtribut();
        } 
}
