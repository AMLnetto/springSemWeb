package br.com.alura.screenmatch.service;

public interface IConverteDados {
    <T> T obeterDados(String Json, Class<T> classe);
}
