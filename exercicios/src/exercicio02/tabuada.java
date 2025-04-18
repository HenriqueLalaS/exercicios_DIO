import java.util.Scanner;
public class tabuada {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.err.println("Escolha um numero para realizar a tabuada dele");
        int num = ent.nextInt();

        for(int i = 0; i<10;i++){
            System.out.println((i+1)+" x "+num+" = "+((i+1)*num) );
        }
        ent.close();
    }
}
