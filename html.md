## <span style="color:#f6a296">Html </span>
> ### Hypertext Markup Language
<br>

---

### `<!DOCTYPE html>` 선언
> ### 문서의 유형을 정의하기 위해 사용하는 선언문

<br>

### DOCTYPE html 
- 호환성을 높이기 위함
- `DOCTYPE`은 웹 브라우저에서 처리할 문서가 `html`이며 어떠한 버전으로 사용하였으니 해당 방식대로 해석하라는 의미를 가짐
- `html` 에서는 대소문자를 구별하지 않지만 `DOCTYPE`의 경우 강조를 위해 대문자로 많이 사용
- DOCTYPE을 생략하게되면 웹 브라우저가 비표준모드로 렌더링 될 수 있다.<br> (렌더링 : HTML,CSS, 자바스크립트 등 개발자가 작성한 문서가 브라우저에서 출력되는 과정)

<br>

### html 문서 버전의 종류
- html5 / html4 / xhtml
- html 버전마다 적용되는 태그가 있고, 적용되지 않는 태그 존재
- 구버전 기준을 유지하는 이유는 과거 웹 자료의 보존 목적을 위함

<br>

---

<br>

### meta 태그
``` html
<head>
    <meta charset="UTF-8">
</head>
```
- html5에서 새롭게 추가된 요소

    - html 4.01
        
        `<meta http-equiv="content-type" content="text/html; charset=UTF-8">`
    - html5

        `<meta charset="UTF-8">`

---
<br>

- html paraghraph tag

        p - 단락 표현
        br - 단순 줄바굼

- character set

        utf-8 > utf-8이라는 문자로 읽으라고 명령
        
- !doctype html

        이 문서는 html로 작성된 문서이다

- 웹의 시작

        info.cern.ch

- 댓글기능 추가 disqus.com (로컬 주소로 들어가야 확인 가능)

    ``` javascript
    <div id="disqus_thread"></div>
    <script>
    /**
    *  RECOMMENDED CONFIGURATION VARIABLES: EDIT AND UNCOMMENT THE SECTION BELOW TO INSERT DYNAMIC VALUES FROM YOUR PLATFORM OR CMS.
    *  LEARN WHY DEFINING THESE VARIABLES IS IMPORTANT: https://disqus.com/admin/universalcode/#configuration-variables    */
    /*
    var disqus_config = function () {
    this.page.url = PAGE_URL;  // Replace PAGE_URL with your page's canonical URL variable
    this.page.identifier = PAGE_IDENTIFIER; // Replace PAGE_IDENTIFIER with your page's unique identifier variable
    };
    */
    (function() { // DON'T EDIT BELOW THIS LINE
    var d = document, s = d.createElement('script');
    s.src = 'https://web-3oaqsmzlsd.disqus.com/embed.js';
    s.setAttribute('data-timestamp', +new Date());
    (d.head || d.body).appendChild(s);
    })();
    </script>
    <noscript>Please enable JavaScript to view the <a href="https://disqus.com/?ref_noscript">comments powered by Disqus.</a></noscript>
    ```
---  
<br>

- 채팅 기능 추가 tawk.to
- 웹사이트 분석기 analytics.google.com

        방문자 수, 방문 경로, 웹사이트 방문 환경, 경로 이동 정보 서비스 제공

        