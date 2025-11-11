
package br.ucb.graspmvc.model;

/**
 * MODEL: Customer
 * Coeso e com baixo acoplamento: representa o cliente sem depender de infraestrutura.
 */
public record Customer(Long id, String name) {}
