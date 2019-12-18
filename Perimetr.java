public class Perimetr {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

// кооординаты вершин треугольника
        float xa = 1;
        float ya = 3;
        float xb = 5;
        float yb = 0;
        float xc = 4;
        float yc = 6;
        // длины сторон

        double ab = destination(xa, ya, xb, yb);
        double ac = destination(xa, ya, xc, yc);
        double bc = destination(xb, yb, xc, yc);
        double perimetr = ab + ac + bc;
        double s = area(ab, ac, bc, perimetr / 2);//формула герона


        System.out.printf("Периметр = %.2f", perimetr);
        System.out.println();

        System.out.printf("Площадь = %.3f", s);
        System.out.println();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " milliseconds");

    }

    public static double destination(float a, float b, float c, float d) {

        double dest = Math.sqrt(Math.pow(a - c, 2) + Math.pow(b - d, 2));



        return dest;
    }

    public static double area(double a, double b, double c, double p) {

        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));



        return s;
    }
}