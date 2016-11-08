/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procon;
import Classes.Cidade;
import Classes.LeDados;
import Classes.Cidade;
import Classes.Regiao;
import Classes.RecebeDado;
import java.util.ArrayList;
import Classes.Procon;
 /**
 *
 * @author d119322
 */
public class ProconExec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RecebeDado a = new RecebeDado();
        ArrayList<Procon> a1 = new ArrayList<>();
        ArrayList<Cidade> a2 = new ArrayList<>();
        ArrayList<Regiao> a3 = new ArrayList<>();
        String dados[];
        
        a1 = a.procon("http://www.justica.gov.br/dados-abertos/anexos/procons-municipais-sao-paulo-6.csv");
        a2 = a.cidade("C:\\Users\\d119322\\Documents\\NetBeansProjects\\proconsp\\Procon\\src\\RELATORIO_DTB_BRASIL_MUNICIPIO.csv");
       a3 = a.regiao("C:\\Users\\d119322\\Documents\\NetBeansProjects\\proconsp\\Procon\\src\\Procons-microregiao.csv");
        dados = a.searchCidade(a2, "Sao Paulo");
    }
    
}
