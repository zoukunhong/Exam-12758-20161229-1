package zoukunhong.Exam_12758_20161229_1;

import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import zoukunhong.Exam_12758_20161229_1.commom.InputUtil;
import zoukunhong.Exam_12758_20161229_1.event.EventPublisher;

/**
 * 程序入口
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
        EventPublisher publisher = (EventPublisher) context.getBean("eventPublisher");
        publisher.publishEvent("wen jia liang", new Date());
        int choice = -1;
/*       
		 while(choice != 0){
        	choice = InputUtil.getInt();
            switch (choice) {
	    		case 1:
	    			break;
	    		case 2:
	    			break;
	    		case 3:
	    			break;
	    		case 4:
	    			break;
	    		case 5:
	    			break;
	    		case 6:
	    			break;
    		}
        }
*/


    }
}
