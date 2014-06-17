package src;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    /**
     * Constructor that takes coefficients from a file (of the given filename),
     * having this format:
     * 
     * Degree-n(int)
     * c0(double)
     * c1(double)
     * ......
     * ......
     * cn-1(double)
     * cn(double)
     * (end-of-file)
     * 
     * @param  filename [description]
     */
    public MyPolynomial(String filename)
    {
        Scanner in = null;
        try {
            in = new Scanner(new File(filename));  // open file
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int degree = Integer.parseInt(in.nextLine()); // read the degree
        coeffs = new double[degree+1];  // allocate the array
        for (int i = 0; i < coeffs.length; ++i) {
            coeffs[i] = Double.parseDouble(in.nextLine());
        }
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public int getDegree() {
        return coeffs.length-1;
    }

    public double evaluate(double x)
    {
        double sum  = 0.0;
        double item = 1.0;
        for (int i = 0; i < coeffs.length; i++) {
            item *= (i == 0 ? 1.0 : x);
            sum  += item * coeffs[i] ;
        }
        return sum;
    }

    public MyPolynomial add(MyPolynomial another)
    {
        
        return this;
    }

    public MyPolynomial multiply(MyPolynomial another) {
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length-1; i >= 0; i--) {
            sb.append(coeffs[i] + (i != 0 ? "*x^"+i+" + ":""));
        }
        return sb.toString();
    }
}   