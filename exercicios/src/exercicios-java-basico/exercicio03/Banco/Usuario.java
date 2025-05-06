package exercicio03.Banco;

public class Usuario {
    public static void main(String[] args) {
        Banco conta = new Banco();

        conta.criarConta(1000);
        conta.DepositarDinheiro(500);
        conta.consultarSaldo();
        conta.PagarBoleto(2000);
        conta.consultarSaldo();
        conta.DepositarDinheiro(400);
        conta.DepositarDinheiro(500);
    }
}
