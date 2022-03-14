# Simple test for docker-compose

## Just an application to increment a Redis Key with Jedis
Each time that you access *localhost:7003*, implements +1 to key "visitors";

Access *localhost:7003/reset* to reset key "visitors".

### Endpoints:
- localhost:7003

- localhost:7003/reset

### Run with docker-compose:
    docker compose up

### Run local:

Up a redis container with 6379 port and add to VM Options:

    -Dredis.url=localhost
