package test.frame04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame_my extends JFrame {

	//생성자
	public MyFrame_my() {
		setTitle("나의 프레임");
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//레이아웃 매니저 객체 생성
		FlowLayout layout=new FlowLayout(FlowLayout.CENTER);
		//프레임의 레이아웃 매니저 설정
		setLayout(layout);
		JButton countBtn=new JButton("0");
		add(countBtn);
		//버튼의 setText() 메소드를 이용하면 버튼에 출력된 문자열을 변경할 수 있다
		//countBtn.setText("1");
		countBtn.setActionCommand("0");
		
		countBtn.addActionListener((e)->{			
			Integer i = Integer.parseInt(e.getActionCommand());
			i++;
			String tmp=String.valueOf(i);
			countBtn.setText(tmp);
			countBtn.setActionCommand(String.valueOf(i));
		});
		
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new MyFrame_my();
	}

	
}
