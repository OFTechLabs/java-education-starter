package com.ortecfinance.education.model.dummy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DUMMY_TABLE")
public class DummyTable {

    @Id
    @Column(name = "DUMMY_COLUMN")
    private String dummyColumn;

    public DummyTable() {
        //JPA
    }

    public DummyTable(String dummyColumn) {
        this.dummyColumn = dummyColumn;
    }

    public String getDummyColumn() {
        return dummyColumn;
    }

    public void setDummyColumn(String dummyColumn) {
        this.dummyColumn = dummyColumn;
    }
}
