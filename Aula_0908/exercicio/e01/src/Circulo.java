public class Circulo implements AreaCalculavel{
    private double raio;
    public Circulo(double r) {
        this.raio=r;
    }
    public double getRaio() {
        return this.raio;
    }
    public double calculaArea(){
        return Math.PI*Math.pow(this.getRaio(),2);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName());
        sb.append("{raio: "+this.getRaio()+"}");
        return sb.toString();
    }

}
