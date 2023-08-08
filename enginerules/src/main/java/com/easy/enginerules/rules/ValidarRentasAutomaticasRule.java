package com.easy.enginerules.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "ValidarRentasAutomaticasRule", description = "Regla para validar si la solicitud tiene configuradas rentas automáticas para el plan cobertura de la reclamación")
public class ValidarRentasAutomaticasRule {

    @Condition
    public boolean verificarRentasAutomaticas(@Fact("solicitud") String solicitud) {
        // Aquí implementa la lógica para verificar si la solicitud tiene configuradas rentas automáticas
        // para el plan de cobertura de la reclamación
        // Retorna true si se cumple la condición, false en caso contrario
        // Por ejemplo:
        //return solicitud.tieneRentasAutomaticas();
    	return solicitud.equals("true");
    }

    @Action
    public void accionValidacionRentasAutomaticas() {
        // Aquí implementa la acción a realizar si la validación es exitosa
        // Por ejemplo:
        System.out.println("La solicitud tiene configuradas rentas automáticas para el plan cobertura de la reclamación");
    }
}
