public class Elemento implements Comparable<Elemento>  {
    private String nome;
    private Integer n;
    public Elemento(String Nome,Integer n) {
        this.nome = Nome;
        this.n = n; 
    }
    public String getNome() {
        return nome;
    }
    public Integer getN() {
        return n;
    }
    @Override
    public int compareTo(Elemento e) {
        if (e.getNome().compareTo(this.getNome())<0){
            return -1;
        }
        if (e.getNome().compareTo(this.getNome())>0){
            return 1;
        }else{
          return 0;  
        }
    }
}
