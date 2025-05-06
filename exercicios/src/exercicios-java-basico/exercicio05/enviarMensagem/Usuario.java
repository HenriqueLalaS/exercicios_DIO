package exercicio05.enviarMensagem;

import java.util.Scanner;

public class Usuario {  
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite a mensagem que deseja enviar: ");
        String mensagem = ent.nextLine();

        System.out.println("Para qual serviço deseja enviar a mensagem?");
        System.out.println("(1)SMS");
        System.out.println("(2)E-mail");
        System.out.println("(3)WhatsApp");
        System.out.println("(4)Rede Social");
        int escolha = ent.nextInt();

        switch (escolha) {
            case 1:
                SMS sms = new SMS();
                sms.enviarMensagem(mensagem);
                break;
            case 2:
                Email email = new Email();
                email.enviarMensagem(mensagem);
                break;
            case 3:
                WhatsApp contato = new WhatsApp();
                contato.enviarMensagem(mensagem);
                break;
            case 4:
                RedeSocial redeSocial = new RedeSocial();
                redeSocial.enviarMensagem(mensagem);
                break;
            default:
                break;
        }

        ent.close();
    }

}
