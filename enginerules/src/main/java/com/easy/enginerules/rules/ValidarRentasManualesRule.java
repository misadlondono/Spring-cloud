package com.easy.enginerules.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "ValidarRentasManualesRule", description = "Regla para validar si la solicitud tiene configuradas rentas manuales para el plan cobertura de la reclamación")
public class ValidarRentasManualesRule {

    @Condition
    public boolean verificarRentasManuales(@Fact("solicitud") String solicitud) {
        // Aquí implementa la lógica para verificar si la solicitud tiene configuradas rentas manuales
        // para el plan de cobertura de la reclamación
        // Retorna true si se cumple la condición, false en caso contrario
        // Por ejemplo:
        // return solicitud.tieneRentasManuales();
    	return solicitud.equals("true");
    }

    @Action
    public void accionValidacionRentasManuales() {
        // Aquí implementa la acción a realizar si la validación es exitosa
        // Por ejemplo:
        System.out.println("La solicitud tiene configuradas rentas manuales para el plan cobertura de la reclamación");
    }
}
