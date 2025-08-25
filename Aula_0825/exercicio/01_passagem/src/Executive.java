import java.util.Arrays;

public class Executive extends Passagem{

    private int milhas;

    public Executive(String cpf, String nome, double valorDaPassagem) {
        super(cpf, nome, valorDaPassagem);
        milhas = (int)(valorDaPassagem*0.1);
    }

    public int getMilhas(){
        return milhas;
    }

    @Override
    public double custoBagagem(int qtdeBagagens, int[] pesoBagabens) {
        if((qtdeBagagens==pesoBagabens.length)&&
           (qtdeBagagens>2)){

            int [] bagagensExecutive;
            Arrays.sort(pesoBagabens);
            bagagensExecutive=Arrays.copyOfRange(pesoBagabens, 0, pesoBagabens.length-2);
            super.custoBagagem(bagagensExecutive.length, bagagensExecutive);
           }
        else
            setCustoBagagem(0);

        return getCustoBagagem();
        
    }

    protected void setMilhas(double valor){
        this.milhas=(int)(valor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");        
        sb.append(super.toString());
        sb.append("  milhas:"+getMilhas()+"\n");
        sb.append("}\n");
        return sb.toString();

    }
    
}
