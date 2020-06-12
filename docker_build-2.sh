docker build -t personservice .
docker tag personservice:latest jingjunlongsap/personservice:2.0
docker push jingjunlongsap/personservice:2.0