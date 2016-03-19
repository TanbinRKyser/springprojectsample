package com.mitul.dao;

import com.mitul.model.logininfo;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Mitul on 18-Mar-16.
 */
@Repository
@Transactional
public class homdao {
    @Autowired private SessionFactory sessionFactory;

    @Transactional
    public List<logininfo> findAllUsers(){
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(logininfo.class);
        return criteria.list();
    }

    public int insertPost(logininfo log){
        return (int) sessionFactory.getCurrentSession().save(log);
    }
}
