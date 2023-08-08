package com.easy.enginerules.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "ValidarPagoAutomaticoRule", description = "Regla para validar si el valor a pagar en la liquidación no supera el valor configurado para pagos automáticos")
public class ValidarPagoAutomaticoRule {

    @Condition
    public boolean verificarPagoAutomatico(@Fact("solicitud") String solicitud) {
        // Aquí implementa la lógica para verificar si el valor a pagar en la liquidación no supera el valor configurado para pagos automáticos
        // Retorna true si se cumple la condición, false en caso contrario
        // Por ejemplo:
        //return solicitud.getValorPagar() <= ConfiguracionPagosAutomaticos.getValorMaximo();
    	  return solicitud.equals("true");
    }

    @Action
    public void accionValidacionPagoAutomatico() {
        // Aquí implementa la acción a realizar si la validación es exitosa
        // Por ejemplo:
        System.out.println("El valor a pagar en la liquidación no supera el valor configurado para pagos automáticos");
    }
}
