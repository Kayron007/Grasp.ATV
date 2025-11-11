package br.ucb.grasp.domain;

/**
 * Entidade simples com dados essenciais do produto.
 */
public record Product(Long id, String name, double price) { }
