public class q1 {
    public static void main(String args[]) {
        Complex c1 = new Complex(5,9);
        Complex c2 = new Complex(3,1);
        
        Complex sum = Complex.sum(c1,c2);
        sum.print();

        Complex diff = Complex.diff(c1,c2);
        diff.print();

        Complex prod = Complex.prod(c1,c2);
        prod.print();
    }
}

class Complex {
    int real, imag;

    Complex(int a , int i) {
        real = a;
        imag = i;
    }

    public static Complex sum(Complex a, Complex b) {
        return new Complex(a.real+b.real, a.imag+b.imag);
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex(a.real-b.real, a.imag-b.imag);
    }

    public static Complex prod(Complex a, Complex b) {
        return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
    }

    void print() {
        if (real == 0 && imag!= 0) {
            System.out.println(imag + "i");
        }
        else if (real != 0 && imag== 0) {
            System.out.println(real);
        }
        else System.out.println(real + " + " + imag + "i");
    }

}