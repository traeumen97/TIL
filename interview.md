# UI/UX 디자이너 · 퍼블리셔 면접 예상 질문

## 1. DOCTYPE 에 대한 설명

    (Document Type) Declaration을 통해서 현재의 웹 문서가 어떤 버전의 HTML 기술로 작성되었는지 웹 브라우저에 전달

    선언의 목적 - 문서간의 호환성을 높이기 위함
    (과거와 현재의 웹 표준의 호환)
    
    현재 버전의 엄격한 기준으로 과거 버전에서 정상적으로 작성 된 태그들을 문법 오류로 간주하는 오류 발생

    구 버전을 폐지하지 않는 이유는 과거 웹 자료의 보존 목적을 위함

    선언하지 않을경우
    브라우저가 해당 문서의 형식을 알 수 없음
    이 경우 브라우저는 표준 모드가 아닌 비표준 모드로 렌더링 모드를 변경하게 되면서 문서 제작자가 의도한 레이아웃(태그의 구조, CSS 등)이 깨지게 되어 사용자에게 정상적인 상태의 문서를 보여주지 못하게 됨

---

## 2. 쿼크모드 / 표준모드의 차이

    웹 브라우저의 두가지 렌더링 모드 - 쿼크모드, 표준모드
    브라우저는 선언된 Doctype에 따라 렌더링 모드를 선택하게 되는데 이 과정을 doctype sniffing 또는 doctype switching이라 함

    최신인지 오래된 문서인지 판단할 때는 DTD(Document Type Defination)를 보고 렌더링함

  - 쿼크모드
    오래된 웹 브라우저를 보여줄 때 하위 호환성을 위해서 표준모드를 대신하여 쓰이는 모드이다.
    쿼크모드의 목적은 오래된 웹 페이지들이 최신 버전의 브라우저에서 깨져 보이지 않으려는 것에 있음

  - 표준모드

    
  FPI 와 FSI가 동시에 기술되어 있을 경우 브라우저는 표준모드를 선택

  - FPI와FSI 모두를 포함하는 doctype 선언 예
    ```html
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd
    Viewer
    ">
    ```
  
  - FPI만 선언되어 있는 doctype 선언 예
    ```html
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
    ```

---

## 3. Cross Browsing

    웹 페이지 제작 시에 모든 브라우저에서 깨지지 않고 의도한 대로 호환 되도록 표준모드를 유지하는 것

---

## 4. 웹 표준 / 웹 접근성

### 웹 표준 

    표준화 된 언어를 사용함으로써 동일한 결과물을 보여주는 것

  - 웹 접근성 향상
  - 구조와 표현의 분리
  - 호환성 확보(크로스 브라우징 용이)
  - 작업, 유지보수 속도 향상 (class, id 사용)

### 웹 접근성(웹 표준 사용 예 링크)

    모든 사용자가 차별없이 웹에서 제공하는 정보를 이용할 수 있도록 하는 것(일반인, 장애인, 고령자 등)

  - 사용자층 확대
  - 규정 / 법적 요구 준수
  - 기업 이미지 향상

### 웹 호환성

    OS, 브라우저에 상관없이 유사한 화면으로 동일한 정보에 접근이 가능해야함. 브라우저마다 코드를 표현하는 방식이 조금씩 다르기 때문에 100% 동일한 화면을 구현하는것은 불가능하지만 정보는 동일해야함.

  - 다양한 환경 적용(다양해진 사용자의 환경에 상관없이 동일한 정보 제공)
  - 새로운 기기 이용
  - 사용자층 확대

---

## 5. 시맨틱 태그

    div나 span과 같이 의미가 없는 태그는 태그 이름만 보고는 어떤 내용인지 전혀 유추할 수가 없는 반면, form, table, article 등 의미가 있는 태그는 내용을 명확하게 정의

  - 검색엔진최적화(SEO) : 검색엔진은 태그를 기반으로 페이지 내 검색 키워드의 우선순위를 판단한다. 따라서 제목은 h1, 중요한 단어는 strong 또는 em을 사용하는 등 의미에 맞는 올바른 태그를 사용하는 것
  - 시각 장애가 있는 사용자가 스크린 리더를 사용해 페이지를 탐색할 때 도움
  - 블록태그```<div>```를 탐색하는 것 보다 훨씬 용이
  - 의미가 있는 요소는 개발자 모두에게 명확한 의미를 전달
  - 채워질 데이터를 기반으로 결정해야함

--- 

## 6. SEO(Search Engine Optimization) 검색엔진 최적화

    검색결과를 만드는 4단계

    Discovering > Crolling > Indexing > Ranking

  검색엔진최적화(SEO로도 불림)는 웹사이트와 웹페이지를 검색엔진이 쉽게 발견(디스커버리)하고, 읽어가서(크롤링), 색인하고(인덱싱), 상위 노출(랭킹)시켜 자연 유입되는 트래픽의 양과 질을 높일 수 있도록 관련 검색 알고리즘의 특성을 고려해서 웹사이트의 구조나 콘텐츠를 개선하는 일련의 작업

  “검색엔진최적화 (Search Engine Optimization, SEO)란 검색자 (검색 유저)의 의도를 이해하고 이에 충실히 맞춰 웹 페이지의 콘텐츠를 제작하고, 이 페이지가 검색 결과 페이지에서 잘 노출 되도록 웹페이지의 태그와 링크 구조를 개선하여 자연 유입 트래픽을 늘리는 시책

  ### SEO CheckList
  - [ ] keyword research

         구글 애즈(Google Ads)에서 무료로 제공하는 키워드 리서치 툴 이용

  - [ ] sitemap

        사이트맵은 검색엔진으로 하여금 나의 웹사이트와 내가 방금 업데이트한 페이지등을 빠지지 않고 모두 인덱싱(indexing, 색인)할 수 있게 도와줌

  - [ ] robots.txt
        
        검색엔진에게 나의 홈페이지의 특정 페이지는 SERPs(Search Engine Results Page, 검색엔진 결과창)에 표시를 하고, 특정 페이지는 표시를 하지 말라고 신호를 보내는 역할을 하는 일반 텍스트 파일

  - [ ] title tag

        SERPs(검색결과창)에서, 제목에 해당하는 태

  - [ ] meta description

        검색 결과창에서, 해당 웹페이지를 1-2문장정도로 짧고 간결하게 설명하는 글

  - [ ] contents SEO

        - 포스팅 URL에 키워드 포함
        - H1 테그는 딱 한 번 사용
        - H2 테그는 서브 헤딩(sub-heading)에 사용
        - 인터널 링크(Internal Link)를 포함
        - 외부 링크(External Link)를 포함
        - 사진,영상,인포그래픽등 시각적인 요소를 포함
        - 사진은 Alt Tag 추가
        - 짧은 문장과 문단 사용 (가독성)
        - 스키마 마크업(Schema Markup) 사용

  - [ ] image SEO

        이미지 사이즈 최적화
        
  - [ ] mobile friendly site

        구글 검색엔진의 모바일 검색 점유율이 50%을 넘어섰고 구글도 이에따라 모바일을 최우선으로 하는 모바일 우선 색인 방식으로 변경됨
        구글 크롤러가 웹사이트 크롤링을 할 때 데스크탑 버전의 페이지가 아닌 모바일 버전의 페이지를 먼저 색인(index)함

  - [ ] image alt tag

        대체 텍스트 제공

---

## UI (User Interface)

    사용자 인터페이스(UI)는 사람들이 컴퓨터, 시스템, 기기, 도구 등 그 사이에서 일어나는 상호작용(Interaction)을 매개

  - 그 요소로부터 명확하게 의도한 결과를 쉽게 얻어 낼 수 있어야 함
  - 입력(I): 사용자가 시스템을 조작
  - 출력(O): 시스템이 사용자가 이용한 것에 대한 결과를 표시

## UI 종류

- CUI (Character based UI): 문자방식의 명령어 입력 사용자 인터페이스 
- GUI (Graphic UI): 그래픽 환경 기반의 마우스 입력 사용자 인터페이스 
- NUI (Natural UI): 사용자의 말과 행동 기반 제스쳐 입력 인터페이스

## UI 기본 원칙
1. 직관성 (Intuitiveness) 
   - 앱의 구조를 큰 노력 없이도 쉽게 이해하고, 쉽게 사용할 수 있게 제작해야 함
   -  용이한 검색  (Findability), 쉬운 사용성 (Ease of use), 일관성 (Consistency)
 
2. 유효성 (Efficiency) 
   - 정확하고 완벽하게 사용자의 목표가 달성될 수 있도록 제작
 
3. 학습성 (Learnability) 
   - 초보와 숙련자 모두가 쉽게 배우고 사용할 수 있게 제작
   - 쉽게 학습 (Easy of learning), 쉬운 접근 (Accessibility), 쉽게 기억 (Memorability)
 
4. 유연성 (Flexibility)
   - 사용자의 인터랙션을 최대한 포용하고, 실수를 방지할 수 있도록 제작
   - 오류예방 (Error Prevention), 실수포용 (Forgiveness), 오류 감지 (Error Detectability)

---

## API

1. API는 서버와 데이터베이스에 대한 출입구 역할을 한다.
2. API는 애플리케이션과 기기가 원활하게 통신할 수 있도록 한다.
3. API는 모든 접속을 표준화

### API 종류

private API / public API / partner API

---

## flot 해제(clear)

1. 부모요소에 ```overflow: hidden;```

        float를 사용하는 요소의 부모에게 overflow: hidden; 을 주면 자식요소를 인식하지만, 이는 부모요소를 벗어나면 요소를 안보이게 한다는 속성이기 때문에 요소 잘림현상이 있을 수 있음
        단점: 해당 요소 안의 컨텐츠를 박스 외부로 표현해 줄 수 없음

2. 가상요소(```::after```)에 ```clear:both;``` (권장)

    ```css
    property::after {
      content: '';
      display: block;
      clear: both;
    }
    /** float를 사용한 요소의 가상요소에 clear:both;를 적용하면 높이값을 인식할 수 있음 **/
    ```

3. 강제로 높이 값 지정

        단점: 반응형 적용 시 자동 높이 값 설정 불가

4. float 된 요소의 부모태그에 float을 또 설정

        단점: 가운데 배치 불가능

5. float 된 요소의 부모 태그에 ```overflow: auto``` 적용

        단점: 특정 브라우저에서 스크롤 바가 표시됨

6. float 된 요소의 다음에 나오는 태그에 ```clear: both``` 지정

        단점: clear:both 가 적용된 요소에는 margin-top: 적용 불가

---

## 각종 태그

1. ul / ol 의 차이
    
        ol(Ordeered list) - 순서대로 번호가 붙는 목록
        ul(Unordered list) - 순서가 없는 목록 

2. dl / dt / dd

    ```html
    <dl>
      <dt>정의 제목</dt>
      <dd>정의 설명</dd>
    </dl>
    ```

     - dl(Definition List)
       - 정의 목록을 나타내는 태그
       - 특정 용어에 대해 정의하는 제목과 그 제목에 대한 설명을 담음
     - dt(Definition List)
       - 정의 되는 용어에 대한 제목
       - 기본적으로 block 요소의 속성을 가짐
     - dd(Definition Description)
       - 정의 된 제목에 대한 설명
       - 기본적으로 block 요소의 속성을 가짐

3. b / strong / i / em

     - b
       - 단순 시각적으로 텍스트에 주의를 끌기 위해 사용
     - strong
       - 매우 중요, 긴급, 경고의 의미를 가짐
     - i
       - 기울임꼴
       - 기술용어, 외국어 구절, 등장인물의 생각 등 특정 이유로 구분할 때 사용
     - em
       - 주위 텍스트와 비교했을 때 해당 부분을 강조하고 싶은 경우에 사용

     <br>
     
     - 단순 기울임이나 텍스트 강조는  css의 font style로 지정 권장

4. figure
 
    ```html
    <figure>
      <img src="icecream.img" alt="아이스크림">
    </figure>
    ```

    - 이미지, 삽화, 도표 등의 내용을 담음 
    - 문서의 내용과 상관은 있지만 figure 태그가 제거 되거나 다른 곳으로 이동해도 문서의 내용에 영향을 주지 않아야함

---

## CSS 전처리기

    CSS를 보다 쉽게, 다른 개발자들이 내가 작성한 CSS를 이해하기 쉽게, CSS로는 구현할 수 없는 변수 또는 함수를 사용할 수 있게 개발된 새로운 형태의 CSS

    유지보수성과 동일한 스타일을 적용해야하는 대상을 보다 쉽게 관리할 수 잇음

    너무 큰 CSS파일을 수정하기에는 해당하는 위치를 찾아가기 어렵기 때문

  장점
  - CSS 코드를 여러 파일로 나눠 유지보수성 향상
  - 중첩 선택자를 작성하기 쉬움
  - 여러 프로젝트에 걸쳐 테마 파일을 공유할 수 있음
  - 반복되는 CSS를 위한 Mixins 생성
  - Less는 자바스크립트로 작성되어 Node와 잘 작동함

  단점
  - 전처리기를 위한 도구가 필요하고 다시 컴파일 하는 시간이 느릴 수 있음
  - Less에서는 변수 이름의 접두어가 @이며, @media, @import, @font-face 규칙과 같은 고유 CSS 키워드와 혼동될 여지가 있음
  - Sass에서는 노드 버전을 바꿀 때 자주 다시 컴파일 해야 함
  
  종류
  - Sass
    - 가장 오래됐고 가장 많은 사람들이 선택한 라이브러리이기 때문에 이용할거리가 많음
    - 막강한 내장 기능을 가짐
    - Compass와 병용하면 리소스 경로를 직접 참조 가능해서 특정 폴더 내 이미지를 모두 참조하거나 이미지 크기를 참조할 수 있음
  - Less
    - 브라우저에 내장된 JS 인터프리터만으로 컴파일이 가능하기 때문에 디펜던시에서 자유로움
    - Sass 다음으로 활발히 개척되고 있음. 쓸만한 라이브러리나 mixin 구현물을 찾기 쉬움
  - Stylus
    - 프로그래밍 언어의 특징을 많이 포함하고 있음
    - CSS 프로퍼티 내에서 연산자나 함수, 루프, 등을 비교적 자유롭게 사용할 수 있음
    - 문법이 혼재해 있어서 처음 전처리를 시작하는 사람에게는 어려울 수 있음

---

## MDN

    구글, MS, W3C에서 웹 표준기술 통합문서를 한 곳에서 정리하기로 합의한 사이트

---

## button 태그의 Default type 과 input type = "button" 차이

- button 태그의 Default type
  - ```button type="button"``` 지정하는 이유는 default가 아니기 때문
  - button type의 속성 > ```submit, reset, button```
  - form 안에서 button을 클릭 했을 때 새로고침 되는 이유는 type을 지정해주지 않아서 submit으로 동작하기 때문
  - button의 Default 값은 submit

- ```input type="button" value="button"```
  - 최근에는 잘 사용하지 않음
  - ```button``` 태그는 자식 태그를 가질 수 있고 CSS에서 가상 선택자로 꾸미는것도 가능

---

## text-decoration

- text-decoration: underline; (밑줄)
- text-decoration: overline; (윗줄)
- text-decoration: line-through; (취소선)
- text-decoration: none; (숨기기)

---

## section / article

```html
<section>
  <h1>HOT TOPIC</h1>
  <section>
    <p>World</p>
    <article>World News 1</article >
    <article>World News 2</article >
    <article>World News 3</article >
  </section>
  <section>
    <p>Sport</p>
    <article>World News 1</article >
    <article>World News 2</article >
    <article>World News 3</article >
  </section>
</section>
```

- section
  - 부분, 구역, 영역을 그룹화해서 분리하는 역할
  - 논리적으로 관계있는 요소 또는 문서를 분리할 때 사용
  - 다른 주제의 문서를 구분지음 (주제별 영역들을 그룹화)
  - 논리적인 관계가 없는 요소들은 ```div```로 그룹화
- article
  - 문서 내에서 그룹화해서 분리하는 역할
  - section과 다르게 독립적으로 존재할 수 있으며 재사용 가능
  - article이 section 보다 구체적
  - 주로 블로그글, 포럼, 뉴스 기사 등을 article로 묶음

---

## CDN(Content Delivery Network)
    지리적 제약 없이 전 세계 사용자에게 빠르고 안전하게 콘텐츠를 전송할 수 있는 콘텐츠 전송 기술

  -  서버와 사용자 사이의 물리적인 거리를 줄여 콘텐츠 로딩에 소요되는 시간을 최소화
  -  각 지역에 캐시 서버를 분산 배치해 근접한 사용자의 요청에 원본 서버가 아닌 캐시 서버가 콘텐츠를 전달
     -  미국에 있는 사용자가 한국에 호스팅 된 웹 사이트에 접근하는 경우 미국에 위치한 PoP서버에서 웹사이트 콘텐츠를 사용자에게 전송하는 방식
  
  <br>

  ### 필요한 경우

  - 인터넷을 통해 비즈니스를 운영하거나 웹 사이트에서 그래픽 이미지, 동영상 파일 등의 콘텐츠를 제공할 경우
  - 동영상 스트리밍이나 온라인 게임, 대용량 파일 전송, 해상도가 높아 용량이 큰 이미지를 다루는 쇼핑몰, 포털사이트 등의 안정적인 서비스 제공을 위해 활용
  - 특정 국가나 지역만을 타깃으로 하는 웹 서비스를 운영한다면 CDN 서비스를 활용할 필요 없음. 오히려 불필요한 연결 지점이 늘어나 웹 사이트의 성능저하를 불러올 수 있음

---

## 가상요소 / 가상클래스

### 가상요소

- 실제로 존재하지 않는 가상의 요소를 만들어 스타일을 부여하는 것
- 보통 콜론: 을 사용하지만 가상 클래스와의 구분을 위에 이중콜론:: 의 사용을 권장

<br>

- ```::before```
  - 저장된 요소의 앞에 가상의 요소 생성
- ```::after```
  - 저장된 요소의 뒤에 가상의 요소 생성
- ```::first-letter```
  - 저장된 요소의 첫 번째 글자에 스타일 적용
- ```::fitst-line```
  - 저장된 요소의 첫 번째 줄에 스타일 적용

<br>

### 가상클래스

```html
<style>
  a {color: #333;}
  a.on {color: #ff0000;} /* 마우스 올렸을 때 색상 변경용 클래스 */
</style>

<body>
  <a href="#">Button</a>

  <script>
    $("a").on("mouseover", function(){
      $(this).addClass("on");
    }).on("mouseout", function(){
      $(this).removeClass("on");
    });
  </script>
</body>
```

```css
a {color: #333;}
a:hover {color: #ff0000;}
```
- 실제로 존재하는 요소에 특정 이벤트나 환경에 맞춰 가상으로 클래스를 부여해 css로 제어

<br>

- ```:hover``` 
  - 해당 요소에 마우스 오버일때 스타일 부여
- ```:active```
  - 해당 요소를 활성화 했을때, 클릭한 상태일 때 스타일 부여
- ```:checked```
  - input 태그의 type이 checkbox나 radio 일 경우 해당 태그가 체크되어 있을 때 스타일 부여
- ```:disabled```
  - 선택, 클릭, 입력 등을 할 수 있는 요소에 비활성을 했을 때 스타일 부여
- ```:enabled```
  - :disabled의 반대로 활성화 되어있는 요소에 스타일 부여
- ```:empty```
  - 자식 요소가 없는 태그에 스타일 부여
- ```:focus```
  - input 태그에 focus를 한 상태일 때 스타일 부여
- ```:link```
  - 미방문 링크에 스타일 부여
- ```:visited```
  - 이미 방문한 링크에 스타일 부여
- ```:(선택자)```
  - 형제/자식 요소에 스타일 부여

---

## CSS 적용 우선순위

1. 속성 값 뒤에 !important가 붙어있는 속성
2. 인라인 스타일 (html 파일에서 스타일 직접 지정)로 적용되어 있는 속성
3. 선택자에 id가 쓰인 속성
4. class, attribute, pseudo-class로 지정한 속성
5. 태그 이름으로 지정한 속성
6. 부모 요소에 의해 상속된 속성

---

## Vanilla JavaScript 장단점

### Vanilla JavaScript란

    수많은 프레임워크, 라이브러리를 사용하지 않고 순수하게 JavaScript만 사용

### 장점

- 단순한 구조: 순수 자바스크립트로 구성돼 단순한 구조로 프로제그 진행 가능
- 가벼운 구성: 별도 라이브러리나 프레임워크를 사용하지 않아 가벼운 스크립트로 구성 가능
- 개발자 스킬 향상: 별도 기반기술에 종속적이지 않고 순수 자바스크립트에 대해 개발 스킬 향상 가능

### 단점

- 낮은 개발 생산성: 필요한 기능에 대해 자체개발이 필요
- 브라우저 파편화: 지원하고자 하는 브러우저에 대한 파편화 처리를 자체 해결 필요
- 개발 품질 유지 어려움: 개발자의 개발 수준에 따른 품질 차이 발생
- 낮은 수준의 결과물: 라이브러리나 프레임워크 대비 일정 수준의 품질을 유지하기 어려움

### 특징

- 어려움: 구조는 단조롭지만 개발자의 역량에 따라 개발 결과가 천차만별
- 가볍고 빠름: 불필요한 코드를 배제하여 필요한 기능만 구현했으므로 성능 우수

## 사용경험

- Login
- Clock
- To Do List
- Weather API

## 크로스 브라우징

    최대한 많은 종류의 웹 브라우저에서 정상적으로 작동하는 웹페이지를 만드는 방법

### 사용경험
- 사용자를 고려하여 chrome 이외의 브라운저에서도 동일 작동하게 하기 위해 vender prefix를 사용하는 등 크로스 브라우징을 고려하여 개발함.

---

## JQuery

    웹사이트에서 자바스크립트를 쉽게 사용할 수 있도록 도와주는 오픈소스 기반의 자바스크립트 라이브러리

---

## Plugin

    자주 사용할 만한 기능들을 직접 일일히 구현할 필요 없이 필요한 기능들만 그때 그때 찾아서 사용할 수 있도록 미리 만들어 놓은것
    라이브러리와는 조금 다름 > 라이브러리는 비슷한 성격을 가진 플러그인들의 집함

---

## script async / defer

> DOM: Document Object Model > XML이나 HTML 문서에 접근하기 위한 인터페이스
> 이 객체 모델은 문서 내의 모든 요소를 정의하고 각각의 요소에 접근하는 방법을 제공

### async
- DOM이나 다른 스크립트에 의존성이 없고, 실행 순서가 중요하지 않은 경우

### defer
- DOM이나 다른 스크립트에 의존성이 있고, 실행 순서가 중요한 경우


<br>

### 스크립트를 비동기 방식으로 불러와야 하는 이유

    일반적으로 브라우저는 HTML 파일을 읽어온 후, 위에서부터 아래로 한 줄씩 해석을 시작.
    그러다 중간에 스크립트 파일을 마주하는 경우에는 해당 파일을 모두 해석하기 전까지 나머지 HTML 렌더를 일시적으로 멈춤

- 같은 코드임에도 불구하고 스크립트 작성 위치에 따라 스크립트의 동작 여부가 달라질 수 있음
- 용량이 큰 스크립트 파일을 불러올 때는 스크립트 아래의 HTML 문서가 제대로 보이지 않음 
   > 사용자에게는 웹 페이지가 멈춘 것 처럼 보일 수 있기때문에 부정적 경험을 끼칠 수 있음

### 해결책

- HTML parsing > HTML parsing paused > script download > script execution
  <br>순으로 로드되기 때문에 ```<body>```태그가 끝나는 부분에 ```<script> ``` 를 넣으라고 제안
  > 스크립트를 해석하는 도중에 사용자가 버튼을 클릭하거나 텍스트를 입력하는 것처럼 웹과 상효작용을 시도하게 된다면 제대로 동작하지 않음(인터넷 연결이 원할하지 않을 경우)

### 이를 해결하기 위한 ```async```, ```defer```  

1. async: DOM 렌더 과정을 방해하지 않도록 병렬로 로드
     - 오직 파일을 불러오는 것만 병렬로 실행
     - 파일의 로딩을 마치게 된다면 그 즉시 DOM 렌더를 멈추고 async 방식으로 불러운 스크립트 파일의 해석을 시작
     - 스크립트의 해석이 얼마나 오래 걸릴지는 스크립트의 파일의 오버헤드에 달려 있음
     - DOM에 접근하는 스크립트를 ```async``` 방식으로 불러오는 것을 권장하지 않음
     - 서로 다른 시간이 걸리는 ```async``` 스크립트가 있다면 먼저 로드가 되는 스크립트가 먼저 실행돼 스크립트의 실행 순서를 조정할 수 없기 때문에 만약 두 스크립트가 서로 의존성이 있다면 제대로 동작하지 않을 수 있음
     - <b style="color: #ff5380;">DOM에 직접 접근하지 않거나, 다른 스크립트에 의존적이지 않은 스크립트들을 독립적으로 실행해야 할 때 효과적</b>

2. defer: DOM 렌더를 방해하지 않고 병렬로 로드
   - 모든 DOM이 로드된 후에 실행
   - 선언한대로 실행 순서가 보장됨
   - <b style="color: #ff5380;">더 빨리 로드되는 스크립트가 있더라도 실행은 항상 선언한 순서대로 실행
   - 스크립트 파일끼리의 의존성이 있는 경우에도 사용</b>

---

## Ajax(Asynchronous JavaScript And Xml)

- 자바스크립트의 라이브러리 중 하나
- 브라우저가 가지고 있는 XMLHttpRequest 객체를 이용해 전체 페이지를 새로 고치지 않고도 페이지의 일부만을 위한 데이터를 로드하는 기법
- JavaScript를 사용한 비동기 통신, 클라이언트와 서버간에 XML 데이터를 주고받는 기술
- JavaScript를 통햇 서버에 데이터를 요청하는 것

---

## JQuery attr() / prop()

1. attr() : HTML의 속성을 가지고 오고 싶을 때 사용
2. prop() : JavaScript로 수정된 요소의 값을 가지고 오고 싶을 때 사용

---

## checkbox css style

```css
input[type="checkbox"]{
        display: none;
      }
input[type="checkbox"] + label{
        display: inline-block;
        width: 30px;
        height: 30px;
        border:3px solid #707070;
        position: relative;
      }
input[id="check1"]:checked + label::after{
        content:'✔';
        font-size: 25px;
        width: 30px;
        height: 30px;
        text-align: center;
        position: absolute;
        left: 0;
        top:0;
      }
```

---

## CSS로 삼각형

```css
div {
  width: 0;
  height: 0;
  border-top: 50px solid transparent;
  border-right: 50px solid transparent;
  border-bottom: 50px solid transparent;
  border-left: 50px solid skyblue;      
}
```