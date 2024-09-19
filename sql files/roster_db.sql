CREATE TABLE roster (player text,  age integer, games integer, games_started integer, minutes_played float, 
					 field_goals_made float, field_goals_attempted float, field_goals_percentage numeric(5, 3), 
					 three_points_made float, three_points_attempted float, three_points_percentage numeric(5, 3),
					 two_points_made float, two_points_attempted float, two_points_percentage numeric(5, 3), 
					 effective_field_goal numeric(5, 3), free_throws float, free_throws_attempted float, 
					 free_throws_percentage numeric(5, 3), offensive_rebounds float, defensive_rebounds float, 
					 total_rebounds float, assists float, steals float, blocks float, turnovers float,
					 personal_fouls float, points_per_game float, team text)

select * from roster