<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html  lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="" id="userForm" method="post">
		<p>
			*用户编号 : <input type="text" name="usercode" class="easyui-validatebox"  />
		</p>
		<p>
			*账号 : <input type="text" name="username" class="easyui-validatebox"  />
		</p>
		<p>
			*密码 : <input type="text" name="password" class="easyui-validatebox"  />
		</p>
		<p>
			*Salt : <input type="text" name="salt" class="easyui-validatebox"  />
		</p>
		<p>
			状态 : <input name="statu" value="1" class="easyui-switchbutton" data-options="onText:'Yes',offText:'No'">
		</p>
		<p>
			角色: <input id="role" class="easyui-combobox" name="role.id" style="width: auto;min-width: 100px;"  data-options="hasDownArrow:true,valueField:'id',textField:'name',url:'role/all',panelHeight:'auto',panelMaxHeight:250,editable:false,panelMinWidth:150">
		</p>
		<p>
			对应员工: <input id="archives" class="easyui-combobox" name="archives.id" style="width: auto;min-width: 100px;"  data-options="hasDownArrow:true,valueField:'id',textField:'name',url:'archives/all',panelHeight:'auto',panelMaxHeight:250,editable:false,panelMinWidth:150">
		</p>
		<hr/>
		<p>
			部门: <input type="text" readonly="true" name="" id="" />
		</p>
		<p>
			职位: <input type="text" readonly="true" name="" id="" />
		</p>
		
		<p>
			电子邮件: <input type="text" readonly="true" id="email" name="" />
		</p>
		<p>
			电话: <input type="text" readonly="true" id="tel" />
		</p>
		<hr/>
		<p>
			备注: <textarea rows="3" id="remark" name="remark" cols="60"></textarea>
		</p>
	</form>
	<script type="text/javascript">
		$("#archives").combobox({
			onChange:function(n,o){
				$.post("archives/toarchives",{id:n},function(data){
					$("#email").val(data.details.email);
					$("#tel").val(data.details.tel);
				});
			}
		});
	</script>
</body>
</html>






