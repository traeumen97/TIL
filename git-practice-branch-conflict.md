# Git branch & conflict

## Git branch
> 같은 뿌리에서 나왔지만 서로 다른 역사를 쓰고있는 버전들을 말한다.

    서로 다른 케이스들을 관리하는 하는 상황에서 이전에 마스터에 있었던 내용 대부분은 같은 내용이지만 서로 다른 디렉토리를 필요로 할 때가 있다.

    이를 다 다른 디렉토리로 관리하기는 매우 어렵다. 예로는 디렉토리의 이름이 바뀌는 과정에서 원래의 뿌리를 확인하기 어려울 수 있다.
    또한 코드를 병합하는 과정에서 생기는 여러 문제들을 수동으로 하나하나 다 처리해야 한다.

    서로 다른 파일은 수정했을때는 자동으로 합쳐지지만, 서로 같은 파일에서 같은 부분을 수정했을 때 덮어쓰면 날릴 수 있다.

<br>

## Git branch 사용법

<br>

### branch 생성

1. `git log` : 현재상태 확인
2. `git log --all --graph --oneline` : 그래프 형태로 보기 쉽게 나타냄
3. `git branch` : main (현재 위치)
    - main 브랜치가 나오는데 저장소를 만드는 순간에 main이라는 기본 브랜치 위에서 작업하던 것이다.
4. `git branch [새로운 브랜치명]` : 새로운 브랜치 생성
5. `git checkout [새로 생성한 브랜치명]` : 새로 생성한 브랜치로 이동

    `git checkout -b [새로운 브랜치명]` : 새로운 브랜치 생성 후 바로 이동

<br>

### branch 삭제

1. 지역저장소에서 브랜치 삭제
    
    `git branch -d [브랜치명]` : 브랜치 삭제

    `git branch` : 삭제됐는지 확인

2. 원격저장소에서 브랜치 삭제

    `git push origin --delete [브랜치명]` : 브랜치 삭제

    `git branch -a` : 삭제됐는지 확인

<br>

### 생성한 branch를 원격 저장소에 push하기

1. `git checkout [브랜치명]` : 생성한 브랜치로 이동
2. `the current branch [생성된 브랜치명] has no upstream branch`
   - 현재 원격저장소에는 main branch 밖에 없는 상태이고 [생성된 브랜치명] branch로 이동하여 push를 하면 오류가 발생한다.
   - 지역저장소를 원격저장소로 처음 push할 때는 --set-upstream 옵션을 줘야한다. 그래야 tracking 정보 설정이 되어 git push 만 사용해도 push가 된다.
3. `git push --set-upstream origin [생성된 브랜치명]` : git push 설정
4. github 에서 결과를 확인하면 신규 브랜치가 생성되어 총 2개의 브랜치를 확인 할 수 있다.

---

<br>

## Git conflict
> 브랜치와 브랜치를 병합할 때 발생하는 충돌이다. 이를 해결할 수 있다면 충돌 이라는것이 사고가 아니라 깃이 제공하는 가장 좋은 기능일 것이다.

    같은 파일인데 서로 다른 부분이 수정되었을 때는 깃이 알아서 합쳐서 생성해주지만,
    같은 파일인데 같은 부분을 수정했을때는 깃이 병합을 중지시킨다. 
    이때 병합을 하는 사용자에게 충돌이 났으니 수동으로 수정하라고 요청한다.

<br>

---

<br>

## Git merge 사용법

### Git merge

1. `git checkout [new branch]` :  새로 생성한 브랜치로 이동
2. `git branch` : 현재 브랜치 위치 확인
3. 파일에 새로운 내용 작성
4. `cat git-practice.md` : 새로 작성한 내용 확인
5. `git add .` : 워킹트리에 추가
6. `git commit` : 깃 커밋
7. new branch에 신규 파일이 추가 되었고 문제가 없다는 가정하에 main 브랜치에도 똑같은 신규 파일을 생성
    - 이때 내가 작성한 파일을 main branch로 이동하여 그대로 작성해도 되지만, merge 기능을 사용하여 new branch에서 합칠 수 있다.
8. `git checkout main` : 이전 new branch에서 작성한 파일은 당연히 main branch에는 없는 상태
9. `git merge [신규작성파일]` : new branch에서 작언했던 파일을 main branch로 병합
10. [new branch]에서 작업했던 파일 복사 확인

<br>

`base branch` / `branch1` / `branch2` / `main branch`
    
    base branch + branch1 = main branch
<br>

---

<br>

## Git conflict 발생/해결

### Git conflict 발생

1. `git checkout [new branch]` : new branch로 이동
2. 신규파일 작업내용 변경
3. `git add .` / `git commit` : 수정한 내용 커밋
4. `git checkout main` : main branch로 이동
5. `cat [신규작성파일]` : main branch를 확인해보면 new branch에서 수정한 내용은 반영되어있지 않다.
6. 신규파일 작업내용 변경
7. `git add .` / `git commit` : 수정한 내용 커밋
8. `git merge [신규작성파일]` : 깃 병합
    - 메세지를 보면 conflict라는 단어가 포함되어 있을 것이다. (충돌 발생)
9. `vi [신규작성파일]` : 충돌 상황이 발생했다고 나와있는 파일 내용 확인
    - `=====`을 기준으로
      - 위 : HEAD로 표시되어 있는 내용이 master branch에서 한 작업
      - 아리 : [신규작성파일]로 표시되어 있는 내용은 new branch에서 한 작업
    - 각각의 브랜치에서 동일한 파일을 수정했는데, 이를 merge하려 했을 때 깃이 어떤 내용이 맞는지 판단할 수 없기 때문에 충돌이 발생했다고 알려줌

---

<br>

### Git conflict 해결

💡 Git conflict를 해결하는 두가지 방법
> 직접 수정

1. 직접 두 브랜치의 내용을 비교하여 수정 후 `git add` / `git commit`
2. conflict 해결 후 커밋 처리
3. `git log` : git log를 살펴보면 충돌이 해결되어 방금 작성한 커밋 메세지로 commit 된 것을 확인할 수 있다.

> 머지 작업 취소

1. `git merge [신규작업파일]` : merge 실행
2. 충돌발생
3. `cat [신규작업파일]` : 파일 내용 확인
4. `git merge --abort` : merge 실행 이전으로 돌아가기
5. `cat [신규작업파일]` : 파일 내용 확인
   - merge실행 이전의 파일 내용과 같은 것을 확인할 수 있다.
6. 새로 작성할 파일을 다시 작업하고 머지하고나 new branch의 내용으로 merge 처리

---

## git branch 연습

### git branch가 필요한 이유
- 아직 완성되지 않은 내용이 중요한 메인 브랜치에 나오면 안되는 상태일 때 유요하게 쓰일 수 있다.
  - 메인브랜치는 모두가 볼 수 있음
  - 짜장면 레시피를 만들었음
  - 짜장면 레시피가 아직 완성되지 않았음
  - 짜장면 레시피는 아직 보여주면 안됨
  - 짜장면 레시피를 다른데서 더 작성하고싶음
  - 그래서 짜장면 브랜치를 따로 만들었음

1. `git branch black-noodle`: 브랜치 생성
2. `git branch`: 브랜치 잘 생성됐는지 확인
3. `git checkout black-noonle`: black-noodle 브랜치로 이동
4. `git branch`: 잘 이동됐는지 확인
5. git add / commit / push
   
   `git push origin black-noodle`: 특정 브랜치 지정해서 푸시
6. `git branch black-noodle`: 브랜치 생성 - 다른 컴퓨터에 아직 원격 저장소의 상태를 동기화 시키지 않았기 때문
7. `git branch`: 잘 생성됐는지 확인
8. `git checkout black-noodle`: black-noodle 브랜치로 이동
9. `git pull origin black-noodle`: black-noodle에 있는 내용 가져오기

### git merge가 필요한 이유
- 다른데서 작업한 내용이 완성돼서 공개할 수 있게됨
- 메인 브랜치에 합쳐서 공개하고싶어짐

1. `git branch`:  브랜치 위치 확인
2. `git checkout main`: 옮기고 싶은 브랜치로 이동
3. `git fetch`: 원격저장소에 있는 상태 전체를 로컬에 가져옴
   `git fetch origin black-noodle`: 원하는 브랜치의 상태를 로컬에 가져옴
4. `git log --graph --oneline -all`: 원격과 로컬의 모든 브랜치의 현재 상태 확인
5. `git merge origin/black-noodle`: 블랙 누들의 내용을 메인으로 머지
6. `git log --graph --oneline -all`: 잘 머지가 됐는지 확인