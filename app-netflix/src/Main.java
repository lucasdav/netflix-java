public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Netflix");
        System.out.println("Filme: Top Gun: Maverick");

        //tipos de variavel primitivo
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento" + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //media calculada pelas 3 notas de 3 usuarios
        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura e ação
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);


        //exemplo de conversao/casting de dados
        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}