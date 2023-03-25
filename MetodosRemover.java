import java.io.FileWriter;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Map;
import java.util.Set;

public class MetodosRemover {
    public static String[] nomesRemover = {"Lisbon", "NASA", "Kyunghee", 
        "Konkuk", "Sogang", "momentarily", "rubella", "vaccinations", 
        "government", "Authorities"};

    public static void escreverEstatisticas(Long tempo) {
        try (FileWriter writer = new FileWriter("tempo.txt",true)) {
            writer.write(tempo + " ");
            writer.close();
        }
        catch(IOException e) {
            System.out.println("Erro");
        }
    }

    public static void remover(AbstractList<String> list) {
        long inicio = System.nanoTime();
        for (String s : nomesRemover) {
            list.remove(s);
        }
        long fim = System.nanoTime();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);
    }
    
    public static void remover(Set<String> set) {
        long inicio = System.nanoTime();
        for (String s : nomesRemover) {
            set.remove(s);
        }
        long fim = System.nanoTime();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);
    }

    public static void remover(Map<String,Integer> map) {
        long inicio = System.nanoTime();
        for (String s : nomesRemover) {
            map.remove(s);
        }
        long fim = System.nanoTime();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);
    }

}