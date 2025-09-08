public class Quadrado implements AreaCalculavel{
    private double lado;
    public double getLado() {
        return lado;
    }
    public Quadrado(double valor) {
        this.lado=valor;
    }
    public double calculaArea(){
        return this.lado*this.lado;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName());
        sb.append("{lado: "+this.getLado()+"}");
        return sb.toString();
    }
}
