/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hitung.bangun.datar;
import java.util.scanner;
/**
 *
 * @author user
 */
 public class HitungBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input panjang, lebar, dan tinggi balok
        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();

        // Hitung volume balok
        double volumeBalok = panjang * lebar * tinggi;

        // Input jari-jari lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        // Hitung keliling lingkaran
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        // Tampilkan hasil
        System.out.println("Volume Balok: " + volumeBalok);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);
    }
}
    }

