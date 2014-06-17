package src;

public class TestMyPolynomial {

    public static void main(String[] args)
    {
        // Test program
        // Can invoke with a variable number of arguments
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);

        System.out.println("Polynomial p1: "+p1);
        System.out.println("Polynomial p2: "+p2);
       
        // Can also invoke with an array
        double[] coeffs = {1.2, 3.4, 5.6, 7.8};
        MyPolynomial p3 = new MyPolynomial(coeffs);
        System.out.println("Polynomial p3: "+p3);

        MyPolynomial p4 = new MyPolynomial("res/coeffs.txt");
        System.out.println("Polynomial p4: "+p4);

        MyPolynomial p5 = new MyPolynomial(1, 0, 3);
        System.out.println("Polynomial p5: "+p5);
        System.out.println("Polynomial evaluated with x = 3: "+p5.evaluate(3));
    }
}   