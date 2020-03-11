
jar包的管理 注册中心

新建一个微服务需要

1.引入 common包即可




docker-compose快速启动项目

在linux上创建 /data/docker-cluster 目录 

docker-cluster/

    ├── config
    │   ├── Dockerfile
    │   └── springcloud-demo-config-0.0.1-SNAPSHOT.jar
    ├── config-local
    ├── docker-compose-after.yml
    ├── docker-compose.yml
    ├── eureka
    │   ├── Dockerfile
    │   └── springcloud-demo-eureka-0.0.1-SNAPSHOT.jar
    ├── shell
    │   └── wait-for.sh
    ├── test
    │   ├── Dockerfile
    │   └── springcloud-demo-test-0.0.1-SNAPSHOT.jar
    
    └── zuul
        ├── Dockerfile
        └── springcloud-demo-zuul-0.0.1-SNAPSHOT.jar

先执行docker-compose -f docker-compose.yml up -d 先启动注册中心和配置中心

在执行docker-compose -f docker-compose-after.yml up -d 启动其他微服务












