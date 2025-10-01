public class Principal {
    public static void main(String[] args) {

        Zoo<Animal> meuZoo = new Zoo<>(10);

        meuZoo.adicionaAnimal(new Tigre(150, "tigre de bengala"));
        meuZoo.adicionaAnimal(new Mamifero(190, "Mamifero a ser decifrado"));
        meuZoo.adicionaAnimal(new Animal(1.005, "Nao tenho ideia de que animal é este"));
        meuZoo.adicionaAnimal(new Oscar(1.005, "Um peixe da amazonia"));

        meuZoo.listaAnimais();
        
        
        
    }
}