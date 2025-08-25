public class Passagem {

    private String cpf, nome, assento;
    private double custoPassagem;
    private double custoBagagem;
    private double custoAssento;

    public Passagem(String cpf, String nome, double custoPassagem) {
        this.cpf=cpf;
        this.nome=nome;
        this.custoPassagem=custoPassagem;
    }

    public double defineAssento(String assento){
        this.assento=assento;
        if(this.assento != null) custoAssento=5.0;
        else custoAssento=0;
        return custoAssento;
    }

    protected double getCustoAssento(){
        return this.custoAssento;
    }

    protected void setCustoAssento(double valor){
        this.custoAssento=valor;
    }

    public double custoBagagem(int qtdeBagagens, int[] pesoBagabens){

        if(qtdeBagagens!=pesoBagabens.length){
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

    protected double getCustoBagagem(){
        return custoBagagem;
    }

    protected void setCustoBagagem(double valor){
        custoBagagem=valor;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("  nome: "+this.nome+"\n");
        sb.append("  cpf: " +this.cpf+"\n");
        sb.append("  assento: "+getCustoAssento()+"\n");
        sb.append("  bagagem: "+this.custoBagagem+"\n");
        sb.append("  passagem: "+this.custoPassagem+"\n");
        sb.append("  total: "+(this.custoPassagem+this.custoBagagem+getCustoAssento())+"\n");
        sb.append("}"+"\n");
        return sb.toString();
    }
}