

public class CharType {

	public static void main(String[] args) {
		
		int e;  // 변수 선언
		e = 10;  // 변수 초기화
		int f = 20;  // 변수 선언과 초기화를 동시에
		
		boolean run = true;  // 논리 자료형(기본값은 false)
		
		byte g = 1;
		short h = 10;
		int i = 100;
		long j = 1000;
		long j2 = 1000L;  // long 타입 우변에 대문자L을 쓰거나 생략한다.
		
		// char k = 'Hello';  // -- 에러. 문자열 클래스를 사용해야 함.
		String str = " Hello ";  // 가능
		
		char a = 'A';
		
		System.out.println("a:" +a);
		
		int b = a;
		System.out.println("b:" +b);
		
		char c = 66;
		System.out.println("c:" +c);
		
		int d = a+b;  // 65 + 65
		System.out.println("d:" +d);
	}
}
