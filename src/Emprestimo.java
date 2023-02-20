public class Emprestimo {
    

    public static double getTaxaDuasVezes() {
        return 0.3;
    }

    public static double getTaxaTresVezes() {
        return 0.45;
    }

    public static void calcular (double valor, int parcela) {
        
        if (parcela == 2) {

            double valorFinal = valor + (valor * getTaxaDuasVezes());

            System.out.println("Valor final de empréstimo para 2 parcelas: R$ " + valorFinal);
        }else if (parcela == 3) {

            double valorFinal = valor + (valor * getTaxaTresVezes());

            System.out.println("Valor final de empréstimo para 3 parcelas: R$ " + valorFinal);
        }else {

            System.out.println("Total de parcelas não permitido!");        
        }

    }

}


