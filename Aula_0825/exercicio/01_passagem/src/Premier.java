public class Premier extends Executive{

    public Premier(String cic, String nominho, double valorEmPilas) {
        super(cic, nominho, valorEmPilas);
        setMilhas(valorEmPilas*0.2);
    }

    @Override
    public double defineAssento(String assento) {
        super.defineAssento(assento);
        setCustoAssento(0);
        return getCustoAssento();
    }

    @Override
    public double custoBagagem(int qtdeBagagens, int[] pesoBagabens) {
        super.custoBagagem(qtdeBagagens, pesoBagabens);
        double valor=getCustoBagagem()/2;
        setCustoBagagem(valor);
        return valor;
    }

    
}