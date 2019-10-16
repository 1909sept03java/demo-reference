package com.revature;

import java.io.PrintWriter;
import java.util.List;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.revature.model.Flashcard;
import com.revature.model.Topic;
import com.revature.service.StudyService;

public class SOAPClientDriver {

	private static final String SERVICE_URL = "http://localhost:8082/SOAPServiceDemo/study-session";

	public static void main(String[] args) {

		// set up a factory to create a proxy for the service
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(StudyService.class); // what methods are available via the portType?
		factory.setAddress(SERVICE_URL);

		// set up interceptors to log incoming and outgoing messages
		LoggingInInterceptor inInterceptor = new LoggingInInterceptor(new PrintWriter(System.out));
		LoggingOutInterceptor outInterceptor = new LoggingOutInterceptor(new PrintWriter(System.out));

		// add interceptors to factory
		factory.getInInterceptors().add(inInterceptor);
		factory.getOutInterceptors().add(outInterceptor);

		// create an instance of StudyService using implementation provided by SOAP
		StudyService studyService = (StudyService) factory.create();

		System.out.println("invoking StudyService.getAllFlashcards()...");
		List<Flashcard> cards = studyService.getAllFlashcards();
		for (Flashcard f : cards) {
			System.out.println(f);
		}

		System.out.println("invoking StudyService.addFlashcard()...");
		try {
			studyService.addFlashcard(new Flashcard(99, "Why did the chicken cross the road?",
					"To get to the other side", new Topic(10, "not coding")));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// System.out.println("invoking StudyService.fakeMethod()...");
		// studyService.fakeMethod();
	}

}
