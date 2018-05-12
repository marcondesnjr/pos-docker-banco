
docker build -t pos-banco/db ./postgres
docker run --name pos-banco-db -p 5433:5432 -d pos-banco/db

mvn clean package -Pdocker

docker build -t pos-banco/app .
docker run --name pos-banco-app -p 8080:8080 -p 4848:4848 --link pos-banco-db:postgres-db -d pos-banco/app
