class Complex
{
    int real,imag;

    Complex(int real, int imag)
    {
        this.real= real;

        this.imag= imag;
    }

    Complex(int real)
    {
        this.real= real;
        
        this.imag= 0;
    }

    Complex()
    {
        this.real= 0;
        this.imag= 0;
    }


    public static Complex sum(Complex c1, Complex c2)
    {
        Complex res= new Complex();

        res.real= c1.real+c2.real;
        res.imag= c1.imag+c2.imag;

        return res;
    }

    public static Complex product(Complex c1, Complex c2)
    {
        Complex res= new Complex();

        res.real= (c1.real*c2.real)-(c1.imag*c2.imag);
        res.imag= (c1.real*c2.imag)+(c1.imag*c2.real);

        return res;
    }


    public static void main(String args[])
    {
        Complex c1= new Complex(3,2);
        Complex c2= new Complex(4,-2);
        
        Complex s= sum(c1,c2);
        Complex p= product(c1,c2);

        System.out.println("The sum of the complex numbers is: "+s.real+" +"+"i"+s.imag);
        System.out.println("The product of the complex numbers is: "+p.real+" +"+"i"+p.imag);
    }
}