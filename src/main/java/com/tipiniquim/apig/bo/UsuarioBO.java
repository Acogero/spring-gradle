package com.tipiniquim.apig.bo;

import com.tipiniquim.apig.Util.ServerUtil;
import com.tipiniquim.apig.Util.UsuarioResponse;
import com.tipiniquim.apig.dao.UsuarioDAO;
import com.tipiniquim.apig.modelo.Usuario;

import javax.validation.ConstraintViolationException;
import java.util.List;

public class UsuarioBO {

    public String inserir(Usuario u, UsuarioDAO dao) {
        Usuario p2 = dao.existeUsuario(u.getEmail());

        if (p2 != null) {
            if (u.equals(p2))
                return UsuarioResponse.USER_FOUND;
        } else {
            try {
                dao.save(u);
            } catch(ConstraintViolationException e) {
                ServerUtil.retornoViolacao(e);
            }

            p2 = dao.existeUsuario(u.getEmail());

            if (p2.getEmail().equals(u.getEmail()))
                return UsuarioResponse.USER_CREATED;
            else
                return UsuarioResponse.ERRO_INVALIDO;
        }

        return UsuarioResponse.ERRO_INVALIDO;
    }

    public List<Usuario> getUsuarioNOME(Usuario u, UsuarioDAO dao) {
        List<Usuario> u2 = dao.getUsuarioNOME(u.getNome());
        return u2;
    }
}
