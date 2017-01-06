package com.zou.dto;

//分页类
public class Page<T>{
	//当前页
    private int page;
    //分页大小
    private int pageSize;
    //数据
    private T entity;


    public Page() {
	}

	public Page(int page, int pageSize, T entity) {
		this.page = page;
		this.pageSize = pageSize;
		this.entity = entity;
	}

	public int getPage() {
        return page;
    }

    public Page setPage(int page) {
        this.page = page;
        return this;
    }

    public int getPageSize() {
        return pageSize;
    }

    public Page setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public int getOffset() {
        return (page - 1) * pageSize;
    }

    public T getEntity() {
        return entity;
    }

    public Page setEntity(T entity) {
        this.entity = entity;
        return this;
    }
}
