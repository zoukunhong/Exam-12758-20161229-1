package zoukunhong.Exam_12758_20161229_1.aop;
import org.aspectj.lang.ProceedingJoinPoint;

import zoukunhong.Exam_12758_20161229_1.event.BeforeInsertFilmEvent;
import zoukunhong.Exam_12758_20161229_1.event.EventPublisher;

public class FilmSaveAop {
	private EventPublisher publisher;
	public void setPublisher(EventPublisher publisher) {
		this.publisher = publisher;
	}
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
		publisher.publishEvent(new BeforeInsertFilmEvent("FilmSave", "Before Insert Film Data"));
		Object obj = pjp.proceed();
		publisher.publishEvent(new BeforeInsertFilmEvent("FilmSave", "After Insert Film Data"));
		return obj;
	}
	public static void main(String[] args) throws InterruptedException{
		
	}
}
