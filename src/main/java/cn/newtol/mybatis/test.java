package cn.newtol.mybatis;

import cn.newtol.mybatis.dao.IUser;
import cn.newtol.mybatis.pojo.User;
import cn.newtol.mybatis.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @Author: REN
 * @Description:
 * @Date: Created in 23:37 2018/4/26
 */
public class test {

        public static void main(String[] args) {
            SqlSessionFactoryUtil sqlSessionFactoryUtil = null;
            SqlSession session = sqlSessionFactoryUtil.getSqlSessionFactory().openSession();
            try {
                IUser iuser = session.getMapper(IUser.class);
                User u = iuser.getUser();
                System.out.println("id:"+u.getId()+"----"+"name:"+u.getName()+"----"+"phone:"+u.getPhone());
            }finally {
                session.close();
            }

        }


}
