import java.util.Objects;

public class MyComplex {
    private double real=0.0;
    private double imag=0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        if(imag > 0) {
            return "(" + real + "+" + imag + "i)";
        } else
            return "(" + real + "" + imag + "i)";

    }

    public  boolean isReal(){
        return this.real != 0.0;
    }

    public boolean isImaginary(){
        return this.imag != 0.0;
    }

    public boolean equals(double real, double imag){
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex another){
        return this.imag == another.imag && this.real == another.real;
    }

    public double magnitude() {
        return Math.sqrt(real*real + imag*imag);
    }

    public double argument() {
        return Math.atan(imag/real);
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex res = new MyComplex();
        res.real= this.real + right.real;
        res.imag= this.imag + right.imag;
        return res;
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        MyComplex res = new MyComplex();
        res.real= this.real - right.real;
        res.imag= this.imag - right.imag;
        return res;
    }

    public MyComplex multiply(MyComplex right) {
        double bufReal=this.real;
        double bufImag = this.imag;
        this.real=bufReal*right.real-bufImag*right.imag;
        this.imag=bufReal*right.imag+bufImag*right.real;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double bufReal=this.real;
        double bufImag = this.imag;
        this.real=(bufReal*right.real+bufImag*right.imag)/(right.real*right.real+right.imag*right.imag);
        this.imag=(right.real*bufImag-bufReal*right.imag)/(right.real*right.real+right.imag*right.imag);
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(real,-imag);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex myComplex = (MyComplex) o;
        return Double.compare(myComplex.real, real) == 0 &&
                Double.compare(myComplex.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imag);
    }
}
