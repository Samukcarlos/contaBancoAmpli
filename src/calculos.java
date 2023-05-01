public class calculos {
    private double soma1;
    private double soma2;
    private double sub1;
    private double sub2;
    private double mult1;
    private double mult2;
    private double div1;
    private double div2;
    private double rad1;

    public double soma (){
        return soma1+soma2;
    }
    public double sub (){
        return sub1-sub2;
    }
    public double mult (){
        return mult1*mult2;
    }
    public double div (){
        return (div1/div2);
    }
    public double rad (){
        return Math.sqrt(rad1);
    }

    public calculos(double soma1, double soma2, double sub1, double sub2, double mult1, double mult2, double div1, double div2, double rad1) {
        this.soma1 = soma1;
        this.soma2 = soma2;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.mult1 = mult1;
        this.mult2 = mult2;
        this.div1 = div1;
        this.div2 = div2;
        this.rad1 = rad1;
    }

    public calculos(double soma1, double soma2) {
        this.soma1 = soma1;
        this.soma2 = soma2;
    }

    public calculos(double rad1) {
        this.rad1 = rad1;
    }

    public calculos() {

    }

    public double getSoma1() {
        return soma1;
    }

    public void setSoma1(double soma1) {
        this.soma1 = soma1;
    }

    public double getSoma2() {
        return soma2;
    }

    public void setSoma2(double soma2) {
        this.soma2 = soma2;
    }

    public double getSub1() {
        return sub1;
    }

    public void setSub1(double sub1) {
        this.sub1 = sub1;
    }

    public double getSub2() {
        return sub2;
    }

    public void setSub2(double sub2) {
        this.sub2 = sub2;
    }

    public double getMult1() {
        return mult1;
    }

    public void setMult1(double mult1) {
        this.mult1 = mult1;
    }

    public double getMult2() {
        return mult2;
    }

    public void setMult2(double mult2) {
        this.mult2 = mult2;
    }

    public double getDiv1() {
        return div1;
    }

    public void setDiv1(double div1) {
        this.div1 = div1;
    }

    public double getDiv2() {
        return div2;
    }

    public void setDiv2(double div2) {
        this.div2 = div2;
    }

    public double getRad1() {
        return rad1;
    }

    public void setRad1(double rad1) {
        this.rad1 = rad1;
    }


}
