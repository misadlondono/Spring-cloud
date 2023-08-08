package com.easy.enginerules.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "CoberturaFaseAuditoriaMedicaRule", description = "Regla para validar si el tipo de cobertura tiene configurada la fase de auditoria medica")
public class CoberturaFaseAuditoriaMedicaRule {

    @Condition
    public boolean verificarCoberturaFaseAuditoriaMedica(@Fact("solicitud") String solicitud) {
        // Aquí implementa la lógica para verificar si el tipo de cobertura tiene configurada la fase de auditoria medica
        // Retorna true si se cumple la condición, false en caso contrario
        // Por ejemplo:
        //return solicitud.getTipoCobertura().tieneFaseAuditoriaMedica();
    	return solicitud.equals("true");
    }

    @Action
    public void accionValidacionCoberturaFaseAuditoriaMedica() {
        // Aquí implementa la acción a realizar si la validación es exitosa
        // Por ejemplo:
        System.out.println("El tipo de cobertura tiene configurada la fase de auditoria medica");
    }
}

