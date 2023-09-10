/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uas.alatmusik;

/**
 *
 * @author user
 */
public class Alatmusik {
    public static void main(String[] args) {
        SuaraHewan hewan1 = new Anjing();
        SuaraHewan hewan2 = new Kucing();
        SuaraHewan hewan3 = new Ayam();   
    }
}
abstract class SuaraHewan {
    public abstract void tampilkanSuara();
}

class Anjing extends SuaraHewan {
    public void tampilkanSuara() {
        System.out.println("Guk Guk");
    }
}

class Kucing extends SuaraHewan {
    public void tampilkanSuara() {
        System.out.println("Meong");
    }
}

class Ayam extends SuaraHewan {
    public void tampilkanSuara() {
        System.out.println("Kukuruyuk");
    }
}
