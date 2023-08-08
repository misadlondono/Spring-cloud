package com.easy.enginerules.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "ValidacionBeneficiariosPagoRule", description = "Regla para validar si la solicitud requiere un pago distribuido")
public class ValidacionBeneficiariosPagoRule {

    @Condition
    public boolean verificarBeneficiariosPago(@Fact("bitacoraTransaccional") String bitacoraTransaccional) {
        // Aquí implementa la lógica para verificar si la solicitud tiene varios beneficiarios de pago
        // y son diferentes al responsable de pago
        // Retorna true si se cumple la condición, false en caso contrario
        // Por ejemplo:
       // return bitacoraTransaccional.tieneVariosBeneficiariosPago() && bitacoraTransaccional.sonDiferentesResponsablePago();.
    	return bitacoraTransaccional.equals("true");
    }

    @Action
    public void accionValidacionBeneficiariosPago() {
        // Aquí implementa la acción a realizar si la validación es exitosa
        // Por ejemplo:
        System.out.println("La solicitud tiene varios beneficiarios de pago y son diferentes al responsable de pago (Requiere un pago distribuido)");
    }
}
