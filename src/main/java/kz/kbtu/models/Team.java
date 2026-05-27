package kz.kbtu.models;

import kz.kbtu.common.generators.IdGenerator;
import kz.kbtu.enums.CountryCode;
import kz.kbtu.enums.Tier;
import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class Team {
    @Builder.Default
    @EqualsAndHashCode.Include
    private String id = IdGenerator.generateId("team");

    private String name;
    private String surname;
    private String slug;
    //Logotype
    private int points;
    private Tier tier;
    private int foundedYear;
    private CountryCode headquarter;
    private int fansCount;
    private Sponsor mainSponsor;

    @Builder.Default
    private ArrayList<Player> players = new ArrayList<>();
    private Coach coach;
}
