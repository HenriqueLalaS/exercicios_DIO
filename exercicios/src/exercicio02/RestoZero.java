import java.util.Scanner;

public class RestoZero {

    public static void main(String[] args) {
        
        int x = 0;
        Scanner ent = new Scanner(System.in);

        System.out.print("informe o numero inicial: ");
        int numInicial = ent.nextInt();
        do {
            System.out.print("informe um novo numero: ");
        int num = ent.nextInt();
            if(num<numInicial){
                System.out.println("Numero invalido! digite um numero maior que: "+numInicial);
            }
            else{
                if(num%numInicial==0){
                    System.out.println(num+" é divisivel por "+numInicial);
                }
                else{
                    System.out.println(num+" não é divísivel por "+ numInicial);
                    x++;
                }
            }
        
        } while (x==0);
        System.out.println("fim do programa");
        ent.close();
    }
}
