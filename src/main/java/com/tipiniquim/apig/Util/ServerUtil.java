package com.tipiniquim.apig.Util;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Set;

public class ServerUtil {

    public static String retornoViolacao(ConstraintViolationException e) {
        //TODO ESSE ESQUEMA IMPRIME A MENSAGEM DO @NotNull DO MODELO
        Set<ConstraintViolation<?>> violations = e.getConstraintViolations();

        if (violations != null && !violations.isEmpty()) {
            final ConstraintViolation<?> error1 = violations.iterator().next();
            return error1.getMessage();
        } else return "";
    }
}
