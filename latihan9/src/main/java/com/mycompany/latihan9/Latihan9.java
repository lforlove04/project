/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan9;

/**
 *
 * @author user
 */
public class Latihan9 {
   public class Latihan9 {
    public static void main(String[] args) {
        double jariJari = 10.0;
        double tinggi = 8.0;
        
        double luas = hitungLuasTabung(jariJari, tinggi);
        double volume = hitungVolumeTabung(jariJari, tinggi);
        
        System.out.println("Jari-jari = " + jariJari);
        System.out.println("Tinggi = " + tinggi);
        System.out.println("Luas = " + luas);
        System.out.println("Volume = " + volume);
    }
    
    public static double hitungLuasTabung(double jariJari, double tinggi) {
        double luasAlas = Math.PI * jariJari * jariJari;
        double luasSelimut = 2 * Math.PI * jariJari * tinggi;
        double luasTotal = 2 * luasAlas + luasSelimut;
        return luasTotal;
    }
    
    public static double hitungVolumeTabung(double jariJari, double tinggi) {
        double volume = Math.PI * jariJari * jariJari * tinggi;
        return volume;
    }
} 
      

