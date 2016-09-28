package thecalculatza16;

/**
 *
 * @author 066223090
 */
public class Scientific {

    public static double volOfCyl(double radius, double height) {
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

    public static double areaOfTriangle(double b, double h) {
        return (b * h / 2);
    }

    public static double areaOfTrapeze(double b, double a, double h) {
        return ((a + b) * h / 2);
    }

    public static String decToFrac(double dec) {
        double base = 1;
        double temp;
        dec *= base *= Math.pow(10.0,Double.toString(dec).length() - (Double.toString(dec).indexOf('.'))-1);
        double decConst = dec;
        double baseConst = base;
        while (base != 0.0) {
            temp = dec % base;
            dec = base;
            base = temp;
        }
        decConst /= dec;
        baseConst /= dec;
        return ((int)decConst + "/" + (int)baseConst);
    }
    
    public static String linearEqnOf(double x1, double y1, double x2, double y2) {
        String eqn = "y = ";
        double slope = ((y2 - y1)/(x2-x1));
        if (slope != 0)
            eqn +=  slope + "x";
        double b = (y2 - slope * x2);
        if (b > 0)
            eqn += "+" + b;
        else if (b < 0)
            eqn += b;
        return eqn;
    }
    
}
