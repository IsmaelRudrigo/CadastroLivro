public class Livro {

    private String nome;
    private String autor;
    private String codigo;
    private double price;

    public Livro(String nome, String autor, String codigo, double price) {
        this.nome = nome;
        this.autor = autor;
        this.codigo = codigo;
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrice() {
        return price;
    }
}
