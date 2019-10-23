<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index.jsp</title>
    <script src="http://code.jquery.com/jquery-latest.js"></script>
</head>
<body >

    <%--
    <h3>入门程序</h3>
    <a href="param/testParam?username=hoarepuss&password=123456">入门程序</a>
    <form action="param/saveAccount" method="get">
        姓名：<input type="text" name="username" /><br/>
        密码：<input type="text" name="password" /><br/>
        金额：<input type="text" name="money" /><br/>
        用户1姓名：<input type="text" name="userList[0].uname" /><br/>
        用户1年龄：<input type="text" name="userList[0].age" /><br/>
        用户2姓名：<input type="text" name="userList[1].uname" /><br/>
        用户2年龄：<input type="text" name="userList[1].age" /><br/>
        用户3姓名：<input type="text" name="userMap['one'].uname" /><br/>
        用户3年龄：<input type="text" name="userMap['one'].age" /><br/>
        用户4姓名：<input type="text" name="userMap['two'].uname" /><br/>
        用户4年龄：<input type="text" name="userMap['two'].age" /><br/>
        <input type="submit" value="提交" /><br/>
    </form>
    <form action="param/saveUser" method="post">
        姓名：<input type="text" name="uname" /><br/>
        年龄：<input type="text" name="age" /><br/>
        生日：<input type="text" name="birthday" /><br/>
        <input type="submit" value="提交" /><br/>
    </form>
    <a href="param/testRequestParam?uname=hoarepuss">RequestParam注解测试</a>
    <form action="param/testRequestBody" method="post">
        姓名：<input type="text" name="uname" /><br/>
        年龄：<input type="text" name="age" /><br/>
        <input type="submit" value="提交" />
    </form>
    <a href="param/testPathVariable/20">PathVariable注解测试</a>
    <a href="param/testRequestHeader">RequestHeader注解测试</a>
    <a href="param/testCookieValue">CookieValue注解测试</a>
    <a href="param/testModuleAttribute?username=hoarepuss&age=30">ModuleAttribute注解测试</a>
    <a href="param/testSetSessionAttributes">session作用域放值</a>
    <a href="param/testDeleteSessionAttributes">session作用域删除值</a>
    <a href="param/testModuleAndView">testModuleAndView20191021</a>
    <img src="images/image0001.jpg">
    <input type="button" value="ajax按钮" id="btn">
    <script>
        $(function(){
            $("#btn").click(function(){
                $.ajax({
                    url:"param/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"小芳", "age":40, "birthday":"2019/01/02"}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        alert(data);
                    },
                    error:function () {
                        alert(123);
                    }

                });
            });
        });
    </script>
<form action="file/fileUpload" method="post" enctype="multipart/form-data">
    文件上传:<input type="file" name="upload">
    <input type="submit" value="提交" >
</form>
    <a href="param/testException">testException</a>
    --%>
    <a href="param/testModuleAndView">testModuleAndView20191021</a>
</body>
</html>
