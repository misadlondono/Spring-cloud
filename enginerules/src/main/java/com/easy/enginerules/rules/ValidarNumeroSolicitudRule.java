package com.easy.enginerules.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "ValidarNúmeroSolicitudRule", description = "Regla para validar el número de solicitud CRM")
public class ValidarNumeroSolicitudRule {

    @Condition
    public boolean verificarNumeroSolicitud(@Fact("numeroSolicitud") String numeroSolicitud) {
        // Aquí implementa la lógica de validación del número de solicitud
        // Retorna true si la validación es exitosa, false en caso contrario
        // Por ejemplo:
        return numeroSolicitud != null && !numeroSolicitud.isEmpty();
    }

    @Action
    public void accionValidacionNumeroSolicitud(@Fact("numeroSolicitud") String numeroSolicitud) {
        // Aquí implementa la acción a realizar si la validación es exitosa
        // Por ejemplo:
        System.out.println("El número de solicitud CRM es válido: " + numeroSolicitud);
    }
}
