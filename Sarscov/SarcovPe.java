
package atividades;

public class SarcovPe {
    
    int[] cidades = {0,1500,1350,1680,950,870}; 
    // Comecei com 0 pois o senhor queria que a maior cidade fosse a 3°, porem a contagem do array começa em 0. 
    // O valor da saida sem o 0 seria 2 e não 3 como o senhor pediu
    int soma;
    int media;
    int qtdP = Integer.MIN_VALUE;
    int vCit;
    int nCit;
    
    int total(int soma){
    for(int i:cidades){
        soma+=i;
        
    }
    return soma;
    }
    
    int media(int media, int soma){
    for(int i:cidades){
       soma+=i;
       media = soma/5;
      }
    return media;
    }
    int qtd(int qtdP){
    for (int i = 0; i < cidades.length; i++) {
    if (cidades[i] > qtdP) {
        qtdP = cidades[i];
       
    }
    }
    
    return qtdP;
    }
    int vCit(int qtdP, int vCit){
    for (int i = 0; i < cidades.length; i++) {
    if (cidades[i] > qtdP) {
        qtdP = cidades[i];
        vCit = i;
    }
    }
    
    return vCit;
    }
    
    
    
    
}
