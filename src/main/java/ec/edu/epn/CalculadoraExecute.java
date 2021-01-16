package ec.edu.epn;

import ec.edu.epn.Calculadora;

public class CalculadoraExecute {
    public static void main(String[] args){
        System.out.println("-- Ejecucion de calculadora --");

        Calculadora c = new Calculadora();
        int suma = c.addition(5,9);
        System.out.println("c.addition(5,9) = " + suma);

        int resta = c.subtraction(6,2);
        System.out.println("c.subtraction(6,2) = " + resta);
    }
}
