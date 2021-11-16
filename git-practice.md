# <span style="color:#79b3b7">Git</span>

> ### 깃은 버전관리 시스템이다

<br><br>

## <span style="color:#f6a296">Git 명령어 </span>
---

- 홈 디렉토리로 이동

        cd ~
- 새 디렉토리 생성

        mkdir
- [디렉토리명]으로 이동

        cd [디렉토리명]
- 부모 디렉토리로 이동

        cd ..
- 현재 경로 출력

        pwd
- 디렉토리 정보 출력

        ls -al
- 터미널 창 내용 삭제

        clear
- 터미널 창 종료

        exit
- 현재 위치에서 로컬 저장소 생성

        git init
- 깃 환경에서 사용자 이름을 [사용자명]으로 지정

        git config --global user.name "kimseokyung"
- 깃 환경에서 사용자 이메일을 [사용자 이메일명]으로 지정

        git config --global user.email "traeumen9@naver.com"
- 깃 상태 확인

        git status
- [파일.확장자명]을 스테이징에 올림

        git add [git-pratice.md]
- 수정한 전체 파일을 스테이지에 올림

        git add .
- 커밋 명령 후 VI 작성

        git commit
- 커밋 메세지 [메세지명]를 한꺼번에 커밋

        git commit -m
- 메세지[메세지명]를 붙여서 스테이징과 커밋을 한꺼번에 커밋

        git commit -a -m
- 커밋 내역 확인

        git log
- 커밋 로그에서 한 줄에 한 커밋씩 출력

        git log --oneline
- 최근 버전과 작업 폴더의 수정 파일의 변경 내역 출력

        git diff
- 가장 최근 커밋을 취소

        git reset HEAD^
- 현재로부터 n번째 이전 커밋으로 되돌리기

        git reset HEAD~n
- 원격 저장소에 연결

        git remote add origin [github repository 주소]
- 원격 저장소에 연결됐는지 확인

        git remote -v
- 로컬 저장소의 커밋을 맨 처음 원격 저장소에 올리는 경우

        git push -u origin master
- 로컬 저장소의 커밋을 맨 처음 원격 저장소에 올린 후 로컬 -> 원격 저장소에 업로드

        git push
        git push origin master
- 원격 저장소의 커밋을 지역 저장소로 가져옴

        git pull
        git pull origin master
- 원격 저장소를 [로컬저장소명]에 복사하기 

        git clone [원격 저장소 주소]

<br><br>

## <span style="color:#f6a296">VI편집기(명령어로 조작하는 텍스트 에디터) 사용법</span>

- insert 모드 - 편집 시작

        i
- 편집 종료

      esc  
- 종료

       :q 
- 강제종료

        :q!
- 저장 후 종료

        :wq
- 저장 후 강제종료

        :wq!