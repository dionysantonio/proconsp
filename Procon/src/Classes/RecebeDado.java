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
    
    void RecebeDado(){
        
    }
    
    ArrayList<Procon> procon(String caminho){
        
        ArrayList<Procon> dados;
        
        LeDados date = new LeDados(caminho,dados);//define caminho para leitura de dados
        
        return date.getProcon();
    }

    Cidade cidade(String caminho){
        
        LeDados date = new LeDados(caminho);//define caminho para leitura de dados
        
        Collection<String[]> dados = date.get();//retorna os dados lidos
        
        Cidade cidadesp = new Cidade(dados);//declara os dados em procon
        
        return cidadesp;
    }
    
}
