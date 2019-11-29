/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaengesoft;

//Impotações.
import java.util.ArrayList;
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
        
        //Cadastro do funcionario administrador.
        //Ordem de cadastro: nome, email, login, senha, cargo.
        Funcionario funcionario1 = new Funcionario("Luci", "luci@gmail.com", "luci", "123", "editor-chefe");
        
        //Lista de ArrayList.
        ArrayList<Revista> revista = new ArrayList();
        Avaliador avaliador = new Avaliador(); //ArrayList para os avaliadores.
        
        //Variaveis para efetuar o loop dos menus do sistema.
        boolean opcaoMenuInicial = false; //Login e senha
        boolean opcaoMenu = false; //Menu principal.
        
        do{
            //Bloco para realização de login no sistema.
            System.out.println(" === Bem vindo === ");
            System.out.println("Digite seu login: ");
            String login = teclado.nextLine();
            System.out.println("Digite sua senha: ");
            String senha = teclado.nextLine();
            
            if(login.equals(funcionario1.getLogin()) && senha.equals(funcionario1.getSenha())){
                //Loop do menu.
                do{
                    //Menu principal.
                    System.out.print("\n === Menu === \n");
                    System.out.println("1 - Pesquisa relatórios");
                    System.out.println("2 - Fazer cadastros");
                    System.out.println("3 - Atribuir nota a artigo");
                    System.out.println("0 - Fechar o sistema");
                    System.out.println("Digite a opção desejada: ");
                    int menuPrincipal = teclado.nextInt();
            
                    switch(menuPrincipal){
                        case 0: //Opção de saida do sistema.
                            System.out.print("\n === Sair === \n");
                            System.out.println("Deseja realmente sair do sistema: ");
                            System.out.println("1 - Sim | 2 - Não");
                            System.out.println("Digite a opção desejada: ");
                             int opcaoSaida = teclado.nextInt();
                    
                            if(opcaoSaida == 1){
                                //Mensagem de saido do sistema.
                                System.out.print("\nO sistema está fechando\n\n");
                                
                                opcaoMenu = true;
                                opcaoMenuInicial = true;
                            } else{
                                System.out.print("\nVoltando para o menu principal\n");
                            }
                        break;
                        
                        case 1: //Opções de relatórios.
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
                            
                            switch(opcaoRelatorio){
                                case 1:
                                    //Selecionar ano para gera os relatórios.
                                    System.out.print("\n === Revistas lançadas por ano === \n");
                                    System.out.println("Digite o ano desejado para gerar o relatório: ");
                                    int anoEscolhido = teclado.nextInt();
                                break;
                                
                                case 2:
                                    //Lista os avaliadores.
                                                                        
                                break;
                                
                                case 3:break;
                                case 4:break;
                                case 5:break;
                                case 6:break;
                                case 7:break;
                                default:
                                    System.out.print("\nOpção inválida \n"); 
                            }
                        break;
                        
                        case 2:
                            //Opções de possiveis cadastro.
                            System.out.print("\n === Cadastrar === \n");
                            System.out.println("1 - Revista");
                            System.out.println("2 - Artigo");
                            System.out.println("3 - Avaliador");
                            System.out.println("4 - Pessoa física");
                            System.out.println("5 - Pessoa jurídica");
                            System.out.println("Digite a opção desejada: ");
                            int opcaoCadastro = teclado.nextInt();
                            
                            switch(opcaoCadastro){
                                case 1:
                                    //Cadastro de revista.
                                    System.out.print("\n === Cadastro da revista === \n");
                                    System.out.println("= Edicao =");
                                    System.out.println("Volume da edição da revista: ");                                    
                                    System.out.println("Número da edição da revista: ");
                                    System.out.println("Mês da edição da revista:");
                                    System.out.println("Ano da edição da revista:");
                                    System.out.println("Tema da edição da revista:");
                                    System.out.println("= Artigos =");
                                    System.out.println("Artigos selecionados;");
                                break;
                                
                                case 2:break;
                                
                                case 3:
                                    //Cadastro de avaliador.
                                    System.out.print("\n === Cadastro de avaliador === \n");
                                    System.out.println("Nome do avaliador:");
                                    avaliador.setNome(teclado.nextLine());
                                break;
                                
                                case 4:break;
                                case 5:break;
                                default:
                                    System.out.print("\nOpção inválida \n");
                            }
                        break;
                        
                        case 3:
                            //Insirir notas nos artigos ja cadastrados
                        break;
                        
                        default:
                            System.out.print("\nOpção inválida \n");
                    }
                } while(opcaoMenu == false);
            } else{
                //Mensagem básica de erro no login e senha. 
                System.out.print("\nSenha e/ou login incorreto\n\n");
            }
        } while(opcaoMenuInicial == false);
    }    
}