import java.util.ArrayList;
import java.util.Scanner;

public class TemperaturaMedia1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> temperaturaMedia = new ArrayList<>();
        String[] mesesAno = { "1 - Janeiro", "2 - Fevereiro", "3 - Março", "4 - Abril", "5 - Maio", "6 - Junho",
                            "7 - Julho", "8 - Agosto", "9 - Setembro", "10 - Outubro", "11 - Novembro", "12 - DEzembro"};

        System.out.println("Por favor, insira a temperatura média dos meses abaixo: ");

        for (int i = 0; i < mesesAno.length; i++) {
        System.out.println("Digite a temperatura do mês " + mesesAno[i] + " : ");
        double entradaTemperatura = scanner.nextDouble();
        temperaturaMedia.add(entradaTemperatura);
        }

        double somaTemperaturas = 0;

        for (double cadaTemperatura : temperaturaMedia) {
            somaTemperaturas += cadaTemperatura;
        }

        double mediaAnual = somaTemperaturas / mesesAno.length;

        System.out.println("A média anual de temperaturas é: " + mediaAnual);
        System.out.println("As temperaturas abaixo estão acima da média anual: ");

        for (int i = 0; i < mesesAno.length; i++) {
            if (temperaturaMedia.get(i) > mediaAnual){
                System.out.println("Mês " + mesesAno[i] + " " + temperaturaMedia.get(i) + " ºC");
            }
        }

        scanner.close();
}
}