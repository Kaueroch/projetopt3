import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //fazer gerador de numeros aleatorios
    //Lista de jogos,seu preços e se sao antigos ou nao(perguntar o ano de lançamento do jogo
    //Calculadora
    public static void main(String[] args) {
        //o valor retornado pelo método não está sendo armazenado ou utilizado de alguma forma.
        // Se você quiser usar o número gerado, você pode atribuir o resultado a uma variável.
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lnumeros = new ArrayList<>();
        Random rnd = new Random();
        System.out.println("Escolha um desses!");
        System.out.println("1-gerador de numero aleatório");
        System.out.println("2-Lista de jogos");
        System.out.println("3-Calculadora");

        int escolha = scan.nextInt();
        switch (escolha){
            case 1:
            System.out.println("Quantos numeros voce quer sortear?");
            int nsorteado = scan.nextInt();
            for(int i = 0; i < nsorteado; i++){
                int n1sorteado = rnd.nextInt(100);
                lnumeros.add(n1sorteado);
                //aprender a usar esse add tambem!
                // Ele é muito útil para quando for fazer esse tipo de programa de adicionar algo!
            }
            System.out.println(lnumeros);
            //depois fazer uma função para perguntar se quer sortear novamente!
          Scanner s = new Scanner(System.in);
          System.out.println("Se quiser continuar, digite 1! senao, clique em 2!");
          String escolha2 = s.nextLine();
          if (escolha2.equals("1")){
              Escolha2();
          }else{
              System.out.println("Até mais,javeiro!!");
              break;
          }
         break;
            case 2: //lista de jogos, codigo grande
        }
    }
    public static void Escolha2(){
        //codigo para mostrar os numeroes exibidos!
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Quantos numeros voce quer sortear?");
        int nsorteado = sc.nextInt();
        for(int i = 0; i < nsorteado; i++) {
            int n1sorteado = ran.nextInt(100);
            numeros.add(n1sorteado);
        }
        System.out.println(numeros);
        //decisao para ir ou ficar
        Scanner s = new Scanner(System.in);
        System.out.println("Se quiser continuar, digite 1! senao, clique em 2!");
        String escolha2 = s.nextLine();
        if (escolha2.equals("1")){
            Escolha2();
        }else{
            System.out.println("Até mais,javeiro!!");
        }
        }
        public static void Listadejogos(){
           //nome do jogo,seu preço e se sao antigos ou nao(perguntar o ano de lançamento do jogo
            System.out.println("Lista de jogos!!!");
            System.out.println("Nome do jogo:");
            System.out.println("Qual o preço");
            System.out.println("Sua data de m"); //é qiue ser um esóap

        }
}