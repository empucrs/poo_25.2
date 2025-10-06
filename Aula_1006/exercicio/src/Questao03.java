import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Questao03 {

    public static void main(String[] args) {
        if(args.length<1){
            System.out.println("Informe o caminho do arquivo a ser consumido");
            System.exit(0);
        }        

        Path filePath = Paths.get(args[0]);

        HashMap<String, Integer> conjuntoDePalavras = new HashMap<>();

		try (BufferedReader reader = 
                Files.newBufferedReader(filePath, 
                                        Charset.forName("utf8"))) {
            String palavra;
            int linha=0;
            while((palavra=reader.readLine())!=null){

                palavra=palavra.toUpperCase().trim();

                if(conjuntoDePalavras.keySet().contains(palavra)){
                    int ocorrencias=conjuntoDePalavras.get(palavra);
                    conjuntoDePalavras.put(palavra, ocorrencias+1);
                }
                else{
                    conjuntoDePalavras.put(palavra, 1);
                }

                // Alternativa usando operador ternario
                /*
                conjuntoDePalavras.put(palavra, 
                                       (
                                        (conjuntoDePalavras.keySet().contains(palavra))
                                         ?(conjuntoDePalavras.get(palavra)+1)
                                         :1
                                       )
                                    );
                */

            }                
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ArrayList<String> listaDePalavras = new ArrayList<>(conjuntoDePalavras.keySet().size());
        listaDePalavras.addAll(conjuntoDePalavras.keySet());
        listaDePalavras.sort(null);                

        System.out.println("O número total de palavras distintas é "+listaDePalavras.size());
        for(String word: listaDePalavras)
            System.out.println(word+": "+conjuntoDePalavras.get(word));

        System.out.println("Fim do programa");

    }
    
}
