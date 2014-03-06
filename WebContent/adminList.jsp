<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
/* UserBean User = (UserBean)request.getSession().getAttribute("User");
if(User == null)
	response.sendRedirect("login.jsp"); */
String ctxpath = request.getContextPath();
/* String userName = User.getUsername();
request.setAttribute("username", userName); */
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员列表</title>
	<link rel="stylesheet" type="text/css" href="./ext-4.2.1-Lite/resources/ext-theme-neptune/ext-theme-neptune-all.css" />
	
  <script type="text/javascript" src="./ext-4.2.1-Lite/ext-all-debug.js"></script>
  <script type="text/javascript" src="./ext-4.2.1-Lite/ext-theme-neptune.js"></script>
  <script type="text/javascript" src="./ext-4.2.1-Lite/locale/ext-lang-zh_CN.js"></script>
	<link rel="stylesheet" type="text/css" href="./css/style.css" />
</head>
<body>
<script type="text/javascript">
	var ctxpath = '<%=ctxpath%>';
	//切换主题
	function themeChange(theme) {
		Ext.util.CSS.swapStyleSheet('theme', './ext-4.2.1-Lite/resources/css/ext-all.css');
	}
	//创建AdminAction模型
	Ext.define('AdminAction', {  
	    extend : 'Ext.data.Model',  
	    fields : [ 'admin', 'updateAdmins', 'createAdmins',  
	            'deleteAdmins', 'message' ],  
	    proxy : {  
	        type : 'ajax',  
	        api : {  
	            create : 'adminTest_add',  
	            update : 'adminTest_update'  
	        },  
	        writer : {  
	            type : 'json'  
	        },  
	        reader : {  
	            type : 'json'  
	        }  
	    }  
	});  
	
	Ext.define('AdminModel', {  
	    extend : 'Ext.data.Model',  
	    fields : [ 'loginid', 'loginpwd', 'adminname' ],  
	      
	});  
	Ext.onReady(function(){
		//创建汽车数据模型
		
		
		var adminStore = Ext.create('Ext.data.Store', {  
		    pageSize : 5,  //改小点，好测试
		    model : 'AdminModel',  
		    autoLoad : true,  
		    proxy : {  
		        type : 'ajax',  
		        actionMethods : 'post',  
		        url : 'adminTest_list',  
		        reader : {  
		            type : 'json',  
		            root : 'rows',  
		            totalProperty : 'totalCount'  
		        }  
		    }  
		});
		
		//定义汽车数据源对象
		/* var busStore = Ext.create('Ext.data.JsonStore',{
			autoLoad :true,
			model : 'Bus',
			proxy: {
		        type: 'ajax',
		        url : 'bus_list',
		        reader: {
		            type: 'json',
		            totalRecords: 'results',
		            idProperty : 'vehicleno'
		         //   record: 'Book'
		        }
		    }
		});
		//创建车站数据模型
		Ext.regModel('Station', {
		    fields: [
				{name: 'stationid'},
				{name: 'stationname'},
				{name: 'locationx'},
				{name: 'locationy'}
		    ]
		});
		//创建线路数据模型
		Ext.regModel('Route', {
		    fields: [
				{name: 'routeid'},
				{name: 'routename'},
				{name: 'startstationid'},
				{name: 'endstationid'},
		    ]
		}); */
		//创建工具栏组件
		var toolbar = [
			{text : '注册汽车',iconCls:'add',handler : showAddAdmin},
			{text : '修改汽车',iconCls:'option'},
			{text : '注销汽车',iconCls:'remove'}
		];
		var pageToolbar=new Ext.PagingToolbar({
			  store:adminStore,
			  pageSize:5,//小点，和上面一致
			  displayInfo:true,
			  displayMsg:"当前显示从{0}条到{1}条，共{2}条",
			  emptyMsg:"<span style='color:red;font-style:italic;'>对不起没有找到数据</span>"
			 });
		//创建Grid表格组件
		var adminGrid = new Ext.grid.Panel({
			tbar : toolbar,
			bbar : pageToolbar,
			region: 'center',
			store: adminStore,
			selModel : new Ext.selection.CheckboxModel(),
			columns: [//配置表格列
				{text: "管理员号", width: 80, dataIndex: 'loginid', sortable: true},
				{text: "登陆密码", width: 80, dataIndex: 'loginpwd', sortable: true},
				{text: "名字", width: 80, dataIndex: 'adminname', sortable: true},	
			]
		});
		new Ext.container.Viewport({
			layout:'border',//表格布局
			items : adminGrid
		});
		
		var adminForm = new Ext.form.Panel({
			fieldDefaults:{//统一设置表单字段默认属性
				labelSeparator :'：',//分隔符
				labelWidth : 80,//标签宽度
				msgTarget : 'side',
				width : 300
			},
			bodyPadding: 5,
			frame:true,
			items : [{
				xtype:'textfield',
				allowBlank : false,
				blankText : '管理员ID不能为空',
				name : 'loginid',
				fieldLabel:'管理员ID'
			},{
				xtype:'textfield',
				allowBlank : false,
				blankText : '密码不能为空',
				name : 'loginpwd',
				fieldLabel:'密码'
			},{
				xtype:'textfield',
				allowBlank : false,
				blankText : '名字不能为空',
				name : 'adminname',
				fieldLabel:'名字'
			}],
			buttons:[{
				text : '提交',
				handler : submitForm
			},{
				text : '关闭',
				handler : function(){
					win.hide();
				}
			},'->']
			});
		
		var win = new Ext.window.Window({
			layout:'fit',
		    width:380,
		    closeAction:'hide',
		    height:280,
			resizable : false,
			shadow : true,
			modal :true,
		    closable:true,
			items:adminForm
		});
		
		function showAddAdmin(){
			adminForm.form.reset();
			adminForm.isAdd = true;
			win.setTitle("新增管理员");
			win.show();
		}
		
		function submitForm(){
			
		}
		
		//创建新增或修改书籍信息的form表单
		Ext.QuickTips.init();});
		//创建书籍类型数据模型
		
		
</script>
</body>
</html>