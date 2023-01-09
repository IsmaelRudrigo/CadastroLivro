import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Cadastro cadastro = new Cadastro();

    public static void main(String[] args) {

        boolean sair = false;
        int opcao;

        menu();

        while(!sair){

            System.out.println("Escolha uma opção: (5 - Para ver opções)");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){

                case 0:
                    sair = true;
                    break;

                case 1:
                    cadastrar();
                    break;

                case 2:
                    deletar();
                    break;

                case 3:
                    alterar();
                    break;

                case 4:
                    cadastro.listar();
                    break;

                case 5:
                    menu();
                    break;
            }
        }


    }

    public static void cadastrar(){

        System.out.println("Título: ");
        String titulo = sc.nextLine();

        System.out.println("Autor: ");
        String autor = sc.nextLine();

        System.out.println("Código: ");
        String codigo = sc.nextLine();

        System.out.println("Preço: ");
        double preco = sc.nextDouble();
        sc.nextLine();

        Livro livro = new Livro(titulo, autor, codigo, preco);
        cadastro.cadastrar(livro);
    }

    public static void deletar(){

        System.out.println("Título: ");
        String titulo = sc.nextLine();

        cadastro.deletar(titulo);
    }

    public static void alterar(){

        System.out.println("Titulo do livro a ser alterado: ");
        String livroAnterior = sc.nextLine();

        System.out.println("Título: ");
        String titulo = sc.nextLine();

        System.out.println("Autor: ");
        String autor = sc.nextLine();

        System.out.println("Código: ");
        String codigo = sc.nextLine();

        System.out.println("Preço: ");
        double preco = sc.nextDouble();

        Livro livro = new Livro(titulo, autor, codigo,preco);

        cadastro.alterar(livroAnterior, livro);
    }
    public static void menu(){

        System.out.println("Pressione: \n" +
                "0 - Para sair\n" +
                "1 - Para cadastrar livro\n" +
                "2 - Para deletar livro\n" +
                "3 - Para alterar livro\n" +
                "4 - Para listar livros");
    }
}