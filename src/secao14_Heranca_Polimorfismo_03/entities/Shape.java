/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao14_Heranca_Polimorfismo_03.entities;

import secao14_Heranca_Polimorfismo_03.enums.Color;

/**
 *
 * @author Jean
 */
public abstract class Shape {
    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Shape() {
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public abstract double area();
    
    
}
