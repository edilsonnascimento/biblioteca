package br.com.utfpr.jpa.biblioteca.controller;

import br.com.utfpr.jpa.biblioteca.controller.dto.LivroDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @GetMapping
    @ResponseBody
    public List<LivroDto> livros() {
        LivroDto livroDto = new LivroDto("AABB", "Queda de Gondolin", "JRRT");
        return Arrays.asList(livroDto, livroDto, livroDto, livroDto);
    }

}
