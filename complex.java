class complex {
    int real;
    int imag;
    complex(int r,int c){
        real=r;
        imag=c;
    }
  static void add(complex c1,complex c2){
        int sumr,sumc;
        sumr=(c1.real+c2.real);
        sumc=(c1.imag+c2.imag);
        System.out.println("addition of complex numbers are : "+sumr+"+"+"i"+sumc);


    }
    static void sub(complex c1,complex c2){
        int subr,subc;
        subr=c1.real-c2.real;
        subc=c1.imag-c2.imag;
        System.out.println("the subraction of complex numbers are  :  "+subr+"+"+"i"+subc);
    }
    public static void main(String args[]){
       // Scanner sc=new Scanner(System.in);
        complex c1=new complex(5,9);
        complex c2=new complex(6,8);
        add(c1,c2);
        sub(c1,c2);
    }
}
