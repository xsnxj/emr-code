Ext.define('iih.sy.patient.view.PatientContentView', {
			extend : 'Xap.ej.stl.view.LeftRightContainerTemplate',
			alias : 'widget.patientcontentview',
			requires : ['iih.sy.patient.view.PatientLeftListView',
					'iih.sy.patient.block.PatientRightBlock',
					'iih.sy.patient.action.PatientRightDeptDelAction',
					'iih.sy.patient.action.PatientLeftSearchAction',
					'iih.sy.patient.action.PatientRightListAction'],

			xapConfig : {
				blocks : {
					'left' : {
						xclass : 'iih.sy.patient.view.PatientLeftListView',
						width : 300,
						region:'west',
						split: true,
		                collapsible: true,
		                header:false
					},
					'right' : {
						xclass : 'iih.sy.patient.block.PatientRightBlock',
						flex : 1
					}
				},

					actions : {
						'patientRightList': {
							xclass: 'iih.sy.patient.action.PatientRightListAction',
							url: 'iemrPatient',
							blocks: {
								condition: 'left',
								result: 'right'
							}
						},
						'toReport': {
							xclass: 'iih.sy.patient.action.PatientDocAction',
							blocks: {
								condition: 'left',
								result: 'right'
							}
						}
					},
					chains : {
						'patientRightList': ['patientRightList'],
						'toReport' : ['toReport']
					},

					connections : {
						'left'	:[{
							selector: 'xapgrid',
							event: 'itemclick',
							chain: 'patientRightList'
						},{
							selector: 'xapgrid',
							event: 'itemdblclick',
							chain: 'toReport'
						}],
						'right' : [
						           {
									event: 'afterrender',
									chain: 'init'
								}]
					}
				}
		});