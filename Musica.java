//generics
public class Musica implements Comparable <Musica> {
    private String titulo;
    private int avalicao;

    public Musica(){}

    public Musica(String titulo){
        this(titulo,0);
    }

    public Musica(String titulo, int avaliacao){
        setTitulo(titulo);
        setAvaliacao(avaliacao);
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAvaliacao(int avaliacao){
        this.avalicao = avaliacao;
    }

    public int getAvalicao() {
        return avalicao;
    }

    @Override
    public String toString(){
        return String.format(
            "(%s, %d)\n",
            titulo,
            avalicao
        );
    }
    @Override
    public int compareTo(Musica o) {
        return this.titulo.compareTo(o.titulo);
    }
    //m1 ="(one, 5)"
    //m2 ="(sunflower, 7)"
    //m1.compareTo(m2)
}