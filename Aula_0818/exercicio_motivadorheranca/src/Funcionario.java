public class Funcionario{
    public static final double LIM_ISENCAO_IR = 2000;
    private String matricula;
    private String nome;
    private double salarioBruto;
    private String categoria;
    
    public String getCategoria() {
        return this.categoria;
    }

    public Funcionario(String matricula, String nome, double salarioBruto){
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.categoria = "Funcionario";
    }

    public Funcionario(String matricula, String nome, double salarioBruto, String categoria){
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.categoria = "Funcionario RISCO";
    }

	public String getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
    
    public double getINSS(){
        return salarioBruto*0.1;
    }

    public double getImpRenda(){

        double salarioBase=this.salarioBruto;
        if(this.getCategoria().equals("Funcionario RISCO")){
            double beneficio = (this.salarioBruto - this.getINSS()) * 0.25;
            salarioBase += beneficio;
        }

        if (salarioBase <= LIM_ISENCAO_IR){
            return 0.0;
        }else{
            double aux = salarioBase - LIM_ISENCAO_IR;
            double ir = aux * 0.2;
            return ir;
        }
    }

    public double getSalarioLiquido(){

        //Salario Liq do funcionario normal
        if(this.getCategoria().equals("Funcionario"))
            return salarioBruto - getINSS() - getImpRenda();
        else{
            double beneficio = (salarioBruto - getINSS()) * 0.25;
            return salarioBruto - getINSS() - getImpRenda() + beneficio;

        }
    }

    private double getBeneficio(){
        if(this.getCategoria().equals("Funcionario RISCO")){
            return (this.getSalarioBruto() - this.getINSS())*0.25;
        }
        return 0;
    }

    public String toString() {
        String aux = "";
        aux += "Categoria: "+this.getCategoria()+"\n";
        aux += "Matricula: "+this.getMatricula()+"\n";
        aux += "Nome: "+this.getNome()+"\n";
        aux += "Salario bruto: "+this.getSalarioBruto()+"\n";
        aux += "(-) INSS: "+this.getINSS()+"\n";
        aux += "(-) IR: "+this.getImpRenda()+"\n";
        aux += "(+) Beneficio: "+this.getBeneficio()+"\n";
        aux += "Salario liquido: "+this.getSalarioLiquido()+"\n";
        aux += "----------";
        return aux;    
    }
}