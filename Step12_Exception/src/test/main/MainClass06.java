package test.main;

import test.mypac.MyUtill;

public class MainClass06 {
	public static void main(String[] args) {
		MyUtill.draw();
		
		try {
			MyUtill.send();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
