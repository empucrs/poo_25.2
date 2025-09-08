public class Retangulo implements AreaCalculavel{
    private double base, altura;
    public Retangulo(double b, double a) {
        this.altura=a;
        this.base=b;
    }
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
    public double calculaArea(){
        return this.base*this.altura;
    }    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName());
        sb.append("{base: "+this.getBase()+"; altura:"+this.getAltura()+"}");
        return sb.toString();
    }

}