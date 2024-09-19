package com.nba.fantasy_hoopz.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/version1/player")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getPlayers(
            @RequestParam(required = false) String team,
            @RequestParam(required = false) String player,
            @RequestParam(required = false) String college,
            @RequestParam(required = false) String position,
            @RequestParam(required = false) String nation) {

        if (team != null && college != null) {
            return playerService.getPlayerByTeamNameAndCollege(team, college);
        }
        else if (team != null) {
            return playerService.getPlayersFromTeam(team);
        }
        else if (player != null) {
            return playerService.getPlayersByName(player);
        }
        else if (college != null) {
            return playerService.getPlayersByCollege(college);
        }
        else if (position != null) {
            return playerService.getPlayersByPosition(position);
        }
        else if (nation != null) {
            return playerService.getPlayersByNation(nation);
        }
        else {
            return playerService.getPlayers();
        }
    }
}
