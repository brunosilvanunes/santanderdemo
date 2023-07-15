package br.com.alura.santanderdemo.exception;

public class ClienteNaoEncontradoException extends Exception {
    public ClienteNaoEncontradoException() {
        super("Cliente não encontrado!");
    }
}
