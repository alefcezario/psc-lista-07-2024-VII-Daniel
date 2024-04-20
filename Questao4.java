import java.util.ArrayList;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> salariosVendedores = new ArrayList<>();


        System.out.println("Digite o salário de cada vendedor abaixo (Para parar digite -1 )");

        double salario = scanner.nextDouble();
        while (salario != -1) {

            salariosVendedores.add(salario);
            salario = scanner.nextDouble();
        }

       int[] contador = new int[9];
       
       for(double vendaBruta : salariosVendedores){

        salario = 200 + (0.09 * vendaBruta);

        if(salario >= 200 && salario <= 299){
            contador[0]++;

        }else if(salario >= 300 && salario <= 399){
            contador[1]++;
        
        }else if(salario >= 400 && salario <= 499){
            contador[2]++;
        
        }else if(salario >= 500 && salario <= 599){
            contador[3]++;
        
        }else if(salario >= 600 && salario <= 699){
            contador[4]++;
        
        }else if(salario >= 700 && salario <= 799){
            contador[5]++;
        
        }else if(salario >= 700 && salario <= 799){
            contador[6]++;
        
        }else if(salario >= 800 && salario <= 899){
            contador[7]++;
        
        }else if(salario >= 900 && salario <= 999){
            contador[8]++;
        
        }
    }

    System.out.println("A quantidade de vendedores em cada intervalo de salário é: ");

    for (int i = 0; i < contador.length; i++) {
        if (i < 8) {
            System.out.println("$" + (200 + (i * 100)) + " - $" + (299 + (i * 100)) + ": " + contador[i]);

        } else {
            System.out.println("$1000 em diante: " + contador[i]);
            
        }
    }

    scanner.close();
    }
}