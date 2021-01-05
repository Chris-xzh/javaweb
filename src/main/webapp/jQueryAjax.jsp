<%--
  Created by IntelliJ IDEA.
  User: Chris
  Date: 2021/1/5
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
    <script type="text/javascript">
        function sendRequest1() {
            var url = "ajaxServlet2";
            var data = "name=xzh$.get()&pwd=123456";
            var callback=function (result) {
                alert(result);
            };
            $.get(url,data,callback);
        }
        function sendRequest2() {
            var url = "ajaxServlet3";
            var data = {name:"xzh$.post()",pwd:"654321"};
            var callback=function (result) {
                alert(result);
            };
            $.post(url,data,callback);
        }

        function sendRequest3() {
            $.ajax({
                url:"ajaxServlet4",
                data:{name : "xzh$.ajax()",pwd : "654321"},
                type:"post",
                success:function (result) {
                    alert(result);
                },
                error:function () {
                    alert("错晒");
                }
            });
        }

        $(function () {
            $("#testjQuery").on("click",function () {
                alert("testjQuery")
            })
        })
    </script>
</head>
<body>
    <input id="testjQuery" type="button" value="testjQuery" >
    <input type="button" value="发送异步请求1" onclick="sendRequest1()">
    <input type="button" value="发送异步请求2" onclick="sendRequest2()">
    <input type="button" value="发送异步请求3" onclick="sendRequest3()">
</body>
</html>
