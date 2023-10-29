# syntax=docker/dockerfile:1.4
FROM python:3.10-alpine 
COPY . /app
WORKDIR /app
RUN pip install -r requirements.txt --no-cache-dir
CMD python main.py
