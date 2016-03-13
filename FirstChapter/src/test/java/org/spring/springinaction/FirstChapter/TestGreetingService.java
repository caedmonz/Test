package org.spring.springinaction.FirstChapter;

import org.junit.Test;
import org.spring.springinaction.FirstChapter.hello.GreetingService;

public class TestGreetingService extends UnitTestBase{
	
	public TestGreetingService(){
		super("hello.xml");
	}
	
	@Test
	public void sayGreetingTest(){
		GreetingService service1 = super.getBean("greetingService1");
		service1.sayGreeting();
		GreetingService service2 = super.getBean("greetingService2");
		service2.sayGreeting();
	}
}
