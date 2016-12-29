package zoukunhong.Exam_12758_20161229_1.event;

import org.springframework.context.ApplicationEvent;

public class TradeEvent extends ApplicationEvent{
	private Object name;
	private Object value;
	
	public TradeEvent(Object source) {
		super(source);
		name = source;
	}
	public TradeEvent(Object name, Object value) {
		super(name);
		this.name = name;
		this.value = value;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object name) {
		this.name = name;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "TradeEvent [name=" + name + ", value=" + value + "]";
	}

}
