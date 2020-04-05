# SpringBootでJWT認証

ソースコード  
https://github.com/Yu-s/springboot-auth-updated

参考URL  
https://auth0.com/blog/implementing-jwt-authentication-on-spring-boot/

##　動作環境

* Java 11
* gradle 6.3 (5 >= でいける気がする)

## 動作確認

起動
```
$ gradle bootrun
```

動作確認

```
# HTTP 403 Forbidden
curl http://localhost:8080/tasks

# 新規ユーザー登録
curl -H "Content-Type: application/json" -X POST -d '{
    "username": "admin",
    "password": "password"
}' http://localhost:8080/users/sign-up

# ログイン (JWT生成される)
curl -i -H "Content-Type: application/json" -X POST -d '{
    "username": "admin",
    "password": "password"
}' http://localhost:8080/login

# POSTでタスク登録(API). ログイン時に生成されたJWTを渡す(xxx.yyy.zzz の部分)
curl -H "Content-Type: application/json" \
-H "Authorization: Bearer xxx.yyy.zzz" \
-X POST -d '{
    "description": "Buy watermelon"
}'  http://localhost:8080/tasks

# タスク一覧取得. ログイン時に生成されたJWTを渡す(xxx.yyy.zzz の部分)
curl -H "Authorization: Bearer xxx.yyy.zzz" http://localhost:8080/tasks
```
