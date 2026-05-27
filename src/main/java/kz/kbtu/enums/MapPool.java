package kz.kbtu.enums;

import lombok.Getter;

@Getter
public enum MapPool {
    MIRAGE("ct"),
    DUST_2("ct"),
    INFERNO("ct"),
    ANCIENT("ct"),
    ANUBIS("t"),
    OVERPASS("ct"),
    NUKE("ct");

    private String stronger;
    MapPool(String stronger) {
        this.stronger = stronger;
    }
}
