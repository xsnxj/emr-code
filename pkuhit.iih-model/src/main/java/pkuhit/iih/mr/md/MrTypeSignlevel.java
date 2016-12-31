package pkuhit.iih.mr.md;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseRelationModel;









public static final   String  CODE = "MRM18.AT01";
// 医疗记录类型编码
public static final   String  MR_TYPE_CODE = "MRM18.AT02";
// 组织机构编码
public static final   String  ORGANIZATION_CODE = "MRM18.AT03";
// 诊断编码
public static final   String  DIAGNOSIS_CODE = "MRM18.AT04";
// 审签级别编码
public static final   String  MR_SIGN_LEVEL_CODE = "MRM18.AT05";


@Column(name="MR_TP_SIGN_LVL_CD") 
private  String code;

@Column(name="MR_TP_CD") 
private  String mrTypeCode;

@Column(name="ORG_CD") 
private  String organizationCode;

@Column(name="DI_CD") 
private  String diagnosisCode;

@Column(name="MR_SIGN_LVL_CD") 
private  String mrSignLevelCode;
// 医疗记录类型名称
@DictionaryTag(code = "mrTypeCode")
private  String mrTypeName;
// 组织机构名称
//@DictionaryTag(code = "organizationCode")
private  String organizationName;
// 诊断名称
@DictionaryTag(code = "diagnosisCode")
private  String diagnosisName;
// 审签级别名称
@DictionaryTag(code = "mrSignLevelCode")
private  String mrSignLevelName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.mrTypeCode;
 }

 {
  this.mrTypeCode = mrTypeCode;
 }

 {
     return this.organizationCode;
 }

 {
  this.organizationCode = organizationCode;
 }

 {
     return this.diagnosisCode;
 }

 {
  this.diagnosisCode = diagnosisCode;
 }

 {
     return this.mrSignLevelCode;
 }

 {
  this.mrSignLevelCode = mrSignLevelCode;
 }

 {
     return this.mrTypeName;
 }

 {
  this.mrTypeName = mrTypeName;
 }

 {
     return this.organizationName;
 }

 {
  this.organizationName = organizationName;
 }

 {
     return this.diagnosisName;
 }

 {
  this.diagnosisName = diagnosisName;
 }

 {
     return this.mrSignLevelName;
 }

 {
  this.mrSignLevelName = mrSignLevelName;
 }

