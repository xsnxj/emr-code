package pkuhit.iih.qa.dao.auto.entity;

import java.sql.Timestamp;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

import pkuhit.xap.ac.Session;

/**
 * 
 */
public class QaSysSegListener implements EntityListener<QaSysSeg> {

    @Override
    public void preInsert(QaSysSeg entity, PreInsertContext<QaSysSeg> context) {
		Session session = Session.get();
		entity.crtUserId = session.getUserId();
    	entity.crtTime = new Timestamp(System.currentTimeMillis());
    	entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = entity.crtTime;
    	entity.delF = (short)0;
      	entity.crtDeptCd = session.getDeptId();
    }

    @Override
    public void preUpdate(QaSysSeg entity, PreUpdateContext<QaSysSeg> context) {
		Session session = Session.get();
		entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = new Timestamp(System.currentTimeMillis());
    	entity.lastUpdDeptCd = session.getDeptId();    	
    }

    @Override
    public void preDelete(QaSysSeg entity, PreDeleteContext<QaSysSeg> context) {
    }

    @Override
    public void postInsert(QaSysSeg entity, PostInsertContext<QaSysSeg> context) {
    }

    @Override
    public void postUpdate(QaSysSeg entity, PostUpdateContext<QaSysSeg> context) {
    }

    @Override
    public void postDelete(QaSysSeg entity, PostDeleteContext<QaSysSeg> context) {
    }
}