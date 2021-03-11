package br.com.utfpr.jpa.biblioteca.modelo;


import javax.persistence.Enumerated;

public enum Estado {
    EMPRESTADO, LIBERADO, DESATIVADO;
}
