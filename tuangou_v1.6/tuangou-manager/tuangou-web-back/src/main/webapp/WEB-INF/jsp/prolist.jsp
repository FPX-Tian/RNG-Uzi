<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
<link rel="stylesheet" type="text/css" href="../js/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="../js/easyui/themes/icon.css" />

<script type="text/javascript" src="../js/easyui/jquery.min.js"></script>
<script type="text/javascript" src="../js/easyui/jquery.easyui.min.js"	charset="utf-8"></script>
<script type="text/javascript" src="../js/easyui/locale/easyui-lang-zh_CN.js" charset="utf-8"></script>
	
	<script type="text/javascript" charset="utf-8">
        $(function () {
        console.info();
            $("#tb1").datagrid({
                title: "所有商品列表",
                width: 400,
                height: 200,
                striped: true,
                url:'http://localhost:8080/product/list',//请求服务端拿数据，要包含每一行信息，还有分页的信息（总页数，当前页，每页显示多少条数据）
                //url: 'http://localhost:8080/product/list',//方法一：让datagrid控件自己去请求服务端拿数据
                //data:{'total': 10,'rows': [{"productid":1,"title":"虎标苦荞茶","productdesc":"香浓","originalprice":38.00000,"currentprice":12.70140,"areaid":4,"shopid":3,"categoryid":13,"picture":null,"salescount":null,"iscommend":null},{"productid":2,"title":"味客吉柿饼","productdesc":"解酒","originalprice":12.50000,"currentprice":4.19840,"areaid":4,"shopid":3,"categoryid":13,"picture":null,"salescount":null,"iscommend":null}]},
                //data:{'total': 10,'rows':${plist}},//方法二：
                
                loadMsg: '数据加载中请稍后……',
                pagination: true,
                rownumbers: true,
                fit: true,
                fitColumns: true,//自动撑满表格
                pageList: [5, 10, 20, 30],
                pageSize: 5,//与上面pageList中的5保持一致，否则需要页面手动选择pageSize
                
                idField:'productid',
                singleSelect:false,
                columns: [[
                	{ field: 'ck',checkbox:true},
                    { field: 'productid', align: 'center', title: '产品编号', rowspan: 2, width: 80, sortable: true },
                    { field: 'title', align: 'left', title: '产品标题', rowspan: 2, width: 80, sortable: true,
                    			formatter: function(value,rowData,index){
      								return "标题："+rowData.title;
								}},
                    { field: 'productdesc', align: 'center', title: '描述', rowspan: 2, width: 80, sortable: true,
                    			formatter: function(value,rowData,index){
      								return "<span style='color:red;'>"+rowData.productdesc + "</span>";
								}},
					{ field: 'originalprice', align: 'center', title: '原价', rowspan: 2, width: 80, sortable: true },
					{ field: 'currentprice', align: 'center', title: '现价', rowspan: 2, width: 80, sortable: true },
					{ field: 'areaid', align: 'center', title: '区域id', rowspan: 2, width: 80, sortable: true },
					{ field: 'shopid', align: 'center', title: '商店id', rowspan: 2, width: 80, sortable: true },
					{ field: 'picture', align: 'center', title: '图片', rowspan: 2, width: 80, sortable: true }
                ]],
                
                toolbar: [{
                		text: "添加产品",
             			iconCls:"icon-add",
             			handler:function () {
                            var checkedItems = $('#tb1').datagrid('getChecked');//获取选择的行信息
                            console.info(checkedItems);//在控制台调试获取的行信息
                            
                            if (checkedItems.length>0) {//判断是否用户选择了行
                            	
                                $("#pid").html(checkedItems[0].productid);
                                $("#ptitle").html(checkedItems[0].title);
                                $("#pdesc").html(checkedItems[0].productdesc);
                                
                                $("#proEdit").dialog({
                                    title: "添加推荐信息",
                                    top:10,
                                    collapsible: true,
                                    resizable:true,
                                    width: 300,
                                    height: 250,
                                    //modal: true,//启用模态对话框
                                });
                            } else {
                                $.messager.alert('警告', '请选择复选框');
                            }
                        }},
                        {text: "删除产品",
             			iconCls:"icon-remove",
             			handler: function () {
                            var checkedItems = $('#tb1').datagrid('getChecked');//获取选择的行信息
                            console.info(checkedItems);//在控制台调试获取的行信息
                            
                            if (checkedItems.length>0) {//判断是否用户选择了行
                            	
                                $("#pid").html(checkedItems[0].id);
                                $("#ptitle").html(checkedItems[0].title);
                                $("#pdesc").html(checkedItems[0].productdesc);
                                
                                $("#proEdit").dialog({
                                    title: "删除产品信息",
                                    collapsible: true,
                                    width: 300,
                                    height: 250,
                                    modal: true,//启用模态对话框
                                    buttons: [
                                        {
                                            text: '确认删除',
                                            iconCls: 'icon-remove',
                                            handler: function () {
                                                console.info("删除用户！");
                                               //ajax提交操作
                                            }
                                        },
                                        {
                                            text: '取消',
                                            iconCls: 'icon-add',
                                            handler: function () {
                                                console.info("取消！");
                                            }
                                        }
                                     ]
                                });
                            } else {
                                $.messager.alert('警告', '请选择复选框');
                            }
                        }}]
            });
        });
    </script>
</head>
<body>
<!-- 以下空的tables，jqueryeasyui用json数据去渲染 -->
<table id="tb1"></table>

<div id="proEdit">
	编号：<span id="pid"></span><br/>
 	标题：<span id="ptitle"></span><br/>
	描述：<span id="pdesc"></span><br/>
</div>
</body>
</html>
    