package br.com.utfpr.jpa.biblioteca.controller.dto;

import br.com.utfpr.jpa.biblioteca.modelo.Sessao;

public class LivroDto {

    private String codigo;
    private String titulo;
    private String autor;


    public LivroDto(String codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }


}
