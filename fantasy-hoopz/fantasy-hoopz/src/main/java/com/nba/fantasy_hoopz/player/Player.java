package com.nba.fantasy_hoopz.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="roster")
public class Player {
    @Id
    @Column(name = "player", unique = true)
    private String player;

    @Column(name = "age")
    private Integer age;

    @Column(name = "games")
    private Integer games;

    @Column(name = "games_started")
    private Integer gamesStarted;

    @Column(name = "minutes_played")
    private Float minutePerGame;

    @Column(name = "field_goals_made")
    private Float fieldGoal;

    @Column(name = "field_goals_attempted")
    private Float fieldGoalAttempted;

    @Column(name = "field_goals_percentage")
    private Double fieldGoalPercentage;

    @Column(name = "three_points_made")
    private Float threePoint;

    @Column(name = "three_points_attempted")
    private Float threePointAttempted;

    @Column(name = "three_points_percentage")
    private Double threePointPercentage;

    @Column(name = "two_points_made")
    private Float twoPoint;

    @Column(name = "two_points_attempted")
    private Float twoPointAttempted;

    @Column(name = "two_points_percentage")
    private Double twoPointPercentage;

    @Column(name = "effective_field_goal")
    private Double efficientFieldGoalPercentage;

    @Column(name = "free_throws")
    private Float freeThrows;

    @Column(name = "free_throws_attempted")
    private Float freeThrowsAttempted;

    @Column(name = "free_throws_percentage")
    private Double freeThrowsPercentage;

    @Column(name = "offensive_rebounds")
    private Float offensiveRebounds;

    @Column(name = "defensive_rebounds")
    private Float defensiveRebounds;

    @Column(name = "total_rebounds")
    private Float totalRebounds;

    @Column(name = "assists")
    private Float assists;

    @Column(name = "steals")
    private Float steals;

    @Column(name = "blocks")
    private Float blocks;

    @Column(name = "turnovers")
    private Float turnovers;

    @Column(name = "personal_fouls")
    private Float personalFouls;

    @Column(name = "points_per_game")
    private Float pointsPerGame;

    @Column(name = "team")
    private String team;

    @Column(name = "position")
    private String position;

    @Column(name = "nation")
    private String nation;

    @Column(name = "college")
    private String college;

    public Player() {

    }

    public Player(String player, Integer age, Integer games, Integer gamesStarted, Float minutePerGame, Float fieldGoal, Float fieldGoalAttempted, Double fieldGoalPercentage, Float threePoint, Float threePointAttempted, Double threePointPercentage, Float twoPoint, Float twoPointAttempted, Double twoPointPercentage, Double efficientFieldGoalPercentage, Float freeThrows, Float freeThrowsAttempted, Double freeThrowsPercentage, Float offensiveRebounds, Float defensiveRebounds, Float totalRebounds, Float assists, Float steals, Float blocks, Float turnovers, Float personalFouls, Float pointsPerGame, String team, String position, String nation, String college) {
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
        this.position = position;
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
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
