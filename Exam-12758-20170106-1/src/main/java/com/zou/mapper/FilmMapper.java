package com.zou.mapper;

import com.zou.entity.Film;

public interface FilmMapper extends BaseMapper<Film,Integer> {

	int selectCount(Film entity);

}
