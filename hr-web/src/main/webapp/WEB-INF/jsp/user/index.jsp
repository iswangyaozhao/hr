<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<base href="<%=basePath%>">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css" href="easyui/themes/material/easyui.css"/>
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css"/>

</head>
<body>
<table id="userTable"  title="User List"
        data-options="url:'user/list',fitColumns:true,striped:true,rownumbers:true,iconCls:'icon-search'">
    <thead>
        <tr>
       		<th data-options="field:'id',width:20,sortable:true,order:'desc'">Id</th>
       		<th data-options="field:'usercode',width:50,formatter:userCadeFormatter">用户编码</th>
       		<th data-options="field:'name',width:80,formatter:nameCadeFormatter">用户名</th>
            <th data-options="field:'username',width:80,sortable:true">账号</th>
            <th data-options="field:'salt',width:50,sortable:true">Salt</th>
            <th data-options="field:'archives',width:30,formatter:sexFormatter">性别</th>
            <th data-options="field:'aadt',width:50">部门</th>
            <th data-options="field:'a7t',width:50">职位</th>
            <th data-options="field:'role',width:50,formatter:roleFormatter">角色</th>
            <th data-options="field:'tel',width:100,formatter:telFormatter">电话</th>
            <th data-options="field:'statu',width:50,sortable:true,formatter:statuFormatter">状态</th>
            <th data-options="field:'cz',width:70,formatter:czFormatter">操作</th>
           
        </tr>
    </thead>
</table>
<div id="tb" style="padding:15px 10px;">
	用户编码 : <input type="text" name="" id="usercode" />
	角色: <input id="role" class="easyui-combobox" name="role.id" style="width: auto;min-width: 100px;"  data-options="hasDownArrow:true,valueField:'id',textField:'name',url:'role/all',panelHeight:'auto',panelMaxHeight:250,editable:false,panelMinWidth:150">
	<!--用户名 : <input type="text" name="" id="name" />
	 
	roles : <div style="min-width:100px; display: inline-block;">
  		<input id="roles" class="easyui-tagbox" name="roleIds" style="width: auto;min-width: 100px;"  data-options="hasDownArrow:true,valueField:'id',textField:'name',url:'role/all',panelHeight:'auto',panelMaxHeight:250,multiple:true,editable:false,panelMinWidth:150">
    		</div> -->
	<a id="btn" href="javascript:void(0)" onclick="setCondition();" class="easyui-linkbutton" data-options="iconCls:'icon-search'">Search</a>
	<a id="btn" href="javascript:void(0)" onclick="resetCondition()" class="easyui-linkbutton" data-options="iconCls:'icon-undo'">Reset</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="add_user();" data-options="iconCls:'icon-add'">添加</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-undo'">导出</a>
</div>
<script type="text/javascript">
	$(function(){
		$("#userTable").datagrid({
			pagination : true,
			toolbar : "#tb",
			idField : "id"
		});
	})
	
	//设置条件
	function setCondition(){
		
		var postData = {usercode : $("#usercode").val()};
		/*var ids = $("#roles").combobox("getValues");
		for(var i = 0; i < ids.length ; i++){
			postData["sysRoles["+i+"].id"] = ids[i];
		}*/
		
		$("#userTable").datagrid("reload",postData);
	}
	
	//添加用户
	function add_user(){
		var d = $("<div></div>").appendTo("body");
		d.dialog({
			title : "添加用户",
			iconCls : "icon-add",
			width:500,	
			height:550,
			modal:true,//是否是模态框
			href : "user/addForm",
			onClose:function(){$(this).dialog("destroy"); },//destroy销毁
			buttons:[{
				iconCls:"icon-ok",
				text:"确定",
				handler:function(){//点击确定按钮的操作
					$("#userForm").form("submit",{
						url : "user/toadd",
						success : function(data){
							d.dialog("close");
							$("#userTable").datagrid("reload");
						}
					});
				}
			},{
				iconCls:"icon-cancel",
				text:"取消",
				handler:function(){
					d.dialog("close");
				}
			}]
		});
	}
	
	//格式化操作
	function czFormatter(value,row,index) {
		return "<a href='javascript:void(0)'>附加角色(0)</a>";
	}
	//格式化name
	function nameCadeFormatter(value,row,index){
			return row.archives.name;
	}
	//格式化角色
	function roleFormatter(value,row,index){
			return row.role.name;
	}
	//格式化电话row.archives.details.tel+
	function telFormatter(value,row,index){
		var tel = row.archives.details.tel+"";
		if(tel != null || tel != ""){
			return tel;
		}
			return '-';
	}
	
	//修改
	function userCadeFormatter(value,row,index) {
		return "<a href='javascript:void(0)' onclick='edit_user("+row.id+");'  >"+value+"</a>";
	}
	
	//
	function edit_user(id){
		var d = $("<div></div>").appendTo("body");
		d.dialog({
			title : "编辑用户",
			iconCls : "icon-edit",
			width:500,
			height:600,
			modal:true,
			href : "user/userForm",
			onClose:function(){$(this).dialog("destroy"); },
			onLoad:function(){
				//发送异步请求，查询数据
				$.post("user/view",{id:id},function(data){
					$("#userForm").form("load",data);
					$("#role").combobox("setValue",data.role.id);
					$("#archives").combobox("setValue",data.archives.id);
					
					$("#email").val(data.archives.details.email);
					$("#tel").val(data.archives.details.tel);
					$("#remark").val(data.remark);
				});
			},
			buttons:[{
				iconCls:"icon-ok",
				text:"确定",
				handler:function(){
					$("#userForm").form("submit",{
						url : "user/updata",
						success : function(data){
							d.dialog("close");
							$("#userTable").datagrid("reload");
						}
					});
				}
			},{
				iconCls:"icon-remove",
				text:"删除",
				handler:function(){
					$.messager.confirm("提示","确定要删除选中的数据吗？",function(da){
						if(da){
							$.post("user/del",{id:id},function(data){
								if(data.result == true){
									// 删除成功后，刷新表格 reload
									d.dialog("close");
									$("#userTable").datagrid("reload");
								}
							})
						}
					})
				}
			},{
				iconCls:"icon-cancel",
				text:"取消",
				handler:function(){
					d.dialog("close");
				}
			}]
		});
	}
	
	//格式化性别
	function sexFormatter(value,row,index){
		if(value.sex == 1){
			return "男";
		}
			return "女";
	}
	//格式化状态
	function statuFormatter(value,row,index){
		if(value == 1){
			return "正常";
		}
			return "锁定";
	}
	/*
	function roleFormatter(value,row,index){
		if(value.length == 0){
			return "-";
		}
		var str = "";
		for(var i = 0; i < value.length; i++){
			str += value[i].name;
			if(i < value.length -1){
				str += ", ";
			}
		}
		return str;
	}

	
	
	//删除选择的数据行
	function delete_user(){
		//获取要删除的数据黄
		var selRows = $("#userTable").datagrid("getSelections");
		if(selRows.length == 0){
			$.messager.alert("提示","请选择要删除的数据行！","warning");
			return;
		}
		$.messager.confirm("提示","确定要删除选中的数据吗？",function(d){
			if(d){
				var postData = "";
				$.each(selRows,function(i){
					postData += "ids="+this.id;
					if(i < selRows.length - 1){
						postData += "&";
					}
				});
				$.post("user/batchDelete",postData,function(data){
					if(data.result == true){
						//4. 删除成功后，刷新表格 reload
						$("#userTable").datagrid("reload");
					}
				})
			}
		})
	}
	
	//添加用户
	*/
</script>
</body>
</html>




