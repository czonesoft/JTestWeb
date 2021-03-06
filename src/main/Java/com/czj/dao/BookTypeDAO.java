package com.czj.dao;

import com.czj.mapper.*;
import com.czj.model.Booktypes;

import java.util.List;

/**
 * 图书类型数据访问接口
 *
 */
public interface BookTypeDAO {
    /*
     * 获得所有图书类型
     */
    public List<Booktypes> getAllBookTypes();
}
