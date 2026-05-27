package kz.kbtu.models;

import kz.kbtu.enums.CountryCode;
import kz.kbtu.enums.Format;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;

@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class Tournament {
    @EqualsAndHashCode.Include
    private String id;

    private String name;
    private Organizer organizer;
    private CountryCode location;
    @Builder.Default
    private ArrayList<Team> teams = new ArrayList<>();
    private Team winner;
    private LocalDate startDate;
    private LocalDate endDate;
    private Format format;
    private int prizePool;
    private int hltvPoints;
    private int valvePoints;
}
