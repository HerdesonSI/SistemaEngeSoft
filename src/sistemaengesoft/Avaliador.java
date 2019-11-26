/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaengesoft;

/**
 *
 * @author Herdeson Mourão
 */
public class Avaliador extends Usuario{
    private String tema[];
    private Instituicao instituicaoDoAvaliador;
    
    public void listarAvaliadores(){
        System.out.println("Nome do avaliador: " + this.nome);
        System.out.println("Habilitado nos temas: " + this.tema);
    }
}