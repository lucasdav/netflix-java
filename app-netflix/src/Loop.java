import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leituraTeclado = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o Filme ");
            nota = leituraTeclado.nextDouble();
            //abaixo abreviacao de/ou mesmo que: mediaAvaliacao = mediaAvaliacao + nota;
            mediaAvaliacao += nota;
        }

        System.out.println("Média de avaliações " + mediaAvaliacao/3);

    }
}
