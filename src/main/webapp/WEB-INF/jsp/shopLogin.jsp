<%--
  Created by IntelliJ IDEA.
  User: hongchen
  Date: 2018/4/19
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
  <title>
  </title>
  <script src="../../resources/js/mui.min.js"></script>
  <script src="../../resources/js/jquery-3.3.1.min.js"></script>
  <link href="../../resources/css/mui.min.css" rel="stylesheet"/>
  <link href="../../resources/css/zui.min.css" rel="stylesheet"/>
  <link href="../../resources/css/doc.min.css" rel="stylesheet"/>
  <link rel="shortcut icon" href="../../resources/img/favicon.ico" type="image/x-icon" />
  <script type="text/javascript" charset="utf-8">
      mui.init();
  </script>
  <style>
    .mui-card{
      top: 130px;
      background-color: rgba(247,247,247,.50);
    }
    .mui-input-clear{
      width: 60%;
    }
    .mui-input-group label {
      width: 35%;
    }

    .mui-input-row label~input,
    .mui-input-row label~select,
    .mui-input-row label~textarea {
      width: 65%;
    }
    .mui-btn{
      width: 50%;
      left: 25%;
      padding: 8px;
    }
    .link-area {
      display: block;
      text-align: center;
    }
    #web_bg{
      position:fixed;
      top: 0;
      left: 0;
      width:100%;
      height:100%;
      min-width: 1000px;
      z-index:-10;
      zoom: 1;
      background-color: #fff;
      background-repeat: no-repeat;
      background-size: cover;
      -webkit-background-size: cover;
      -o-background-size: cover;
      background-position: center 0;
    }
    #web_bar {
      height: 10%;
      width: 100%;
      background-color: #dc322f;
      opacity: 0.9;
      position: relative;
    }
    #title {
      font-family: Consolas;
      vertical-align: middle;
      font-size: 35px;
      position: absolute;
      top: 3%;
      transform: translateX(33%);

    }
    #waimailogo {
      background-size: 100% 100%;
      height: 50px;
      width: 50px;
      vertical-align: middle;
      position: absolute;
      top: 13%;
      transform: translateX(110%);
    }
  </style>
</head>
<body>
<div class="wrapper">
  <!--背景图片-->
  <div id="web_bg" style="background-image:url(../../resources/img/GettyImages-545286388n.jpg);"></div>
  <!--其他代码 ... -->
</div>
<header id="web_bar">
  <h2 id="title" style="color: white"><b>C U C 外 卖 商 户 端</b></h2>
  <img id="waimailogo" src="../../resources/img/waimailogo.png">
</header>

<div id="IN">
  <div class="mui-card">
    <div class="mui-card-header">
      <div class="mui-input-row">
        <label>商户号</label>
        <input id='shopId' type="text" class="mui-input-clear mui-input" placeholder="请输入账号或手机号">
      </div>
    </div>
  </div>


  <div class="mui-card">
    <div class="mui-card-header">
      <div class="mui-input-row">
        <label>密码</label>
        <input id='shopPsd' type="password" class="mui-input-clear mui-input" placeholder="请输入密码">
      </div>
    </div>
  </div>


  <div class="mui-card">
    <div class="mui-card-header">
      <button id='login' class="mui-btn mui-btn-block mui-btn-danger" onclick="check()">登录</button>
    </div>
    <div class="mui-content-padded">
      <div class="link-area">
        <a id='reg' onclick="regbutton()">注册账号</a>
        <a >@copyright2018</a>
      </div>
    </div>
  </div>

</div>

<script type="text/javascript" charset="utf-8">
    mui.init();
    function regbutton(){
        var btnArray = ['确认', '取消'];
        mui.confirm("您确定要注册账号吗？","注册提醒",btnArray,function(e){
            if (e.index == 1) {
                mui.toast("已取消");
            } else {
                mui.innerText="进入注册界面";
                window.location.href="/shopReg";
            }
        })
    }
    function check(){
        var shopId  = document.getElementById("shopId").value;
        var shopPsd = document.getElementById("shopPsd").value;
        var info = document.getElementById("info");
        if(shopId==""||shopPsd==""){
            mui.alert("用户名和密码不能为空，请重新输入");
        }
        else{
            $.ajax({
                type:'POST',
                url:"/shopLogin.do",
                data:{
                    "shopIdOrTel":shopId
                    ,"shopPsw":shopPsd
                },
                success:function(data) {
                    if (data.valueOf()==1)
                    {
                        mui.alert("你已登录成功","登陆提醒","确认",function(){
                            window.location.href="/main";
                        })
                        //window.location.href="/reg";
                    }
                    else if(data.valueOf()==0){
                        mui.alert("帐号或密码错误！","登陆提醒","确认",function(){
                        })
                    }
                    else {
                        mui.alert("没有此账户");
                    }

                }

            })
        }
    }
</script>
</body>
</html>
