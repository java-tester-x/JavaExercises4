package src;

public class TestMyComplex {

    public static void main(String[] args)
    {
        MyComplex c1 = new MyComplex(1.1, 2.2);
        System.out.println("Number 1 is "+ c1);
        System.out.println(c1 + " is "+(c1.isReal() ? "" : "NOT")+" pure real number");
        System.out.println(c1 + " is "+(c1.isImaginary() ? "" : "NOT")+" pure imaginary number");

        MyComplex c2 = new MyComplex(3.3, 4.4);
        System.out.println("Number 2 is "+ c2);
        System.out.println(c2 + " is "+(c2.isReal() ? "" : "NOT")+" pure real number");
        System.out.println(c2 + " is "+(c2.isImaginary() ? "" : "NOT")+" pure imaginary number");

        System.out.println(c1+" is " +(c1.equals(c2) ? "":"NOT") +" equal to "+c2);
        System.out.println(c1+" + "+c2+" = "+c1.add(c2));
        System.out.println(c1+" - "+c2+" = "+c1.substract(c2));
    }
}   