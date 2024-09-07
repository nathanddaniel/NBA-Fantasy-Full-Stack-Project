from bs4 import BeautifulSoup
import pandas as pd
import requests
import time

# Requesting the HTML page
html = requests.get("https://www.basketball-reference.com/leagues/NBA_2023_standings.html").text
soup = BeautifulSoup(html, "lxml")

# Extracting the Western Conference and Eastern Conferences tables
east_table = soup.find_all('table', class_='stats_table')[0]
west_table = soup.find_all('table', class_='stats_table')[1]

# # Reading the HTML content directly into DataFrames
# east_data = pd.read_html(str(east_table))[0]
# west_data = pd.read_html(str(west_table))[0]

# Within each conference standings table on the website, there's a link for each team's stats
# We want to get each team's link
eLinks = east_table.find_all('a')
wLinks = west_table.find_all('a')

# We filter all the links within the table to get all the links that have "/teams" in them
# Each link that has that is a link to an NBA team's stats website
eLinks = [l.get("href") for l in eLinks if "/teams" in l.get("href", "")]
wLinks = [l.get("href") for l in wLinks if "/teams" in l.get("href", "")]

# Prepend the base URL to each of the filtered links from the table
eTeamUrls = [f"https://www.basketball-reference.com{l}" for l in eLinks]
wTeamUrls = [f"https://www.basketball-reference.com{l}" for l in wLinks]

nbaTeamUrls = eTeamUrls + wTeamUrls

# Function to scrape roster data for a given NBA team URL using the table ID
for nbaTeamUrl in nbaTeamUrls:
    # retrieving the abbreviation of each NBA team from each team url
    nbaAbr = nbaTeamUrl.split("/")[-2]
    # Retrieving the HTML content from each NBA team url
    teamData = requests.get(nbaTeamUrl).text
    # Using Beautiful Soup to parse through the content
    soup = BeautifulSoup(teamData, "lxml")
    # getting the table that contains the entire roster for each team
    teamRoster = soup.find_all('table', class_='stats_table')[0]
    print(teamRoster)
