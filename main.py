
import json
import random
from flask import Flask
app = Flask(__name__)

with open('./teams/afc/west.json') as file:
    afc_west = json.load(file)
    
def shuffle(dict):
    d = []
    placeholder = 0
    for uuid in dict.items():
        d.append(uuid)

    shuffled_array = d
    for i in range(len(d) -1, -1, -1):
        random_int = random.randint(0, i)
        placeholder = shuffled_array[i]
        shuffled_array[i] = shuffled_array[random_int]
        shuffled_array[random_int] = placeholder

    return shuffled_array

def get_games(dict):
    wiik = []
    count = 0
    val = shuffle(afc_west)
    for team_info in dict.items():
        team1 = afc_west[val[count]]
        wiik.append(team1)
        count += 1
    return week

@app.route('/')
def home():
    week = get_games(afc_west)
    return week
