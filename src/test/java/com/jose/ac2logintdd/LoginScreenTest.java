package com.jose.ac2logintdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste para a tela de login.
 * Contém testes para verificar o comportamento do método de login.
 */
public class LoginScreenTest {

    /**
     * Testa o login com credenciais inválidas.
     * O login deve falhar para credenciais inválidas.
     */
    @Test
    public void testLoginInvalido() {
       
        LoginScreen loginService = new LoginScreen();
        boolean result = loginService.login("UsuarioInvalido", "SenhaInvalida");
        assertFalse(result, "Login deve falhar para credencias invalidas");
    }

    /**
     * Testa o login com credenciais válidas.
     * O login deve ser bem-sucedido para credenciais válidas.
     */
    @Test
    public void testLoginValido() {
        LoginScreen loginService = new LoginScreen();
        boolean result = loginService.login("UsuarioValido", "SenhaValida");
        assertTrue(result, "Login deve ser bem sucedido para credencias validas");
    }

    /**
     * Testa o login com o nome de usuário vazio.
     * O login deve falhar se o nome de usuário estiver vazio.
     */
    @Test
    public void testUsuarioVazio() {
        LoginScreen loginService = new LoginScreen();
        boolean result = loginService.login("", "SenhaValida");
        assertFalse(result, "Login falhou pelo usuario vazio");
    }

    /**
     * Testa o login com a senha vazia.
     * O login deve falhar se a senha estiver vazia.
     */
    @Test
    public void testSenhaVazia() {
        LoginScreen loginService = new LoginScreen();
        boolean result = loginService.login("UsuarioValido", "");
        assertFalse(result, "Login falhou pela senha vazia");
    }
}
