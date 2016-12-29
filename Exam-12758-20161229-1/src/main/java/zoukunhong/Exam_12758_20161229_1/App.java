package zoukunhong.Exam_12758_20161229_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import zoukunhong.Exam_12758_20161229_1.controller.FunctionController;

/**
 * 程序入口
 */
public class App 
{
	public void startApp(){
		
	}
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
        ConfigurableApplicationContext cac = (ConfigurableApplicationContext)context;
        cac.start();
        FunctionController controller = (FunctionController)cac.getBean("functionController");
        controller.saveFilm();
        cac.stop();
    }
}
