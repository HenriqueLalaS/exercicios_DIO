package exercicio05.enviarMensagem;

public class WhatsApp implements MensagemMarketing{

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando Mensagem...");
        System.out.println(mensagem);
    }

}
