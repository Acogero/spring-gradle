package com.tipiniquim.apig.dao;

import com.tipiniquim.apig.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsuarioDAO extends JpaRepository<Usuario, Long> {

    @Query(value = "SELECT * FROM usuario WHERE email = :email", nativeQuery = true)
    public Usuario existeUsuario(@Param("email") String email);

    @Query(value = "SELECT * FROM usuario WHERE nome like %:nome%", nativeQuery = true)
    public List<Usuario> getUsuarioNOME(@Param("nome") String nome);
}
