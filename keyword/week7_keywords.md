
# Week 7 Keywords

## Database (DB)

### Database의 정의는 무엇일까요?

데이터베이스는 구조화된 정보 또는 데이터의 조직화된 모음으로서 일반적으로 컴퓨터 시스템에 전자적으로 저장됩니다. DB는 보통 DBMS에 의해 제어되며, 데이터와 애플리케이션을 하나로 묶어 데이터베이스 시스템이라고 합니다.

데이터는 보통 테이블 형식(행과 열)으로 저장되며, SQL 언어를 통해 작성 및 쿼리됩니다.

🔗 [출처: Oracle Database 소개](https://www.oracle.com/kr/database/what-is-database/)

### Database는 어디서 주로 사용될까요?

- 애플리케이션과 관련된 데이터를 저장하고 관리하는 데 사용됩니다.

---

## Database Management System (DBMS)

### DBMS란 무엇일까요?

DBMS는 데이터베이스와 사용자(또는 프로그램) 간의 인터페이스를 제공하며, 데이터 검색/업데이트/관리/백업/복구 등을 쉽게 할 수 있도록 도와주는 소프트웨어입니다.

### 대표적인 DBMS는?

- MySQL, Microsoft Access, SQL Server, FileMaker Pro, Oracle, dBASE

### 관계형 저장 방식이란?

- 데이터를 테이블 형식으로 저장 (행/열 구조)
- 테이블 간 관계를 맺어 데이터 정합성을 유지

### 비관계형(NoSQL) 저장 방식은?

- 테이블이 아닌 다양한 구조 (Key-Value, 문서, 그래프 등)로 저장
- 유연하고 확장성 있는 구조 제공

### SQL이란?

- **DDL**: 데이터 구조 정의 (`CREATE`, `ALTER`, `DROP`)
- **DML**: 데이터 조작 (`SELECT`, `INSERT`, `UPDATE`, `DELETE`)

---

## Key-Value 구조

### Java/Kotlin에서 Key-Value 자료구조?

- `Map` 구조 사용

#### ✅ Java
- `HashMap`, `TreeMap`, `LinkedHashMap`

#### ✅ Kotlin
- `mutableMapOf()`, `mapOf()`, `hashMapOf()` 등

### 하나의 Key에 여러 값 저장 가능?

- `Map<String, List<T>>` 또는 JSON 구조로 가능

---

## SharedPreferences

### 하나의 Key에 여러 값을 넣는 방법은?

- JSON의 배열(Array) 또는 객체(Object)로 표현 가능

### JSON 관련 라이브러리

- **Java**: Jackson, Gson, org.json
- **Kotlin**: kotlinx.serialization, Moshi, Gson

---

## RoomDB

### RoomDB란?

- Android의 내장 DB(SQLite)를 간편하게 사용하기 위한 AAC 라이브러리

### RoomDB 기반 기술?

- SQLite

### 값 저장 방식?

1. 객체 생성
2. DAO 메서드 호출
3. SQL 변환 후 SQLite에 저장

---

## Firebase

### Firebase란?

- Google의 모바일 앱 개발 플랫폼

### 왜 사용할까?

- 실시간 데이터베이스(Realtime Database)를 포함해 다양한 기능 제공
- 실시간 채팅, 멀티플레이 게임 등에 적합

🔗 [출처: 이랜서 블로그](https://www.elancer.co.kr/blog/detail/296)
