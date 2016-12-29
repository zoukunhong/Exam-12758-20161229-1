package zoukunhong.Exam_12758_20161229_1.service;

import java.util.List;

public interface IEntityService<T> {
	public List<T> getAll();
	public int save(T t);
}
