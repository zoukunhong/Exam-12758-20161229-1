package zoukunhong.Exam_12758_20161229_1.event;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class EventListener implements ApplicationListener{
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof TradeEvent){
			TradeEvent tradeEvent = (TradeEvent)event;
			System.out.println(tradeEvent.getValue());
		}else if(event instanceof ContextStartedEvent){
			System.out.println("Context Start");
		}else if(event instanceof ContextStoppedEvent){
			System.out.println("Context Stop");
		}
	}
}
