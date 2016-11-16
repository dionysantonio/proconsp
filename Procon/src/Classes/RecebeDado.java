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
    
    public Procon searchProcon(ArrayList<Procon> lista, String parametro){//Retornar Procon Por busca
        
        Iterator<Procon> i;
        Procon bProcon;// objeto para retorno
        String aux;
        
        i = lista.iterator();//define iterator para buscar
        bProcon =(Procon) i.next();
        
        
        while (i.hasNext()){
            
            try{
                aux = bProcon.getOrgao();
            if( aux.equals(parametro)){
                return bProcon;
            }else{
                bProcon =  i.next();
            }
            
            }catch(ArrayIndexOutOfBoundsException e){
                bProcon =  i.next();
                //System.out.println(bCidade.RetornarRegiao());
            }
            
        }
        return bProcon;
    }

    public String[] searchCidade(ArrayList<Cidade> lista, String parametro){// retornar nome da regiao pela cidade
    //Retorna a cidade por parametro de regiao
        String[] dados = new String[20];
        Iterator<Cidade> i;
        Cidade bCidade;// objeto para retorno
        int n = 0;
        String aux;
        
        i = lista.iterator();//define iterator para buscar
        bCidade =i.next();
        
        
        while (i.hasNext()){
            
            try{
                aux = bCidade.RetornarNome();
            if( aux.equals(parametro)){
                dados[n] = bCidade.RetornarRegiao();
                n++;
                bCidade =  i.next();
            }else{
                bCidade = i.next();
            }
            
            }catch(ArrayIndexOutOfBoundsException e){
                bCidade =  i.next();
                //System.out.println(bCidade.RetornarRegiao());
            }
            
        }
        return dados;
    }
    
    public String[] searchRegiao(ArrayList<Regiao> lista, String parametro){// retornar nome de procon pelo nome da regiao
    //Retorna a cidade por parametro de regiao
        String[] dados = new String[20];
        Iterator<Regiao> i;
        Regiao bRegiao;// objeto para retorno
        int n = 0;
        String aux;
        
        i = lista.iterator();//define iterator para buscar
        bRegiao =(Regiao) i.next();
        
        
        while (i.hasNext()){
            
            try{
                aux = bRegiao.RetornarMicroregiao();
            if( aux.equals(parametro)){
                dados[n] = bRegiao.RetornarProcon();
                n++;
                bRegiao =  i.next();
            }else{
                bRegiao = i.next();
            }
            
            }catch(ArrayIndexOutOfBoundsException e){
                bRegiao =  i.next();
                //System.out.println(bCidade.RetornarRegiao());
            }
            
        }
        return dados;
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
