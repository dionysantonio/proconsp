/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;


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
    
    ArrayList<Procon> procon(String caminho){
        
        date.readProcon(caminho);//define caminho para leitura de dados
        
        return date.getProcon();
    }

    ArrayList<Cidade> cidade(String caminho){
        
        date.readCidade(caminho);//define caminho para leitura de dados
        
        return date.getCidade();
       
    }
    
    Procon searchProcon(ArrayList<Procon> lista, String parametro){
        
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
