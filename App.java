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
            FileReader fileReader = new FileReader("palavras.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            ArrayList<String> nomes = new ArrayList<String>();
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                nomes.add(linha);
            }
            System.out.println(nomes.size());
            String[] vetorDeNomes = nomes.toArray(new String[0]);
            bufferedReader.close();
            return vetorDeNomes;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    private static void InserirVector(String[] nomes) {
        long inicio = System.currentTimeMillis();
        Vector<Elemento> vector = new Vector<Elemento>();
        for (int i = 0; i < nomes.length; i++) {
            Elemento e = new Elemento(nomes[i], i);
            vector.add(e);
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
    
    }
    private static void InserirArrayList(String[] nomes) {
        long inicio = System.currentTimeMillis();
        ArrayList<Elemento> array = new ArrayList<Elemento>();
        for (int i = 0; i < nomes.length; i++) {
            Elemento e = new Elemento(nomes[i], i);
            array.add(e);
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
    
    }
    private static void InserirLinkedList(String[] nomes) {
        long inicio = System.currentTimeMillis();
        LinkedList<Elemento> lista= new LinkedList<Elemento>();
        for (int i = 0; i < nomes.length; i++) {
            Elemento e = new Elemento(nomes[i], i);
            lista.add(e);
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
    
    }
    
    public static void main(String[] args) {
        //long inicio = System.currentTimeMillis();
        //long fim = System.currentTimeMillis();
        //long tempoDeExecucao = fim - inicio;
        String[] nomes = leituraArquivo();
        //InserirVector(nomes);
        //InserirArrayList(nomes);
        InserirLinkedList(nomes);
}
    
}

    

    
