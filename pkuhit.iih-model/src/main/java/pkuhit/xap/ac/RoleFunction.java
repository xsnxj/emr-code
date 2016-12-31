package pkuhit.xap.ac;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseRelationModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  CODE = "XAPM15.AT01";
// 角色编码
public static final   String  ROLE_CODE = "XAPM15.AT02";
// 功能编码
public static final   String  FUNCTION_CODE = "XAPM15.AT03";


@Column(name="ROLE_FU_CD") 
private  String code;

@Column(name="ROLE_CD") 
private  String roleCode;

@Column(name="FU_CD") 
private  String functionCode;
// 角色名称
private  String roleName;
// 功能名称
private  String functionName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.roleCode;
 }

 {
  this.roleCode = roleCode;
 }

 {
     return this.functionCode;
 }

 {
  this.functionCode = functionCode;
 }

 {
     return this.roleName;
 }

 {
  this.roleName = roleName;
 }

 {
     return this.functionName;
 }

 {
  this.functionName = functionName;
 }

