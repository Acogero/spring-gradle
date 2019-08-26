package com.tipiniquim.apig.controller;

import com.tipiniquim.apig.bo.UsuarioBO;
import com.tipiniquim.apig.dao.UsuarioDAO;
import com.tipiniquim.apig.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioDAO dao;
    private UsuarioBO pacienteBO = new UsuarioBO();

    @PostMapping("/inserir")
    public String inserir(@RequestBody Usuario u) {
        return pacienteBO.inserir(u, dao);
    }
}
