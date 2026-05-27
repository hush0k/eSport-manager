package kz.kbtu.models;

import kz.kbtu.enums.MapPool;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
@Builder
public class MapPlayed {
    private Team firstTeam;
    private Team secondTeam;
    private int firstTeamWinedRounds;
    private int secondTeamWinedRounds;
    private MapPool map;
    @Builder.Default
    private Map<Player, PlayerStatistics> playerStatistics = new HashMap<>();
}
