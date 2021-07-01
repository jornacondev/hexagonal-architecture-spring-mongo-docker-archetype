FROM mongo:4.4.6
COPY init.json /init.json
CMD mongo movieDatabase --eval "printjson(db.dropDatabase())"
CMD mongoimport --host mongodb --db sampleDatabase --collection Sample --type json --file /init.json --jsonArray