/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author d119322
 */
public class Cidade{

    private String nome;
    private String regiao;
    
    public Cidade(){
    }
    public Cidade(String dados[]){//Método contrutor
        nome = dados[0];
        regiao = dados[1];
    }
    
    public void Imprimir(){//Imprime o nome da cidade
        System.out.println(nome);        
    }
    
    public String RetornarRegiao(){//Retorna a região da cidade
        return(regiao);
    }
    public String RetornarNome(){//Retorna a região da cidade
        return(nome);
    }
   

}
