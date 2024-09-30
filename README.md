
## ELK Stack 구현하기

### - 로깅흐름

1. Postman에서 Spring Boot 애플리케이션으로 요청 전송
2. Spring Boot 애플리케이션에서 로그 생성
3. 생성된 로그가 파일 시스템에 저장
    - 이제 로그는 ./logs/application.log 파일에 직접 저장됩니다.
4. Filebeat가 로그 파일 모니터링 및 수집
    - Filebeat는 설정된 로그 파일(./logs/application.log)을 지속적으로 모니터링합니다.
    - 새로운 로그 항목이 파일에 추가되면 Filebeat가 이를 감지하고 수집합니다.
5. Filebeat가 수집한 로그를 Logstash로 전송
    - Filebeat는 수집한 로그 데이터를 Logstash로 전송합니다.
6. Logstash가 로그를 처리하고 Elasticsearch로 전송
    - Logstash는 Filebeat로부터 받은 로그 데이터를 처리합니다.
    - 처리된 데이터는 Elasticsearch로 전송됩니다.
7. Elasticsearch가 로그 데이터 저장
8. Kibana에서 Elasticsearch의 데이터를 조회하여 로그 표시
