
# Week 5 Keywords

## Lifecycle

### Lifecycle이란 무엇일까요?

**안드로이드 앱의 구성 요소(Activity, Fragment 등)가 생성부터 종료까지 거치는 일련의 상태 변화와 그에 따른 콜백 메서드를 총칭**합니다.  
즉, 앱이 동작하는 동안 각 컴포넌트가 어떤 상태로 있는지, 상태가 어떻게 바뀌는지, 그리고 상태 변화에 따라 어떤 작업을 해야 하는지를 정의하는 시스템입니다.

![Lifecycle image](image.png)

### Lifecycle은 왜 등장하게 되었을까요?

**앱의 상태 변화를 정확히 파악하고, 이에 따라 적절한 동작을 수행하기 위함**입니다.  
즉, 사용자가 앱을 사용하는 도중 전화가 걸려오거나 다른 앱으로 전환될 때, 혹은 앱이 완전히 종료될 때와 같이 다양한 상황에서 앱의 상태를 관리하고, 그에 맞는 처리를 할 수 있도록 해줍니다.

---

## Activity의 Lifecycle

### 대표적인 Lifecycle

- 시작: `onCreate`, `onStart`, `onResume`
- 종료: `onPause`, `onStop`, `onDestroy`
- 재시작: `onRestart`, `onResume`

### 각 메서드 설명

- **onCreate**: 액티비티 생성 시 최초 1회 호출. 초기 세팅 코드 작성.
- **onRestart**: onStop 이후 다시 시작되기 직전 호출.
- **onStart**: 액티비티가 사용자에게 보이기 시작할 때 호출.
- **onResume**: 사용자와 상호작용 가능한 상태가 되었을 때 호출.
- **onPause**: 다른 액티비티가 전면에 나올 때 호출.
- **onStop**: 액티비티가 더 이상 보이지 않을 때 호출.
- **onDestroy**: 액티비티가 완전히 종료될 때 호출.

각 상태에서 하나의 메서드만 호출되고, 이어지는 플로우에 따라 다음 메서드가 호출됨.

---

### Lifecycle 활용 예시

- **onCreate()**: 초기 UI 설정, 데이터베이스 연결 등
- **onStart()**: 화면 표시 직전, UI 업데이트
- **onResume()**: 사용자와 상호작용 시작, 위치 추적 등
- **onPause()**: 재생 중단, 상태 저장
- **onStop()**: 리소스 해제, 네트워크 종료
- **onDestroy()**: 앱 종료, 메모리 해제

---

## MediaPlayer

### 사용 용도

- 오디오/비디오 파일 재생
- 스트리밍 콘텐츠 재생
- 음악/동영상 앱 구현
- 미디어 상태 관리

### 주요 함수 및 설명

- `setDataSource()`: 파일 경로 지정
- `prepare()`: 미디어 준비
- `start()`: 재생 시작
- `pause()`: 일시 정지
- `stop()`: 정지 후 초기화
- `release()`: 객체 해제
- `setOnPreparedListener()`: 준비 완료 리스너
- `setOnCompletionListener()`: 재생 완료 리스너
- `setOnErrorListener()`: 오류 처리 리스너
- `setVolume()`: 음량 설정
- `setPlaybackSpeed()`: 재생 속도 설정

---

## SharedPreferences

### SharedPreferences란?

안드로이드에서 간단한 설정/데이터를 키-값 쌍으로 저장하는 방식.  
복잡한 DB 없이 앱 내 기본 정보 저장 가능.

### 저장 방식

1. **키-값 저장**: 예시 - `"theme_mode" : "dark"`
2. **XML 파일 형태**로 내부 저장
3. **간단한 접근**: 메서드를 통해 직접 읽고 쓰기
4. **DB와 차이점**: 구조 단순, 대용량에는 부적합
5. **보안 주의**: 기본적으로 암호화 X → 민감 정보 저장 시 주의
6. **DataStore**: Jetpack에서 제공하는 개선된 저장 방식

---

### JSON과 GSON

- **JSON**: 웹에서 데이터 교환용 경량 포맷
- **GSON**: Java에서 JSON ↔ 객체 간 변환을 지원하는 라이브러리
