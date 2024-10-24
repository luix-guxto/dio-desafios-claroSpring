package dio.desafios;

public class SegundoDesafio {
    public static String calcularCustoCombo(String[] linhasEntrada) {
        String[] produtos = linhasEntrada[0].split(",");
        String[] descontos = linhasEntrada[1].split(",");
        double totalCusto = 0;
        int totalContratados = 0;
        for(int i = 0;i < 3; i++){
            int valorProduto = Integer.parseInt(produtos[i]);
            if(valorProduto>0){
                totalCusto+=valorProduto;
                totalContratados+=1;
            }
        }
        if(totalContratados>0){
            double desconto = (1d/100d)*Double.parseDouble(descontos[totalContratados-1]);
            totalCusto *= (1d - desconto);
            if(totalContratados == 3){
                totalCusto -= 20;
            }
        }
        return String.format("%.2f",totalCusto).replace(",",".");
    }
}
