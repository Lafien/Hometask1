import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree(){
        return this.coeffs.length-1;
    }

    @Override
    public String toString() {
        String result="";
        String last=""+coeffs[0];
        for(int i=coeffs.length-1; i> 0; i--){
            result += coeffs[i]+"x^"+i + "+";
        }
        result+=last;
        return result;
    }

    public double evaluate(double x){
        double p = 0;
        for (int i = coeffs.length-1; i >= 0; i--)
            p = coeffs[i] + (x * p);
        return p;
    }

    public MyPolynomial add(MyPolynomial right){
        if(this.getDegree()>right.getDegree()){
            double result[] = new double[this.getDegree()+1];
            //MyPolynomial poly = new MyPolynomial();
           // poly=this;
            for (int i = 0; i <= this.getDegree(); i++) result[i] += this.coeffs[i];
            for (int i = 0; i <= right.getDegree(); i++) result[i] += right.coeffs[i];
            return new MyPolynomial(result);
        } else {
            double result[] = new double[right.getDegree()+1];
            //MyPolynomial poly = new MyPolynomial();
            //poly = right;
            for (int i = 0; i <= right.getDegree(); i++) result[i] += right.coeffs[i];
            for (int i = 0; i <= this.getDegree(); i++) result[i] += this.coeffs[i];
            return new MyPolynomial(result);
        }
    }

    public MyPolynomial multiply(MyPolynomial right){
        int length = this.getDegree() + right.getDegree() +1;
        double[] result = new double[length];
        if(this.getDegree()>right.getDegree()) {
            for (int i = 0; i <= this.getDegree(); i++) {
                for(int j =0; j <= right.getDegree(); j++){
                    result[i+j] += coeffs[i] * right.coeffs[j];
                }
            }
            return new MyPolynomial(result);
        } else {
            for (int i = 0; i <= right.getDegree(); i++) {
                for(int j =0; j <= this.getDegree(); j++){
                    result[i+j] += coeffs[j] * right.coeffs[i];
                }
            }
            return new MyPolynomial(result);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPolynomial that = (MyPolynomial) o;
        return Arrays.equals(coeffs, that.coeffs);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coeffs);
    }
}
