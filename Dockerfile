#基础镜像，如果本地仓库没有，会从远程仓库拉取
FROM adoptopenjdk/openjdk11
ARG JAR_FILE
#编译后的jar包copy到容器中创建到目录内
COPY ${JAR_FILE} /opt/docker-demo.jar
#指定容器启动时要执行的命令
ENTRYPOINT ["java","-jar","/opt/docker-demo.jar"]
