
# Week 7 Keywords

## Database (DB)

### Database의 정의는 무엇일까요?

데이터베이스는 구조화된 정보 또는 데이터의 조직화된 모음으로서 일반적으로 컴퓨터 시스템에 전자적으로 저장됩니다. 데이터베이스는 일반적으로 [데이터베이스 관리 시스템(DBMS)](https://www.oracle.com/kr/database/what-is-database/#WhatIsDBMS)에 의해 제어됩니다. 애플리케이션과 함께 데이터와 DBMS를 하나로 묶어 데이터베이스 시스템이라고 하며, 줄여서 데이터베이스라고도 합니다.

데이터는 일반적으로 테이블의 행과 열로 모델링되어 SQL을 통해 처리 및 쿼리됩니다.

🔗 https://www.oracle.com/kr/database/what-is-database/

### Database는 어디서 주로 사용될까요?

- 애플리케이션과 관련된 데이터 관리

---

## Database Management System (DBMS)

### DBMS란 무엇일까요?

DBMS는 데이터베이스와 사용자(또는 프로그램) 간의 인터페이스 역할을 하며, 정보 검색, 업데이트, 관리, 백업, 복구 등을 가능하게 합니다.

### 대표적인 DBMS는?

- MySQL, Microsoft Access, SQL Server, FileMaker Pro, Oracle, dBASE

### 관계형 저장 방식이란?

- 데이터를 테이블 구조(행/열)로 저장하며, 테이블 간 관계로 연결됨

### 관계형이 아닌 저장 방식은?

- NoSQL (Key-Value, 문서, 컬럼, 그래프 등 비정형 모델)

### SQL이란?

- **DDL (Data Definition Language)**: 테이블 구조 정의 (`CREATE`, `ALTER`, `DROP`)
- **DML (Data Manipulation Language)**: 데이터 조작 (`SELECT`, `INSERT`, `UPDATE`, `DELETE`)
- ~~DCL (Data Control Language)~~

🔗 [DDL 설명 출처](https://blog.naver.com/jwyoon25/221292265261)

---

## Key-Value 구조

### Java/Kotlin에서 사용하는 대표 자료구조는?

- `Map`

#### ✅ Java
- `HashMap`, `TreeMap`, `LinkedHashMap`

#### ✅ Kotlin
- `mutableMapOf()`, `mapOf()`, `hashMapOf()`, `linkedMapOf()`, `sortedMapOf()`

### 하나의 Key에 여러 값을 저장하려면?

- `List`, `Set` 등 컬렉션 형태로 값을 저장하면 가능

---

## SharedPreferences

### 하나의 Key에 여러 값을 넣는 방법은?

- JSON의 배열 또는 객체로 표현

### 사용 가능한 JSON 라이브러리

- **Java**: Jackson, Gson, org.json
- **Kotlin**: kotlinx.serialization, Moshi, Gson

---

## RoomDB

### RoomDB란?

- Android의 AAC 라이브러리 기반 DB. SQLite 위에 구성됨.

### RoomDB 기반 기술은?

- SQLite

### RoomDB 저장 흐름

1. Kotlin/Java 객체 생성  
2. DAO 메서드 호출  
3. SQL로 변환 → SQLite 저장  
4. 실제 데이터는 DB 파일에 저장됨

---

## Firebase

### Firebase란?

- Google의 모바일 앱 개발 플랫폼

### 기능

- 실시간 데이터베이스(Realtime Database) 지원 → 실시간 채팅, 멀티플레이 게임 등에 적합

🔗 https://www.elancer.co.kr/blog/detail/296
