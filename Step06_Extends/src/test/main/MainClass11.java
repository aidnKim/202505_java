package test.main;

import test.mypac.Item;

//setter, getter 추가 설명
public class MainClass11 {
	public static void main(String[] args) {
		// Item 객체 생성
		Item item=new Item();
		
		//item.name="전자시계";
		item.setName("전자시계");
		
		// Item 객체에 저장된 상품의 이름을 불러와서(참조해서) 활용하려면?
		// 활용?
		// 1. 특정 변수에 담고 싶다
		// 2. 어딘가에 전달하고 싶다 (다른 클래스의 생성자나, 다른 객체의 메소드에)
		// 3. 콘솔창에 출력하고 싶다 등등
		
		// String a = item.name;
		String a = item.getName();
		
		// System.out.println(item.name);
		System.out.println(item.getName());
		
		/*
		 *  item객체의 필드 값이 private이기 때문에 item에 .을 찍어서
		 *  필드 접근 불가 --> setter, getter
		 *    
		 *  private로 접근지정자를 해놓으면 자동으로 해주는 것들이 많음
		 */
	}
}
