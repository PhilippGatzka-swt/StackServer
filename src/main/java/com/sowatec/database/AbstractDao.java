package com.sowatec.database;

import java.util.List;

public interface AbstractDao<T> {

    List<T> getAll();

    void insert(T value);

    void delete(T value);

}
