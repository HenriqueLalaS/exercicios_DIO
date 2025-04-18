import java.util.Scanner;

public class SequenciaEntre {
    public static void main(String[] args) {
        int x = 0;
        Scanner ent = new Scanner(System.in);
        do {
            System.out.println("Digite dois numeros, sendo o segundo maior que o primeiro");
            System.out.print("numero 1: ");
            int num1 = ent.nextInt();
            System.out.print("numero 2: ");
            int num2 = ent.nextInt();
            if(num2>num1){
                System.out.println("Escolha entre Impar (1) ou Par (2)");
                System.out.print(": ");
                int impPar = ent.nextInt();

                for (int i = num2; i >= num1; i--) {
                    if (impPar == 1 && i % 2 != 0) {
                        System.out.print(i + " ");
                    } else if (impPar == 2 && i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                }
                x++;
                System.out.println("fim do programa");
            }else{
                System.out.println("você escolheu uma opção invalida!\ntente novamente\n\n");
            }
        } while (x==0);
        ent.close();
    }
}
