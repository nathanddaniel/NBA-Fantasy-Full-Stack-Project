from bs4 import BeautifulSoup
import pandas as pd
import requests
import time

# Requesting the HTML page
html = requests.get("https://www.pro-football-reference.com/years/2023/index.htm").text
soup = BeautifulSoup(html, "lxml")

# Extracting the AFC and NFC tables
afc_table = soup.find_all('table', class_='stats_table')[0]
nfc_table = soup.find_all('table', class_='stats_table')[1]



# Reading the HTML content directly into DataFrames
afc_data = pd.read_html(str(afc_table))[0]
nfc_data = pd.read_html(str(nfc_table))[0]

# Define column names (based on the table structure for both tables)
columns = ['Tm', 'W', 'L', 'W-L%', 'PF', 'PA', 'PD', 'MoV', 'SoS', 'SRS', 'OSRS', 'DSRS']

# Rename columns for both AFC and NFC tables
afc_data.columns = columns
nfc_data.columns = columns

# Clean the AFC DataFrame: remove rows with "AFC" in 'Tm' and NaN rows
afc_data = afc_data.dropna(subset=['Tm'])  # Drop rows where 'Tm' is NaN
afc_data = afc_data[~afc_data['Tm'].str.contains("AFC", na=False)]  # Remove rows with "AFC" in 'Tm'

# Clean the NFC DataFrame: remove rows with "NFC" in 'Tm' and NaN rows
nfc_data = nfc_data.dropna(subset=['Tm'])  # Drop rows where 'Tm' is NaN
nfc_data = nfc_data[~nfc_data['Tm'].str.contains("NFC", na=False)]  # Remove rows with "NFC" in 'Tm'

# Combine the AFC and NFC DataFrames
overall_standings = pd.concat([afc_data, nfc_data], ignore_index=True)

# Print the combined DataFrame (Overall Standings)
print("Overall Standings (AFC + NFC):")
print(overall_standings)