/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uas.alatmusik1;

/**
 *
 * @author user
 */
public class AlatMusik1 {

   public static void main(String[] args) {
        EkspresiWajah ekspresi1 = new Senyum();
        EkspresiWajah ekspresi2 = new Tertawa();
        EkspresiWajah ekspresi3 = new Marah();

        SuaraHewan hewan1 = new Anjing();
        SuaraHewan hewan2 = new Kucing();
        SuaraHewan hewan3 = new Ayam();

        EkspresiWajah[] ekspresi = {ekspresi1, ekspresi2, ekspresi3};
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
        System.out.println("bunyi drum");
    }
}

class Tertawa extends EkspresiWajah {
    public void tampilkanEkspresi() {
        System.out.println("bunyi piano");
    }
}

class Marah extends EkspresiWajah {
    public void tampilkanEkspresi() {
        System.out.println("bunyi gitar");
    }
}

abstract class SuaraHewan {
    public abstract void tampilkanSuara();
}

class Anjing extends SuaraHewan {
    public void tampilkanSuara() {
        System.out.println("bunyidrum dugdugtak");
    }
}

class Kucing extends SuaraHewan {
    public void tampilkanSuara() {
        System.out.println("bunyipiano kreleng");
    }
}

class Ayam extends SuaraHewan {
    public void tampilkanSuara() {
        System.out.println("bunyigitar jrenjreng");
    }
}

