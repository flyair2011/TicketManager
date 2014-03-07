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
<title>调度管理</title>
	<link rel="stylesheet" type="text/css" href="./ext-4.2.1-Lite/resources/ext-theme-neptune/ext-theme-neptune-all.css" />

  <script type="text/javascript" src="./ext-4.2.1-Lite/ext-all-debug.js"></script>
  <script type="text/javascript" src="./ext-4.2.1-Lite/ext-theme-neptune.js"></script>
  <script type="text/javascript" src="./ext-4.2.1-Lite/locale/ext-lang-zh_CN.js"></script>
  	<script type="text/javascript" src="./scripts/Models.js"></script>
	<script type="text/javascript" src="./scripts/Station.js"></script>
	<link rel="stylesheet" type="text/css" href="./css/style.css" />
</head>
<body>
<script type="text/javascript">
	var ctxpath = '<%=ctxpath%>';
	//切换主题
	function themeChange(theme) {
		Ext.util.CSS.swapStyleSheet('theme', './ext-4.2.1-Lite/resources/css/ext-all.css');
	}
	
	
	Ext.onReady(function(){

		var routesScheduleStore = Ext.create('Ext.data.Store', {  
		    pageSize : 10,  
		    model : 'RouteScheduleModel',  
		//    autoLoad : true,  
		    proxy : {  
		        type : 'ajax',  
		        actionMethods : 'post',  
		        url : 'routemchedule_list',  
		        reader : {  
		            type : 'json',  
		            root : 'rows',  
		            totalProperty : 'totalCount'  
		        }  
		    }  
		});
		var toolbar_rs = [
		         			{text : '新增调度',iconCls:'add',handler:showNewSchedule},
		         			{text : '修改调度',iconCls:'option'},
		         			{text : '删除调度',iconCls:'remove'}
		         		];

		      //分页工具下拉框
		      var pagesize_combo_rs = new Ext.form.ComboBox({   
		          store: [[5,'5条'],[10,'10条'],[20,'20条'],[40,'40条'],[60,'60条'],[100,'100条']],   
		       width:70,    
		       emptyText: '10条',   
		          mode: 'remote',
		          name: 'pageSize',
		          editable:false,
		          triggerAction: 'all',   
		          valueField: 'value',   
		          displayField: 'text'  
		      });
		      //绑定分页下拉框更改事件
		      pagesize_combo_rs.on("select",function(comboBox){          
		      	pageToolbar_rs.pageSize = parseInt(comboBox.getValue());
		      	routesScheduleStore.pageSize = parseInt(comboBox.getValue());
		      	routesScheduleStore.reload({params:{start:0,limit:pageToolbar_rs.pageSize}});   
		      });
		      //分页工具栏
		      var pageToolbar_rs=new Ext.PagingToolbar({
		      	  store:routesScheduleStore,
		      	  pageSize:10,//小点，和上面一致
		      	  displayInfo:true,
		      	  displayMsg:"当前显示从{0}条到{1}条，共{2}条",
		      	  emptyMsg:"<span style='color:red;font-style:italic;'>对不起没有找到数据</span>",
		      	  items:[ '&nbsp;&nbsp;每页显示记录数量：',pagesize_combo_rs]
		      	 });
		      //定义表格组件
		      var routesScheduleGrid = new Ext.grid.Panel({
		      			tbar : toolbar_rs,
		      			bbar : pageToolbar_rs,
		      			region: 'center',
		      			store: routesScheduleStore,
		      			selModel : new Ext.selection.CheckboxModel(),
		      			columns: [//配置表格列
		      				{text: "调度编号", width: 80, dataIndex: 'scheduleid', sortable: true},
		      				{text: "调度线路", width: 80, dataIndex: 'schedulerouteid', sortable: true},
		      				{text: "出发时间", width: 80, dataIndex: 'starttime', sortable: true},	
		      				{text: "到达时间", width: 80, dataIndex: 'endtime', sortable: true},
		      				{text: "调度名称", width: 80, dataIndex: 'schedulename', sortable: true},
		      				{text: "调度车辆", width: 80, dataIndex: 'schedulevehicleno', sortable: true}
		      			]
		      		});
		     
		
		
		
		 var testGrid = new Ext.grid.Panel({
				region: 'center',
   		//	store: routesScheduleStore,
   			name: 'innerGrid',
   			selModel : new Ext.selection.CheckboxModel(),
   			columns: [//配置表格列
   			       {text: "调度编号", width: 80, dataIndex: 'scheduleid', sortable: true},
     				{text: "调度线路", width: 80, dataIndex: 'schedulerouteid', sortable: true}
   			]
				
			});
		 var innerGrid = new Ext.grid.Panel({
					region: 'center',
	      		//	store: routesScheduleStore,
	      			name: 'innerGrid',
	      			selModel : new Ext.selection.CheckboxModel(),
	      			columns: [//配置表格列
	      				
	      			]
					
				});
		 testGrid.hide();
		 
		//显示
			new Ext.container.Viewport({
				layout:'border',//表格布局
				items : routesScheduleGrid
			});
		//创建调度表单
		var routesScheduleForm = new Ext.form.Panel({
			autoHeight : true,
			layout : "form",
			fieldDefaults:{//统一设置表单字段默认属性
				labelSeparator :'：',//分隔符
				labelWidth : 80,//标签宽度
			//	msgTarget : 'side',
				width : 200
			},
			bodyPadding: 5,
			frame:true,
			items : [{//第一行
				layout : 'column',
				items : [{
					xtype:'textfield',
					allowBlank : false,
					blankText : '调度线路不能为空',
					name : 'schedulerouteid',
					fieldLabel:'调度线路'
				},{
		            xtype: 'button',
		            text : '选择线路',
		            handler:function(){
		            //	alert("ok");
		            	stationGrid.show();
		            	testGrid.hide();
		            	//TODO编写选择线路操作
		            }
		        },{
					xtype:'textfield',
					allowBlank : false,
					blankText : '调度车辆不能为空',
					name : 'schedulevehicleno',
					fieldLabel:'&nbsp;&nbsp;&nbsp;调度车辆'
				},{
		            xtype: 'button',
		            text : '选择车辆',
		            handler:function(){
		            	//TODO编写选择车辆操作
		            	stationGrid.hide();
		            	testGrid.show();
		            	
		            }
		        }]
				
			},{
				layout : 'column',
				items : [{
			        xtype: 'timefield',
			        name: 'starttime',
			        fieldLabel: '出发时间',
			        minValue: '6:00 AM',
			        maxValue: '8:00 PM',
			        increment: 30,
			        anchor: '100%'
			    }, {
			        xtype: 'timefield',
			        name: 'endtime',
			        fieldLabel: '&nbsp;&nbsp;&nbsp;到达时间',
			        minValue: '6:00 AM',
			        maxValue: '8:00 PM',
			        increment: 30,
			        anchor: '100%'
			   },{
		        	
					xtype:'textfield',
					allowBlank : false,
					blankText : '调度名称不能为空',
					name : 'schedulename',
					fieldLabel:'&nbsp;&nbsp;&nbsp;调度名称'
				}]
			},{
				items: [stationGrid,testGrid]
			}
			]
		});

		//创建弹出窗口
		var win = new Ext.window.Window({
			layout:'fit',
		    width:700,
		    closeAction:'hide',
		    height:400,
			resizable : false,
			shadow : true,
			modal :true,
		    closable:true,
			items: [routesScheduleForm]
		});
		
		function showNewSchedule(){
			win.setTitle("新增调度");
			win.show();
			
		}
	
		
		Ext.QuickTips.init();});

		
</script>
</body>
</html>