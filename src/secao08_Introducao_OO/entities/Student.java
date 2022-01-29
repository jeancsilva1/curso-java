/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao08_Introducao_OO.entities;

/**
 *
 * @author Jean
 */
public class Student {

    public String name;
    public double nota1, nota2, nota3, notas;

    public void somaNotas(double n1, double n2, double n3) {
        notas = n1 + n2 + n3;

    }

    public String aprovado() {
        if (notas > 60) {
            return "PASS";
        }
        else {
            notas = 100 - notas;
            return "FAILED \nMISSING " + (60 - notas) + "POINTS";
        }
    }

    @Override
    public String toString() {
        return name + "\n"
                + nota1 + "\n"
                + nota2 + "\n"
                + nota3 + "\n";
               
    }

}
