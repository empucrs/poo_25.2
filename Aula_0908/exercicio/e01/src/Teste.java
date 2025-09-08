import java.util.Random;

public class Teste {

    public static void main(String[] args) {

        if(args.length!=1){
            System.out.println("É preciso passar um inteiro como argumento");
            System.out.println("  java Teste valor, onde");
            System.out.println("  valor representa o tamanho do vetor de objetos que implementam AreaCalculavel");
            System.exit(0);
        }

        int tamanho = Integer.parseInt(args[0]);

        AreaCalculavel [] vetor = new AreaCalculavel [tamanho];
        Random r = new Random();

        for(int i=0; i<tamanho; i++){
            switch (r.nextInt()%3) {
                // quadrado
                case 0:                    
                    vetor[i] = new Quadrado(r.nextDouble()* 30);
                    break;            
                // retangulo
                case 1:
                    vetor[i] = new Retangulo(r.nextDouble()* 30, r.nextDouble()* 30);
                    break;            
                // circulo
                default:
                    vetor[i] = new Circulo(r.nextDouble()* 30);
                    break;
            }
        }

        for(AreaCalculavel ac: vetor){
            System.out.println(ac);
            System.out.println("  area: "+ac.calculaArea());
        }

    }
    
}
