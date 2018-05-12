docker rm pos-banco-db -f

docker rm pos-banco-app -f

docker rmi pos-banco/db
docker rmi pos-banco/app