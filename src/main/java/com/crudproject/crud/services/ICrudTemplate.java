package com.crudproject.crud.services;

import java.util.List;

public interface ICrudTemplate<T> {

  T create(T entity);

  T read(Long id);

  T update(Long id, T entity);

  T delete(Long id);

  List<T> all();

}
