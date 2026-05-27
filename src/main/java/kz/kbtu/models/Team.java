package kz.kbtu.models;

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
    @EqualsAndHashCode.Include
    private String id;

    private String name;
    private String slug;
    private String logotype;
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
