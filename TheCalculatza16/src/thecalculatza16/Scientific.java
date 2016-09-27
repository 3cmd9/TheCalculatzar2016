package thecalculatza16;

/**
 *
 * @author 066223090
 */
public class Scientific {

    public static double volOfCylc(double radius, double height) {
        return (height * (4 / 3) * Math.PI * (Math.pow(radius, 3)));
    }

    public static double volOfRectPrism(double length, double width, double height) {
        return (length * width * height);
    }

    public static double volOfSphere(double radius) {
        return ((4 / 3) * Math.PI * (Math.pow(radius, 3)));
    }

    public static double volOfPyramid(double length, double width, double height) {
        return ((length * width * height) / 3);
    }

    public static double areaOfRect(double l, double w) {
        return (l * w);
    }

    public static double areaOfRectPrism(double l, double w, double h) {
        return (2 * l * w + 2 * l * h + 2 * w * h);
    }

    public static double areaOfCircle(double r) {
        return (Math.PI * r * r);
    }

    public static double areaOfSphere(double r) {
        return (4 * Math.PI * r * r);
    }
    
    public static double areaOfCylinder(double r, double h) {
        return (2 * (Math.PI * r * r) + 2 * Math.PI * r * h);
    }
    
    public static double areaOfCylinder(double r, double h) {
        return (2 * (Math.PI * r * r) + 2 * Math.PI * r * h);
    }
    
    public static double areaOfTriangle(double b, double h) {
        return (b * h / 2);
    }

    public static double areaOfTrapeze(double b, double a, double h) {
        return ((a + b) * h / 2);
    }
}
