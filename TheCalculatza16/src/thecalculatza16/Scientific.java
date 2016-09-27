package thecalculatza16;

/**
 *
 * @author 066223090
 */
public class Scientific {
    
    public static double areaOfRect(double l, double w) {
        return (l*w);
    }
    
    public static double areaOfRectPrism(double l, double w, double h) {
        return (2*l*w + 2*l*h + 2*w*h);
    }
    
    public static double areaOfCircle(double r) {
        return (Math.PI * r * r);
    }
    
    public static double areaOfSphere(double r) {
        return (4 * Math.PI * r * r);
    }
    
    public static double areaOfTriangle(double b, double h) {
        return (b * h / 2);
    }
    
    public static double areaOfTrapeze(double b, double a, double h) {
        return ((a+b)*h/2);
    }
}
