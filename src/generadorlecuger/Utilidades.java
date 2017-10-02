/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorlecuger;

/**
 *
 * @author RetailAdmin
 */
public class Utilidades {

    public double calculaX(double semillaX) {
        double semilla = (40014 * semillaX) % 2147483563;
        return semilla;
    }

    public double calculaY(double semillaY) {

        double semilla = (40692 * semillaY) % 2147483563;
        return semilla;

    }

    public double calculaZ(double semillaX, double semillaY) {

        double semilla = (semillaX - semillaY) % 2147483562;
        return semilla;
    }

    public double calculaU(double semillaZ) {
        double semilla = 0;
        if (semillaZ == 0) {
            semilla = 2147483562 / 2147483563;    
        } else {
            semilla = semillaZ / 2147483563;
        }
        return semilla;
    }

}
