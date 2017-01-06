package com.zou.service;

import java.util.List;

import com.zou.dto.Page;
import com.zou.dto.ResponseData;

public interface Service<T> {
    T getById(int id);
    ResponseData<T> query(Page<T> t);
    List<String> batchInsert(List<T> t);
    int delete(Integer id);
    T insert(T t);
    int update(T t);
    int batchUpdate(List<T> list);
    List<T> selectAll();
    List<T> selectAllByEntity(T t);
}
