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
      

/**
 *
 * @author d119322
 */
public class LeDados {
   

    private DataInputStream dis;
    private String[] dados;


    LeDados(String caminho){
        try{
            dis = new DataInputStream(new BufferedInputStream(new FileInputStream(caminho)));
            String linha;
                while ((linha = dis.readLine())!= null){//A primeira linha é o cabecalho. Este loop lê o arquivo todo
                    linha = dis.readLine();
                    dados = linha.split(";");//Separa os dados
                } 
            dis.close();
        }catch(IOException notFound){
            System.out.print(notFound.getMessage());        
        }
    //"C:/Users/d119322/Documents/teste.txt"
    }
    
    public String[] get(){
        return dados;// Neste primeiro momento está retornando a ultima linha, é preciso modificar.
    }   
}
