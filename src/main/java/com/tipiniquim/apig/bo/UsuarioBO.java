package com.tipiniquim.apig.bo;

import com.tipiniquim.apig.Util.ServerUtil;
import com.tipiniquim.apig.Util.UsuarioResponse;
import com.tipiniquim.apig.dao.UsuarioDAO;
import com.tipiniquim.apig.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolationException;
import java.util.List;

@Service
public class UsuarioBO {
    
    @Autowired
    private UsuarioDAO usuarioDao;

    public String inserir(Usuario u) {
        Usuario p2 = usuarioDao.existeUsuario(u.getEmail());

        if (p2 != null) {
            if (u.equals(p2))
                return UsuarioResponse.USER_FOUND;
        } else {
            try {
                usuarioDao.save(u);
            } catch(ConstraintViolationException e) {
                return ServerUtil.retornoViolacao(e);
            }

            p2 = usuarioDao.existeUsuario(u.getEmail());

            if (p2.getEmail().equals(u.getEmail()))
                return UsuarioResponse.USER_CREATED;
            else
                return UsuarioResponse.ERRO_INVALIDO;
        }

        return UsuarioResponse.ERRO_INVALIDO;
    }

    public List<Usuario> getUsuarioNOME(Usuario u) {
        return usuarioDao.getUsuarioNOME(u.getNome());
    }
    
    public void setUsuarioDao(UsuarioDAO usuarioDao) {
        this.usuarioDao = usuarioDao;
    }
}
