package com.klimov.dao;

import com.klimov.domain.Country;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CountryDAO extends GenericDAO<Country>{
    //private final SessionFactory sessionFactory;
    public CountryDAO( SessionFactory sessionFactory) {

        super(Country.class, sessionFactory);
    }

    @Override
    public List<Country> getAll() {
        Query<Country> query = getCurrentSession().createQuery("select c from Country c join fetch c.countryLanguages", Country.class);
        return query.list();
    }
}
