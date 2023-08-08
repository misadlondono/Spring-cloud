package com.easy.enginerules.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "ValidacionListasRestrictivasRule", description = "Regla para validar si la consulta en listas restrictivas en radicación no presenta novedad")
public class ValidacionListasRestrictivasRule {

    @Condition
    public boolean verificarListasRestrictivas(@Fact("bitacoraValidaciones") String bitacoraValidaciones) {
        // Aquí implementa la lógica para verificar si la consulta en listas restrictivas no presenta novedad
        // Retorna true si no se encuentra ninguna novedad, false en caso contrario
        // Por ejemplo:
        //return !bitacoraValidaciones.hayNovedadesListasRestrictivas();
    	return bitacoraValidaciones.equals("true");
    }

    @Action
    public void accionValidacionListasRestrictivas() {
        // Aquí implementa la acción a realizar si la consulta en listas restrictivas no presenta novedad
        // Por ejemplo:
        System.out.println("La consulta en listas restrictivas en radicación no presenta ninguna novedad");
    }
}
