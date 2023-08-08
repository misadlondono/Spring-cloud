package com.easy.enginerules.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "SolicitudAsociadaCrm", description = "Valida si la solicitud tiene asociada un numero de solicitud CRM")
public class SolicitudAsociadaCrm {

    @Condition
    public boolean evaluate(@Fact("regla") boolean regla) {
        // Lógica de la condición de la regla
        return regla; // Devuelve true si la condición se cumple, false en caso contrario
    }

    @Action
    public void execute() {
        // Acción que se ejecuta si la condición de la regla se cumple
        System.out.println("La condición de la regla se cumplió");
    }
}
