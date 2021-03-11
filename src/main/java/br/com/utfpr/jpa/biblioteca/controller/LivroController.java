package br.com.utfpr.jpa.biblioteca.controller;

import br.com.utfpr.jpa.biblioteca.controller.dto.LivroDto;
import br.com.utfpr.jpa.biblioteca.modelo.Livro;
import br.com.utfpr.jpa.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping
    @ResponseBody
    public List<LivroDto> livros() {
         List<Livro> livros = livroRepository.findAll();
         livros.forEach(System.out::println);
        return LivroDto.converte(livros);
    }

}
