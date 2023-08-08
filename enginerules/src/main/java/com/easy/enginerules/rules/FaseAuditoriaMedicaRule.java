package com.easy.enginerules.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "FaseAuditoriaMedicaRule", description = "Regla para validar si la solicitud tiene fase de auditoria medica")
public class FaseAuditoriaMedicaRule {

    @Condition
    public boolean verificarFaseAuditoriaMedica(@Fact("solicitud") String solicitud) {
        // Aquí implementa la lógica para verificar si la solicitud tiene fase de auditoria medica
        // Retorna true si se cumple la condición, false en caso contrario
        // Por ejemplo:
        //return solicitud.getTipoCobertura().tieneFaseAuditoriaMedica();
    	return solicitud.equals("true");
    }

    @Action
    public void accionValidacionFaseAuditoriaMedica() {
        // Aquí implementa la acción a realizar si la validación es exitosa
        // Por ejemplo:
        System.out.println("La solicitud tiene fase de auditoria medica");
    }
}

