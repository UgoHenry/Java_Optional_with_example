package pratice.equation;

import com.sun.deploy.security.SelectableSecurityManager;

public class Equation {
    int a;
    int b;
    int c;
    double x1;
    double x2;
    double delta;

    public Equation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double caldelta() {
        if (delta > 0) {
            delta = b * b - 4 * a * c;
        } else {
            System.out.println("Delta is negative ");
        }

        return delta;
    }

    public double calx1() {
        x1 = ((-b - (Math.sqrt(delta))) / (2 * a));
        return x1;
    }

    public double Calx2() {
        x2 = ((-b + (Math.sqrt(delta))) / (2 * a));
        return x2;
    }
}
