package Lecture1_oops_1;

public class Fraction_Class {
    private int numerator;
    private int denominator;

    public Fraction_Class(int numerator, int denominator){
        this.numerator=numerator;
        if (denominator == 0) {
            System.out.println("Wrong in put");
        }
        this.denominator=denominator;
        //To simplify both number a/b form
        simplify();


    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if(denominator==0) return;
        this.denominator = denominator;
        simplify();
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public void print(){
        if(denominator == 1) {
            System.out.println(numerator);
        }else{
            System.out.println(numerator+"/"+denominator);
        }
    }

    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator,denominator);
        for (int i = 2; i < smaller; i++) {
            if(numerator % i ==0 && denominator % i ==0)  gcd=i;
        }
        numerator = numerator/gcd;
        denominator = denominator / gcd;
    }

    public void add(Fraction_Class f2){
        this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    public void  multiply(Fraction_Class f2){
        this.numerator = this.numerator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    public static Fraction_Class add(Fraction_Class f1, Fraction_Class f2){
        int newnm = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
        int newdn = f1.denominator * f2.denominator;
        Fraction_Class f = new Fraction_Class(newnm , newdn);
         return f;
    }


}
