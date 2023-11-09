import java.util.ArrayList;
import java.util.Collections;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;

public class GerenciaPlaylist {
    public static void main(String[] args) {
        //generics:
        //List <Musica> musicas = new ArrayList <> ();
        //musicas.add(new Musica());
        //musicas.add(new Pessego());
        //Collections.sort(musicas);
        var musicas = new ArrayList<Musica>();
        String menu = "1-Adicionar\n2-Ver Musica\n3-Avaliar música\n4-Excluir música\n0-Sair";
        int op;
        do{
            op = parseInt(showInputDialog(menu));
            switch(op){
                case 1:{
                    //1.Pegar os dados da música
                    String titulo = showInputDialog("Digite o nome da faixa:\n");
                    //2.Contruir um objeto música
                    var musica = new Musica(titulo);
                    //3.Adicionar música na colecão com add
                    musicas.add(musica);
                    //4.Avisar o usuário que deu certo
                    showMessageDialog(null, "Concluido");
                    break;
                }
                case 2:{
                    var sb = new StringBuilder("");
                    Collections.sort(musicas); // in-place
                    //for each ou enhanced  for (C#: foreach)
                    for (Musica m : musicas) {
                        sb
                        .append(m)
                        .append("\n")
                        .append("******************************")
                        .append("\n");
                    }
                    /*refaça com for normal
                    for(int i = 0;i < musicas.size( ); i++){
                        sb.append(musicas.get(i + 1))
                        .append("\n")
                        .append("***************");
                    }*/
                    showMessageDialog(null,sb); //[t1, t2, t3]
                    break;
                }
                case 3:{
                    //Comparar por avavaliação
                    Collections.sort(musicas, new ComparadorPorTitulo());
                    var sb = new StringBuilder("");
                    for (Musica m : musicas) {
                        sb
                        .append(m)
                        .append("\n")
                        .append("******************************")
                        .append("\n");
                    }
                }
            }
        }while (op != 0);
        
    }
}
