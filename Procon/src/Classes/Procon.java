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
public class Procon {
    private String nome;
    private String cargo;
    private String orgao;
    private String endereco;
    private String ddd;
    private String telefone1;
    private String email;
    private String site;
    
    Procon(String[] dados){
         nome = dados[0];
         cargo = dados[1];
         orgao = dados[2];
         endereco = dados[3];
         ddd = dados[4];
         telefone1 = dados[5];
         email = dados[6];
         site = dados[7];
    }
    
    public String getName(){
        return nome;
    }
    public String getOrgao(){
        return orgao;
    }
    public String getEnd(){
        return endereco;
    }
    public String getTel(){
        return telefone1;
    }
    public String getEmail(){
        return email;
    }
    public String getSite(){
        return site;
    }
}
