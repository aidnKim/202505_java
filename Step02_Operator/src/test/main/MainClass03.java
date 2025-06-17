package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * i라는 변수를 만들고 초기값 0 대입
		 * i가 10보다 작은 동안에 반복한다(작으면 for문 블럭을 실행한다)
		 * i를 1씩 증가시키면서
		 * i는 for문 안에서 만들어진 지역변수(for문이 종료되면 i는 사라진다)
		 */
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		System.out.println("---------------");
		// 콘솔창에 9부터 0까지 순서대로 출력되도록 for문을 구성해보세요
		// 9, 8, 7, 6, ... , 1, 0
		for(int i=9; i>=0; i--) {
			System.out.println(i);
		}
		//i는 지역변수라 두번 선언되어도 오류가 없음(for문이 종료되면 사라짐)
	}
}
