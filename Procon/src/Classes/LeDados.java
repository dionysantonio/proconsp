/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
    import java.io.DataInputStream;
    import java.io.BufferedInputStream;
    import java.io.FileInputStream;
    import java.io.IOException;
    import java.util.ArrayList;
    import java.util.Collection;
    import java.util.List;
    import java.net.URL;
    import java.net.MalformedURLException;




/**
 *
 * @author d119322
 */
public class LeDados {
   

    private DataInputStream dis;
    private ArrayList<Procon> dadosProcon;
    private ArrayList<Cidade> dadosCidade;

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
