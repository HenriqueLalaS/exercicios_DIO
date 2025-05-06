package exercicio03.carro;

public class Carro {
    private boolean on_off;
    private int velocidade;
    private int marcha;

    public Carro(){
        on_off=false;
        velocidade=0;
        marcha=0;
    }

    public void ligar(){
        if(on_off==false){
            on_off=true;
            System.out.println("Carro ligado!");
        }
        else 
        System.out.println("O carro já está ligado!");
        
    }

    public void desligar(){
        if(on_off==true){
            on_off=false;
            System.out.println("Carro desligado!");
        }
        else 
        System.out.println("O carro já está desligado!");
        
    }
    
    public void acelerar(){
        if(on_off==false){
            System.out.println("O carro está delisgado");
        }
        switch (marcha) {
            case 0:
                System.out.println("O carro está em ponto morto, não acelere!");
                break;
            case 1:
                velocidade+=1;
                System.out.println("Acelerando... "+velocidade+"Km/h");
                if(velocidade>20){
                    velocidade-=1;
                    System.out.println("Carro pede uma marcha maior..."+velocidade+"Km/h");
                }
                break;
            case 2:
            velocidade+=1;
            System.out.println("Acelerando... "+velocidade+"Km/h");
                if(velocidade>41)
                    velocidade-=1;
                    System.out.println("Carro pede uma marcha maior..."+velocidade+"Km/h");
                break;
            case 3:
                velocidade+=1;
                System.out.println("Acelerando... "+velocidade+"Km/h");
                if(velocidade>61){
                    velocidade-=1;
                    System.out.println("Carro pede uma marcha maior..."+velocidade+"Km/h");
                }
                break;
            case 4:
                velocidade+=1;
                System.out.println("Acelerando... "+velocidade+"Km/h");
                if(velocidade>81){
                    velocidade-=1;
                    System.out.println("Carro pede uma marcha maior..."+velocidade+"Km/h");
                }
                break;
            case 5:
                velocidade+=1;
                System.out.println("Acelerando... "+velocidade+"Km/h");
                if(velocidade>101){
                    velocidade-=1;
                    System.out.println("Carro pede uma marcha maior..."+velocidade+"Km/h");
                }
                break;
        }
    }

    public void desacelerar(){
        if(velocidade==0){
            System.out.println("o carro está parado");
        }
        else{
            velocidade-=1;
            System.out.println("Desacelerando..."+velocidade);
        }
    }

    public void passarMarcha(boolean a){
        if(a==true){
            marcha+=1;
            if(marcha>5)
                marcha=5;
        }
        else{
            marcha-=1;
            if(marcha<0)
                marcha=0;
        }
    }
    public void virarCarro(boolean a){
        if(a){
            if(velocidade>40){
                System.out.println("O carro está muito rápido para mudar a direção");
            }
            System.out.println("Virando para a direita");
        }
        else{
            if(velocidade>40){
                System.out.println("O carro está muito rápido para mudar a direção");
            }
            System.out.println("Virando para a esquerda");
        }
    }

    public int getVelocidade() {
        return velocidade;
    }
    public int getMarcha() {
        return marcha;
    }

    public boolean getOn_Off(){
        return on_off;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
