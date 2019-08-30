package com.ortecfinance.education.dao;

import com.google.common.collect.Lists;
import com.ortecfinance.education.model.dummy.DummyTable;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class DummyDao extends ExtendedBasicDao {

    private static final long serialVersionUID = 1L;

    public List<DummyTable> getAll() {
        return Lists.newArrayList(
                new DummyTable("A"),
                new DummyTable("B"),
                new DummyTable("C")
        );
    }

}
