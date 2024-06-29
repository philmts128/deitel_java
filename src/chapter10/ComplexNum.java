/**
* Simples complex number example to demonstrate
* the overriding of 'equal' function
* Author: Philippe Matias
*/


public class ComplexNum
{
    public static void main(String[] args)
    {
        var n1 = new Complex(2, 5);
        var n2 = new Complex(1, 0);

        System.out.printf("** n1 = %s\n", n1);
        System.out.printf("** n2 = %s\n", n2);

        var n3 = n1.sum(n2);
        System.out.printf("** n3 = n1 + n2 = %s\n", n1);

        ComplexNum.comp(n1, n2, "n1", "n2");
        ComplexNum.comp(n1, n3, "n1", "n3");
    }

    public static void comp(Complex n1, Complex n2, String sn1, String sn2)
    {
        if (n1.equals(n2)) {
            System.out.printf("%s is equal to %s\n",
                sn1, sn2);
        } else {
        System.out.printf("%s is not equal to %s\n",
            sn1, sn2);
        }
    }
}


class Complex
{
    private double real;
    private double imaginary;

    Complex(double r, double i)
    {
       this.real = r;
       this.imaginary = i;
    }

    public Complex sum(Complex n)
    {
        double r = this.real + n.real;
        double i = this.imaginary + n.imaginary;
        var res = new Complex(r, i);
        return res;
    }

    @Override
    public boolean equals(Object an) //does'nt work. Fix it later!
    {
        if (an instanceof Complex)
        {
            final double EPS = 0.000000001;
            var n = (Complex)an;
            boolean rc = Math.abs(this.real - n.real) <= EPS;
            boolean ic = Math.abs(this.imaginary - n.imaginary) <= EPS;
            boolean e = rc && ic;
            return e;
        }

        return false;
    }

    @Override
    public String toString()
    {
        if (this.imaginary == 0) {
            return String.format("%.2f", this.real);
        }

        if (this.real == 0) {
            return String.format("%.2f", this.imaginary);
        }

        if (this.imaginary == 0 && this.real == 0) {
            return "0";
        }

        char ch = (imaginary < 0) ? '-' : '+';
        return String.format("%.2f %c %.2fi",
            this.real, ch, Math.abs(this.imaginary));
    }
}
