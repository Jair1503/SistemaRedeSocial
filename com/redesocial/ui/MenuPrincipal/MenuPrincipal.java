package com.redesocial.ui.MenuPrincipal;

import com.redesocial.modelo.Usuario;

public class MenuPrincipal {
    public void exibirMenu(){
        System.out.println("Menu Principal");
    }
    public boolean fazeLogin(String username, String senha){
        System.out.println("Fazer Login");
        return false;
    }
    public void CadastrarUsuario(){
        System.out.println("Cadastrar Usuário");
    }
    private void exibirMenuLogado(Usuario ususario){
        System.out.println("Menu Logado");
    }
}
