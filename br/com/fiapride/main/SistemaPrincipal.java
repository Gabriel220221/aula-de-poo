package br.com.fiapride.main;

import br.com.fiapride.model.Garrafa;

public class SistemaPrincipal {

    public static void main(String[] args) {
   
        
       
        Garrafa minhagarrafa = new Garrafa();
        minhagarrafa.cordatampa = "Preta";
        minhagarrafa.materialdagarrafa = "Plastico";
        minhagarrafa.marca = "Cristal";

        System.out.println("---Sistema FiapRide---");
        System.out.println("Cor da tampa: " + minhagarrafa.cordatampa );
        System.out.println("Material da Garrafa: " + minhagarrafa.materialdagarrafa );
        System.out.println("Marca da Garrafa: " + minhagarrafa.marca);
        

    }
}