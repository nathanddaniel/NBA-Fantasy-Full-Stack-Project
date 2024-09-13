package com.nba.fantasy_hoopz.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="roster")
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
    private String team;

    private String nation;
    private String college;

    public Player() {

    }

    public Player(String player, Integer age, Integer games, Integer gamesStarted, Float minutePerGame, Float fieldGoal, Float fieldGoalAttempted, Double fieldGoalPercentage, Float threePoint, Float threePointAttempted, Double threePointPercentage, Float twoPoint, Float twoPointAttempted, Double twoPointPercentage, Double efficientFieldGoalPercentage, Float freeThrows, Float freeThrowsAttempted, Double freeThrowsPercentage, Float offensiveRebounds, Float defensiveRebounds, Float totalRebounds, Float assists, Float steals, Float blocks, Float turnovers, Float personalFouls, Float pointsPerGame, String team, String nation, String college) {
        this.player = player;
        this.age = age;
        this.games = games;
        this.gamesStarted = gamesStarted;
        this.minutePerGame = minutePerGame;
        this.fieldGoal = fieldGoal;
        this.fieldGoalAttempted = fieldGoalAttempted;
        this.fieldGoalPercentage = fieldGoalPercentage;
        this.threePoint = threePoint;
        this.threePointAttempted = threePointAttempted;
        this.threePointPercentage = threePointPercentage;
        this.twoPoint = twoPoint;
        this.twoPointAttempted = twoPointAttempted;
        this.twoPointPercentage = twoPointPercentage;
        this.efficientFieldGoalPercentage = efficientFieldGoalPercentage;
        this.freeThrows = freeThrows;
        this.freeThrowsAttempted = freeThrowsAttempted;
        this.freeThrowsPercentage = freeThrowsPercentage;
        this.offensiveRebounds = offensiveRebounds;
        this.defensiveRebounds = defensiveRebounds;
        this.totalRebounds = totalRebounds;
        this.assists = assists;
        this.steals = steals;
        this.blocks = blocks;
        this.turnovers = turnovers;
        this.personalFouls = personalFouls;
        this.pointsPerGame = pointsPerGame;
        this.team = team;
        this.nation = nation;
        this.college = college;
    }

    public Player(String player) {
        this.player = player;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGames() {
        return games;
    }

    public void setGames(Integer games) {
        this.games = games;
    }

    public Integer getGamesStarted() {
        return gamesStarted;
    }

    public void setGamesStarted(Integer gamesStarted) {
        this.gamesStarted = gamesStarted;
    }

    public Float getMinutePerGame() {
        return minutePerGame;
    }

    public void setMinutePerGame(Float minutePerGame) {
        this.minutePerGame = minutePerGame;
    }

    public Float getFieldGoal() {
        return fieldGoal;
    }

    public void setFieldGoal(Float fieldGoal) {
        this.fieldGoal = fieldGoal;
    }

    public Float getFieldGoalAttempted() {
        return fieldGoalAttempted;
    }

    public void setFieldGoalAttempted(Float fieldGoalAttempted) {
        this.fieldGoalAttempted = fieldGoalAttempted;
    }

    public Double getFieldGoalPercentage() {
        return fieldGoalPercentage;
    }

    public void setFieldGoalPercentage(Double fieldGoalPercentage) {
        this.fieldGoalPercentage = fieldGoalPercentage;
    }

    public Float getThreePoint() {
        return threePoint;
    }

    public void setThreePoint(Float threePoint) {
        this.threePoint = threePoint;
    }

    public Float getThreePointAttempted() {
        return threePointAttempted;
    }

    public void setThreePointAttempted(Float threePointAttempted) {
        this.threePointAttempted = threePointAttempted;
    }

    public Double getThreePointPercentage() {
        return threePointPercentage;
    }

    public void setThreePointPercentage(Double threePointPercentage) {
        this.threePointPercentage = threePointPercentage;
    }

    public Float getTwoPoint() {
        return twoPoint;
    }

    public void setTwoPoint(Float twoPoint) {
        this.twoPoint = twoPoint;
    }

    public Float getTwoPointAttempted() {
        return twoPointAttempted;
    }

    public void setTwoPointAttempted(Float twoPointAttempted) {
        this.twoPointAttempted = twoPointAttempted;
    }

    public Double getTwoPointPercentage() {
        return twoPointPercentage;
    }

    public void setTwoPointPercentage(Double twoPointPercentage) {
        this.twoPointPercentage = twoPointPercentage;
    }

    public Double getEfficientFieldGoalPercentage() {
        return efficientFieldGoalPercentage;
    }

    public void setEfficientFieldGoalPercentage(Double efficientFieldGoalPercentage) {
        this.efficientFieldGoalPercentage = efficientFieldGoalPercentage;
    }

    public Float getFreeThrows() {
        return freeThrows;
    }

    public void setFreeThrows(Float freeThrows) {
        this.freeThrows = freeThrows;
    }

    public Float getFreeThrowsAttempted() {
        return freeThrowsAttempted;
    }

    public void setFreeThrowsAttempted(Float freeThrowsAttempted) {
        this.freeThrowsAttempted = freeThrowsAttempted;
    }

    public Double getFreeThrowsPercentage() {
        return freeThrowsPercentage;
    }

    public void setFreeThrowsPercentage(Double freeThrowsPercentage) {
        this.freeThrowsPercentage = freeThrowsPercentage;
    }

    public Float getOffensiveRebounds() {
        return offensiveRebounds;
    }

    public void setOffensiveRebounds(Float offensiveRebounds) {
        this.offensiveRebounds = offensiveRebounds;
    }

    public Float getDefensiveRebounds() {
        return defensiveRebounds;
    }

    public void setDefensiveRebounds(Float defensiveRebounds) {
        this.defensiveRebounds = defensiveRebounds;
    }

    public Float getTotalRebounds() {
        return totalRebounds;
    }

    public void setTotalRebounds(Float totalRebounds) {
        this.totalRebounds = totalRebounds;
    }

    public Float getAssists() {
        return assists;
    }

    public void setAssists(Float assists) {
        this.assists = assists;
    }

    public Float getSteals() {
        return steals;
    }

    public void setSteals(Float steals) {
        this.steals = steals;
    }

    public Float getBlocks() {
        return blocks;
    }

    public void setBlocks(Float blocks) {
        this.blocks = blocks;
    }

    public Float getTurnovers() {
        return turnovers;
    }

    public void setTurnovers(Float turnovers) {
        this.turnovers = turnovers;
    }

    public Float getPersonalFouls() {
        return personalFouls;
    }

    public void setPersonalFouls(Float personalFouls) {
        this.personalFouls = personalFouls;
    }

    public Float getPointsPerGame() {
        return pointsPerGame;
    }

    public void setPointsPerGame(Float pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
