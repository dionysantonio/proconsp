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




/**
 *
 * @author d119322
 */
public class LeDados {
   

    private DataInputStream dis;
    private ArrayList<Procon> dadosProcon;

    LeDados(String caminho, ArrayList<Procon> dados){
             
        
        
        try{
            dis = new DataInputStream(new BufferedInputStream(new FileInputStream(caminho)));
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
    
    public ArrayList<Procon> getProcon(){
        dadosProcon = new ArrayList<>();
        return dadosProcon;// Agora retorna umacoleção de String[]
    }   
}
