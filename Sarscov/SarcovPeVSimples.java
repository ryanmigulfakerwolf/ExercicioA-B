
package atividades;


public class SarcovPeVSimples {
    public static void main(String[] Args){
        
        int c1 = 1500, c2 = 1350, c3 = 1680, c4 = 950, c5 = 870;
        
        int total;
        int media;
        int maior=0;
        int ind =0; 
        
        total = c1+c2+c3+c4+c5;
        media = total/5;
        if(c1>c2 && c1>c3 && c1>c4 && c1>c5){
            maior = c1;
            ind =1;
        }else if(c2>c1 && c2>c3 && c2>c4 && c2>c5){
            maior = c2;
            ind =2;
        }else if(c3>c2 && c3>c1 && c3>c4 && c3>c5){
            maior = c3;
            ind =3;
        }else if(c4>c2 && c4>c3 && c4>c1 && c4>c5){
            maior = c4;
            ind =4;
        }else if(c5>c2 && c5>c3 && c5>c4 && c5>c1){
            maior = c5;
            ind =5;
        }
        System.out.println("Total de pessoas contaminadas: "+total);
        System.out.println("Média de pessoas contaminadas: "+media);
        System.out.println("Quantidade de pessoas contaminadas na cidade com maior contaminação: "+maior);
        System.out.println("Número da cidade com maior quantidade de pessoas contaminadas: " +ind);
        
        
        
        
        
        
        
        
    }
}
