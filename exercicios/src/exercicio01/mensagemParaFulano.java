import java.time.LocalDate;
import java.time.Period;

public class mensagemParaFulano {
    public static void main(String[] args) {
        String nome = "Fulano";
        LocalDate anoNasc = LocalDate.of(2000, 07, 24);
        LocalDate anoAtual = LocalDate.now();
        Period idade = Period.between(anoNasc, anoAtual);
        System.out.println("Olá "+nome+" Você tem "+idade.getYears()+" anos");

    }
}
