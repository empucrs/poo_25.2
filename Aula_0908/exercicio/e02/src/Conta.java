public class Conta {
    private double saldo;
    public Conta() {
        this.saldo=0;
    }    
    public double obterSaldo(){
        return this.saldo;
    }
    public void depositar(double valor){
        if(valor>0)
            this.saldo+=valor;        
    }
    public double sacar(double valor){
        if(valor<=0)
            return 0;
        if(valor>saldo){
            double aux=this.saldo;
            saldo=0;
            return aux;
        }
        else{
            saldo-=valor;
            return valor;
        }
    }    

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName());
        sb.append("{saldo: R$"+this.obterSaldo()+"}");
        return sb.toString();
    }
}