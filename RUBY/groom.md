## 준비 과정

1. 주소 : https://ide.goorm.io/ 에 접속한다.
2. 회원가입 과 함께 로그인
3. 대시보드에 들어가기
4. 처음에 들어가게 되면 아무것도 없게 된다. 새 컨테이너 생성 클릭!
5. 버전에 맞는 railsdhk ruby를 선택하고 생성하기 클릭! 



## Ruby on rails 게시판 만들기

#### 1. 페이지 생성하기

#### 2. 서버 실행하기

```cmd
#프로젝트 속성 중 빌드/실행 설정에서 실행 옵션을 복사한다.
#터미널에서 
rails <붙여넣기>
#하고 브라우저에서 프로젝트 속성의 실행 URL포트를 복사하여 붙여넣기 하여 실행해보자. 그러면 실행된 서버를 확인 할 수 있따.
```





#### model 만들기

```cmd
rails g model (이름) #=> g = generate 
```

- config/migrate 폴더에 migration 파일을 수정한다.
- `rake db:migrate` 로 모델을 확정적으로 만들게 된다.

#### 실습으로 만들 페이지

1. 글 작성 form 페이지
2. 글 생성 action(view필요 없음)
3. 글 읽기 페이지

```ruby

```

4. 삭제 기능 추가
5. 





