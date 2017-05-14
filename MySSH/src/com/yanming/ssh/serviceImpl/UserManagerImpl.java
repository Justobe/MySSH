package com.yanming.ssh.serviceImpl;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;

import com.yanming.ssh.beans.User;
import com.yanming.ssh.dao.BaseDao;
import com.yanming.ssh.forms.UserForm;
import com.yanming.ssh.service.UserManager;

public class UserManagerImpl implements UserManager {

    private BaseDao dao;

    public void setDao(BaseDao dao) {
        this.dao = dao;
    }

    @Override
    public void regUser(UserForm userForm) throws HibernateException {
        User user = new User();
        BeanUtils.copyProperties(userForm, user);
        dao.saveObject(user);
    }

}