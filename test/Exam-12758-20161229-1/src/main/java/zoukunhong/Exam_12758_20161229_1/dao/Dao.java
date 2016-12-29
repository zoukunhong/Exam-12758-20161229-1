package zoukunhong.Exam_12758_20161229_1.dao;


import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class Dao<T> {
	@Autowired
	protected SqlSessionTemplate sqlSessionTemplate;
	public List<T> getAll(){
		return null;
	}
	public int save(T t){
		return -1;
	}
}
