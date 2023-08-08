package com.easy.enginerules.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "ValidarConceptoFavorableRule", description = "Regla para validar si la auditoria medica emite un concepto favorable para la solicitud")
public class ValidarConceptoFavorableRule {

    @Condition
    public boolean verificarConceptoFavorable(@Fact("solicitud") String solicitud) {
        // Aquí implementa la lógica para verificar si la auditoria medica emite un concepto favorable para la solicitud
        // Retorna true si se cumple la condición, false en caso contrario
        // Por ejemplo:
        //return solicitud.getFaseAuditoriaMedica().emiteConceptoFavorable();
    	return solicitud.equals("true");
    }

    @Action
    public void accionValidacionConceptoFavorable() {
        // Aquí implementa la acción a realizar si la validación es exitosa
        // Por ejemplo:
        System.out.println("La auditoria medica emite un concepto favorable para la solicitud");
    }
}
