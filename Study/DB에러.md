## DB 에러

- ```ruby
  ActiveRecord::StatementInvalid: Mysql2::Error: This connection is still waiting for a result, try again once you have the result: ROLLBACK
  ```

- 무슨 문제????




###  cid (ORA-12505 오류)

```cmd
ORA-12505 , TNS: listener does not currently know of SID given in connect descriptor
#이런 오류가 뜬다.
```



cid가 맞지 않아서 발생하는 것

``` cmd
# go to the cmd
lsnrctl services #를 입력
```

![image-20200518152245408](DB%EC%97%90%EB%9F%AC.assets/image-20200518152245408.png)

- `Lsnrctl service` 는 리스너를 제대로 잡아주는 역활? 을 하는 듯 하는데 이렇게 안 뜬다면 설치하는 과정에서 문제가 생긴 것이다.
- "~" 서비스는 인스턴스를 가집니다의 ""안의 부분이 sid 에 해당한다.

![image-20200518152450590](DB%EC%97%90%EB%9F%AC.assets/image-20200518152450590.png)

- 위의 SID 에 제대로 입력하면 된다(xe로 하니 당연히 접속이 안되는 것!)

### 비밀번호

- oracle 이다.

### sys 관리자 계정 비밀번호 변경

```cmd
sqlplus
Enter user-name: sys as sysdba #입력 sys as sysdba 입력
password 입력 없이 엔터
SQL> show user # 현재 접속 유저 확인 명령어
SQL> alter user sys identified by 1234; #sys 계정의 암호를 1234로 변경

#cmd 껐다 키면서
sqlplus
Enter user-name : sys as sysdba

SQL> conn sys/1234 as sysdba;
Connected #가 나오면 접속 완료 메세지 로써 접속 확인 완료
```



### 28002,  the password will expire within 7 days 

- 이 오류는 비밀번호 만기 된다는 것으로써 sys 계정에서 해결하면 된다.

1. cmd 에서

   ```cmd
   sqlplus  #입력!
   사용자명 입력 : sys as sysdba
   비밀번호 입력 : # 엔터를 치자.
   SQL> #sys 계정으로 접속 완료
   SQL> show user #라고 현재 유저를 확인하면
   USER은 "SYS"입니다. # 라고 뜬다.
   SQL> select resource_name , limit 
   from DBA_PROFILES
   where PROFILE = 'DEFAULT' and RESOURCE_TYPE = 'PASSWORD';
   ```

   ![image-20200518153517940](DB%EC%97%90%EB%9F%AC.assets/image-20200518153517940.png)

   - 위의 life_time의 한계가 180일인데 이를 unlimited로 바꿔줘야 한다.

   ```cmd
   ALTER PROFILE DEFAULT LIMIT PASSWORD_LIFE_TIME UNLIMITED;
   ```

   ![image-20200518153742194](DB%EC%97%90%EB%9F%AC.assets/image-20200518153742194.png)

   다시 확인하면 limit가 바뀌어져 있다.

   





