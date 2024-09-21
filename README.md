
## ELK Stack 구현하기

### - 로깅흐름

1. Postman에서 Spring Boot 애플리케이션으로 요청 전송
2. Spring Boot 애플리케이션에서 로그 생성
3. 생성된 로그가 Logstash로 전송
4. Logstash가 로그를 처리하고 Elasticsearch로 전송
5. Elasticsearch가 로그 데이터 저장
6. Kibana에서 Elasticsearch의 데이터를 조회하여 로그 표시
