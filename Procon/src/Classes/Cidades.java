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
public class Cidades{

    private String nome;
    private String regiao;
    
    public Cidades(){
    }
    public Cidades(String name, String reg){//Método contrutor
        nome = name;
        regiao = reg;
    }
    
    public void Imprimir(){//Imprime o nome da cidade
        System.out.println(nome);        
    }
    
    public String RetornarRegiao(){//Retorna a região da cidade
        return(regiao);
    }
   

}
