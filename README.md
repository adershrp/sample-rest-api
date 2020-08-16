## sample-rest-api

### Include lib using below dependency.
```xml
<dependency>
  <groupId>com.rate.limitter</groupId>
  <artifactId>rate-limitter</artifactId>
  <version>0.0.1-SNAPSHOT</version>
</dependency>
```

### Configure the Default values, to enable the api access rate limiting.

If below values are not present, api-rate limiting won't get enabled.
```yml
default:
  user-api:
    duration: 120
    threshold: 60
```

### Configure User specific API limits
```yml
rate-limiter:
  user-api-map:
    user1:
    - api: /v1/sample/second-api
      duration: 120
      threshold: 90
    - api: /v1/sample/first-api
      duration: 120
      threshold: 60
    user2:
    - api: /v1/sample/second-api
      duration: 120
      threshold: 60
    - api: /v1/sample/first-api
      duration: 120
      threshold: 120
```
