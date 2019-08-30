package com.ortecfinance.education.dao;

import java.io.Serializable;

public class DummyService implements Serializable {

    private static final long serialVersionUID = 1L;

    public String get() {
        return "cdi-injected";
    }
}
