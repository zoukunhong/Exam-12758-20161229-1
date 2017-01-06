# simpleJava
1. 在src/main/resources/jdbc.properties文件中更改用户名和密码
2. 运行  mvn -Djetty.port=8887 jetty:run 启动
3. http://localhost:8887进入登录界面，登录成功后至搜索页面
4. 搜索页面中的点击“添加”进入添加页面
5. http://localhost:8887/film/ShowFilm.action 进入搜索页面
6. http://localhost:8887/film/AddFilm.action 进入添加页面
7. 运行  mvn -Djetty.port=8887 jetty:stop 退出