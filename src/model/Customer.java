package br.ucb.grasp.domain;

/**
 * Alta coesão e baixo acoplamento:
 * Representa o cliente sem depender de outras camadas.
 */
public record Customer(Long id, String name) { }
//Organização