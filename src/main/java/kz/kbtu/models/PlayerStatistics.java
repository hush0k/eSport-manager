package kz.kbtu.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class PlayerStatistics {
    private Player player;
    private int kills;
    private int deaths;
    private int assists;
    private int totalDamage;
    private int totalRounds;
    private int kastRounds;
    private int openingKills;
    private int openingDeaths;
    private int headshotKills;

    

}
