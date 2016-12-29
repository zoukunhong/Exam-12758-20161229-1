package zoukunhong.Exam_12758_20161229_1.commom;

import java.util.Scanner;

public class InputUtil {
	public static int getInt(){
		Scanner sc = new Scanner(System.in);
        while(true){
    		String input = sc.next();
    		if(input.matches("[0-9]+")){
    			return Integer.parseInt(input);
    		}else{
    			System.out.println("非法数字请重新输入！");
    		}
        }
	}
	public static String getString(){
		Scanner sc = new Scanner(System.in);
        while(true){
    		String input = sc.nextLine();
    		if("".equals(input.trim())){
    			System.out.println("非法字符串请重新输入！");
    		}else{
    			return input;
    		}
        }
	}
}
