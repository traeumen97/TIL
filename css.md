## <span style="color:#f6a296">css </span>
> ### Hypertext Markup Language
<br>

---
<br>

- font tag (css 등장 전)

        <font color="red"> </font>

- css 속성 검색

        ex) css text size property

- 선택자 순서

        id > class > element

- www.caniuse.com

        현재 어떤 브라우저들이 html, css, javascript 채택하고 있는가에 대해 확인 가능한 사이트

-  grid

        grid-template-columns: 150px 1fr;
        150px > 첫번째 영역의 사이즈 고정
        fr > 첫번째 영역의 사이즈를 제외한 나머지 영역을 비율로 나눠 지정

    1. display: grid; 지정
    2. grid-templete-columns: px fr em; 세로 영역 사이즈 지정

        grid-templete-rows: px fr em; 가로 영역 사이즈 지정

- 미디어쿼리

    ``` css
    screen width > 800px
    @media(min-width:800px) {
        div {
            display: none;
        }
    }
    ```
        
        