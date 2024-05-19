package com.jose.ac2logintdd;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe que representa a tela de login.
 * Contém a lógica para autenticar usuários.
 */
public class LoginScreen {
    private Map<String, String> users;

    /**
     * Construtor que inicializa a lista de usuários.
     * Adiciona um usuário válido para teste.
     */
    public LoginScreen() {
        users = new HashMap<>();
        // Adicionando um usuário válido para teste
        users.put("UsuarioValido", "SenhaValida");
    }

    /**
     * Método que autentica o usuário com base no nome de usuário e senha fornecidos.
     *
     * @param username o nome de usuário
     * @param password a senha
     * @return true se as credenciais forem válidas, false caso contrário
     */
    public boolean login(String username, String password) {
        // Verifica se username ou password estão vazios
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            return false;
        }
        
        // Verifica se as credenciais são válidas
        String validPassword = users.get(username);
        return validPassword != null && validPassword.equals(password);
    }
}
