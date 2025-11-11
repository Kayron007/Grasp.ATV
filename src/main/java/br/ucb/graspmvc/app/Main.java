
package br.ucb.graspmvc.app;

import br.ucb.graspmvc.view.MenuView;

/**
 * Main
 * Camada: APP (bootstrap)
 * Responsabilidade: iniciar a aplicação e entregar o fluxo para a VIEW.
 * GRASP Low Coupling/High Cohesion: mantém a inicialização simples e coesa.
 */
public class Main {
    public static void main(String[] args) {
        new MenuView().start();
    }
}
