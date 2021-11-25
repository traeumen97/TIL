## <span style="color:#f6a296">Git 협업</span>
---
<br>

> ### 버전 탐색
<br>

- 버전을 만든 시점으로 돌아감
    
        git log 했을때 나오는 커밋 아이디 복사 후
        git chekout [커밋 아이디]
- 버전을 만들기 전 최조의 상태로 돌아감

        git checkout master
- 버전 리셋 (삭제X '이 버전이 되겠다.')

        git reset [커밋 아이디]

---
<br>

> ### 버전 되돌리기(삭제 후 이동)

<br>

- 버전 되돌리기

      git revert [커밋 아이디]
      텍스트 에디터에서 커밋 메세지 같은 리버트 메세지 작성
    
     1 2 3 4 의 버전이 있는 경우 1의 버전으로 리버트 하고 싶을 때     
     역순으로 4 3 2 를 리버트 시킨 후 1로 리버트 해야 충돌이 일어나지 않음
---
<br>

- 버전관리를 하지 말아야 할 파일이 있을경우 .gitignore 라는 파일은 만들어서 사용

---
<br>

> ### 협업

<br>

1. git repository 생성
2. git remote add origin [repository 주소]
3. git push
4. git push -u origin main



 <br>

>### <span style="color:#f6a296">git push 오류 'rejected' </span>because the remote contains work that you do
<br>

리모트에 다른 사람이 작업한 파일이 있는데 그 파일을 나의 로컬로 가져오지 않았기 때문

-> 다른 사람이 작업한 것을 내 로컬로 'pull' 해서 진행해야함.

<br>

git cat 명령어 실행 시 오류 발생
  * '<<<<<<HEAD' -> 내가 작업한 내용
  * '>>>>>>커밋아이디' -> 다른 사람이 작업한 커밋 변경점

<br>

>### <span style="color:#f6a296">git status</span> Your branch is <span style="color:#3092d0">ahead</span> of 'origin/master' by 1 commit.
<br>

- origin master 보다 하나의 커밋이 앞서 있기 때문에 git push를 해야함.

<br>

>### <span style="color:#f6a296">git status</span> Your branch is <span style="color:#3092d0">behind</span> of 'origin/master' by 1 commit.
<br>

- origin master 보다 하나의 커밋이 앞서 있기 때문에 git push를 해야함.


<br>

>### Fetch
<br>

  1. git fetch
  2. git merge FETCH_HEAD
  3. git commit
  4. git push

<br>

>### git fetch 와 git pull의 차이

<br>

- git pull<br>git remote 명령을 통해 서로 연결된 원격 저장소의 최신 내용을 로컬 저장소로 가져오면서 병합

        원격 저장소의 정보를 가져오면서 자동으로 로컬 브랜치에 병합(Merge)까지 수행해주는 명령어
        

- git fetch<br>로컬 저장소와 원격 저장소의 변경 사항이 다를 때 이를 비교 대조하고 git merge 명령어와 함께 최신 데이터를 반영하거나 충돌 문제 등을 해결

        페치(fetch)는 원격 저장소의 커밋들을 로컬 저장소로 가져오지만, 자동으로 병합(Merge)를 해주지 않기 때문에 본인이 직접 확인을 한 후에 병합(Merge)하는 과정을 거쳐야 한다.