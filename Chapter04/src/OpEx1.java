
public class OpEx1 {

	public static void main(String[] args) {
		
		int a = 10;
		
		/* 에러
		 * 10 = a;  // 에러 1
		 * a + 1 = 10;  // 에러 2
		 * 10 = 1;  // 에러 3
		 * a = a +10;  //정상
		 */
		
		int b = 10;
		int c = 4;
		System.out.println("10 / 4 = " +b/c);  // 결괏값 2
		System.out.println("10 / 4 = " +(double)b/c);  // 결괏값 2.5. 강제 형변환
		
		double d = 10;
		int e = 4;
		System.out.println("10 / 4 = " +d/e);  // 결괏값 2.5
		
		
		int number1 = 10;
		System.out.println("number1 = 10 -> " +number1);  // 10출력
		number1 += 10;  // 더하고 대입
		System.out.println("number1 += 10 -> " +number1);  // 20출력
		number1 -= 10;  // 빼고 대입
		System.out.println("number1 -= 10 -> " +number1);  // 10출력
		number1 *= 2;  // 곱하고 대입
		System.out.println("number1 *= 2 -> " +number1);  // 20출력
		number1 /= 2;  // 나누고 대입
		System.out.println("number1 /= 10 -> " +number1);  // 10출력
		number1 %= 3;  // 나머지 대입
		System.out.println("number1 %= 3 -> " +number1);  // 1출력
	}
}
