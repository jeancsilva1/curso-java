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
public class Rectangle {
    public double width;
    public double height;
    
    public double area(){
        return width * height;
        
    }
    public double perimeter(){
        return width + width + height + height;
    }
    
    public double diagonal(){
       return Math.sqrt(width * width + height * height);
    }
}
