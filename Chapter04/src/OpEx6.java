
public class OpEx6 {

	public static void main(String[] args) {
		
		System.out.println("2: " +Integer.toBinaryString(2));  // 십진수 2를 이진수로 변환
		System.out.println("3: " +Integer.toBinaryString(3));  // 십진수 3을 이진수로 변환
		
		// 비트 논리연산
		System.out.println("2&3 : " +(2&3));
		System.out.println("2|3 : " +(2|3));
		System.out.println("2^3 : " +(2^3));
		System.out.println("~3 : " +~3);
		
		// 첫 자리는 부호를 나타내는 비트를 포함하여 모든 비트를 반대로 변환함.
		System.out.println("~3을 이진수로 : " +Integer.toBinaryString(~3));
		
		// ~3의 이진수 값의 길이
		// 첫 자리는 부호를 나타내를 비트이고, 나머지 31자리로 정수자료형을 메모리에 저장함.
		/// System.out.println(Integer.toBinaryString(~3), length());
		System.out.println(Integer.MAX_VALUE);  // 정수 자료형의 최댓값 (2의 31승 -1)
		System.out.println(Integer.parseInt("1111111111111111111111111111100",2)-Integer.MAX_VALUE-1);
		
	}
}
