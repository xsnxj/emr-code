Ext.define('iih.mr.wr.mr.action.ShowDoctorSelectAction', {
	extend : 'Xap.ej.action.ServiceInvocation',

	requires : [],

	execute : function(context) {
		var selft=this;
		//判断如果是需要选择查房医师的病历走弹窗流程
		var tplTree = Ext.getCmp('mrTempSortTree');
	       //病历文书类型
		var treeNode = tplTree.getSelectionModel().getSelection();
		var treeNodeData=treeNode[0].raw.data;
		var templateName=treeNodeData.templateName;
	    var typeCode = treeNodeData.templateTypeCode;
		if(typeCode=='MRM16.19'||typeCode=='MRM16.20'){
				var win = new Ext.window.Window({
					id:'doctorSelectId',
					title : '请选择上级查房医师',
					plain: true, 
	//				header: false, 
	//				border: false,  
					frame:false,
					modal : true,
					width : 320,
					minHeight:33,
					height : 100,
					draggable : false, // 不允许拖拽
					resizable : false, // 不允许改变窗口大小
					closable : false, // 不显示关闭按钮
					collapsible : false, // 显示折叠按钮
					//modal : true,
					//layout : 'fit',
					//x:context.x-50,
					//y:context.y,
					items : [{
						xtype:'xapcombobox',
						name:'higherLvlEmp',
						padding:'10 0 0 15',
						fieldLabel:'上级查房医师',
						labelWidth:80,
						editable:true,
						width:280,
						disabled:false,
						queryMode: 'local',
						displayField: 'name',
						valueField: 'id'
					},{
			            xtype: "button",
			            margin:'0 0 0 170',
			            name: 'confimUpPro',
			            text: '确认',
			            iconCls: 'icon-OK',
			            handler:function(){
			            	var higherLvlEmpId=Ext.getCmp('doctorSelectId').down('xapcombobox[name=higherLvlEmp]');
			            	if(higherLvlEmpId.value!=null){
			            		var higherLvlEmp= higherLvlEmpId.valueModels[0].data;
			            		var createDoc = selft.getOwner().getActionChain('createDoc');
				            	Ext.getCmp("doctorSelectId").close();
				    			createDoc.execute({higherLvlEmpId:higherLvlEmp.id,superiorDoctorName:higherLvlEmp.name+" "+templateName,timeAutoGenerated:1});
			            	}else{
				            	Ext.Msg.alert('提示','请选择上级医师！');
			     	           	return
			            	}
				        }
			        },{
			            xtype: "button",
			            margin:'0 0 0 10',
			            name: 'cancel',
			            text: '取消' ,
			            iconCls: 'icon-cancel' ,
			            handler:function(){
			            	Ext.getCmp("doctorSelectId").close();
			            	return;
				        }
			    } ]
			});
			this.prepareOperations(context.operations);
			win.show();
			Ext.getCmp('doctorSelectId').down('xapcombobox[name=higherLvlEmp]').expand();
		}else{
			var createDoc = selft.getOwner().getActionChain('createDoc');
			createDoc.execute({timeAutoGenerated:1});
		}
		
	},prepareOperations: function(operations) {
		 var url ='app/sup/doctors?deptCd='+IMER_GLOBAL.department.code;
		 console.info(url);
	     var operation = {
	         url: url,
	         method: 'get',
	         scope: this,
	         success: this.onSuccess
	        };
	     operations.push(operation);
    },onSuccess: function(operation) {
        var higherLvlEmpId=Ext.getCmp('doctorSelectId').down('xapcombobox[name=higherLvlEmp]');
        if(operation.result.data.supDoctors){
            higherLvlEmpId.setData(operation.result.data.supDoctors);
        }
    }

});