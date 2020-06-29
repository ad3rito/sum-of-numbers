import java.util.Scanner;

class CalculoSomaTotal {
    public static void main(String[] args){
        double num1,num2,num3,num4,num5,soma;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero 1 : ");
        num1 = entrada.nextDouble();

        System.out.println("Digite o numero 2 : ");
        num2 = entrada.nextDouble();

        System.out.println("Digite o numero 3 : ");
        num3 = entrada.nextDouble();

        System.out.println("Digite o numero 4 : ");
        num4 = entrada.nextDouble();

        System.out.println("Digite o numero 5 : ");
        num5 = entrada.nextDouble();

        soma = (num1+num2+num3+num4+num5);
        System.out.println("A soma total e igual a " + soma); 

    }
}