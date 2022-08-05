
import java.util.Scanner; // 자바에서 미리 만들어 둔 Scanner를 얻어옴
						  // 해당 클래스에서 사용 가능

public class VariableExample6 {
	public static void main(String[] args) {
		
		Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게 하는 역할
		
		// 1) class 위에
		// import java.util.Scanner; 작성
		
		// 2) 얻어 온 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 3) Scanner로 입력 받기
		
		//정수 : sc.nextInt()
		
		System.out.println("입력 받은 두 정수의 합 구하기");
		System.out.print("정수 입력1 : ");
		int input1 = sc.nextInt();
		//키보드로부터 다음 정수를 입력받아 그 값을 input1에 대입
		System.out.print("정수 입력2 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", input1, input2, input1 + input2);
		
		System.out.println("입력 받은 두 실수의 합");
		
		System.out.print("실수 입력1 : ");
		double input3 = sc.nextDouble();
		System.out.print("실수 입력2 : ");
		double input4 = sc.nextDouble();
	}
}
