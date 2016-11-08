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
import java.lang.ArrayIndexOutOfBoundsException;



/**
 *
 * @author d119322
 */
public class LeDados {
   

    private DataInputStream dis;
    private ArrayList<Procon> dadosProcon;
    private ArrayList<Cidade> dadosCidade;
    private ArrayList<Regiao> dadosRegiao;


    
    void readProcon(String caminho){
        
        
        ArrayList<Procon> dados = new ArrayList<>();
        
     try{
           URL url = new URL(caminho);
           CSVReader reader = new CSVReader(new InputStreamReader(url.openStream()),';');
          String [] nextLine;
          while ((nextLine = reader.readNext()) != null) {
            // nextLine[] is an array of values from the line
            Procon dadosP= new Procon(nextLine);
            dados.add(dadosP);
            }
     
      }catch(IOException u){
          System.out.println("Leitura interrompida ou fim da instrucao");
      }catch(ArrayIndexOutOfBoundsException u){
          dadosProcon = dados;
      } 
        
    //"C:/Users/d119322/Documents/teste.txt"
    }
    
    void readCidade(String caminho){
             
         ArrayList<Cidade> dados = new ArrayList<>();
        
     try{
          CSVReader reader = new CSVReader(new FileReader(caminho),',');
          String [] nextLine;
          while ((nextLine = reader.readNext()) != null) {
            // nextLine[] is an array of values from the line
            Cidade dadosC= new Cidade(nextLine);
            dados.add(dadosC);
            }
     
      }catch(IOException u){
          System.out.println("Leitura interrompida ou fim da instrucao"); 
      }
        dadosCidade = dados;
    //"C:/Users/d119322/Documents/teste.txt"
    }
    
        void readRegiao(String caminho){
             
         ArrayList<Regiao> dados = new ArrayList<>();
        
     try{
          CSVReader reader = new CSVReader(new FileReader(caminho),',');
          String [] nextLine;
          while ((nextLine = reader.readNext()) != null) {
            // nextLine[] is an array of values from the line
            Regiao dadosR= new Regiao(nextLine);
            dados.add(dadosR);
            }
     
      }catch(IOException u){
          System.out.println("Leitura interrompida ou fim da instrucao"); 
      }
        dadosRegiao = dados;
    //"C:/Users/d119322/Documents/teste.txt"
    }
    
     public ArrayList<Procon> getProcon(){
        return dadosProcon;// Agora retorna ArrayList
    } 
     public ArrayList<Cidade> getCidade(){
        return dadosCidade;// Agora retorna ArrayList
    } 
     public ArrayList<Regiao> getRegiao(){
        return dadosRegiao;// Agora retorna ArrayList
    } 
}
