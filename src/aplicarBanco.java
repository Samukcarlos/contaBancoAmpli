
public class aplicarBanco {
    private double a;
    private double b;

    public aplicarBanco() {
    }
    public double X (){
        return (a * b);
    }
    public double cdb (){
        return (((a * b)/12)*(0.1))*12;
    }
    public double totalCDB (){
        return aplicarBanco.this.cdb() + (a * b);

    }

    public double Y (){
        return (a * b);
    }
    public double lci (){
        return (((a * b)/12)*(0.08)*12);
    }
    public double totalLCI (){
        return aplicarBanco.this.lci() + (a * b);

    }

    public aplicarBanco(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public aplicarBanco(double a) {
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
