/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao14_Heranca_Polimorfismo.model.entities;

/**
 *
 * @author Jean
 */
public class OutsourcedEmployee extends Employee {
    
    private Double addtionalCharge;

    public OutsourcedEmployee() {
    }

    public OutsourcedEmployee(Double addtionalCharge, String name, Integer hours, Double valuePerHour) {
        super(name, hours, valuePerHour);
        this.addtionalCharge = addtionalCharge;
    }

    public Double getAddtionalCharge() {
        return addtionalCharge;
    }

    public void setAddtionalCharge(Double addtionalCharge) {
        this.addtionalCharge = addtionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + (addtionalCharge * 1.1);
    }

    
    
    
}
