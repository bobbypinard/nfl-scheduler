
import json
import random
from flask import Flask
app = Flask(__name__)

with open('./teams/afc/west.json') as file:
    afc_west = json.load(file)
    
def shuffle(dict):
    placeholder = 0
    shuffled_array = dict
    for i in range(len(dict) -1, -1, -1):
        random_int = random.randint(0, i)
        placeholder = shuffled_array[i]
        shuffled_array[i] = shuffled_array[random_int]
        shuffled_array[random_int] = placeholder

    return shuffled_array

def uuid_to_name(uuids):
    names = []
    for uuid in uuids:
        names.append(afc_west[uuid]['teamName'])
    return names

def get_games(dict):
    week = []
    count = 0
    for team_info in dict.items():
        week.append(team_info[0])
        count += 1
    val = shuffle(week)
    value = uuid_to_name(val)
    return value

@app.route('/')
def home():
    week = get_games(afc_west)
    return week
