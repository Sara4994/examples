#!/bin/sh
echo "Starting the Kogito Task Console"

PROJECT_VERSION=$(cd ../ && mvn help:evaluate -Dexpression=kogito.version -q -DforceStdout)

echo "Project version: ${PROJECT_VERSION}"

TASK_CONSOLE_VERSION=${PROJECT_VERSION}
TASK_CONSOLE_RUNNER="https://repository.jboss.org/nexus/service/local/artifact/maven/content?r=public&g=org.kie.kogito&a=task-console&v=${TASK_CONSOLE_VERSION}&c=runner"

wget -nc -O task-console-${TASK_CONSOLE_VERSION}-runner.jar ${TASK_CONSOLE_RUNNER}

java -jar  -Dquarkus.http.port=8380 -Dquarkus.profile=keycloak -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=1044 task-console-${TASK_CONSOLE_VERSION}-runner.jar
