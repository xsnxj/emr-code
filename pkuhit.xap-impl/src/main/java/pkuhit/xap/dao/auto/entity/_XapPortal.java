package pkuhit.xap.dao.auto.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.35.0" }, date = "2017-01-01T01:49:41.347+0800")
public final class _XapPortal extends org.seasar.doma.jdbc.entity.AbstractEntityType<pkuhit.xap.dao.auto.entity.XapPortal> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.35.0");
    }

    private static final _XapPortal __singleton = new _XapPortal();

    /** the portalCd */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object> $portalCd = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object>(pkuhit.xap.dao.auto.entity.XapPortal.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "portalCd", "PORTAL_CD");

    /** the orgCd */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object> $orgCd = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object>(pkuhit.xap.dao.auto.entity.XapPortal.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "orgCd", "ORG_CD", true, true);

    /** the nm */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object> $nm = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object>(pkuhit.xap.dao.auto.entity.XapPortal.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "nm", "NM", true, true);

    /** the des */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object> $des = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object>(pkuhit.xap.dao.auto.entity.XapPortal.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "des", "DES", true, true);

    /** the shtNmEn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object> $shtNmEn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object>(pkuhit.xap.dao.auto.entity.XapPortal.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "shtNmEn", "SHT_NM_EN", true, true);

    /** the nmEn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object> $nmEn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object>(pkuhit.xap.dao.auto.entity.XapPortal.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "nmEn", "NM_EN", true, true);

    /** the memo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object> $memo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object>(pkuhit.xap.dao.auto.entity.XapPortal.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "memo", "MEMO", true, true);

    /** the sortNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object> $sortNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object>(pkuhit.xap.dao.auto.entity.XapPortal.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sortNo", "SORT_NO", true, true);

    /** the spellNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object> $spellNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object>(pkuhit.xap.dao.auto.entity.XapPortal.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "spellNo", "SPELL_NO", true, true);

    /** the wubiNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object> $wubiNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object>(pkuhit.xap.dao.auto.entity.XapPortal.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "wubiNo", "WUBI_NO", true, true);

    /** the updCnt */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.math.BigInteger, java.lang.Object> $updCnt = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.math.BigInteger, java.lang.Object>(pkuhit.xap.dao.auto.entity.XapPortal.class, java.math.BigInteger.class, org.seasar.doma.wrapper.BigIntegerWrapper.class, null, null, "updCnt", "UPD_CNT", true, true);

    /** the crtTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.sql.Timestamp, java.lang.Object> $crtTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.sql.Timestamp, java.lang.Object>(pkuhit.xap.dao.auto.entity.XapPortal.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "crtTime", "CRT_TIME", true, true);

    /** the crtUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object> $crtUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object>(pkuhit.xap.dao.auto.entity.XapPortal.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "crtUserId", "CRT_USER_ID", true, true);

    /** the crtDeptCd */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object> $crtDeptCd = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object>(pkuhit.xap.dao.auto.entity.XapPortal.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "crtDeptCd", "CRT_DEPT_CD", true, true);

    /** the lastUpdTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.sql.Timestamp, java.lang.Object> $lastUpdTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.sql.Timestamp, java.lang.Object>(pkuhit.xap.dao.auto.entity.XapPortal.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "lastUpdTime", "LAST_UPD_TIME", true, true);

    /** the lastUpdDeptCd */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object> $lastUpdDeptCd = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object>(pkuhit.xap.dao.auto.entity.XapPortal.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "lastUpdDeptCd", "LAST_UPD_DEPT_CD", true, true);

    /** the lastUpdUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object> $lastUpdUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.String, java.lang.Object>(pkuhit.xap.dao.auto.entity.XapPortal.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "lastUpdUserId", "LAST_UPD_USER_ID", true, true);

    /** the delF */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.Short, java.lang.Object> $delF = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, java.lang.Short, java.lang.Object>(pkuhit.xap.dao.auto.entity.XapPortal.class, java.lang.Short.class, org.seasar.doma.wrapper.ShortWrapper.class, null, null, "delF", "DEL_F", true, true);

    private final pkuhit.xap.dao.auto.entity.XapPortalListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.xap.dao.auto.entity.XapPortal, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.xap.dao.auto.entity.XapPortal, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.xap.dao.auto.entity.XapPortal, ?>> __entityPropertyTypeMap;

    private _XapPortal() {
        __listener = new pkuhit.xap.dao.auto.entity.XapPortalListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "XapPortal";
        __catalogName = "";
        __schemaName = "";
        __tableName = "XAP_PORTAL";
        __qualifiedTableName = "XAP_PORTAL";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.xap.dao.auto.entity.XapPortal, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.xap.dao.auto.entity.XapPortal, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.xap.dao.auto.entity.XapPortal, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.xap.dao.auto.entity.XapPortal, ?>>(18);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.xap.dao.auto.entity.XapPortal, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.xap.dao.auto.entity.XapPortal, ?>>(18);
        __idList.add($portalCd);
        __list.add($portalCd);
        __map.put("portalCd", $portalCd);
        __list.add($orgCd);
        __map.put("orgCd", $orgCd);
        __list.add($nm);
        __map.put("nm", $nm);
        __list.add($des);
        __map.put("des", $des);
        __list.add($shtNmEn);
        __map.put("shtNmEn", $shtNmEn);
        __list.add($nmEn);
        __map.put("nmEn", $nmEn);
        __list.add($memo);
        __map.put("memo", $memo);
        __list.add($sortNo);
        __map.put("sortNo", $sortNo);
        __list.add($spellNo);
        __map.put("spellNo", $spellNo);
        __list.add($wubiNo);
        __map.put("wubiNo", $wubiNo);
        __list.add($updCnt);
        __map.put("updCnt", $updCnt);
        __list.add($crtTime);
        __map.put("crtTime", $crtTime);
        __list.add($crtUserId);
        __map.put("crtUserId", $crtUserId);
        __list.add($crtDeptCd);
        __map.put("crtDeptCd", $crtDeptCd);
        __list.add($lastUpdTime);
        __map.put("lastUpdTime", $lastUpdTime);
        __list.add($lastUpdDeptCd);
        __map.put("lastUpdDeptCd", $lastUpdDeptCd);
        __list.add($lastUpdUserId);
        __map.put("lastUpdUserId", $lastUpdUserId);
        __list.add($delF);
        __map.put("delF", $delF);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return __tableName;
    }

    @Override
    public String getQualifiedTableName() {
        return __qualifiedTableName;
    }

    @Override
    public void preInsert(pkuhit.xap.dao.auto.entity.XapPortal entity, org.seasar.doma.jdbc.entity.PreInsertContext<pkuhit.xap.dao.auto.entity.XapPortal> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(pkuhit.xap.dao.auto.entity.XapPortal entity, org.seasar.doma.jdbc.entity.PreUpdateContext<pkuhit.xap.dao.auto.entity.XapPortal> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(pkuhit.xap.dao.auto.entity.XapPortal entity, org.seasar.doma.jdbc.entity.PreDeleteContext<pkuhit.xap.dao.auto.entity.XapPortal> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(pkuhit.xap.dao.auto.entity.XapPortal entity, org.seasar.doma.jdbc.entity.PostInsertContext<pkuhit.xap.dao.auto.entity.XapPortal> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(pkuhit.xap.dao.auto.entity.XapPortal entity, org.seasar.doma.jdbc.entity.PostUpdateContext<pkuhit.xap.dao.auto.entity.XapPortal> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(pkuhit.xap.dao.auto.entity.XapPortal entity, org.seasar.doma.jdbc.entity.PostDeleteContext<pkuhit.xap.dao.auto.entity.XapPortal> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.xap.dao.auto.entity.XapPortal, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.xap.dao.auto.entity.XapPortal, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.xap.dao.auto.entity.XapPortal, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, pkuhit.xap.dao.auto.entity.XapPortal, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public pkuhit.xap.dao.auto.entity.XapPortal newEntity() {
        return new pkuhit.xap.dao.auto.entity.XapPortal();
    }

    @Override
    public pkuhit.xap.dao.auto.entity.XapPortal newEntity(java.util.Map<String, Object> __args) {
        return new pkuhit.xap.dao.auto.entity.XapPortal();
    }

    @Override
    public Class<pkuhit.xap.dao.auto.entity.XapPortal> getEntityClass() {
        return pkuhit.xap.dao.auto.entity.XapPortal.class;
    }

    @Override
    public pkuhit.xap.dao.auto.entity.XapPortal getOriginalStates(pkuhit.xap.dao.auto.entity.XapPortal __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(pkuhit.xap.dao.auto.entity.XapPortal __entity) {
    }

    /**
     * @return the singleton
     */
    public static _XapPortal getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _XapPortal newInstance() {
        return new _XapPortal();
    }

}
