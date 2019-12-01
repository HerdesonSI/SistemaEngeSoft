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
public class Cadastros {
    //Classe para apoio aos cadastros.
    
    Scanner teclado = new Scanner(System.in);
    
    //Cadastro de edição
    public Edicao cadastroEdicao(){
        //Instancia da class Edicao, da class Datae da Class Artigo.
        Edicao edicao = new Edicao();
        Data data = new Data();
        Artigo artigo = new Artigo();
        
        System.out.print("\n === Cadastro da revista === \n");                                                                   
        System.out.println("= Edicao =");
        System.out.println("Volume da edição da revista: ");
        edicao.setVolume(teclado.nextInt());
        System.out.println("Número da edição da revista: ");
        edicao.setVolume(teclado.nextInt());
        System.out.println("Mês da edição da revista:");
        data.setMes(teclado.nextInt());
        System.out.println("Ano da edição da revista:");
        data.setAno(teclado.nextInt());
        System.out.println("Tema da edição da revista:");
        edicao.setTema(teclado.next());
        
        System.out.println("= Artigos =");
        System.out.println("Apenas 8 por revista");
        
        for(int i = 0; i < 8; i++){
            System.out.println("Indentificação do arquivo selecionado:");
            artigo.setIdentificacaoArtigo(teclado.next());
        }
        edicao.setData(data);
        
        return edicao;
    }
    
    // no nome do autor
    public Artigo cadastroArtigo(){
        Usuario usuario = new Usuario();
        Autor autor = new Autor();
        Artigo artigo = new Artigo();
        
        System.out.println("Quantos autor o artigo tem: ");
        int num = teclado.nextInt();
        
        System.out.print("\n === Cadastro da revista === \n");
        for(int i = 0; i < num; i++){
            System.out.println("Nome do autor: ");
            autor.setNome(teclado.next());
        }
        
        System.out.println("Titulo do artigo: ");
        artigo.setTitulo(teclado.next());
        
        System.out.println("Arquivo foi recebido: 1 - sim | 2 - não: ");
        int decisaoArtigo = teclado.nextInt();
        
        if(decisaoArtigo == 1){
            artigo.setArquivoDoArtigo(true);
        } else{
            artigo.setArquivoDoArtigo(false);
        }
        
        System.out.println("Identificação do artigo: ");
        artigo.setIdentificacaoArtigo(teclado.next());
        System.out.println("Autor responsavel: ");
        autor.setNome(teclado.next());
        
        System.out.println("Status do artigo: 1 - avaliado | 2 - ainda não avaliado: ");
        int decisaoAvaliacao = teclado.nextInt();
        
        if(decisaoAvaliacao == 1){
            artigo.setStatus(true);
        } else{
            artigo.setStatus(false);
        }
        
        System.out.println("Tema do artigo: ");
        artigo.setTema(teclado.next());
        
        return artigo;
    }
    
    public Avaliador cadastroAvaliador(){
        Avaliador avaliador = new Avaliador();
        return avaliador;
    }
}