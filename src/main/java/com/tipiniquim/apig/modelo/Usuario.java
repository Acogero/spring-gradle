package com.tipiniquim.apig.modelo;

import com.tipiniquim.apig.Util.NotNullUsuario;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Blob;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "nome", nullable = false)
    @NotNull(message = NotNullUsuario.USER_NOME)
    private String nome;

    @Column(name = "email", nullable = false)
    @NotNull(message = NotNullUsuario.USER_EMAIL)
    private String email;

    @Column(name = "senha", nullable = false)
    @NotNull(message = NotNullUsuario.USER_SENHA)
    private String senha;

    @Column(name = "telefoneC", nullable = false)
    @NotNull(message = NotNullUsuario.USER_TEL)
    private String telefoneC;

    @Column(name = "tipo_consulta", nullable = false)
    @NotNull(message = NotNullUsuario.USER_CONSULTA)
    private String tipo;

    @Column(name = "sexo")
    private String sexo;
    @Column(name = "foto")
    private Blob foto;
    @Column(name = "telefoneF")
    private String telefoneF;
    @Column(name = "nome_convenio")
    private String nome_convenio;
    @Column(name = "num_plano")
    private String num_plano;

    public Usuario() { }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefoneC() {
        return telefoneC;
    }

    public void setTelefoneC(String telefoneC) {
        this.telefoneC = telefoneC;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }

    public String getTelefoneF() {
        return telefoneF;
    }

    public void setTelefoneF(String telefoneF) {
        this.telefoneF = telefoneF;
    }

    public String getNome_convenio() {
        return nome_convenio;
    }

    public void setNome_convenio(String nome_convenio) {
        this.nome_convenio = nome_convenio;
    }

    public String getNum_plano() {
        return num_plano;
    }

    public void setNum_plano(String num_plano) {
        this.num_plano = num_plano;
    }
}
