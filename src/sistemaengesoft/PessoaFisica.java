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
public class PessoaFisica extends Usuario{
    private String sexo;
    private Data dataNascimento;
    private String numIdentificacao;
    private String cpf;
    
    //Gets e Sets da classe
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNumIdentificacao() {
        return numIdentificacao;
    }

    public void setNumIdentificacao(String numIdentificacao) {
        this.numIdentificacao = numIdentificacao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}