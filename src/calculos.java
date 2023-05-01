public class calculos  {

    private double a;
    private double b;
    public double soma (){
        return a+b;
    }
    public double sub (){
        return a-b;
    }
    public double mult (){
        return a*b;
    }
    public double div (){
        return (a/b);
    }
    public double rad (){
        return Math.sqrt(a);
    }

    public calculos(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public calculos(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
