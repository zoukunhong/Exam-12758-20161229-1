package zoukunhong.Exam_12758_20161229_1.commom;

import java.util.Scanner;

public class InputUtil {
	public static int getInt(){
		System.out.print("请输入一个正整数：");
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
}
