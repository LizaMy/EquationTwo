package EquationTwoPackage;

import Equation.Equation;

public class EquationTwo {
    private Equation root;

    public EquationTwo(double a, double b, double c) {
        root = new Equation(a, b, c);
    }
    public double largerRoot() throws IllegalArgumentException{
        double[] res = root.QuadraticEquation();

        if (res.length == 0){
            throw new IllegalArgumentException("Корней нет");
        }else{
            if(res.length == 1) {
                return res[0];
            }else{
                if(res[0] > res[1]){
                    return res[0];
                }else{
                    return res[1];
                }
            }
        }
    }
}
