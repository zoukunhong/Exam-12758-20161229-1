package zoukunhong.Exam_12758_20161229_1.event;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class EventListener implements ApplicationListener{
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof TradeEvent){
			TradeEvent tradeEvent = (TradeEvent)event;
			System.out.println(tradeEvent.toString());
		}
	}
}
