## Github SSH Key 등록하는 방법
---
    github에서 통신할 때 비밀번호로 인증하는 것이 2021년 8월부터 금지됨.
    따라서, ssh나 access token을 통해 인증을 해야하는데 ssh가 더 일반적인 방법이기 때문에 ssh를 선택함.

### .ssh 폴더 만들기
<br>

1. 터미널에서 `ls-al` 명령해서 `.ssh` 폴더 있는지 확인
2. `mkdir .ssh` : 폴더를 만드는 명령어 입력 (`ls-al`)로 확인

### ssh key 생성
<br>

3. `cd .ssh` : .ssh 폴더로 들어감
4. `pwd` : 현재 경로 확인
5. `ssh-keygen -t ed25519 -C "traeumen97@naver.com"` : ssh key 생성
6. `ls-al` : .pub / pub없는 파일 생성됐는지 확인
   - .pub 파일 : 공개 키
   - .pub이 없는 파일 : 개인 키 &#10141; 아무한테도 주면 안됨
7. `cat id_ed25519.pub` : 공개 키 확인 (`cat` 명령어는 리눅스 명령어로 파일 내용을 출력한다.)
8. `cat id_ed25519` : 개인 키 확인

<br>

### Github에 생성한 ssh key 등록

<br>

9. github.com에서 profile > settings > SSH and GPG keys > Add new
10. title 설정
11. `cat id_ed25519.pub` 복사해서 붙여넣기

<br>

### config 파일 만들기

<br>

12. `vi` &#10141; 편집기
13. `vi .파일명` &#10141; 파일 편집기 열림
14. `cat .파일명` &#10141; 파일 내용 확인
15. .ssh 폴더에 들어가서 `vi config` 명령어로 config 파일 생성
16. vi편집기에서 아래 내용을 붙여넣음

        Host github.com
        IdentityFile ~/.ssh/id_ed25519
        User git
17. `ls-al` 명령어로 config 폴더 잘 생성됐는지 확인
18. `cat config` 명령어로 16번에서 작성한 내용 잘 됐는지 확인

<br>

### ssh키로 통신이 잘 되나 확인하기 (push 해보기)
    ssh-origin을 ssh 경로로 연결
    origin 을 삭제 (https경로니까)
    ssh-origin의 이름을 origin으로 변경

19. `git remote -v` : 현재 연결상태 확인 &#10141; http만 연결되어 있는거 확인해서 ssh 추가해야됨 (이 명령어는 계속 확인하기 위해 자주 쳐보기)

20. `git remote add ssh-origin [ssh 경로]

    github 홈페이지에서 ssh 경로는 복사 붙여넣기 한 후 이 명령어를 입력

    &#10141; ssh-origin 이라는 이름으로 등록 됨
21. `git remote remove origin` : http origin 삭제
22. `git remote rename ssh-origin origin : ssh-origin의 이름을 origin으로 변경
23. `git push` 했을 때 `git push --set-upstream origin main` 나와서 그래도 복사 붙여넣기 함

    &#10141; 통신할 때 fetch, pull, push 명령어 쓰는데

    `git push [remote이름] [branch이름] &#10141; 원래 정석

    기본값을 origin을 main branch로 쓰겠다고 설정

    이 설정을 한 후에는 git push만 입력해도 됨 