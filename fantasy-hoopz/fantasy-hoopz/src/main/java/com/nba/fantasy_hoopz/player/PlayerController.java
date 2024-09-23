package com.nba.fantasy_hoopz.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/version1/player")
//@CrossOrigin(origins = "*")  // Enable CORS for all origins
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/college/{college}")
    public List<Player> getPlayersByCollege(@PathVariable String college) {
        return playerService.getPlayersByCollege(college);
    }

    @GetMapping("/nation/{nation}")
    public ResponseEntity<List<Player>> getPlayersByNation(@PathVariable String nation) {
        List<Player> players = playerService.findByNation(nation);
        return new ResponseEntity<>(players, HttpStatus.OK);
    }
}

