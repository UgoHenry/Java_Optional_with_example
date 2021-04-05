package pratice.equation;

import pratice.equation.Equation;

public class Main {
    public static void main(String[] args) {
        Equation eq = new Equation(2,5,1);
        eq.caldelta();
        eq.calx1();
        eq.Calx2();
        System.out.println(eq.delta);
        System.out.println(eq.calx1());
        System.out.println(eq.Calx2());
    }
}
