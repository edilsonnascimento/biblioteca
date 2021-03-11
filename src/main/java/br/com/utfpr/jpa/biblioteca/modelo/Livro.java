package br.com.utfpr.jpa.biblioteca.modelo;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Entity
public class Livro extends AbstractPersistable<Long> {

    private String titulo;

    private String autor;

    @ManyToOne(fetch = FetchType.EAGER)
    private Emprestimo emprestimo;

    @ManyToOne
    private Sessao sessao;

    @Enumerated(EnumType.STRING)
    private Estado estado;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimos(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
