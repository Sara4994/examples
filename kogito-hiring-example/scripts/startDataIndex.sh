#!/bin/sh
echo "Script requires your Hiring Example project to be compiled"

PROJECT_VERSION=$(cd ../ && mvn help:evaluate -Dexpression=kogito.version -q -DforceStdout)

echo "Project version: ${PROJECT_VERSION}"

DATA_INDEX_VERSION=${PROJECT_VERSION}

PERSISTENCE_FOLDER=target/classes/persistence
DATA_INDEX_RUNNER="https://repository.jboss.org/nexus/service/local/artifact/maven/content?r=public&g=org.kie.kogito&a=data-index-service-infinispan&v=${DATA_INDEX_VERSION}&c=runner"

mkdir persistence

cp -rf ../$PERSISTENCE_FOLDER/*.proto persistence/

wget -nc -O data-index-service-infinispan-${DATA_INDEX_VERSION}-runner.jar ${DATA_INDEX_RUNNER}

java -jar  -Dkogito.protobuf.folder=./persistence data-index-service-infinispan-${DATA_INDEX_VERSION}-runner.jar
