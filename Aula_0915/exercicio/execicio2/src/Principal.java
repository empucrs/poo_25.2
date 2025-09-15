import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temperatura=0;
        int opcao;

        do{
            System.out.println("Escolha o tipo de conversão");
            System.out.println("  [0] Sair do programa ");
            System.out.println("  [1] de Celsius para Fahrenheit ");
            System.out.println("  [2] de Fahrenheit para Celsius ");
            opcao=Integer.parseInt(sc.nextLine());
            switch (opcao) {
                case 1:
                    System.out.println("Convertendo de C para F");
                    break;                    
                case 2:                    
                    System.out.println("Convertendo de F para C");
                    break;
                case 0:                    
                    System.out.println("Solicitado o fim do programa");
                    break;            
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    opcao=-1;
                    break;
            }
            if(opcao==0) break;
            else if(opcao==-1) continue;

            System.out.println("Informe a temperatura");
            temperatura=Double.parseDouble(sc.nextLine());
            double conversao=0;

            try {
                if(opcao==1) conversao = Utils.toFahrenheit(temperatura);
                else conversao=Utils.toCelsius(temperatura);
                System.out.println("O resultado da conversão de ");
                System.out.println("  "+temperatura+((opcao==1)?"C":"F")+"º");
                System.out.println("foi");
                System.out.println("  "+conversao+((opcao==1)?"F":"C")+"º");            
            } catch (Exception e) {
                System.out.println("[Exceção] Ocorreu uma exceção durante a conversão");
                System.out.println("\n\n\n"+e.getMessage());
            }

        }
        while(temperatura > -10000);

        System.out.println("Fim do programa");

        sc.close();
    }
    
}
