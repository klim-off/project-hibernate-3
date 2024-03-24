package com.klimov.dao;

import com.klimov.domain.City;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.resource.beans.container.spi.BeanContainer;

public class CityDAO extends GenericDAO<City>{
    public CityDAO( SessionFactory sessionFactory) {
        super(City.class, sessionFactory);
    }

    public int getTotalCount(){
        Query <Long> query = getCurrentSession().createQuery("select count (c) from City c", Long.class);
        return Math.toIntExact(query.uniqueResult());
    }
}
