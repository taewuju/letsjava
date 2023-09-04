
public class OpEx3 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		System.out.println(a > b);  // true
		System.out.println(a >= b);  // true
		System.out.println(a < b);  // false
		System.out.println(a <= b);  // false
		System.out.println(a == b);  // false
		boolean h = a == b;  // h 변수에 결괏값을 대입함
		System.out.println("h = " +h);
		boolean i = h == false;  // i 변수에 결괏값을 대입함.
		System.out.println("i = " +i);
		
		++a;  // 전위 연산. 먼저 변수에 1을 증가시킨 후 다른 연산을 실행함.
		b++;  // 후위 연산. 다른 연산을 실행한 후 변수에 1을 증가시킴.
		
		System.out.println(a);
		System.out.println(b);
				
		int c = 10;
		int d = ++a;
		
		System.out.println("전위연산 결과 : " +b);
		
		int x = 10;
		int y = x++;
		System.out.println("후위연산 결과 :" +y);
		System.out.println("x : " +x);
		
		int e = 10;
		e++;
		System.out.println("e++ : " +e);
		int f = 10;
		f += 1;
		System.out.println("f += 1 : " +f);
		int g = 10;
		g = g + 1;
		System.out.println("g = g +1 : " +g);
		
	}
}
