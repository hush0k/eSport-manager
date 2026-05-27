package kz.kbtu.enums;

import lombok.Getter;

@Getter
public enum BusinessLevel {
    SMALL_BUSINESS(1),
    MEDIUM_BUSINESS(2),
    LARGE_BUSINESS(3);

    private final int level;
    BusinessLevel(int level) {
        this.level = level;
    }
}
