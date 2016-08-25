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
    private Cidades next = null;
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
    
    public boolean IsFinal(){//Testa se é a última cidade da lista
        return(next==null);
    }
    public void AdmitirProximo(Cidades proximo){//Recebe o apontador da proxima cidade
        if (next==null){
            next = proximo;
        }
    }
    
    public Cidades RetornarProximo(){//Retorna o apontador da próxima cidade
        return next;
    }
    

    
}
