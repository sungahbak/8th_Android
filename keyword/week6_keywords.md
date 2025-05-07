
# Week 6 Keywords

## ListView

### ListView란 무엇일까요?

`ListView`는 **여러 개의 항목을 스크롤 가능한 리스트 형태로 화면에 나열해주는 UI 컴포넌트**입니다.

### ListView에 들어갈 아이템들은 어떻게 저장해야 할까요?
1. 배열 또는 리스트에 저장
2. adapter로 저장

### ListView는 어떤 구성요소로 되어있을까요?

| 구성요소 | 역할 |
| --- | --- |
| `ListView` | 전체 리스트 뷰를 감싸는 UI 컴포넌트 |
| `Adapter` (예: `ArrayAdapter`, `BaseAdapter`) | 데이터와 아이템 뷰를 연결 |
| `View` (예: `TextView`, `ImageView`, `LinearLayout`) | 각 항목을 구성하는 UI |
| 데이터 리스트 (`ArrayList`, `String[]` 등) | 실제 보여줄 정보가 담긴 컬렉션 |

---

## Adapter

### Android에서 사용되는 Adapter란 무엇일까요?

**데이터 소스를 ListView나 RecyclerView 같은 UI 컴포넌트에 연결해서 각 항목의 View를 생성해주는 중간 역할 객체**입니다.

### Adapter는 주로 어떤 역할을 할까요?

- `getCount()`: 몇 개의 항목을 표시할지 알려줌
- `getItem(position)`: 특정 위치의 데이터 항목 반환
- `getView()`: 해당 항목을 어떤 뷰로 표현할지 생성

### ListView의 Adapter는 어떤 구성 요소를 가지고 있을까요?

| Adapter 종류 | 설명 |
| --- | --- |
| `ArrayAdapter` | 문자열 등 단순한 리스트를 보여줄 때 사용 |
| `BaseAdapter` | 복잡한 커스텀 아이템을 구현할 때 직접 상속하여 사용 |
| `SimpleAdapter` | `Map` 구조의 데이터를 키와 레이아웃 뷰에 매핑할 때 |
| `CursorAdapter` | DB 결과인 `Cursor` 객체를 다룰 때 |
| `RecyclerView.Adapter` | RecyclerView 전용 어댑터 |

---

## RecyclerView

### RecyclerView란 무엇일까요?

`RecyclerView`는 **Android에서 리스트나 그리드 형태의 데이터를 효율적으로 표시하기 위한 고성능 UI 컴포넌트**입니다.

### RecyclerView와 ListView의 차이

- 더 유연하고 성능이 뛰어남
- 다양한 레이아웃 쉽게 구현 가능

### RecyclerView Adapter의 구성 요소

1. ViewHolder 클래스
2. `onCreateViewHolder()`
3. `onBindViewHolder()`

### RecyclerView 설정 시 주의사항

| 주의사항 | 설명 |
| --- | --- |
| LayoutManager 설정 필요 | 없으면 화면에 아무것도 안 나옴 |
| View 재사용에 따른 상태관리 필요 | ViewHolder는 재활용되므로 상태 초기화 필수 |
| 데이터 변경 시 알림 메서드 호출 | `notifyDataSetChanged()` 등 |
| findViewById 최소화 | ViewHolder에서 캐싱 |
| 복잡한 레이아웃/중첩 리스트 관리 | NestedScrolling 조정 필요 |

### FragmentStateAdapter와 차이점

| 비교 항목 | FragmentStateAdapter | RecyclerView.Adapter |
| --- | --- | --- |
| 목적 | ViewPager2에서 Fragment 관리 | RecyclerView에서 View 관리 |
| 생성 메서드 | `createFragment()` | `onCreateViewHolder()` |
| 데이터 바인딩 | 없음 (Fragment 자체 처리) | `onBindViewHolder()` |
| 생명주기 | 있음 | 없음 |

---

## Foreground Service

### Foreground Service란 무엇일까요?

**사용자에게 명확히 표시되며 시스템이 강제로 종료하지 않는 서비스**입니다.

### 사용하는 이유

| 이유 | 설명 |
| --- | --- |
| 안정성 | 종료 위험 낮음 |
| 지속 실행 | 백그라운드 작업 유지 |
| 사용자 인지 | Notification 필수 |
| Android 제한 대응 | 8.0 이상에서 유리 |

### 주의사항

| 주의사항 | 설명 |
| --- | --- |
| 5초 내 startForeground | 아니면 앱 강제 종료 |
| Notification 표시 | 사용자 인지 필수 |
| 중요 작업에만 사용 | 과도 사용 시 앱 제재 |
| 배터리 고려 | 지속 실행으로 리소스 사용 |
| NotificationChannel 필수 | Android 8.0+ |
| 민감 권한 분리 관리 | Android 10+ |

---

## Background Service

### Background Service란 무엇일까요?

**UI와 독립적으로 백그라운드에서 동작하는 Android 서비스**입니다.

### 사용하는 이유

| 목적 | 설명 |
| --- | --- |
| 주기적인 작업 | 예: 데이터 동기화 |
| UI 독립 | 앱이 닫혀 있어도 동작 |
| 센서 이벤트 감지 | 예: 움직임 감지 |
| 예약된 작업 | 예: 알람, 타이머 등 |
