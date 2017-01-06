package com.zou.mapper;

import com.zou.dto.Page;

import java.util.List;

public interface BaseMapper<T, P> {
    T getById(P id);

    int update(T dto);

    int delete(T dto);

    List<T> select(Page<T> dto);

    int insert(T dto);
    
    List<T> selectAll();
    
    List<T> selectAllByEntity(T t);
}
