from bs4 import BeautifulSoup
import pandas as pd
import requests
import time

all_teams = []

html = requests.get("https://www.pro-football-reference.com/years/2023/index.htm").text
soup = BeautifulSoup(html, "lxml")

afc_table = soup.find_all('table', class_='stats_table')[0]
nfc_table = soup.find_all('table', class_='stats_table')[1]

afc_df = pd.read_html(str(afc_table))[0]
nfc_df = pd.read_html(str(nfc_table))[0]

# Print the cleaned DataFrame
print(afc_df)
