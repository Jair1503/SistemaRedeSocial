package com.redesocial.gerenciador.GerenciadorUsuarios;

import com.redesocial.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorUsuarios {
    private final List<Usuario> usuarios = new ArrayList<>();
    private int proximoId = 1;

    public GerenciadorUsuarios() {
    }

    private boolean validarDados(String nome, String username, String email, String senha) {
        return nome != null && !nome.isEmpty() &&
                username != null && !username.isEmpty() &&
                email != null && !email.isEmpty() &&
                senha != null && !senha.isEmpty();
    }

    public Usuario getUsuario(Integer id) {
        if (id >= 0 && id < usuarios.size()) {
            return usuarios.get(id);
        }
        return null;
    }

    public Usuario cadastrar(String nome, String username, String email, String senha) {
        Usuario usuario = new Usuario(proximoId, nome, username, email, senha);
        usuarios.add(usuario);
        proximoId++;
        return usuario;

    }

    public Usuario buscarPorId(int id) {
        if (id >= 0 && id < usuarios.size()) {
            return usuarios.get(id);
        }
        return null;
    }
    public Usuario buscarPorUsername(String username) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username)) {
                return usuario;
            }
        }
        return null;
    }
    public List<Usuario> buscarPorNome(String nome) {
        List<Usuario> usuarios = new ArrayList<>();
        for (Usuario usuario : this.usuarios) {
            if (usuario.getNome().equals(nome)) {
                usuarios.add(usuario);
            }
        }
        return usuarios;
    }
    public boolean atualizar(Usuario usuario) {
        if (usuario != null) {
            int indice = usuarios.indexOf(usuario);
            if (indice >= 0) {
                usuarios.set(indice, usuario);
                return true;
            }
        }
        return false;
    }
    public boolean deletar(Usuario usuario) {
        if (usuario != null) {
            int indice = usuarios.indexOf(usuario);
            if (indice >= 0) {
                usuarios.remove(indice);
                return true;
            }
        }
        return false;
    }
    public void adicionarAmizade(int idUsuario1, int idUsuario2) {
        Usuario usuario1 = buscarPorId(idUsuario1);
        Usuario usuario2 = buscarPorId(idUsuario2);
        usuario1.adicionarAmigo(usuario2);
        usuario2.adicionarAmigo(usuario1);
    }
    public void removerAmizade(int idUsuario1, int idUsuario2) {
        Usuario usuario1 = buscarPorId(idUsuario1);
        Usuario usuario2 = buscarPorId(idUsuario2);
        usuario1.removerAmigo(usuario2);
        usuario2.removerAmigo(usuario1);
    }
    public void validarUsuario(Usuario usuario) {
        if (usuario != null) {
            if (usuario.getId() == null) {
                usuario.setId(proximoId);
                usuarios.add(usuario);
                proximoId++;
            }
        }
    }
}
