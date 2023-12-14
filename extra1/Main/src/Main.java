
public class Main {

    public static void main(String[] args) {

        System.out.println("\nAntes:\n");
        Pessoa p1 = new Pessoa("Alice", "123.456.789-10", 20);
        p1.mostrarDetalhes();

        Livro l1 = new Livro("Diario de uma Ansiosa","Beth Evans",2021,33.9);
        l1.mostrarDetalhes();

        System.out.println("\nDepois:\n");

        p1.aniversario();
        l1.alterarPreco(204.5);

        p1.mostrarDetalhes();
        l1.mostrarDetalhes();
    }
}