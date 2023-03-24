package io.github.andreleite.msstarwars.common;

import io.github.andreleite.msstarwars.domain.Planet;

public class PlanetConstants {

    public static final Planet PLANET = new Planet("name", "climate", "terrain");
    public static final Planet INVALID_PLANET = new Planet("", "", "");
}
