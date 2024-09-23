package com.nba.fantasy_hoopz.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayersByCollege(String college) {
        return playerRepository.findByCollege(college);
    }

    public List<Player> findByNation(String nation) {
        return playerRepository.findByNation(nation);
    }

    public List<Player> findByTeam(String team) {
        return playerRepository.findByTeam(team);
    }

    public List<Player> findByPosition(String position) {
        return playerRepository.findByPosition(position);
    }
}
