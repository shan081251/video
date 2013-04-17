package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pojo.User;

import dao.IUserDao;

public class UserDao extends HibernateDaoSupport implements IUserDao {

	@SuppressWarnings("unchecked")
	@Override
	public User login(User u) {
		// TODO Auto-generated method stub
		try{
			String hql="from User where logid='"+u.getLogid()+"' and logpass='"+u.getLogpass()+"'";
			List<User> list=(List<User>)getHibernateTemplate().find(hql);
			if(list.size()>0){
				return list.get(0);
			}else{
				return null;
			}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
