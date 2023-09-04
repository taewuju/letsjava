
public class ScopeEx {  // 1. 틀래스 블럭

	int no;  // 1-1. 클래스 블럭 내에서 사용가능한 변수
	
	public static void main(String[] args) {  // 2. main 메서드 블럭
		
		String name;  // 2-1. main 메서드 블럭 내에서 사용가능한 변수
		
		if (true) {
			// 메서드 블럭 안에서 선언한 변수 사용간으함
			name = "홍길동";
			
			// if문 블럭 안에서 변수 선언함
			String email = "hong@test.com";
		}
		
		// if문 블럭 밖에서 email 변수를 사용하면 에러 발생함
		// email = "hong@test.com";
	}

	
	
}
