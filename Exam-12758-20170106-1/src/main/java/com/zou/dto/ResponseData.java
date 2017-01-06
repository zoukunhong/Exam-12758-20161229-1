package com.zou.dto;

import java.util.List;

//应答数据类
public class ResponseData<T>  {
	//符合条件的总记录数
    private int total;
    //返回数据
    private List<T> rows;

    public int getTotal() {
        return total;
    }

    public ResponseData setTotal(int total) {
        this.total = total;
        return this;
    }

    public List<T> getRows() {
        return rows;
    }

    public ResponseData setRows(List<T> rows) {
        this.rows = rows;
        return this;
    }

	@Override
	public String toString() {
		return "ResponseData [total=" + total + ", rows=" + rows + "]";
	}
    
}
