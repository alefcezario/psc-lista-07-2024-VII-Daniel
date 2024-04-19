import java.util.ArrayList;
import java.util.Scanner;

public class PerguntasSobreCrime2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> contadorSim = new ArrayList<>();
        ArrayList<String> perguntas = new ArrayList<>();

        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");
    

        System.out.println("Responda as perguntas abaixo com (S) para sim ou (N) para não: ");

        char resposta;

        for (String pergunta : perguntas) {

            do {
                System.out.println(pergunta);
                resposta = Character.toLowerCase(scanner.next().charAt(0));

                if (resposta == 's') {
                    contadorSim.add(resposta);

                } else if (resposta == 'n') {
                    continue; 

                } else {
                    System.out.println("Digite apenas S para sim ou N para não!");
                }
            } while (!(resposta == 's' || resposta == 'n'));
        }
      

        if (contadorSim.size() == 2) {
            System.out.println("Suspeita");
        } else if (contadorSim.size() == 3 || contadorSim.size() == 4){
            System.out.println("Cumplice");
        }else if (contadorSim.size() == 5) {
            System.out.println("Assassino");
        }else {
            System.out.println("Inocente");
        }


        scanner.close();
    }
}
