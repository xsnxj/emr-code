package pkuhit.iih.qa.old;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseRelationModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final String   OBJ_CD  = "QAB04";
public static final   String  PK = "QAB04.AT01";
// 质控主键
public static final   String  QA_PK = "QAB04.AT02";
// 缺陷主键
public static final   String  QA_FAULT_PK = "QAB04.AT03";


@Column(name="QA_FLT_ITM_PK") 
private  String pk;

@Column(name="QA_PK") 
private  String qaPk;

@Column(name="QA_FLT_PK") 
private  String qaFaultPk;

//缺陷主键
@Column(name="ACTIVE_F") 
private  short activeF;

 {
     return this.pk;
 }

 {
  this.pk = pk;
 }

 {
     return this.qaPk;
 }

 {
  this.qaPk = qaPk;
 }

 {
     return this.qaFaultPk;
 }

 {
  this.qaFaultPk = qaFaultPk;
 }

public short getActiveF() {
	return activeF;
}

public void setActiveF(short activeF) {
	this.activeF = activeF;
}
