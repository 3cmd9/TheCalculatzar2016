/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thecalculatza16;

/**
 *
 * @author 066223090
 */
public class Scientific {

    public static double volOfRect(double length, double width, double height) {
        return (length * width * height);
    }
    
    public static double volOfSphere(double radius) {
        return ((4/3)*Math.PI*(Math.pow(radius, 3)));
    }
    
    public static double volOfPyramid(double length, double width, double height) {
        return ((length * width * height)/3);
    }
    
    public static double areaOfRect(double l, double w) {
        return (l*w);
    }
    
    public static double areaOfCircle(double d) {
        return (Math.PI * d);
    }
    
    public static double areaOfTriangle(double b, double h) {
        return (b * h / 2);
    }
    
    public static double areaOfTrapeze(double b, double a, double h) {
        return ((a+b)*h/2);
    }
}
