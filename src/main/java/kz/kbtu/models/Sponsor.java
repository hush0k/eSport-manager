package kz.kbtu.models;

import kz.kbtu.enums.BusinessLevel;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class Sponsor {
    @EqualsAndHashCode.Include
    private String id;

    private String name;
    private String description;
    private String logotype;
    private BusinessLevel level;
    private int budget;
    private String mainProduct;
}
