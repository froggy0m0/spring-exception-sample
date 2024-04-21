# Spring Boot Exception Handling Sample


## 기능

예외를 중앙에서 관리합니다.

- **요청 유효성 검증**: `@Validated` 어노테이션을 사용해 컨트롤러 레벨에서 요청 데이터의 유효성을 검증합니다.
- **사용자 정의 예외 처리**: 서비스 또는 컨트롤러 레벨에서 발생 가능한 예외를 사용자 정의 예외로 처리합니다.
- **예외 중앙 관리**: `CustomException` 클래스와 `CustomExceptionStatus` 열거형을 통해 예외 상황을 중앙에서 관리합니다.




## 예외 처리 방법

### 1. 요청 유효성 검증

- **API**: `POST /api/product`
- **오류**: `MethodArgumentNotValidException` (수량 50 초과)
- **조건**: 수량이 50을 초과할 경우
- **예시 요청**:
  ```json
  {
    "name": "Example Product",
    "quantity": 51
  }
  ```
- **설명**: `@Validated` 어노테이션을 사용하여 컨트롤러에서 요청의 수량이 50을 넘지 않도록 검증합니다. 50을 초과하는 값이 입력되면 `MethodArgumentNotValidException` 예외가 발생합니다.

### 2. 사용자 정의 예외 처리

- **API**: `GET /api/product?Id=3`
- **오류**: `CustomException` (해당하는 제품 없음)
- **조건**: 요청된 ID에 해당하는 제품이 없을 경우
- **설명**: 요청된 제품 ID가 데이터베이스에 존재하지 않을 때 `CustomException`을 발생시킵니다. 이는 중앙에서 관리되는 사용자 정의 예외를 통해 처리됩니다.


## Dummy data

| id | name         | quantity |
|----|--------------|----------|
| 1  | 삼성 갤럭시북| 10     |
| 2  | 삼성 세탁기  | 5      |


## DB Settings

로컬 데이터베이스 설정은 다음과 같습니다:

- **DB**: MySQL
- **Port**: 3306
- **ID**: root
- **PW**: root

## 기술 스택
- **Java Version**: 17
- **Spring Boot Version**: 3.2.5
- **Database**: MySQL
- **ORM**: JPA
