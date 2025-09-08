public class ContaCorrente extends Conta implements Tributavel{
    public double calculaTributos() {
        return 0.01*obterSaldo();
    }    
}
