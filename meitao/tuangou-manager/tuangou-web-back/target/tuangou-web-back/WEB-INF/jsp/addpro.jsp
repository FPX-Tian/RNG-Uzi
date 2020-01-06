<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="js/jquery-3.4.1.min.js" charset="utf-8"></script>

<script type="text/javascript">
	$(function() {

		function getArea() {
			var AreaList = $("#area");//获取id=area的html对象，并封装成一个jquery对象

			$.ajax({
				type : 'POST',
				dataType : 'json',//预期服务器返回的数据类型			
				url : 'getarea',//相对路径访问
				success : function(responseData, status, xhr) {

					AreaList.html("");//把页面上的select清空数据
					var str ="";//定义存放区域select中的html
					//responseData是ajax从服务端拿到的区域json
					$.each(responseData, function(i, obj) {//i 循环索引 ,obj 每次循环拿到的元素
						//此循环就是拼接一段html静态代码
						str = str
								+ '<option value="'+obj.areaid+'">'
								+ obj.areaname + "</option>"
					});
					
					console.info(str);
					AreaList.html(str);//把上面拼接的静态代码丢过去
				},
				error : function(xhr, status, error) {
					console.info("出错了！");
					console.info(error);
					AreaList.html('<option>'+获取区域异常+"</option>");
				}
			});
		}

		getArea();
	});
</script>

</head>
<body>
添加商品
<form action="product/add" method="post" enctype="multipart/form-data">
	商品标题：<input type="text" name="title" /><br>
	 商品描述：<textarea name="productdesc" cols="50" rows="3"></textarea><br>
	 
	 原价：<input type="text" name="originalprice" /><br>
	 当前团购价：<input type="text" name="currentprice" /><br>
	 
	<!-- 异步请求：从数据库中查询出所有的区域,商店，类型列表，动态（js,或jstl）显示在下拉列表中
	 区域：<select name="areaid">
	 	<option value="4">江汉路</option>
	 	<option value="6">武广</option>
	 </select><br>
	-->
	 区域：
	 <select id="area" name="areaid">
	 	<!-- 拼接的静态代码放此处 -->
	 </select><br>
	 
	<!-- 从数据库中查询出所有的区域列表，动态（js,或jstl）显示在下拉列表中 -->
	  商店：
	 <select name="shopid">
	 	<option value="2">领先一步干果店</option>
	 	<option value="4">谷一韩式自助餐厅武广店</option>
	 </select><br>
	 <!-- 从数据库中查询出所有的区域列表，动态（js,或jstl）显示在下拉列表中 -->
	 商品类型：
	 <select name="categoryid">
	 	<option value="7">火锅</option>
	 	<option value="13">食品</option>
	 </select><br>
	 
	 <!-- 后期通过上传图片，将图片的地址保存到数据库 -->
	 商品图片1：
	 <input type="file" name="attachs" id="picPath1"/><br>
	 
	  商品图片2：
	 <input type="file" name="attachs" id="picPath2"/><br>
	
	<input type="submit" value="添加"  />
</form>
</body>
</html>