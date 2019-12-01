/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaengesoft;

import java.util.Scanner;

/**
 *
 * @author Herdeson Mourão
 */
public class Menus {
    /*
    * Classe para armazenar todos os menus do sistema
    * com suas opções. Evitando poluição visual da class main.
    */
    Scanner teclado = new Scanner(System.in);
    
    //Menu principal do sistema.
    public int menuPrincipal(){
        System.out.print("\n === Menu === \n");
        System.out.println("1 - Pesquisa relatórios");
        System.out.println("2 - Fazer cadastros");
        System.out.println("3 - Atribuir nota a artigo");
        System.out.println("0 - Fechar o sistema");
        System.out.println("Digite a opção desejada: ");
        int menuPrincipal = teclado.nextInt();
        
        return menuPrincipal;
    }
    
    //Menu de confirmação de saida do sistema.
    public int menuSaida(){
        System.out.print("\n === Sair === \n");
        System.out.println("Deseja realmente sair do sistema: ");
        System.out.println("1 - Sim | 2 - Não");
        System.out.println("Digite a opção desejada: ");
        int opcaoSaida = teclado.nextInt();
        
        return opcaoSaida;
    }
    
    //Menu de opções de relatórios para serem gerados.
    public int listaOpcoesRelatorio(){
        System.out.print("\n === Relatório === \n");
        System.out.println("1 - Revistas lançadas por ano");
        System.out.println("2 - Avaliadores");
        System.out.println("3 - Artigos submetidos");
        System.out.println("4 - Artigos selecionados e rejeitados");
        System.out.println("5 - Pessoas físicas");
        System.out.println("6 - Pessoas jurídicas");
        System.out.println("7 - Assinantes para renova");
        System.out.println("Digite a opção desejada: ");
        int opcaoRelatorio = teclado.nextInt();
        
        return opcaoRelatorio;
    }
    
    //Menu de opções de cadastros do sistema.
    public int listaOpcoesCadastro(){
        System.out.print("\n === Cadastrar === \n");
        System.out.println("1 - Revista");
        System.out.println("2 - Artigo");
        System.out.println("3 - Avaliador");
        System.out.println("4 - Pessoa física");
        System.out.println("5 - Pessoa jurídica");
        System.out.println("Digite a opção desejada: ");
        int opcaoCadastro = teclado.nextInt();
        
        return opcaoCadastro;
    }
    
    //Erro de login e senha.
    public void erroDeLogin(){
        System.out.print("\nSenha e/ou login incorreto\n\n");
    }
    
    //Mensagem de opção digitado inválida.
    public void mensgemOpcaoInvalida(){
        System.out.print("\nOpção inválida \n");
    }
    
    public int loopDeCadastroRevista(){
        System.out.println("Deseja cadastrar outra revista? ");
        System.out.println("1 - sim | 2 - não");
        System.out.println("Digite a opção desejada: ");
        int opcaoQuebraDeLoop = teclado.nextInt();
        
        return opcaoQuebraDeLoop;
    }
    
    public int loopDeCadastroArtigo(){
        System.out.println("Deseja cadastrar outro artigo? ");
        System.out.println("1 - sim | 2 - não");
        System.out.println("Digite a opção desejada: ");
        int opcaoQuebraDeLoop = teclado.nextInt();
        
        return opcaoQuebraDeLoop;
    }
}