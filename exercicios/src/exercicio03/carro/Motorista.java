package exercicio03.carro;

public class Motorista {
    public static void main(String[] args) {
        Carro carro = new Carro();

        // Tentando acelerar com o carro desligado
        carro.acelerar();

        // Ligando o carro
        carro.ligar();

        // Acelerando em ponto morto
        carro.acelerar();

        // Passando para a 1ª marcha
        carro.passarMarcha(true);
        System.out.println("Marcha atual: " + carro.getMarcha());

        // Acelerando até o carro pedir nova marcha
        carro.setVelocidade(19);
        carro.acelerar(); // 20 -> 21 -> reduz para 20 e pede marcha maior
        carro.acelerar();

        // Passando para a 2ª marcha
        carro.passarMarcha(true);
        System.out.println("Marcha atual: " + carro.getMarcha());

        // Acelerando um pouco na 2ª marcha
        carro.acelerar();
        carro.acelerar();

        // Tentando virar com velocidade baixa (ok)
        carro.virarCarro(true);  // Direita
        carro.virarCarro(false); // Esquerda

        // Setando velocidade alta para testar virar (forçando o caso)
        carro.setVelocidade(45);
        carro.virarCarro(true);  // Muito rápido

        // Desacelerando até parar
        while (carro.getVelocidade() > 0) {
            carro.desacelerar();
        }

        // Reduzindo a marcha até ponto morto
        carro.passarMarcha(false); // 1 -> 0
        System.out.println("Marcha atual: " + carro.getMarcha());

        // Desligando o carro
        carro.desligar();

        // Tentando acelerar novamente com o carro desligado
        carro.acelerar();
    }
}
