package br.edu.utfpr.vera.modelo.dao.util;

import java.util.List;

public interface iDAO<T> {

    T save(T obj);

    T listOne(int index);

    List<T> listAll(Class clazz);

    T update(T obj);

    void delete(T obj);

    void delete(int index);
}
