package com.czj.test;

import com.czj.dao.BookTypeDAO;
import com.czj.dao.BookTypeDAOImpl;
import com.czj.mapper.BooktypesMapper;
import com.czj.model.Booktypes;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BookTypeDAOImplTest {
    static BookTypeDAO bookTypeDao;
    @BeforeClass
    public static void beforeClass()
    {
        bookTypeDao=new BookTypeDAOImpl();
    }

    @Test
    public void testGetAllBookTypes() {
        List<Booktypes> booktypes=bookTypeDao.getAllBookTypes();
        for (Booktypes bookType : booktypes) {
            System.out.println(bookType.getId()+"|"+bookType.getTypename());
        }
        assertNotNull(booktypes);
    }
}