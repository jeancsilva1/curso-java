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
public class Employee {

    public String name;
    public double GlossSlary;
    public double tax;

    public double netSalary() {
        return GlossSlary - tax;
    }

    public void increaseSalary(double percentage) {
        GlossSlary += GlossSlary * percentage / 100;
    }

    @Override
    public String toString() {
        return "Employee: "+ name + ", " + netSalary();
    }

}
