import java.util.Random;

public class Oraculo {
    public String oraculo() {
        String numerosOraculo;

        // sorteia o número
        Random r = new Random();
        int rndNumero = r.nextInt(60) + 1;

        // declarar variaveis e array que vao ficar os numeros
        int i, j;
        int[] megasena = new int[6];

        // Percorrer array e verificar se já existe, senão irá adicionar no array 
        for (i = 0; i < megasena.length; i++) {         
          for (j = 0; j < megasena.length; j++) { 
            if(rndNumero == megasena[j] && j != i){
              rndNumero = r.nextInt(60) +1;
              } else {
                megasena[i] = rndNumero;
              }
          }
        }
        // Testa e coloca ordem crescente
        for (i=0; i<megasena.length; i++){
          for (j=i+1; j<megasena.length; j++) {
            if (megasena[i] > megasena[j]){
              rndNumero = megasena[i];
              megasena[i] = megasena[j];
              megasena[j] = rndNumero;
            }
          }
        }
        return numerosOraculo = (megasena[0]+" - "+ megasena[1]+" - "+megasena[2]+" - "+megasena[3]+" - "+megasena[4]+" - "+megasena[5]);
      } 
}