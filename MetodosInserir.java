import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

private static void inserirVector(String[] nomes) {
        Vector<String> vector = new Vector<String>();
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < nomes.length; i++) {
            vector.add(nomes[i]);
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        //escreverEstatisticas(tempoDeExecucao);
        //MetodosPesquisar.pesquisar(vector);
        MetodosRemover.remover(vector);
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
        //escreverEstatisticas(tempoDeExecucao);
        //MetodosPesquisar.pesquisar(lista);
        MetodosRemover.remover(lista); 
    }

    private static void inserirArrayList(String[] nomes) {
        ArrayList<String> lista = new ArrayList<String>();
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < nomes.length; i++) {
            lista.add(nomes[i]);
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        //MetodosPesquisar.pesquisar(lista);
        MetodosRemover.remover(lista);
        //escreverEstatisticas(tempoDeExecucao);
        
    }
    
    private static void inserirHashSet(String[] nomes) {
        HashSet<String> lista= new HashSet<String>();
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < nomes.length; i++) {
            lista.add(nomes[i]);
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        //escreverEstatisticas(tempoDeExecucao);
        //MetodosPesquisar.pesquisar(lista);
        MetodosRemover.remover(lista);  
    }

    private static void inserirLinkedHashSet(String[] nomes) {
        LinkedHashSet<String> lista = new LinkedHashSet<String>();
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < nomes.length; i++) {
            lista.add(nomes[i]);
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        //MetodosPesquisar.pesquisar(lista);
        MetodosRemover.remover(lista);  
        //escreverEstatisticas(tempoDeExecucao);
    }

    private static void inserirTreeSet(String[] nomes) {
        TreeSet<String> lista = new TreeSet<String>();
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < nomes.length; i++) {
            lista.add(nomes[i]);
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        //MetodosPesquisar.pesquisar(lista);
        MetodosRemover.remover(lista);
        //escreverEstatisticas(tempoDeExecucao);  
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
        //MetodosPesquisar.pesquisar(lista);
        MetodosRemover.remover(lista);
        //escreverEstatisticas(tempoDeExecucao);  
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
        //MetodosPesquisar.pesquisar(lista);
        MetodosRemover.remover(lista);
        //escreverEstatisticas(tempoDeExecucao);  
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
        //MetodosPesquisar.pesquisar(lista);
        MetodosRemover.remover(lista);
        //escreverEstatisticas(tempoDeExecucao);  
    }