public class SeguroDeVida implements Tributavel{
    private double valorSegurado;
    public SeguroDeVida(double valor) {
        this.valorSegurado=valor;
    }

    public double getValorSegurado() {
        return this.valorSegurado;
    }
    
    public double calculaTributos() {
        return 42;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName());
        sb.append("{valorSegurado: R$"+this.getValorSegurado()+"}");
        return sb.toString();
    }
    
}
