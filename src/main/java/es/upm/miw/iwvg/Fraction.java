package es.upm.miw.iwvg;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction multiply(Fraction f2){
        return new Fraction(f2.getNumerator() * this.getNumerator(), f2.getDenominator() * this.getDenominator());
    }

    public Fraction divide (Fraction f2){
        Fraction resultado=new Fraction( this.getNumerator() * f2.getDenominator() , this.getDenominator() * f2.getNumerator());
        return resultado;
    }
}
