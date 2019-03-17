package hms.hotelogix.registration.Testpage;

import javax.swing.JOptionPane;

import org.testng.TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2 {

	
	
	public static void main(String[] args) throws Exception{
		String comand =JOptionPane.showInputDialog("Kya Hukm Hai Mere Aaka");
		Test2.test(comand);
	}
	
	public static void test(String arg) throws Exception{
		if(arg.equalsIgnoreCase("Spanish")){
			new SpanishPage();
		}else{
			new EnglishPage();
		}
	}
	
//	@Test
	//@DataProvider(name = "test2")
//	public void fn_Test2(){
//		TestNG ts=new TestNG();
//		String[] argv={};
//		ts.main(argv);
//		ts.run();
//		System.out.println("i m test2 class");
//	}

}
