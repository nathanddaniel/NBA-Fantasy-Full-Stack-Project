package com.nba.fantasy_hoopz.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_stats")
public class Player {
    @Id
    @Column(name = "name", unique = true)
    private String player;
    private Integer age;

    private Integer games;
    private Integer gamesStarted;
    private Float minutePerGame;

    private Float fieldGoal;
    private Float fieldGoalAttempted;
    private Double fieldGoalPercentage;

    private Float threePoint;
    private Float threePointAttempted;
    private Double threePointPercentage;

    private Float twoPoint;
    private Float twoPointAttempted;
    private Double twoPointPercentage;

    private Double efficientFieldGoalPercentage;
    private Float freeThrows;
    private Float freeThrowsAttempted;
    private Double freeThrowsPercentage;

    private Float offensiveRebounds;
    private Float defensiveRebounds;
    private Float totalRebounds;

    private Float assists;
    private Float steals;
    private Float blocks;
    private Float turnovers;
    private Float personalFouls;
    private Float pointsPerGame;




}
