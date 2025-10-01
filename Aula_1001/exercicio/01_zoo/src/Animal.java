public class Animal {

    private String identificacao;
    private double peso;

    public Animal(double p, String id) {
        this.peso=p;
        this.identificacao=id;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {        
        return this.getClass().getName()+" -> {id: "+this.identificacao+"; peso: "+this.peso;
    }
    
    
}