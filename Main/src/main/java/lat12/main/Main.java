/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lat12.main;

public class Main {
   public static void main(String[] args) {
        EkspresiWajah ekspresi1 = new Senyum();
        EkspresiWajah ekspresi2 = new Sedih();
  
        SuaraHewan hewan1 = new Anjing();
        SuaraHewan hewan2 = new Kucing();
        SuaraHewan hewan3 = new Ayam();

        EkspresiWajah[] ekspresi = {ekspresi1, ekspresi2,};
        SuaraHewan[] hewan = {hewan1, hewan2, hewan3};

        for (EkspresiWajah e : ekspresi) {
            e.tampilkanEkspresi();
        }

        for (SuaraHewan h : hewan) {
            h.tampilkanSuara();
        }
    }
}

abstract class EkspresiWajah {
    public abstract void tampilkanEkspresi();
}

class Senyum extends EkspresiWajah {
    public void tampilkanEkspresi() {
        System.out.println(":)");
    }
}

class Sedih extends EkspresiWajah {
    public void tampilkanEkspresi() {
        System.out.println(":(");
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

