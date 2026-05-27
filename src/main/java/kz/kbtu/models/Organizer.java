package kz.kbtu.models;

import kz.kbtu.common.generators.IdGenerator;
import kz.kbtu.enums.CountryCode;
import kz.kbtu.enums.Tier;
import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@ToString
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Organizer {
    @EqualsAndHashCode.Include
    private String id;

    private String name;
    private String logotype;
    private CountryCode country;
    private int reputation;
    private Tier tier;
    private int foundedYear;
    private int foundedMonth;
    private int foundedDay;

    @Builder.Default
    private ArrayList<Sponsor> sponsors = new ArrayList<>();
}
