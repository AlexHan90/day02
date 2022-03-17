package day02;

import java.util.Scanner; //java 폴더안에 유틸 폴더안에 스캐너라는 기능을 사용하게 끌어온다

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name;
		System.out.println("이름 뭐에요??");
		name = input.next();
		System.out.println("당신의 이름은 " + name+ "이군요");
		
		int age;
		System.out.print("나이 입력 : ");
		age = input.nextInt();
		System.out.println("나이 : " + age + "살");
		
		
		 int k=0, e=0; //첫글자 소문자는 초기화 0으로 , //첫글자 대문자는 null 초기화 ,,처음에 할때는 초기화를 해주면 오류가 안생긴다
		 char c = 0;
		 double d = 0;
		 float f = 0;
		 
		 String n = null;
		
		 System.out.println(n);
		 
		 
		
		
		

	}

}
