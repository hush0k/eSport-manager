package kz.kbtu.common.factory;

import kz.kbtu.common.generators.IdGenerator;
import kz.kbtu.models.*;

public class EntityFactory {
    private IdGenerator generator;

    public EntityFactory(IdGenerator generator) {
        this.generator = generator;
    }

    public Player createPlayer(Player.PlayerBuilder playerBuilder) {
        String id = generator.generateId("player");
        return playerBuilder.id(id).build();
    }

    public Sponsor createSponsor(Sponsor.SponsorBuilder sponsorBuilder) {
        String id = generator.generateId("sponsor");
        return sponsorBuilder.id(id).build();
    }

    public Team createTeam(Team.TeamBuilder teamBuilder) {
        String id = generator.generateId("team");
        return teamBuilder.id(id).build();
    }

    public Tournament createTournament(Tournament.TournamentBuilder tournamentBuilder){
        String id = generator.generateId("tournament");
        return tournamentBuilder.id(id).build();
    }

    public Organizer createOrganizer(Organizer.OrganizerBuilder organizerBuilder){
        String id = generator.generateId("organizer");
        return organizerBuilder.id(id).build();
    }

    public Match createMatch(Match.MatchBuilder matchBuilder){
        String id = generator.generateId("match");
        return matchBuilder.id(id).build();
    }

    public Coach createCoach(Coach.CoachBuilder coachBuilder){
        String id = generator.generateId("coach");
        return coachBuilder.id(id).build();
    }

}
