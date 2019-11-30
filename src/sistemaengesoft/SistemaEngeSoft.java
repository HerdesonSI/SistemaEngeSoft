/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaengesoft;

//Impotações.
import java.util.ArrayList;
import java.util.List;
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
        //Instanciando Scanner.
        Scanner teclado = new Scanner(System.in);
        
        //Cadastro do funcionario administrador.
        //Ordem de cadastro: nome, email, login, senha, cargo.
        Funcionario funcionario1 = new Funcionario("Luci", "luci@gmail.com", "luci", "123", "editor-chefe");
        
        //Instanciando as classes.
        Menus menu = new Menus(); //Classe com os menus do sistema.
        Cadastros cadastros = new Cadastros(); //Classe com os cadastro.
        
        //ArrayList
        List<Edicao> edicao = new ArrayList(); //ArrayList da class edicao.
        
        //Variaveis para efetuar o loop do sistema.
        boolean opcaoMenuInicial = false; //Loop de login e senha
        boolean opcaoMenu = false; //Loop do menu principal.
        
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
                    /*
                    * Passando o método menuPrincipal como parametro.
                    * Esse metodo tem todas as opções do Menu principal.
                    */            
                    switch(menu.menuPrincipal()){
                        case 0: //Opção de saida do sistema.                    
                            if(menu.menuSaida() == 1){
                                //Mensagem de saido do sistema.
                                System.out.print("\nO sistema está fechando\n\n");
                                
                                //Fechando os dois loops do sistema.
                                opcaoMenu = true;
                                opcaoMenuInicial = true;
                            } else{
                                System.out.print("\nVoltando para o menu principal\n");
                            }
                        break;
                        
                        case 1: //Opções de relatórios.                            
                            switch(menu.listaOpcoesRelatorio()){
                                case 1:
                                    //Selecionar ano para gera os relatórios.
                                    System.out.print("\n === Revistas lançadas por ano === \n");
                                    System.out.println("Digite o ano desejado para gerar o relatório: ");
                                    int anoEscolhido = teclado.nextInt();
                                    
                                    for(Edicao e: edicao){
                                        e.listaEdicao();
                                    }
                                break;
                                
                                case 2:
                                    //Lista os avaliadores.
                                                                        
                                break;
                                
                                case 3:
                                    //Lista artigos submetidos.
                                break; 
                                
                                case 4:
                                    //Lista artigos selecionados e rejeitados.
                                break; 
                                
                                case 5:
                                    //Lista pessoas físicas.
                                break; 
                                
                                case 6:
                                    //Lista pessoas jurídicas.
                                break; 
                                
                                case 7:
                                    //Lista assinantes para renovação.
                                break; 
                                
                                default:
                                    menu.mensgemOpcaoInvalida();
                            }
                        break;
                        
                        case 2:
                            //Opções de possiveis cadastro.                           
                            switch(menu.listaOpcoesCadastro()){
                                case 1:
                                    //Cadastro de revista.
                                    boolean novoCadastro = false; //Loop para cadastros seguidos.
                                            
                                    do{                                        
                                        //Adicionando no arraylist com o metodo de cadastro de edicao.
                                        edicao.add(cadastros.cadastroEdicao());
                                        
                                        //Utilizando metodo loopDeCadastroRevista para retorna o valor para os ifs.
                                        if(menu.loopDeCadastroRevista() == 2){
                                            novoCadastro = true;
                                        } else{
                                            System.out.println("Opção inválida, você será redirecionado para o menu");
                                            novoCadastro = true;
                                        }
                                    } while(novoCadastro == false); 
                                break;
                                
                                case 2:
                                    //Cadastro de artigo.                                    
                                break;
                                
                                case 3:
                                    //Cadastro de avaliador.
                                    System.out.print("\n === Cadastro de avaliador === \n");
                                    System.out.println("Nome do avaliador:");
                                break;
                                
                                case 4:
                                    //Cadastro pessoa física.
                                break;
                                
                                case 5:
                                    //Cadastro pessoa jurídica.
                                break;
                                
                                default:
                                    menu.mensgemOpcaoInvalida();
                            }
                        break;
                        
                        case 3:
                            //Insirir notas nos artigos ja cadastrados
                        break;
                        
                        default:
                            menu.mensgemOpcaoInvalida();
                    }
                } while(opcaoMenu == false);
            } else{
                //Mensagem básica de erro no login e senha. 
                menu.erroDeLogin();
            }
        } while(opcaoMenuInicial == false);
    }    
}