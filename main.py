import flask
app = flask.Flask(__name__)

@app.route('/')
def hello_world():
    return 'Flask cocked, locked, and ready to rock.'

if __name__ == '__main__':
    app.run(debug=True,host='0.0.0.0')
