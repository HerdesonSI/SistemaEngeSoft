/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaengesoft;

//Impotações.
import java.util.Scanner;

/**
 *
 * @author Herdeson Mourão
 */
public class SistemaEngeSoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Instanciando Scanner.
        Scanner teclado = new Scanner(System.in);
        
        //Cadastro de funcionarios.
        //Ordem de cadastro: nome, email, login, senha, cargo.
        Funcionario funcionario1 = new Funcionario("Luci", "luci@gmail.com", "luci", "123", "editor-chefe");
        Funcionario funcionario2 = new Funcionario("Milto", "milto@gmail.com", "adm", "123", "redator");
        
        //Variaveis para efetuar o loop dos menus do sistema.
        boolean opcaoMenuInicial = false;
        boolean opcaoMenu = false;
        
        do{
            //Bloco para realização de login no sistema.
            System.out.println(" === Bem vindo === ");
            System.out.println("Digite seu login: ");
            String login = teclado.nextLine();
            System.out.println("Digite sua senha: ");
            String senha = teclado.nextLine();
            
            if(login.equals(funcionario1.getLogin()) || login.equals(funcionario2.getLogin())){
                do{
                    //Menu principal.
                    System.out.println(" === Menu === ");
                    System.out.println("1 - Pesquisa relatorios");
                    System.out.println("0 - Fechar o sistema");
                    System.out.println("Digite a opção desejada: ");
                    int menuPrincipal = teclado.nextInt();
            
                    switch(menuPrincipal){
                        case 0: //Opção de saido do sistema.
                            System.out.println(" === Sair === ");
                            System.out.println("Deseja realmente sair do sistema: ");
                            System.out.println("1 - Sim | 2 - Não");
                            System.out.println("Digite a opção desejada: ");
                            int opcaoSaida = teclado.nextInt();
                    
                            if(opcaoSaida == 1){
                                opcaoMenu = true;
                                opcaoMenuInicial = true;
                            } else{
                                System.out.println("Voltando para o menu principal");
                            }
                        break;
                        
                        case 1: //Opções de relatórios.
                            System.out.println(" === Relatório === ");
                            System.out.println("1 - Revistas lançadas");
                            System.out.println("2 - Avaliadores");
                            System.out.println("3 - Artigos submetidos");
                            System.out.println("4 - Artigos selecionados e rejeitados");
                            System.out.println("5 - Pessoas físicas");
                            System.out.println("6 - Pessoas jurídicas");
                            System.out.println("7 - Assinantes para renova");
                            System.out.println("Digite a opção desejada: ");
                            int opcaoRelatorio = teclado.nextInt();
                        break;
                    }
                } while(opcaoMenu == false);
            } else{
                System.out.println("Senha e/ou login incorreto");
            }
        } while(opcaoMenuInicial == false);
    }    
}