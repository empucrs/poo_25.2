public class Zoo <E extends Mamifero>{

    private int nAnimais;
    private Object[] listaDeAnimais;

    public Zoo(int capacidadeMaximaDeAnimais) {
        this.nAnimais=0;
        listaDeAnimais = new Object[capacidadeMaximaDeAnimais];
    }

    public boolean adicionaAnimal(E animalzito){
        if(nAnimais<listaDeAnimais.length){
            listaDeAnimais[nAnimais]=animalzito;
            nAnimais++;
            return true;
        }
        return false;
    }

    public void listaAnimais(){
        int i=0;
        for(Object animal: listaDeAnimais){
            System.out.println("Animal "+i+": "+animal);
            i++;
        }
    }
    
}
