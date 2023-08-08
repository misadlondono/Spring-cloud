package com.easy.enginerules.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "ValidacionExitosaRule", description = "Validar si la solicitud cumplió con todas las validaciones para la radicación")
public class ValidacionExitosaRule {

    @Condition
    public boolean validarSolicitud(@Fact("validacionExitosa") String  validacionExitosa) {
        // Verificar si la validación de la solicitud es exitosa
        return validacionExitosa.equals("true");
    }

    @Action
    public void accionValidacionExitosa(@Fact("validacionExitosa") String  validacionExitosa) {
        // Realizar la acción correspondiente si la validación es exitosa
        // Por ejemplo:
        System.out.println("La solicitud cumplió con todas las validaciones para la radicación");
    }
}

