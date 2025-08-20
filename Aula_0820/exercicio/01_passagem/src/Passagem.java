public class Passagem {

    private String cpf, nome, assento;
    private double custoPassagem;
    private double custoBagagem;

    public Passagem(String cpf, String nome, double custoPassagem) {
        this.cpf=cpf;
        this.nome=nome;
        this.custoPassagem=custoPassagem;
    }

    public double defineAssento(String assento){
        this.assento=assento;
        if(this.assento != null) return 5.0;
        else return 0;
    }

    public double custoBagagem(int qtdeBagagens, int[] pesoBagabens){

        if(qtdeBagagens>pesoBagabens.length){
            System.out.println("A qtde de bagagens não é equivalente a o tamanho do vetor de bagagens");
            return 0;
        }

        double custo=0;
        for(int i=0; i<pesoBagabens.length; i++)
            custo+=(pesoBagabens[i]*0.5);

        this.custoBagagem+=custo;

        return custo;

    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getAssento() {
        return assento;
    }

    public double getCustoPassagem() {
        return custoPassagem;
    }
}