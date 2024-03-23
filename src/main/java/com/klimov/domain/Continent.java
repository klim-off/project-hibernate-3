package com.klimov.domain;

public enum Continent {
    ASIA ("Asia"),
    EUROPE ("Europe"),
    NORTH_AMERICA("North America"),
    AFRICA ("Africa"),
    AUSTRALIA("Australia"),
     ANTARCTICA("Antarctica"),
    SOUTH_AMERICA("South America");

    private final String value;

    Continent(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
