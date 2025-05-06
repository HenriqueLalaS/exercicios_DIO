import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Digite a sua altura: ");
        double altura = ent.nextDouble();
        System.out.print("Digite o seu peso: ");
        double peso = ent.nextDouble();
        double IMC = peso/(altura*altura);
        System.out.println(IMC);
        if(IMC<= 18.5){
            System.out.println("Abaixo do peso");
        }
        else if(IMC<25){
            System.out.println("Peso ideal");
        }
        else if(IMC<30){
            System.out.println("Levemente acima do peso");
        }
        else if(IMC<35){
            System.out.println("Obesidade Grau I");
        }
        else if(IMC<40){
            System.out.println("Obesidade Grau II (Severa)");
        }
        else{
            System.out.println("Obesidade Grau II (Mórbida)");
        }
        ent.close();
    }
}
