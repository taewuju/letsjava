import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		
		/* int number = 3;
		
		switch (number) {
			case 1 :
				System.out.println("1번");
				break;
			case 2 :
				System.out.println("2번");
				break;
			case 3 :
				System.out.println("3번");
				break;
			case 4 :
				System.out.println("4번");
				break;
			case 5 :
				System.out.println("5번");
				break;
			default :
				System.out.println("6번");
		}
		*/

	System.out.println("점수를 입력하세요.");
	Scanner scan = new Scanner(System.in);
	
	int score = scan.nextInt();
	String grade = "";
	switch (score / 10) {
		case 9 :
			grade = "A";
		case 8 :
			grade = "B";
		case 7 :
			grade = "C";
		case 6 :
			grade = "D";
		default :
			grade = "F";
	}
	System.out.println("학점 : " +grade);  // --> 에러. break를 안 넣어서 
	// 실행문이 멈추지 않고 끝까지 가므로 무조건 F가 나옴.
	}
}