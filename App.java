import java.util.*;
import java.util.LinkedList;
import java.util.Vector;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class App {
    public static String[] leituraArquivo(){
        
        try {
            FileReader fileReader = new FileReader("alunosED.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            ArrayList<String> nomes = new ArrayList<String>();
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                nomes.add(linha);
            }
            String[] vetorDeNomes = nomes.toArray(new String[0]);
            bufferedReader.close();
            return vetorDeNomes;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        //long inicio = System.currentTimeMillis();
        //long fim = System.currentTimeMillis();
        //long tempoDeExecucao = fim - inicio;
        Elemento e = new Elemento("Luis", 1);
        Vector<Elemento> lista = new Vector<Elemento>();
        lista.add(e);
        for (Elemento e1 : lista) {
            System.out.println(e1.nome); 
        }
        
}
}
