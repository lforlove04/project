/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package volume.pert10;


public class Silinder1 {
  double jari, tinggi;

    Silinder1(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    double hitungLuas() {
        double luas = 2 * Math.PI * this.jari * (this.jari + this.tinggi);
        return luas;
    }

    double hitungVolume() {
        double volume = 2 * Math.PI * this.jari * this.jari * this.tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Silinder1 tabung = new Silinder1(10, 8);

        System.out.println("Jari-jari = " + tabung.jari);
        System.out.println("Tinggi = " + tabung.tinggi);
        System.out.println("Volume Silinder = " + tabung.hitungVolume());
        System.out.println("Luas Permukaan Silinder = " + tabung.hitungLuas());
    }
}  

