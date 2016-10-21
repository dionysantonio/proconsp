/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
    import java.io.DataInputStream;
    import java.io.BufferedInputStream;
    import java.io.FileInputStream;
import java.io.FileReader;
    import java.io.IOException;
    import java.util.ArrayList;
    import java.util.Collection;
    import java.util.List;
    import java.net.URL;
    import java.io.InputStream;
import java.io.InputStreamReader;
    import java.net.MalformedURLException;
import com.opencsv.CSVReader;
import java.io.FileNotFoundException;



/**
 *
 * @author d119322
 */
public class LeDados {
   

    private DataInputStream dis;
    private ArrayList<Procon> dadosProcon;
    private ArrayList<Cidade> dadosCidade;


    public void le(){


        int i=0;
        
        try{
           URL url = new URL("http://www.justica.gov.br/dados-abertos/anexos/procons-municipais-sao-paulo-6.csv");
           CSVReader reader = new CSVReader(new InputStreamReader(url.openStream()),';');
          String [] nextLine;
          while ((nextLine = reader.readNext()) != null) {
            // nextLine[] is an array of values from the line
            while(i<nextLine.length){
              System.out.println(nextLine[i]);
              i++;
                }
                i=0;
            }
     
      }catch(IOException u){
          System.out.println("Leitura interrompida ou fim da instrucao");
      }
    }

    
    void readProcon(String caminho){
        
        URL url = null;
        ArrayList<Procon> dados = new ArrayList<>();
        
        try{
            url = new URL(caminho);
        }catch(MalformedURLException error){
            error.getMessage();
        }
                
        try{
            dis = new DataInputStream(new BufferedInputStream(url.openStream()));
            String linha;
                while ((linha = dis.readLine())!= null){//A primeira linha é o cabecalho. Este loop lê o arquivo todo
                    
                    String[] dados1;
                    
                    linha = dis.readLine();
                    dados1 = linha.split(";");//Separa os dados
                    Procon dadosP= new Procon(dados1);
                    dados.add(dadosP);
                    
                } 
            dis.close();
        }catch(IOException notFound){
            System.out.print(notFound.getMessage());        
        }
        dadosProcon = dados;
    //"C:/Users/d119322/Documents/teste.txt"
    }
    
    void readCidade(String caminho){
             
         ArrayList<Cidade> dados = new ArrayList<>();
        
        try{
            dis = new DataInputStream(new BufferedInputStream(new FileInputStream(caminho)));
            String linha;
                while ((linha = dis.readLine())!= null){//A primeira linha é o cabecalho. Este loop lê o arquivo todo
                    
                    String[] dados1;
                    
                    linha = dis.readLine();
                    dados1 = linha.split(";");//Separa os dados
                    Cidade dadosP= new Cidade(dados1);
                    dados.add(dadosP);
                    
                } 
            dis.close();
        }catch(IOException notFound){
            System.out.print(notFound.getMessage());        
        }
        dadosCidade = dados;
    //"C:/Users/d119322/Documents/teste.txt"
    }
    
     public ArrayList<Procon> getProcon(){
        return dadosProcon;// Agora retorna ArrayList
    } 
     public ArrayList<Cidade> getCidade(){
        return dadosCidade;// Agora retorna ArrayList
    } 
}
