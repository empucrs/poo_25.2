import java.util.HashSet;

public class Questao02 {

    public static void main(String[] args) {

        if(args.length<1){
            System.out.println("Informe um valor inteiro");
            System.exit(0);
        }

        int N = Integer.parseInt(args[0]);
        HashSet<Integer> conjunto = new HashSet<>();

        // passo 1 - Inserir todos nros de 2 até N
        for(int x=2; x<=N; x++)
            conjunto.add(x);

        // passo 2 - Remove todos os múltiplos quer tivermos
        int limite = (int) Math.sqrt(N);
        HashSet<Integer> tmp;
        for(int multiplo=2; multiplo<=limite; multiplo++){
            tmp=new HashSet<>();
            for(Integer aux: conjunto){
                if((aux!=multiplo)&&((aux%multiplo)==0))
                    tmp.add(aux);
            }
            conjunto.removeAll(tmp);
        }

        // passo 3 - Imprime o conjunto de primos
        System.out.println(conjunto);
        
    }
    
}
