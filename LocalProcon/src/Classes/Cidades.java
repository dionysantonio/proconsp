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
    public Cidades(String name, String reg){
        nome = name;
        regiao = reg;
    }
    
    public void Imprimir(){
        System.out.println(nome);        
    }
    
    public String RetornarRegiao(){
        return(regiao);
    }
    
    public void AdmitirProximo(Cidades proximo){
        next = proximo;
    }
    
    public Cidades RetornarProximo(){
        return next;
    }
    
    public boolean IsFinal(){
        return(next==null);
    }
}
