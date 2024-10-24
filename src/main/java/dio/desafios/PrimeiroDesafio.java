package dio.desafios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class PrimeiroDesafio {
    public static String calcularCredito(String[] linhas) {
        int n = Integer.parseInt(linhas[0]);
        double totalGasto = 0;
        for(int i = 1;i <= n;i++){
            String[] informacoesLinha = linhas[i].split(",");
            double minutos = Double.parseDouble(informacoesLinha[0]);
            double custo = Double.parseDouble(informacoesLinha[2]);
            totalGasto += (minutos*custo);
        }
        NumberFormat formato = new DecimalFormat("#0.00");
        return formato.format(totalGasto).replace(",",".");
    }
}
