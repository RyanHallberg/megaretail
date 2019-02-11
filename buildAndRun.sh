#!/bin/sh
mvn clean package && docker build -t com.megaretail/megaretail .
docker rm -f megaretail || true && docker run -d -p 8080:8080 -p 4848:4848 --name megaretail com.megaretail/megaretail 
