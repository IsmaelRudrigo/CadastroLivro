import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private List<Livro> livros = new ArrayList<>();

    public Cadastro() {
        this.livros = new ArrayList<>();
    }

    public boolean cadastrar(Livro livro){
        if(encontrarLivro(livro.getNome()) == null){
            this.livros.add(livro);
            return true;
        }else{
            System.out.println("Livro com título " + livro.getNome() + " já se encontra " +
                    "na base de dados" );
            return false;
        }
    }

    public boolean deletar(String titulo){
        if(encontrarLivro(titulo) != null){
            for(int i=0; i<this.livros.size(); i++){
                Livro livro = this.livros.get(i);
                if(livro.getNome().equals(titulo)){
                    this.livros.remove(livro);
                    System.out.println("Livro com título " + livro.getNome() + " foi removido da " +
                            "base de dados");
                    return true;
                }
            }
        }else{
            System.out.println("Livro com título " + titulo + " não foi encontrado " +
                    "na base de dados");
            return false;
        }
        return false;
    }

    public boolean alterar(String livroAntigo, Livro livroNovo){
        if(encontrarLivro(livroAntigo) != null){
            for(int i=0; i<this.livros.size(); i++){
                Livro livro = this.livros.get(i);
                if(livro.getNome().equals(livroAntigo)){
                    int index = i;
                    this.livros.set(i, livroNovo);
                    System.out.println("Livro com título " + livroAntigo +
                            " foi alterado para livro com título " + livroNovo.getNome());
                    return true;
                }
            }
        }else{
            System.out.println("Livro com título " + livroAntigo + " não foi encontrado na base de dados");
            return false;
        }
        return false;
    }

    public void listar(){

        for(int i=0; i<this.livros.size(); i++){
            System.out.println("############################################");
            System.out.println((i+1) + " - Título: " + livros.get(i).getNome());
            System.out.println("Autor: " + livros.get(i).getAutor());
            System.out.println("Código: " + livros.get(i).getCodigo());
            System.out.println("Preço: " + livros.get(i).getPrice());
            System.out.println("############################################");
        }
    }
    private Livro encontrarLivro(String nome){
        for(int i=0; i<this.livros.size(); i++){
            Livro livro = this.livros.get(i);
            if(nome.equals(livro.getNome())){
                return livro;
            }
        }
        return null;
    }
}
