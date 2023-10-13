CREATE TABLE IF NOT EXISTS weeks(
  week_number INT PRIMARY KEY,
  away_team VARCHAR(255) NOT NULL,
  home_team VARCHAR(255) NOT NULL,
  game_location VARCHAR(255) NOT NULL,
  stadium VARCHAR(255) NOT NULL,
  broadcaster VARCHAR(255) NOT NULL
)

CREATE TABLE IF NOT EXISTS afc_north(
  team_id INT PRIMARY KEY,
  team_name VARCHAR(255) NOT NULL,
  stadium_location VARCHAR(255) NOT NULL,
  stadium VARCHAR(255) NOT NULL
)

CREATE TABLE IF NOT EXISTS afc_east(
  team_id INT PRIMARY KEY,
  team_name VARCHAR(255) NOT NULL,
  stadium_location VARCHAR(255) NOT NULL,
  stadium VARCHAR(255) NOT NULL
)

CREATE TABLE IF NOT EXISTS afc_south(
  team_id INT PRIMARY KEY,
  team_name VARCHAR(255) NOT NULL,
  stadium_location VARCHAR(255) NOT NULL,
  stadium VARCHAR(255) NOT NULL
)

CREATE TABLE IF NOT EXISTS afc_west(
  team_id INT PRIMARY KEY,
  team_name VARCHAR(255) NOT NULL,
  stadium_location VARCHAR(255) NOT NULL,
  stadium VARCHAR(255) NOT NULL
)

CREATE TABLE IF NOT EXISTS nfc_north(
  team_id INT PRIMARY KEY,
  team_name VARCHAR(255) NOT NULL,
  stadium_location VARCHAR(255) NOT NULL,
  stadium VARCHAR(255) NOT NULL
)

CREATE TABLE IF NOT EXISTS nfc_east(
  team_id INT PRIMARY KEY,
  team_name VARCHAR(255) NOT NULL,
  stadium_location VARCHAR(255) NOT NULL,
  stadium VARCHAR(255) NOT NULL
)

CREATE TABLE IF NOT EXISTS nfc_south(
  team_id INT PRIMARY KEY,
  team_name VARCHAR(255) NOT NULL,
  stadium_location VARCHAR(255) NOT NULL,
  stadium VARCHAR(255) NOT NULL
)

CREATE TABLE IF NOT EXISTS nfc_west(
  team_id INT PRIMARY KEY,
  team_name VARCHAR(255) NOT NULL,
  stadium_location VARCHAR(255) NOT NULL,
  stadium VARCHAR(255) NOT NULL
)
