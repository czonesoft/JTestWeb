package com.czj.dao;

import com.czj.mapper.BooktypesMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BookTypeDAOImpl implements BookTypeDAO  {
    @Override
    public List<BooktypesMapper> getAllBookTypes() {
        //获得会话对象
        SqlSession session=MyBatisUtil.getSession();
        try {
            //通过MyBatis实现接口BookTypeDAO，返回实例
            BookTypeDAO bookTypeDAO=session.getMapper(BookTypeDAO.class);
            return bookTypeDAO.getAllBookTypes();
        } finally {
            session.close();
        }
    }
}
