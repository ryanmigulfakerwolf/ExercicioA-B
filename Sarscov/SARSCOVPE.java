
package atividades;


public class SARSCOVPE {
    public static void main(String[] Args){
        
        SarcovPe sarcov = new SarcovPe();
        
        System.out.println("Total de pessoas contaminadas: "+sarcov.total(sarcov.soma));
        System.out.println("Média de pessoas contaminadas: "+sarcov.media(sarcov.media, sarcov.soma));
        System.out.println("Quantidade de pessoas contaminadas na cidade com maior contaminação: "+sarcov.qtd(sarcov.qtdP));
        System.out.println("Número da cidade com maior quantidade de pessoas contaminadas: " +sarcov.vCit(sarcov.qtdP, sarcov.vCit));
        
        
    }
}
