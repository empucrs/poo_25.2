public class OutraSubClasse extends SuperClasse{

    @Override
    public String toString() {
        return "Este é o método da outra subclasse";
    }

    public void outroMetodo(){
        System.out.println("Um método definido na outra classe");
    }
    
}