
import java.util.*;
import java.util.LinkedList;
import java.util.Vector;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class App {
    public static String[] nomesPesquisa = {"Lisbon", "NASA", "Kyunghee", 
        "Konkuk", "Sogang", "momentarily", "rubella", "vaccinations", 
        "government", "Authorities"};

    public static String[] leituraArquivo(){
        
        try {
            FileReader fileReader = new FileReader("arquivos/palavras.txt");
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

    public static void escreverEstatisticas(Long tempo) {
        try (FileWriter writer = new FileWriter("tempo.txt",true)) {
                writer.write(tempo + " ");
            writer.close();
        }
        catch(IOException e) {
            System.out.println("Erro");
    }
    }
    private static void pesquisar(AbstractList<String> a) {
        long inicio = System.currentTimeMillis();
        for (String s : nomesPesquisa) {
            a.contains(s);
        }
        
        
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        //escreverEstatisticas(tempoDeExecucao);
    }
    private static void inserirVector(String[] nomes) {
        Vector<String> vector = new Vector<String>();
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < nomes.length; i++) {
            vector.add(nomes[i]);
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);
        pesquisar(vector);
    }
    private static void inserirLinkedList(String[] nomes) {
        LinkedList<String> lista= new LinkedList<String>();
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < nomes.length; i++) {
            lista.add(nomes[i]);
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);
        pesquisar(lista); 
    }
    private static void inserirArrayList(String[] nomes) {
        ArrayList<Elemento> lista = new ArrayList<Elemento>();
        lista.contains(nomes)
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < nomes.length; i++) {
            Elemento e = new Elemento(nomes[i], i);
            lista.add(e);
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);
        
    }
    
    private static void inserirHashSet(String[] nomes) {
        HashSet<Elemento> lista= new HashSet<Elemento>();
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < nomes.length; i++) {
            Elemento e = new Elemento(nomes[i], i);
            lista.add(e);
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);  
    }
    private static void inserirLinkedHashSet(String[] nomes) {
        LinkedHashSet<Elemento> lista = new LinkedHashSet<Elemento>();
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < nomes.length; i++) {
            Elemento e = new Elemento(nomes[i], i);
            lista.add(e);
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);  
    }
    private static void inserirTreeSet(String[] nomes) {
        TreeSet<Elemento> lista = new TreeSet<Elemento>();
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < nomes.length; i++) {
            Elemento e = new Elemento(nomes[i], i);
            lista.add(e);
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);  
    }
    private static void inserirHashMap(String[] nomes) {
        HashMap<String,Integer>  lista = new HashMap<String,Integer>();
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < nomes.length; i++) {
            lista.put(nomes[i], i);
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);  
    }
    private static void inserirLinkedHashMap(String[] nomes) {
        LinkedHashMap<String,Integer> lista = new LinkedHashMap<String,Integer>();
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < nomes.length; i++) {
            lista.put(nomes[i], i);
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);  
    }
    private static void inserirTreeMap(String[] nomes) {
        TreeMap<String,Integer> lista = new TreeMap<String,Integer>();
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < nomes.length; i++) {
            lista.put(nomes[i], i);
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);  
    }
    
    public static void main(String[] args) {
        //long inicio = System.currentTimeMillis();
        //long fim = System.currentTimeMillis();
        //long tempoDeExecucao = fim - inicio;
        String[] nomes = leituraArquivo();
        //inserirVector(nomes);
        inserirLinkedList(nomes);
        //inserirArrayList(nomes);
        //inserirHashSet(nomes);
        //inserirLinkedHashSet(nomes);
        //inserirTreeSet(nomes);
        //inserirHashMap(nomes);
        //inserirLinkedHashMap(nomes);
        //inserirTreeMap(nomes);
}
    
}

    

    
