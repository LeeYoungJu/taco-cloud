FROM azul/zulu-openjdk-alpine:17-jre

ARG JAR_FILLE_PATH=/build/libs/taco-cloud-0.0.1.jar

WORKDIR /app

COPY $JAR_FILLE_PATH .

COPY entrypoint.sh .

RUN ["chmod", "+x", "entrypoint.sh"]
ENTRYPOINT ["sh", "entrypoint.sh"]
