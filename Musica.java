public class Musica {
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
}