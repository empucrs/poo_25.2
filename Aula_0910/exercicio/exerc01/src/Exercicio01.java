/*
Crie um programa, o qual deverá ter um método chamado
getInt. O método deve solicitar que o usuário entre com um valor
inteiro. Capture este valor, e caso ele não seja um valor inteiro
(e.g. string/double), lance uma exceção do tipo
IllegalArgumentException; Caso o valor esteja ok, retorne o
valor inteiro.
 */

import java.util.Scanner;

public class Exercicio01 {

    private Scanner sc;

    public Exercicio01() {
        sc = new Scanner(System.in);
    }
 
    public int getInt(){
        int valor=0;
        System.out.print("Informe um número inteiro: ");
        String resposta = sc.nextLine();

        //alternativa 01 - Exceção específica sendo tratada
        /*try {
            valor=Integer.parseInt(resposta);
        } catch (NumberFormatExpection e) {
            System.out.println("Exceção: O valor informado não é um inteiro válido");
            System.out.println("msg: "+e.getMessage());
            System.out.println("stackTrace: "+e.getStackTrace());
        }
        */

        //alternativa 02 - Exceção geral sendo tratada
        /*try {
            valor=Integer.parseInt(resposta);
        } catch (Exception e) {
            System.out.println("Exceção: O valor informado não é um inteiro válido");
            System.out.println("msg: "+e.getMessage());
            System.out.println("stackTrace: "+e.getStackTrace());
        }
        */

        //alternativa 03 - Exceção específica errada sendo tratada
        /*try {
            valor=Integer.parseInt(resposta);
        } catch (NullPointerException e) {
            System.out.println("Exceção: O valor informado não é um inteiro válido");
            System.out.println("msg: "+e.getMessage());
            System.out.println("stackTrace: "+e.getStackTrace());
        }
        */

        // Demais alternativas onde o tratamento não é feito neste método
        valor=Integer.parseInt(resposta);
        return valor;
    }

    public static void main(String[] args) {
        Exercicio01 e = new Exercicio01();

        // condução da exceção alternativas 1 e 2
        // condução da exceção alternativa 3, onde o programa será abortado
        /*
        System.out.println(e.getInt());
        */

        // Abordagem onde o tratamento é realizado no método "chamador"
        try {
            System.out.println(e.getInt());
            System.out.println("Programa finalizado com sucesso");            
        } catch (Exception ex) {
            System.out.println("Ocorreu uma exceção");
        }

        // print final para comprovar que o programa chegou ao final
        //  ou que foi abortado antes.
        System.out.println("Programa finalizado com sucesso");
    }
    
 }