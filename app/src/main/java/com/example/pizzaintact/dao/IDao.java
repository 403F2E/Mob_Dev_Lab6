package com.example.pizzaintact.dao;

import java.util.List;

// 403f2e has defined the IDao interface to provide a generic data access object structure
public interface IDao<T> {
    // 403f2e has defined the create method to insert a new object of type T
    T create(T t);
    // 403f2e has defined the update method to modify an existing object of type T
    T update(T t);
    // 403f2e has defined the delete method to remove an object by its ID
    boolean delete(long id);
    // 403f2e has defined the findById method to retrieve an object by its ID
    T findById(long id);
    // 403f2e has defined the findAll method to retrieve all objects of type T
    List<T> findAll();
}
