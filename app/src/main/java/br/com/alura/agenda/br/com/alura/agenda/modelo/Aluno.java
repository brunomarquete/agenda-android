package br.com.alura.agenda.br.com.alura.agenda.modelo;

import java.io.Serializable;

/**
 * Created by Bruno Marquete on 13/06/2016.
 */
public class Aluno implements Serializable {

    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String site;
    private Double nota;

    public Aluno() {
    }

    public Aluno(String nome, String endereco, String telefone, String site, Double nota) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.site = site;
        this.nota = nota;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return this.nome + " (" + this.telefone + ")";
    }
}
