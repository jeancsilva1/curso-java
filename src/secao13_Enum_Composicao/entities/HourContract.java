/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13_Enum_Composicao.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jean
 */
public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public HourContract() {
    }

    public HourContract(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue(){
        return this.hours * this.valuePerHour; 
    }
    
    @Override
    public String toString() {
        return "Contratos: " + sdf.format(date) + ", R$" + valuePerHour + ", " + hours + "H";
    }
    
    
    
}
