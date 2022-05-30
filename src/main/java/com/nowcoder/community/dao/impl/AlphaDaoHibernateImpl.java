package com.nowcoder.community.dao.impl;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.stereotype.Repository;

/**
 * @Author Lyz
 * @Date: 2022/5/27 1:12
 * @Version 1.0
 */

@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao {
    @Override
    public String select() {
        return "Hibernate";
    }
}
