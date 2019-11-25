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
public class Funcionario extends Usuario{
    private String login;
    private String senha;
    private String cargo;
    
    //Construtor
    public Funcionario(String nome, String email, String login, String senha, String cargo){
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }    
}