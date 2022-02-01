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
public class Rectangle extends Shape {
    private Double width;
    private Double height;

    public Rectangle() {
    }

    public Rectangle(Double width, Double height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }
    
    
    @Override
    public double area() {
        return width * height;
    }

}


