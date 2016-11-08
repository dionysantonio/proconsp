/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.ArrayIndexOutOfBoundsException;


/**
 *
 * @author d119322
 */

/*Deve-se checar a leitura dos dados, pois a classe LeDados está lendo apenas 1 linha, retornando ela e depois encerrando o arquivo.
*/

public class RecebeDado {
    
    private LeDados date = new LeDados();
    
    void RecebeDado(){
        
    }
    
    public ArrayList<Procon> procon(String caminho){
        
        date.readProcon(caminho);//define caminho para leitura de dados
        
        return date.getProcon();
    }

    public ArrayList<Cidade> cidade(String caminho){
        
        date.readCidade(caminho);//define caminho para leitura de dados
        
        return date.getCidade();
       
    }
    
    public ArrayList<Regiao> regiao(String caminho){
        
        date.readRegiao(caminho);//define caminho para leitura de dados
        
        return date.getRegiao();
       
    }
    
    public Procon searchProcon(ArrayList<Procon> lista, String parametro){
        
        Iterator i;
        Procon bProcon;// objeto para retorno
        
        i = lista.iterator();//define iterator para busca
        bProcon =(Procon) i.next();
        
        while (i.hasNext()){
            
            if(bProcon.getName().equals(parametro)){
                return bProcon;
            }else{
                bProcon =(Procon) i.next();
            }
     
        }
        return null;
    }

    public String[] searchCidade(ArrayList<Cidade> lista, String parametro){
    //Retorna a cidade por parametro de regiao
        String[] dados = new String[20];
        Iterator i;
        Cidade bCidade;// objeto para retorno
        int n = 0;
        
        i = lista.iterator();//define iterator para busca
        bCidade =(Cidade) i.next();
        
        while (i.hasNext()){
            try{
            if(bCidade.RetornarRegiao().equals(parametro)){
                dados[n] = bCidade.RetornarRegiao();
                System.out.println(bCidade.RetornarRegiao());
            }else{
                bCidade =(Cidade) i.next();
            }
            
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Oxi");
            }
            n++;
        }
        return dados;
    }
    
     public Cidade searchRegiao(ArrayList<Cidade> lista, String parametro){
    //Retorna a cidade por parametro de cidade
        
        Iterator i;
        Cidade bCidade;// objeto para retorno
        
        i = lista.iterator();//define iterator para busca
        bCidade =(Cidade) i.next();
        
        while (i.hasNext()){
            
            if(bCidade.RetornarNome().equals(parametro)){
                return bCidade;
            }else{
                bCidade =(Cidade) i.next();
            }
     
        }
        return null;
    }

      public void RetornarDadosP(ArrayList<Procon> proc,ArrayList<Cidade> lista, String parametro){
    //Retorna a cidade por parametro de regiao
        
        Iterator i;
        Cidade bCidade;
        Procon bProcon;// objeto para retorno
        
        i = lista.iterator();//define iterator para busca
        bCidade =(Cidade) i.next();
        
        while (i.hasNext()){
            
            if(bCidade.RetornarRegiao().equals(parametro)){
                bProcon =this.searchProcon(proc, bCidade.RetornarNome());
                System.out.println(bProcon.getName() + bProcon.getEnd());
            }else{
                bCidade =(Cidade) i.next();
            }
     
        }

    }
}
