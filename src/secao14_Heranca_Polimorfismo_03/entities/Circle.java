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
public class Circle extends Shape{
    private Double radius;

    public Circle() {
    }

    public Circle(Double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public Circle(Double radius) {
        this.radius = radius;
    }
    

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    
}
