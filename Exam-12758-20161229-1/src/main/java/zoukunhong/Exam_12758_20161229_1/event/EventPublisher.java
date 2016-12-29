package zoukunhong.Exam_12758_20161229_1.event;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
@Component
public class EventPublisher implements ApplicationEventPublisherAware{
	private ApplicationEventPublisher publisher;
	public void publishEvent(TradeEvent event){
		this.publisher.publishEvent(event);
	}
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
}