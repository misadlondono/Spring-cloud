package com.easy.enginerules.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "ValidarPagoCrediperseveradosRule", description = "Regla para validar si la solicitud tiene un pago a crediperseverados")
public class ValidarPagoCrediperseveradosRule {

    @Condition
    public boolean verificarPagoCrediperseverados(@Fact("solicitud") String solicitud) {
        // Aquí implementa la lógica para verificar si la solicitud tiene un pago a crediperseverados
        // Retorna true si se cumple la condición, false en caso contrario
        // Por ejemplo:
        //return solicitud.tienePagoCrediperseverados();
    	return solicitud.equals("true");
    }

    @Action
    public void accionValidacionPagoCrediperseverados() {
        // Aquí implementa la acción a realizar si la validación es exitosa
        // Por ejemplo:
        System.out.println("La solicitud tiene un pago a crediperseverados");
    }
}

