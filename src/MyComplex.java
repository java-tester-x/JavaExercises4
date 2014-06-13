package src;

public class MyComplex {

    private double real;
    private double imag;

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return this.imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public boolean isReal() {
        return (imag == 0);
    }

    public boolean isImaginary() {
        return (real == 0);
    }

    public boolean equals(double real, double imag) {
        return (thix.real == real && this.imag = imag);
    }

    public boolean equals(MyComplex another) {
        return (thix.real == another.getReal() && this.imag = another.getImag());
    }

    public double magnitude() {
        return Math.sqrt(real*real + imag*imag);
    }

    public double argumentInRadians() {
        return Math.atan2(imag, real);
    }

    public int argumentInDegrees() {
        
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }

    public MyComplex add(MyComplex another) {
        return new MyComplex(real+another.getReal(), imag+another.getImag());
    }

    public MyComplex substract(MyComplex another) {
        return new MyComplex(real-another.getReal(), imag-another.getImag());
    }

    public MyComplex multiplyWith(MyComplex another) {
        // (ac - bd) + (ad + bc)i
        return new MyComplex(
            real*another.getReal() - imag*another.getImag()
        ,   real*another.getImag() + imag*another.getReal()
        );
    }

    public MyComplex divideBy(MyComplex another) {
        // [(a + bi) * (c – di)] / (c2 + d2)
        
    }

    public String toString() {
        return "("+real " + "+ imag+"i)" ;
    }
}   