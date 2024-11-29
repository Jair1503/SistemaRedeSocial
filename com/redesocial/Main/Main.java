package com.redesocial.Main;

import com.redesocial.ui.MenuPrincipal.MenuPrincipal;
import com.redesocial.ui.MenuPrincipal.MenuPrincipal;

public class Main {

    private static void initializeSystem() {
    } // Inicializa o sistema

    public static void main(String[] args) {
        initializeSystem();   //Iniciar o loop principal da aplicação
        startMainLoop();
    }

    private static void fazerLogin() {
        Login login = new Login();
        login.exibirLogin();
    }

    private static void startMainLoop() {
        fazerLogin();
        //cria instancias do menu principal
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.exibirMenu();
    }

    }


