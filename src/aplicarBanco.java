
public class aplicarBanco {
    GerenciaBanco2 gerenciaBanco2;
     private Double invCDB;
     private Integer meses;
     private Double invLCI;
    private Integer meses2;

    public aplicarBanco() {
    }

    public aplicarBanco(Double invCDB, Integer meses, Double invLCI, Integer meses2) {
        this.invCDB = invCDB;
        this.meses = meses;
        this.invLCI = invLCI;
        this.meses2 = meses2;
    }


    public aplicarBanco(Double invLCI, Integer meses2) {
        this.invLCI = invLCI;
        this.meses2 = meses2;
    }

    public Double getInvLCI() {
        return invLCI;
    }

    public Integer getMeses2() {
        return meses2;
    }

    public Double getInvCDB() {
        return invCDB;
    }

    public void setInvCDB(Double invCDB) {
        this.invCDB = invCDB;
    }

    public Integer getMeses() {
        return meses;
    }

    public void setMeses(Integer meses) {
        this.meses = meses;
    }

    public void setInvLCI(Double invLCI) {
        this.invLCI = invLCI;
    }

    public void setMeses2(Integer meses2) {

        this.meses2 = meses2;
    }

    public double X (){
        return (invCDB * meses);
    }
    public double cdb (){
        return (((invCDB * meses)/12)*(0.1));
    }
    public double totalCDB (){
        return aplicarBanco.this.cdb() + (invCDB * meses);

    }

    public double Y (){
        return (invLCI * meses2);
    }
    public double lci (){
        return (((invLCI * meses2)/12)*(0.08));
    }
    public double totalLCI (){
        return aplicarBanco.this.lci() + (invLCI * meses2);

    }
}
