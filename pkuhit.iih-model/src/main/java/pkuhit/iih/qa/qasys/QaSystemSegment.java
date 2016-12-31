package pkuhit.iih.qa.qasys;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseRelationModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;








 
 public static final String   OBJ_CD  = "QAK04";

public static final   String  CODE = "QAK04.AT01";
// 质控体系医疗记录编码
public static final   String  QA_SYSTEM_MR_CODE = "QAK04.AT02";
// 段落类型编码
public static final   String  MR_SEGMENT_TYPE_CODE = "QAK04.AT03";
// 质控要求
public static final   String  REQUIRMENT = "QAK04.AT04";
// 总分值
public static final   String  TOTAL_SCORE = "QAK04.AT05";


@Column(name="QA_SYS_SEG_CD") 
private  String code;

@Column(name="QA_SYS_MR_CD") 
private  String qaSystemMrCode;

@Column(name="MR_SEG_TP_CD") 
private  String mrSegmentTypeCode;

@Column(name="REQ") 
private  String requirment;

@Column(name="TTL_SCR") 
private  Integer totalScore;
// 段落类型名称
@DictionaryTag(code = "mrSegmentTypeCode")
private  String mrSegmentTypeName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.qaSystemMrCode;
 }

 {
  this.qaSystemMrCode = qaSystemMrCode;
 }

 {
     return this.mrSegmentTypeCode;
 }

 {
  this.mrSegmentTypeCode = mrSegmentTypeCode;
 }

 {
     return this.requirment;
 }

 {
  this.requirment = requirment;
 }

 {
     return this.totalScore;
 }

 {
  this.totalScore = totalScore;
 }

 {
     return this.mrSegmentTypeName;
 }

 {
  this.mrSegmentTypeName = mrSegmentTypeName;
 }

