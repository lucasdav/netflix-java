import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leituraTeclado = new Scanner(System.in);
        System.out.println("Digite seu filme favorito");
        String filme = leituraTeclado.nextLine();

        System.out.println("Qual o ano de lançamento");
        int anoDeLancamento = leituraTeclado.nextInt();

        System.out.println("Diga sua avaliação para o Filme ");
        double avaliacao = leituraTeclado.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
