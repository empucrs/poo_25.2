import java.util.Arrays;
import java.util.HashSet;

public class Questao01 {

    public static void main(String[] args) {

        // Item 1
        HashSet<Integer> conjunto = new HashSet<>(Arrays.asList(1,2,3));
        System.out.print("1. 1 pertence ao conjunto "+conjunto+"? ");
        System.out.println( conjunto.contains(1) ? "Sim": "Não");

        // Item 2
        HashSet<Integer> conjuntoVazio = new HashSet<>();
        System.out.print("2. Vazio está contido no conjunto "+conjunto+"? ");
        System.out.println( conjunto.containsAll(conjuntoVazio) ? "Sim": "Não");

        // Item 3
        HashSet<Integer> conjuntoTemporario = new HashSet<>(Arrays.asList(1,2));        
        conjunto.add(4);
        //conjunto.addAll(Arrays.asList(1,2,3,4));
        System.out.print("3. "+conjuntoTemporario+" NÃO está contido no conjunto "+conjunto+"? ");
        // Contextualizado com relação a operação. Se está contido, então a resposta é negativa.
        System.out.println( conjunto.containsAll(conjuntoTemporario) ? "Não, ele está contido": "Sim, ele não está contido");

        // Item 4
        conjunto.clear();
        conjunto.addAll(Arrays.asList(1,2,3,4));
        conjuntoTemporario.clear();
        conjuntoTemporario.addAll(Arrays.asList(1,2,5));
        System.out.print("4. "+conjunto+"-"+conjuntoTemporario+"=");
        conjunto.removeAll(conjuntoTemporario);
        System.out.println(conjunto);



        
    }
    
}