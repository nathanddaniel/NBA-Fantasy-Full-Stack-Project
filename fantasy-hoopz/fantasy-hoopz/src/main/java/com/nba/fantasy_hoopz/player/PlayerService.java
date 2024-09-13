package com.nba.fantasy_hoopz.player;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers(){
        return playerRepository.findAll();
    }

    //this will return a list of players from a given team
    public List<Player> getPlayersFromTeam(String teamName) {
        return playerRepository.findAll().stream()
                .filter(player -> teamName.equals(player.getTeam()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByName(String searchText){
        return playerRepository.findAll().stream()
                .filter(player -> player.getPlayer().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List <Player> getPlayersByNation(String searchNation){
        return playerRepository.findAll().stream()
                .filter(player -> player.getNation().toLowerCase().contains(searchNation.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List <Player> getPlayersByCollege(String searchCollege){
        return playerRepository.findAll().stream()
                .filter(player -> player.getCollege().toLowerCase().contains(searchCollege.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayerByTeamNameAndCollege(String teamName, String searchCollege) {
        return playerRepository.findAll().stream()
                .filter(player -> teamName.equals(player.getTeam()) && searchCollege.equals(player.getCollege()))
                .collect(Collectors.toList());
    }
}
