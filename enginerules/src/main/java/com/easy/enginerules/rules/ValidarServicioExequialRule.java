package com.easy.enginerules.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "ValidarServicioExequialRule", description = "Regla para validar si la solicitud tiene habilitado un servicio exequial")
public class ValidarServicioExequialRule {

    @Condition
    public boolean verificarServicioExequial(@Fact("solicitud") String solicitud) {
        // Aquí implementa la lógica para verificar si la solicitud tiene habilitado un servicio exequial
        // Retorna true si se cumple la condición, false en caso contrario
        // Por ejemplo:
        // return solicitud.isServicioExequialHabilitado();
    	  return solicitud.equals("true");
    }

    @Action
    public void accionValidacionServicioExequial() {
        // Aquí implementa la acción a realizar si la validación es exitosa
        // Por ejemplo:
        System.out.println("La solicitud tiene habilitado un servicio exequial");
    }
}
