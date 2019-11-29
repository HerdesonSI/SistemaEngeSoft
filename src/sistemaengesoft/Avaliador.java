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
        System.out.println("Email do avaliador: " + this.email);
        System.out.println("Insituição: " + this.instituicaoDoAvaliador);
        System.out.println("Habilitado nos temas: " + this.tema);
    }

    //Gets e Sets da classe
    public String[] getTema() {
        return tema;
    }

    public void setTema(String[] tema) {
        this.tema = tema;
    }

    public Instituicao getInstituicaoDoAvaliador() {
        return instituicaoDoAvaliador;
    }

    public void setInstituicaoDoAvaliador(Instituicao instituicaoDoAvaliador) {
        this.instituicaoDoAvaliador = instituicaoDoAvaliador;
    }
    
    //Gets e Sets da classe usuario.
    @Override
    public String getNome() {
        return nome;
    }
    
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}