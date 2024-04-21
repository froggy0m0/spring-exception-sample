# Spring Boot Exception Handling Sample

* Java 17
* Spring Boot 3.2.5
* JPA
* MySQL

## 기능

예외를 중앙에서 관리합니다.

- **요청 유효성 검증**: `@Validated` 어노테이션을 사용해 컨트롤러 레벨에서 요청 데이터의 유효성을 검증합니다.
- **사용자 정의 예외 처리**: 서비스 또는 컨트롤러 레벨에서 발생 가능한 예외를 사용자 정의 예외로 처리합니다.
- **예외 중앙 관리**: `CustomException` 클래스와 `CustomExceptionStatus` 열거형을 통해 예외 상황을 중앙에서 관리합니다.

## DB Settings

로컬 데이터베이스 설정은 다음과 같습니다:

- **DB**: MySQL
- **Port**: 3306
- **ID**: root
- **PW**: root

