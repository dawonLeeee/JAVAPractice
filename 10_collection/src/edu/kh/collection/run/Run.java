package edu.kh.collection.run;

import edu.kh.collection.model.service.ListService;
import edu.kh.collection.model.service.SetService;
import edu.kh.collection.view.StudentView;

public class Run {
	public static void main(String[] args) {
		
		ListService service1 = new ListService();
		SetService service2 = new SetService();
		
//		service1.ex1();
		
//		new StudentView().displayMenu();
//		service2.ex1();
//		service2.ex2();
		service2.ex3();
		
		

	}
}
