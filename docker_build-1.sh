docker build -t personservice .
docker tag personservice:latest jingjunlongsap/personservice:1.0
docker push jingjunlongsap/personservice:1.0