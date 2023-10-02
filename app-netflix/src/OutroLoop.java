import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leituraTeclado = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o Filme ou -1 para encerrar ");
            nota = leituraTeclado.nextDouble();
            //abaixo abreviacao de/ou mesmo que: mediaAvaliacao = mediaAvaliacao + nota;
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalNotas++;
            }
        }

        System.out.println("Média de avaliações " + mediaAvaliacao/totalNotas);
    }
}
