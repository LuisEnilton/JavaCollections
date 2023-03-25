import java.io.FileWriter;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Map;
import java.util.Set;

public class MetodosPesquisar {
    public static String[] nomesPesquisa = {"Lisbon", "NASA", "Kyunghee", 
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
        public static void pesquisar(AbstractList<String> a) {
        long inicio = System.nanoTime();
        for (String s : nomesPesquisa) {
            a.contains(s);
        }
        long fim = System.nanoTime();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);
    }
    public static void pesquisar(Set<String> set) {
        long inicio = System.nanoTime();
        for (String s : nomesPesquisa) {
            set.contains(s);
        }
        long fim = System.nanoTime();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);
    }

    public static void pesquisar(Map<String,Integer> map) {
        long inicio = System.nanoTime();
        for (String s : nomesPesquisa) {
            map.get(s);
        }
        long fim = System.nanoTime();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);
    }
}
