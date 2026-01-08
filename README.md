# 개발환경
- **Framework**: Spring Boot 3.5.9
- **Language**: Java 17
- **Build Tool**: Gradle 8.14.3
- **DB**: MongoDB 7.0.28
- **DB Mapping**: Spring Data JPA 3.5.9, MyBatis 3.0.5, Spring Data MongoDB(MongoTemplate) 3.5.9
- **Utilities**: Lombok<br><br><br>

# 프로젝트 구성
## 📁 도메인형 구조 (Domain-Driven Design, DDD)
`도메인`중심의 비즈니스 로직 계층입니다.<br>
각 도메인은 Controller -> Service -> Repository 구조를 따릅니다.<br>
**명시성**을 확보하고자 관련 클래스들의 상위폴더를 두었습니다.<br><br>
`구조`<br>
com/kstec/idp/portal<br>
├── domain<br>
│   ├── history &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;# history 관련 도메인<br>
│   │   ├── controller &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;# API/View 컨트롤러<br>
│   │   ├── service &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;# 비즈니스 로직 (JPA/MyBatis 호출)<br>
│   │   ├── repository &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;# JPA Interface<br>
│   │   ├── mapper &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;# MyBatis Mapper Interface<br>
│   │   ├── entity &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;# JPA Entity (DB 테이블 매핑)<br>
│   │   └── dto &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;# Request/Response 객체 (데이터 전달용)

## 📁 global
`global`은 전역적으로 사용되는 공통 설정 및 기능을 관리합니다.
- **config**: CORS, 메시지 컨버터 등 웹 관련 설정
- **auth**: 인증/인가 관련 로직 (JWT, Securtiy...)
- **exception**: 전역 예외 처리
- **common**: 공통 유틸리티...

## 📁 resources/mappers
`mappers`는 MyBatis SQL Mapper XML 파일을 관리합니다.

## 📁 Application Configuration
- **application.yml**: 공통 환경 설정
- **application-dev.yml**: 개발 환경 설정
- **application-prod.yml**: 운영 환경 설정