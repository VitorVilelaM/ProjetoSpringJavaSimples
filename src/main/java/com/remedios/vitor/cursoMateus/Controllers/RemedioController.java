package com.remedios.vitor.cursoMateus.Controllers;

import com.remedios.vitor.cursoMateus.Remedio.DadosCadastroRemedio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remedios")
public class RemedioController {
    @PostMapping
    public void Cadastro(@RequestBody DadosCadastroRemedio json){
        System.out.println(json);
    }
}
