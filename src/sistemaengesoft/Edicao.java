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
public class Edicao {
    private int volume;
    private int numero;
    private Data data;
    private String tema;
    private Artigo[] artigosSelecionados;

    public Edicao(){
        //Construtor padrão vazio.
    }
    
    //Construtor com todos os parametros.
    public Edicao(int volume, int numero, Data data, String tema, Artigo[] artigoSelecionados){
        this.volume = volume;
        this.numero = numero;
        this.data = data;
        this.tema = tema;
        this.artigosSelecionados = artigoSelecionados;
    }
    
    public void listaEdicao(){
        System.out.println("Volume: " + getVolume());
        System.out.println("Numero: " + getNumero());
        System.out.println("Data: " + this.data.getMes() + "/" + this.data.getAno());
        System.out.println("Tema: " + getTema());
        System.out.println("Artigos selecionados: " + getArtigosSelecionados());
    }
    
    //Gets e Sets da classe
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Artigo[] getArtigosSelecionados() {
        return artigosSelecionados;
    }

    public void setArtigosSelecionados(Artigo[] artigosSelecionados) {
        this.artigosSelecionados = artigosSelecionados;
    }
}