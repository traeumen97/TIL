## <span style="color:#f6a296">Html </span>
> ### Hypertext Markup Language
<br>

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

        