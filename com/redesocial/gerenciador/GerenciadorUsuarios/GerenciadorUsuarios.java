package com.redesocial.gerenciador.GerenciadorUsuarios;

import com.redesocial.modelo.Usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorUsuarios{
    private List<Usuario> usuarios = new ArrayList<>();
    private int proximoId = 1;
    private int contador = 1;
    private boolean validarDados(String nome,String username,String email, String senha){
        return nome != null && !nome.isEmpty() &&
                username != null && !username.isEmpty() &&
                email != null && !email.isEmpty() &&
                senha != null && senha.isEmpty();
    }
    public Usuario getUsuario(Integer id){
        return usuarios.get(id);
    }
    public Usuario cadastrar(String nome, String username, String email, String senha){
       Usuario usuario = new Usuario(contador, nome, username, email, senha);
       usuarios.add(contador, usuario);
       contador++;
       return usuario;

    }
    public Usuario buscarPorId(int id){
        return usuarios.get(id);
    }
    public Usuario buscarPorUsername(String username){
        for(Usuario usuario : usuarios){
            if(usuario.getUsername().equals(username)){
                return usuario;
            }
            public List<Usuario> buscarPorNome(String nome){
                for ()
            }

}
