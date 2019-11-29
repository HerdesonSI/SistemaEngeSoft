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
public class Artigo {
    private Autor[] nomeAutor;
    private String titulo;
    private boolean arquivoDoArtigo;
    private String identificacaoArtigo;
    private Autor autorResponsavel;
    private boolean status;
    private String tema;
    
    //Gets e Sets da classe
    public Autor[] getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(Autor[] nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isArquivoDoArtigo() {
        return arquivoDoArtigo;
    }

    public void setArquivoDoArtigo(boolean arquivoDoArtigo) {
        this.arquivoDoArtigo = arquivoDoArtigo;
    }

    public String getIdentificacaoArtigo() {
        return identificacaoArtigo;
    }

    public void setIdentificacaoArtigo(String identificacaoArtigo) {
        this.identificacaoArtigo = identificacaoArtigo;
    }

    public Autor getAutorResponsavel() {
        return autorResponsavel;
    }

    public void setAutorResponsavel(Autor autorResponsavel) {
        this.autorResponsavel = autorResponsavel;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}