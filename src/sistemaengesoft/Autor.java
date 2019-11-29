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
public class Autor {
    private Instituicao nomeDaInstituicao;
    private Instituicao enderecoDaInstituicao;
    
    //Gets e Sets da classe
    public Instituicao getNomeDaInstituicao() {
        return nomeDaInstituicao;
    }

    public void setNomeDaInstituicao(Instituicao nomeDaInstituicao) {
        this.nomeDaInstituicao = nomeDaInstituicao;
    }

    public Instituicao getEnderecoDaInstituicao() {
        return enderecoDaInstituicao;
    }

    public void setEnderecoDaInstituicao(Instituicao enderecoDaInstituicao) {
        this.enderecoDaInstituicao = enderecoDaInstituicao;
    }
}