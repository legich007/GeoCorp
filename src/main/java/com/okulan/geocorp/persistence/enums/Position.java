package com.okulan.geocorp.persistence.enums;

/**
 * Должность
 *
 * @author Oleg Kulankhin 05.04.2021
 */
public enum Position {
    GENERAL_MANAGER("Генеральный директор"),
    TECHNICAL_DIRECTOR("Технический директор");

    private String name;

    Position(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
