package com.nba.fantasy_hoopz.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
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

    public List <Player> getPlayersByAge(Integer searchAge){
        return playerRepository.findAll().stream()
                .filter(player -> player.getAge().equals(searchAge))
                .collect(Collectors.toList());
    }
}
