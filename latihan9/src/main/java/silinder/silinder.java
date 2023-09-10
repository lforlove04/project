/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package silinder;

public class silinder {
double jari, tinggi;
    Silinder(double r, double t){
    jari = r;
    tinggi = t;
    }
    double hitungLuas(){
    
        double Luas = 2*Math.PI*jari*(jari + tinggi);
        return Luas;
    }
    double hitungVolume() {
    
        double Volume =2*Math.PI*jari*jari*tinggi;
        return Volume;
    }
    public static void main(String [] args){
    Silinder tabung = new Silinder (10, 8);
    
    System.out.println("Jari-jari = " + tabung.jari);
    System.out.println("Tinggi = " + tabung.tinggi);
    System.out.println("Volume Silinder = " + tabung.hitungVolume());
    System.out.println("Volume Silinder = " + tabung.hitungLuas());
    }
}


