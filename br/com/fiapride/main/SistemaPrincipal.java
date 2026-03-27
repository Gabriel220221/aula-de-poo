package br.com.fiapride.main;

import br.com.fiapride.model.Garrafa;

public class SistemaPrincipal {
    public static void main(String[] args) {

        System.out.println("---Sistema FiapRide---");

        Garrafa minhagarrafa = new Garrafa("Cristal", "Plastico");
        minhagarrafa.setCordatampa("Preta");

        System.out.println("Cor da tampa: " + minhagarrafa.getCordatampa());
        System.out.println("Material: " + minhagarrafa.getMaterialdagarrafa());
        System.out.println("Marca: " + minhagarrafa.getMarca());
    }
}