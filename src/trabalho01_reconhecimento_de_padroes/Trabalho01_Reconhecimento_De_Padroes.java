/*Entrega de trabalho TADS - Turma B
Nós, 
Dalila Di Lazzaro,
João Pedro Santos Costa
Nome completo 3
declaramos que
todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos à equipe e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.*/
package trabalho01_reconhecimento_de_padroes;

import java.io.BufferedReader;
import java.io.FileReader;


public class Trabalho01_Reconhecimento_De_Padroes {

   public static void main(String[] args) throws Exception{

        float [][] matriz = LerArquivo("matriz.txt");   
     
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i] [j] + " ");
            }
            
        }
        
        System.out.println();

    }

    public static float[][] funcaoReconhecimentoPadroes(float[][] matriz) {
        return null;
    }

     public static float[][] LerArquivo(String Arquivo) throws Exception
    {
        FileReader arquivoGravado = new FileReader(Arquivo);
        
        BufferedReader ler = new BufferedReader(arquivoGravado);
        
        String linha1 = ler.readLine();
        String linha2 = ler.readLine();
        
        ler.close();
        
        double linhas = Double.parseDouble(linha1);
        double colunas = Double.parseDouble(linha2); 
        
        double[][] m = new double[linhas][colunas];
        
        String[] dados = linha1.split(" ");
        
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
               // m[i][j]= Float.parseFloat(dados[i][j]);
            }
            
        }
        
        return m;
    }

}
