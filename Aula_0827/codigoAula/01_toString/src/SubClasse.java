public class SubClasse extends SuperClasse{

    @Override
    public String toString() {        
        return "Eu sou a sub classe";
    }

    public void soMeu(){
        System.out.println("Este é método definido na subclasse");
    }
}