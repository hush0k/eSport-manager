package kz.kbtu.models;

import kz.kbtu.common.generators.IdGenerator;
import kz.kbtu.enums.BestOf;
import kz.kbtu.enums.MapPool;
import kz.kbtu.enums.StageOfTournament;
import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class Match {
    @EqualsAndHashCode.Include
    private String id;

    private Team firstTeam;
    private Team secondTeam;
    private Tournament tournament;
    private Team winner;
    private Team loser;
    private StageOfTournament stage;
    private BestOf bestOf;
    @Builder.Default
    private ArrayList<MapPool> bannedMaps = new ArrayList<>();
    @Builder.Default
    private ArrayList<MapPool> pickedMaps = new ArrayList<>();
    @Builder.Default
    private ArrayList<MapPlayed> playedMaps = new ArrayList<>();
    private int firstTeamScore;
    private int secondTeamScore;

}
