/**
 * an object to hold all the vitamins a person should eat in a day to do their specific objective (lose gain weight).
 */
public class Vitamin {

    /**
     * An attirubte to hold vitamin a in micrograms.
     * 
     */
    private double A;

    /**
     * An attirubte to hold vitamin c in micrograms.
     */
    private double C;

    /**
     * An attirubte to hold vitamin e in micrograms.
     */
    private double E;

    /**
     * An attirubte to hold vitamin k in micrograms.
     */
    private double K;

    /**
     * An attirubte to hold vitamin b1 (Thiamine) in micrograms.
     */
    private double B1;

    /**
     * an attribute to hold vitamin b2 (Riboflavin) in micrograms.
     */
    private double B2;

    /**
     * An attirubte to hold vitamin b3 (Niacin) in micrograms.
     */
    private double B3;

    /**
     * An attirubte to hold vitamin b5 (Pantothenic acid) in micrograms.
     */
    private double B5;

    /**
     * An attirubte to hold vitamin b6 (Pyridoxine) in micrograms.
     */
    private double B6;

    /**
     * An attirubte to hold vitamin b7 (Biotin) in micrograms.
     */
    private double B7;

    /**
     * An attirubte to hold vitamin b9 (Folate) in micrograms.
     */
    private double B9;

    /**
     * An attirubte to hold vitamin b12 (Cobalamin) in micrograms.
     */
    private double B12;

    /**
     * a constructor for vitamins for 0.
     */
    public Vitamin() {
        this.A = 0.0;
        this.C = 0.0;
        this.E = 0.0;
        this.K = 0.0;
        this.B1 = 0.0;
        this.B2 = 0.0;
        this.B3 = 0.0;
        this.B5 = 0.0;
        this.B6 = 0.0;
        this.B7 = 0.0;
        this.B9 = 0.0;
        this.B12 = 0.0;
    }
    
    /**
     * a constructor for vitamins.
     * @param A the amount of vitamin a per day in micrograms.
     * @param C the amount of vitamin c per day in micrograms.
     * @param E the amount of vitamin e per day in micrograms.
     * @param K the amount of vitamin k per day in micrograms.
     * @param B1    the amount of vitamin b1 per day in micrograms.
     * @param B2    the amount of vitamin b2 per day in micrograms.
     * @param B3    the amount of vitamin b3 per day in micrograms.
     * @param B5    the amount of vitamin b5 per day in micrograms.
     * @param B6    the amount of vitamin b6 per day in micrograms.
     * @param B7    the amount of vitamin b7 per day in micrograms.
     * @param B9    the amount of vitamin b9 per day in micrograms.
     * @param B12   the amount of vitamin b12 per day in micrograms.
     */
    public Vitamin(double A, double C, double E, double K, double B1, double B2, double B3, double B5, double B6, double B7, double B9, double B12) {
        this.A = A;
        this.C = C;
        this.E = E;
        this.K = K;
        this.B1 = B1;
        this.B2 = B2;
        this.B3 = B3;
        this.B5 = B5;
        this.B6 = B6;
        this.B7 = B7;
        this.B9 = B9;
        this.B12 = B12;
    }

    /**
     * a getter for vitamin a.
     * @return  the amount of vitamin a a person should have per day in micrograms.
     */
    public double getA() {
        return this.A;
    }
    
    /**
     * a getter for vitamin c.
     * @return  the amount of vitamin c a person should have per day in micrograms.
     */
    public double getC() {
        return this.C;
    }
    
    /**
     * a getter for vitamin e.
     * @return  the amount of vitamin e a person should have per day in micrograms.
     */
    public double getE() {
        return this.E;
    }

    /**
     * a getter for vitamin k.
     * @return  the amount of vitamin k a person should have per day in micrograms.
     */
    public double getK() {
        return this.K;
    }

    /**
     * a getter for vitamin b1.
     * @return  the amount of vitamin b1 a person should have per day in micrograms.
     */
    public double getB1() {
        return this.B1;
    }

    /**
     * a getter for vitamin b2.
     * @return  the amount of vitamin b2 a person should have per day in micrograms.
     */
    public double getB2() {
        return this.B2;
    }

    /**
     * a getter for vitamin b3.
     * @return  the amount of vitamin b3 a person should have per day in micrograms.
     */
    public double getB3() {
        return this.B3;
    }

    /**
     * a getter for vitamin B5.
     * @return  the amount of vitamin B5 a person should have per day in micrograms.
     */
    public double getB5() {
        return this.B5;
    }

    /**
     * a getter for vitamin b6.
     * @return  the amount of vitamin b6 a person should have per day in micrograms.
     */
    public double getB6() {
        return this.B6;
    }

    /**
     * a getter for vitamin b7.
     * @return  the amount of vitamin b7 a person should have per day in micrograms.
     */
    public double getB7() {
        return this.B7;
    }

    /**
     * a getter for vitamin b9.
     * @return  the amount of vitamin b9 a person should have per day in micrograms.
     */
    public double getB9() {
        return this.B9;
    }

    /**
     * a getter for vitamin b12.
     * @return  the amount of vitamin b12 a person should have per day in micrograms.
     */
    public double getB12() {
        return this.B12;
    }

    /**
     * a setter for the amount of vitamin a a person should have in a day in micrograms.
     * @param A the amount of vitamin a a person should have per day in micrograms to be sety.
     */
    public void setA(double A) {
        this.A = A;
    }

    /**
     * a setter for the amount of vitamin c a person should have in a day in micrograms.
     * @param C the amount of vitamin c a person should have per day in micrograms to be sety.
     */
    public void setC(double C) {
        this.C = C;
    }

    /**
     * a setter for the amount of vitamin E a person should have in a day in micrograms.
     * @param E the amount of vitamin E a person should have per day in micrograms to be sety.
     */
    public void setE(double E) {
        this.E = E;
    }

    /**
     * a setter for the amount of vitamin K a person should have in a day in micrograms.
     * @param K the amount of vitamin K a person should have per day in micrograms to be sety.
     */
    public void setK(double K) {
        this.K = K;
    }

    /**
     * a setter for the amount of vitamin b1 a person should have in a day in micrograms.
     * @param B1 the amount of vitamin b1 a person should have per day in micrograms to be sety.
     */
    public void setB1(double B1) {
        this.B1 = B1;
    }

    /**
     * a setter for the amount of vitamin b2 a person should have in a day in micrograms.
     * @param B2 the amount of vitamin b2 a person should have per day in micrograms to be sety.
     */
    public void setB2(double B2) {
        this.B2 = B2;
    }

    /**
     * a setter for the amount of vitamin b3 a person should have in a day in micrograms.
     * @param B3 the amount of vitamin b3 a person should have per day in micrograms to be sety.
     */
    public void setB3(double B3) {
        this.B3 = B3;
    }

    /**
     * a setter for the amount of vitamin b5 a person should have in a day in micrograms.
     * @param B5 the amount of vitamin b5 a person should have per day in micrograms to be sety.
     */
    public void setB5(double B5) {
        this.B5 = B5;
    }

    /**
     * a setter for the amount of vitamin b6 a person should have in a day in micrograms.
     * @param B6 the amount of vitamin b6 a person should have per day in micrograms to be sety.
     */
    public void setB6(double B6) {
        this.B6 = B6;
    }

    /**
     * a setter for the amount of vitamin b7 a person should have in a day in micrograms.
     * @param B7 the amount of vitamin b7 a person should have per day in micrograms to be sety.
     */
    public void setB7(double B7) {
        this.B7 = B7;
    }

    /**
     * a setter for the amount of vitamin b9 a person should have in a day in micrograms.
     * @param B9 the amount of vitamin b9 a person should have per day in micrograms to be sety.
     */
    public void setB9(double B9) {
        this.B9 = B9;
    }

    /**
     * a setter for the amount of vitamin b12 a person should have in a day in micrograms.
     * @param B12 the amount of vitamin b12 a person should have per day in micrograms to be sety.
     */
    public void setB12(double B12) {
        this.B12 = B12;
    }

    /**
     * a tostring method which returns all the vitamins of this object.
     * @return a string which has every vitamin in this object in a list
     */
    public String toString() {

        String str = "";
        
        str += "A: " + this.A + " micrograms\n";
        
        str += "C: " + this.C + " milligrams\n";
        
        str += "E: " + this.E + " milligrams\n";
        
        str += "K: " + this.K + " micrograms\n";
        
        str += "B1: " + this.B1 + " milligrams\n";
        
        str += "B2: " + this.B2 + " milligrams\n";
        
        str += "B3: " + this.B3 + " milligrams\n";

        str += "B5: " + this.B5 + " milligrams\n";

        str += "B6: " + this.B6 + " milligrams\n";

        str += "B7: " + this.B7 + " micrograms\n";
    
        str += "B9: " + this.B9 + " micrograms\n";
        
        str += "B12: " + this.B12 + " micrograms\n";
        
        return str;

    }
}
