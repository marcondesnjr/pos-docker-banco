FROM postgres
ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD 123456
ENV POSTGRES_DB pos-docker-banco
ADD ./create.sql /docker-entrypoint-initdb.d/
ADD ./insert.sql /docker-entrypoint-initdb.d/
