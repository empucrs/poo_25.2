import java.util.Scanner;

public class Principal {

    private static Scanner sc;

    public static void main(String[] args) {

        sc=new Scanner(System.in);
        int opcao;
        do{
            opcao=menu();
            switch (opcao) {
                case 0:                    
                    System.out.println("Programa sendo finalizado");
                    break;            
                case 1:                    
                    System.out.println("incluindo um gato");
                    break;            
                case 2:                    
                    System.out.println("incluindo um cão");
                    break;            
                case 3:                    
                    System.out.println("contabilizando");
                    break;            
                default:
                    System.out.println("Situacao desconhecida");
                    break;
            }            
        }while (opcao!=0);
        sc.close();        
    }

    public static int menu(){
        while(true){
            System.out.flush();
            System.out.println("Escolha uma das opcoes");
            System.out.println("  1 - Incluir um gato");
            System.out.println("  2 - Incluir um cão");
            System.out.println("  3 - Contabilizar o nro/tipo de animais");
            System.out.println("  0 - Sair");
            int opcao=Integer.parseInt(sc.nextLine());

            if((opcao >3)||(opcao<0)){
                System.out.println("Opção invalida. Tente novamente");
                sc.nextLine();
            }
            else{
                return opcao;
            }                
        }
    }

    
}