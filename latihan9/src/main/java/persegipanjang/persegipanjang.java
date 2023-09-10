/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persegipanjang;

/**
 *
 * @author user
 */
public class persegipanjang {

    private double panjang;
    private double lebar;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getLuas() {
        return panjang * lebar;
    }
}

public class Main {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(5); // mengatur panjang
        pp.setLebar(3); // mengatur lebar

        double panjang = pp.getPanjang(); // mendapatkan panjang
        double lebar = pp.getLebar(); // mendapatkan lebar
        double luas = pp.getLuas(); // menghitung luas

        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + luas);
    }
}
 
    

 
