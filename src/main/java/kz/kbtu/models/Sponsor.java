package kz.kbtu.models;

import kz.kbtu.common.generators.IdGenerator;
import kz.kbtu.enums.BusinessLevel;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sponsor {
    @EqualsAndHashCode.Include
    @Builder.Default
    private String id = IdGenerator.generateId("sponsor");

    private String name;
    private String description;
    private String logotype;
    private BusinessLevel level;
    private int budget;
    private String mainProduct;
}
