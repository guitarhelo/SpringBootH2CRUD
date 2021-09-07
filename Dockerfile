# FROM 指定基础镜像
# For Java 8, try this
# FROM openjdk:8-jdk-alpine

# For Java 11, try this
FROM adoptopenjdk/openjdk11:alpine-jre
# ARG 构建参数
ARG JAR_FILE=build/libs/*.jar
# COPY 复制文件
COPY ${JAR_FILE} app.jar
# 暴露端口
EXPOSE 8080
# CMD 容器启动命令
CMD java -jar /app.jar