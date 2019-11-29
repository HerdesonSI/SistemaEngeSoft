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