package pkuhit.xap.me;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseMasterModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  CODE = "MEB02.AT01";
// 父数据对象编码
public static final   String  PARENT_CODE = "MEB02.AT02";
// 领域编码
public static final   String  DOMAIN_CODE = "MEB02.AT03";
// 根数据对象编码
public static final   String  ROOT_CODE = "MEB02.AT04";
// 版本号
public static final   String  VERSION_NO = "MEB02.AT05";
// 对象类型编码
public static final   String  TYPE_CODE = "MEB02.AT06";
// 名称
public static final   String  NAME = "MEB02.AT07";
// 描述
public static final   String  DESCRIPTION = "MEB02.AT08";
// 英文简称
public static final   String  SHORT_ENGLISH_NAME_ = "MEB02.AT09";
// 英文名称
public static final   String  ENGLISH_NAME = "MEB02.AT10";
// 数据表名
public static final   String  TABLE_NAME = "MEB02.AT11";
// 通用主数据标志
public static final   String  COMMON_MASTER_DATA_FLAG = "MEB02.AT12";
// 数据表标志
public static final   String  TABLE_FLAG = "MEB02.AT13";
// 缓存标志
public static final   String  CACHE_FLAG = "MEB02.AT14";
// 常量生成标志
public static final   String  CONSTANT_FLAG = "MEB02.AT15";
// 包名
public static final   String  PACKAGE_PATH = "MEB02.AT16";
// 基类
public static final   String  BASE_CLASS = "MEB02.AT17";


@Column(name="OBJ_CD") 
private  String code;

@Column(name="PAR_OBJ_CD") 
private  String parentCode;

@Column(name="DO_CD") 
private  String domainCode;

@Column(name="RT_OBJ_CD") 
private  String rootCode;

@Column(name="VER_NO") 
private  String versionNo;

@Column(name="OBJ_TP_CD") 
private  String typeCode;

@Column(name="NM") 
private  String name;

@Column(name="DES") 
private  String description;

@Column(name="SHT_NM_EN") 
private  String shortEnglishName;

@Column(name="NM_EN") 
private  String englishName;

@Column(name="TAB_NM") 
private  String tableName;

@Column(name="COM_MD_F") 
private  Integer commonMasterDataFlag;

@Column(name="TAB_F") 
private  Integer tableFlag;

@Column(name="CACHE_F") 
private  Integer cacheFlag;

@Column(name="CONSTANT_F") 
private  Integer constantFlag;

@Column(name="PACKGE_PATH") 
private  String packagePath;

@Column(name="BASE_CLASS") 
private  String baseClass;
// 领域名称
private  String domainName;
// 对象类型名称
@DictionaryTag(code = "typeCode")
private  String typeName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.parentCode;
 }

 {
  this.parentCode = parentCode;
 }

 {
     return this.domainCode;
 }

 {
  this.domainCode = domainCode;
 }

 {
     return this.rootCode;
 }

 {
  this.rootCode = rootCode;
 }

 {
     return this.versionNo;
 }

 {
  this.versionNo = versionNo;
 }

 {
     return this.typeCode;
 }

 {
  this.typeCode = typeCode;
 }

 {
     return this.name;
 }

 {
  this.name = name;
 }

 {
     return this.description;
 }

 {
  this.description = description;
 }

 {
     return this.shortEnglishName;
 }

 {
  this.shortEnglishName = shortEnglishName;
 }

 {
     return this.englishName;
 }

 {
  this.englishName = englishName;
 }

 {
     return this.tableName;
 }

 {
  this.tableName = tableName;
 }

 {
     return this.commonMasterDataFlag;
 }

 {
  this.commonMasterDataFlag = commonMasterDataFlag;
 }

 {
     return this.tableFlag;
 }

 {
  this.tableFlag = tableFlag;
 }

 {
     return this.cacheFlag;
 }

 {
  this.cacheFlag = cacheFlag;
 }

 {
     return this.constantFlag;
 }

 {
  this.constantFlag = constantFlag;
 }

 {
     return this.packagePath;
 }

 {
  this.packagePath = packagePath;
 }

 {
     return this.baseClass;
 }

 {
  this.baseClass = baseClass;
 }

 {
     return this.domainName;
 }

 {
  this.domainName = domainName;
 }

 {
     return this.typeName;
 }

 {
  this.typeName = typeName;
 }

