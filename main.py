import logic
from flask import Flask
app = Flask(__name__)

@app.route('/')
def home():
    week = logic.get_games()
    return week
