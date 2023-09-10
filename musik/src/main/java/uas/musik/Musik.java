/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uas.musik;

/**
 *
 * @author user
 */
public class AlatMusik {
// Superclass AlatMusik
class AlatMusik {
    public void mainkan() {
        System.out.println("Memainkan alat musik...");
    }
}

// Subclass AlatMusikGitar
class AlatMusikGitar extends AlatMusik {
    @Override
    public void mainkan() {
        System.out.println("Memainkan gitar...");
    }
}

// Subclass AlatMusikPiano
class AlatMusikPiano extends AlatMusik {
    @Override
    public void mainkan() {
        System.out.println("Memainkan piano...");
    }
}

// Subclass AlatMusikBiola
class AlatMusikBiola extends AlatMusik {
    @Override
    public void mainkan() {
        System.out.println("Memainkan biola...");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        AlatMusik alatMusik1 = new AlatMusikGitar();
        AlatMusik alatMusik2 = new AlatMusikPiano();
        AlatMusik alatMusik3 = new AlatMusikBiola();

        alatMusik1.mainkan();
        alatMusik2.mainkan();
        alatMusik3.mainkan();
    }
}
  }
