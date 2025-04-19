package exercicio03.Banco;

public class Banco {

    private double saldo;
    private double chequeValorTotal;
    private double chequeValorReal;
    private double divida;

    public void criarConta(double depositoInicial){
        this.saldo = depositoInicial;
        if(depositoInicial>500)
            chequeValorTotal = depositoInicial*0.5;
        else
            chequeValorTotal = 50;

        System.out.println("conta criada com Sucesso!!!");
        chequeValorReal=chequeValorTotal;
    }

    public void consultarSaldo(){
        System.out.println("seu saldo é de: "+(saldo+chequeValorReal));
        System.out.println("ele é composto por: "+saldo+"R$ de saldo e: "+chequeValorReal+"R$ de cheque especial");
    }

    public void consultarChequeEspecial(){
        System.out.println("O valor do seu cheque especial: R$"+ (chequeValorReal));
    }
    public void DepositarDinheiro(double valor){
        if(divida==0){
            saldo+=valor;
            System.out.println("operação realizada com sucesso!!"+
                               "\nSeu saldo agora é dê: R$"+saldo);
        }else if(valor<divida){
            divida-=valor;
            System.out.println("Valor insuficiente para quitação da divída");
            System.out.println("valor da divida pós-abatimento R$"+divida);
            System.out.println("Operação realizada com sucesso");

        }else{
            valor-=divida;
            saldo+=valor;
            System.out.println("operação realizada com sucesso!!"+
                               "\nSeu saldo agora é dê: R$"+saldo);
        }
    }

    public void SacarDinheiro(double valor){
        if(valor>saldo){//teste de mesa saldo = 100 e cheque especial no valor de 40 reais, valor de 120;
            if(valor>(saldo+chequeValorReal)){
                System.out.println("Você não tem saldo suficiente");
                System.out.println("saldo: R$"+getSaldo()
                                    +"\ncheque especial R$"+getChequeValorReal());
            }
            else{//teste de mesa
                valor-=saldo;//o valor agora é de 20
                saldo = 0;
                chequeValorReal=chequeValorReal-valor;
                divida=chequeValorTotal-chequeValorReal;
                System.out.println("operação realizada com sucesso"+
                                    "\nvocê utilizou seu cheque Especial no valor de R$"+valor);
            }  
        }
        else{
            saldo = saldo-valor;
            System.out.println("operação realizada com sucesso");
        }

    }
    public void PagarBoleto(double valor){
        SacarDinheiro(valor);
    }

    public void VerificarUsoChequeEspecial(){
        if(chequeValorReal==chequeValorTotal)
            System.out.println("cheque não utilizado! valor total do Cheque R$"+chequeValorTotal);
        else{
            System.out.println("Cheque utilizado! Valor disponível"+chequeValorReal);
        }
    }

    public double getChequeValorReal() {
        return chequeValorReal;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getChequeValorTotal() {
        return chequeValorTotal;
    }
}
