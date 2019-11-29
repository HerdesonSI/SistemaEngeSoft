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
public class Instituicao {
    private String nomeInstituicao;
    private Endereco enderecoInstituicao;
    
    //Gets e Sets da classe
    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public Endereco getEnderecoInstituicao() {
        return enderecoInstituicao;
    }

    public void setEnderecoInstituicao(Endereco enderecoInstituicao) {
        this.enderecoInstituicao = enderecoInstituicao;
    }
}