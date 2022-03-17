package day02;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	String name;
	int kor;
	int eng;
	int math;
	
	System.out.print("당신의 이름은 무엇입니까?");
	name = sc.next();
	
	System.out.print(name + "님의 국어 점수 : "  );
	kor = sc.nextInt();
	
	System.out.print(name + "님의 영어 점수:  ");
	eng = sc.nextInt();
	
	System.out.print(name + "님의 수학 점수:  ");
	math = sc.nextInt();
	
	System.out.println("====================");
	System.out.println("이름 : " + name  );
	System.out.println("====================");
	System.out.println("국어 : " + kor);
	System.out.println("영어 : " + eng);
	System.out.println("수학 : " + math);
	System.out.println("====================");
	System.out.println("합계 : " + (kor+eng+math));
	System.out.println("====================");
	System.out.println("평균 : " + (kor+eng+math)/3);
	
	
	
		
	}

}
