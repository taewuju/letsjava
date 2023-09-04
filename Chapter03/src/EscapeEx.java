
public class EscapeEx {

	public static void main(String[] args) {
		
		final double PI = 3.14;  // 상수 선언
		// PI = 3.141592;  // 상수에 값 변경시 에러 발생
		
		String greet = "안녕하세요, \n저는 \"홍길동\"입니다.";
		String greet2 = "\t반갑습니다.";
		
		System.out.println(greet);
		System.out.println(greet2);
	}
	
	
}
