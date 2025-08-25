public class Economy extends Passagem{

    public Economy() {
        super("nro invalido", "nome invalido", -1);
    }

    public Economy(String cpf, String nome, double valorDaPassagem){
        super(cpf, nome, valorDaPassagem);
    }

    @Override
    public double custoBagagem(int qtdeBagagens, int[] pesoBagabens) {        
        super.custoBagagem(qtdeBagagens, pesoBagabens);
        if(getCustoBagagem()!=0)
            setCustoBagagem(getCustoBagagem()+(qtdeBagagens*10.0));
        return getCustoBagagem();        

    }
    
}
