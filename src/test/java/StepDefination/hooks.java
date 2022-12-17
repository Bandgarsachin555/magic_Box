package StepDefination;


import BaseLayer.BaseClass;
import io.cucumber.java.After;

import io.cucumber.java.Before;


public class hooks extends BaseClass{

	@Before
	public void beforeall()
	{
		System.out.println("end");
	}
	
	@After
	public void after()
	{
		System.out.println("start");
	}
	
}
