public class DiferencaDeIdade {
    public static void main(String[] args) {
        int idade1 = 16;
        int idade2 = 25;
        int diffIdade = idade1-idade2;
        /*int diffIdade = Math.abs(idade1 - idade2); 
         * tornaria desnecessario o if, uma vez que "Math.abs" retorna o valor positivo da operação
        */
        if(diffIdade<0){
            diffIdade = diffIdade*-1;
        }

        System.out.println("a diferença de idade dos dois é: "+diffIdade);
}
}
