package test.mypac;

//가상의 옛날 가정용 전화기 객체를 생성할 설계도라고 가정
public class Phone extends Object{ // Object는 따로 써주지 않아도 자동으로 상속
	//생성자
	public Phone() {
		System.out.println("Phone 생성자 호출됨");
	}
	//전화거는 메소드
	public void call() {
		System.out.println("전화를 걸어요!");
	}
}
