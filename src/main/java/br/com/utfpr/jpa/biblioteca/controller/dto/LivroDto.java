package br.com.utfpr.jpa.biblioteca.controller.dto;

import br.com.utfpr.jpa.biblioteca.modelo.Estado;
import br.com.utfpr.jpa.biblioteca.modelo.Livro;
import br.com.utfpr.jpa.biblioteca.modelo.Sessao;

import java.util.List;
import java.util.stream.Collectors;

public class LivroDto {


    private String titulo;
    private String autor;
    private Estado estado;


    public LivroDto(Livro livro) {
        this.titulo = livro.getTitulo();
        this.autor = livro.getAutor();
        this.estado = livro.getEstado();
    }

    public static List<LivroDto> converte(List<Livro> livros) {
        return livros.parallelStream().map(LivroDto::new).collect(Collectors.toList());
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Estado getEstado() {
        return estado;
    }
}
