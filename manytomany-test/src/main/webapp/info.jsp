<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2022/8/13
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="jQuery/jQuery-v3.6.0.js"></script>
    <script>
        let sid='${param.id}';
        $(function (){
            $.ajax({
                url:"mis?m=list",
                dataType:"json",
                success:function (resp){
                    for (let d of resp){
                        $("#mids").append("<input type='checkbox' class='mids' value="+m.id+" name='mid'>" + m.name);
                    }
                },
                async:false
            });
            $.ajax({
                url: "stu?m=queryStudentById",
                data:{id:id},
                dataType: "json",
                success:function (resp) {
                    let sms=resp.stuAndMis
                    let mnames='';
                }
            });
        });
    </script>
</head>
<body>
<table align="center">
    <tr>
        <td>姓名:</td>
        <td>
            <span id="name"></span>
        </td>
    </tr>
    <tr>
        <td>已违纪项:</td>
        <td>
            <span id="mnames"></span>
        </td>
    </tr>
    <tr>
        <td>已扣除分数:</td>
        <td>
            <span id="mscore"></span>
        </td>
    </tr>
    <tr>
        <td>剩余分数:</td>
        <td>
            <span id="score"></span>
        </td>
    </tr>
    <tr>
        <td>全部违纪项</td>
        <td>
            <span id="mids"></span>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="button" value="返回" id="back">
            <input type="button" value="保存" id="save">
        </td>
    </tr>
</table>

</body>
</html>
