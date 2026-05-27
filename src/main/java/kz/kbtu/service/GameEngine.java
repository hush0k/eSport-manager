package kz.kbtu.service;

import kz.kbtu.models.Team;
import lombok.Builder;

@Builder
public class GameEngine {
    private Team firstTeam;
    private Team secondTeam;

    public void startGame(){}
}
