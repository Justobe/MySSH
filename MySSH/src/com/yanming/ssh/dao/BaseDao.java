package com.yanming.ssh.dao;

import org.hibernate.HibernateException;  
import org.hibernate.Session;  

public interface BaseDao {  

    public void saveObject(Object obj) throws HibernateException; 
    
}  