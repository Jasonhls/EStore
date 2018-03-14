var E3MALL = {
	checkLogin : function(){
		var _ticket = $.cookie("token");
		if(!_ticket){
			return ;
		}
		$.ajax({
			url : "http://localhost:8089/user/token/" + _ticket,  //这里请求的是另一个工程，然后响应回来的数据，浏览器限制js获取，即存在js跨域问题
			dataType : "jsonp",                                   //解决方法是利用js中的callback方法，把对象转为json作为该方法的参数，回传给该js
			type : "GET",                                         //实现方法：这里需要加上dataType : "jsonp"，然后后台服务方法参考/sso/controller/TokenController.java中的方法
			success : function(data){
				if(data.status == 200){
					var username = data.data.username;
					var html = username + "，欢迎来到宜立方购物网！<a href=\"http://www.e3mall.cn/user/logout.html\" class=\"link-logout\">[退出]</a>";
					$("#loginbar").html(html);
				}
			}
		});
	}
}

$(function(){
	// 查看是否已经登录，如果已经登录查询登录信息
	E3MALL.checkLogin();
});